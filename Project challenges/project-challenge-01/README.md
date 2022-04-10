# Create your first repository on GitHub

## Installing Git on your machine (Windows)

- Access the [Git] website(https://git-scm.com/download/win)
- Download the package according to your system architecture
- After downloading, follow the steps by clicking ```Next```

## Installing Git on your machine (Linux)

- Access the [Git] website(https://git-scm.com/download/linux)
- Follow the installation instructions according to your Linux distribution

### Creating an account on GitHub

- Access the [GitHub] website(https://github.com/)
- Inform a valid email

### Creating a repository on GitHub

- Access your account in the [Login] link(https://github.com/login)
- In your profile, access ```Repositories``` -> ```New```
- Insert a name, in this case, ```desafio_de_projeto_01```
- Insert a description (optional but very useful)
- Keep the repository as public
- Click on ```Create repository```

### Configuring a personal access token for GitHub access

- Access your profile -> Settings -> Developer Settings -> Personal Access Tokens
- New personal access token
- Insert a note for the token
- Select Repo scope
- Copy and save the token to a file on your computer (this is the only time the token will be presented)
- Test:
  - Clone a private repository via HTTPS
  - When opening the GitHub screen, enter the personal token

### Configuring an SSH key for remote GitHub access

- Login to your GitHub account -> Click on the profile icon -> Settings -> SSH and GPG Keys -> New SSH Key
- Access Git Bash:
  - ```ssh-keygen -t ed25519 -C [your_github_email]``` -> Enter
  - Enter a password -> Repeat password
  - Check the created public and private keys
  - Access the folder where the keys are ```cd /path/to/folder```
  - Access the contents of the public key ```cat id_ed25519.pub```
  - Copy the content
- On the GitHub website:
  - Enter a name for the key in ```Title```
  - Insert the content in ```Key```
  - Click on Add SSH Key and enter your password when prompted
- In Git Bash:
  - Start the SSH Agent: ```eval $(ssh-agent -s)```
  - Tell the SSH Agent the private key ```ssh-add id_ed25519```
  - Inform the password of your SSH key
  - Enter
- Test
  - Clone a private repository via SSH

### Creating local repository

- Create a folder for the project: ``` mkdir project_challenge-01```
- Access the folder created: ```cd challenge_de_projeto_01```
- Start the repository: ```git init```
- Add the origin repository: ```git remote add origin https://github.com/cassiano-dio/desafio_de_projeto_01.git```
- Create a file called ```README.md```
- Insert a title with the following syntax:
```### First design challenge```
- Create a folder with the command ```mkdir exercises```
- Insert the files of exercises developed in previous modules and weeks
- Perform the first commit: ```git commit -m "My first commit"```
- Select the "main" branch: ```git branch -M main```
- Push changes to remote repository: ```git push -u origin master```
