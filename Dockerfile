# Utilisez une image de base
FROM mcr.microsoft.com/windows/servercore:ltsc2019

# Étiquetez l'auteur de l'image
LABEL maintainer="azer<azerboughrara095@gmail.com>"

# Exécutez des commandes pour installer des dépendances
RUN powershell -Command \
    Install-WindowsFeature Web-Server; \
    Remove-Item -Recurse C:\inetpub\wwwroot\*

# Copiez les fichiers de votre application dans l'image
COPY . C:\app

# Définissez le répertoire de travail
WORKDIR C:\app

# Exposez un port si nécessaire
EXPOSE 80

# Commande par défaut pour démarrer votre application
CMD ["./pathePolyBack"]