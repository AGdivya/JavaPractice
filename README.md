# Java-Learning and Git Commands

This repository serves as a guide for learning Java programming language and mastering Git commands for version control. It includes detailed explanations of Java concepts and practical examples to aid in learning.

## Git Commands for Repository Management

### Setting Up Remote Repository

1. `git init -b main`: Initialize a new Git repository with the main branch.
2. `git status`: Check the status of the working directory and staging area.
3. `git add <filename>`: Add specific files to the staging area.
4. `git commit -m "commit message"`: Commit changes with a descriptive message.
5. `git remote add origin <repo clone link>`: Link the local repository to a remote repository.
6. `git remote -v`: Verify the remote repository link.
7. `git push`: Push changes to the remote repository.

### Handling Repository History

- If encountering "refusing to merge unrelated histories" error:
    ```
    git pull origin main --allow-unrelated-histories
    ```
- To update the remote repository URL:
    ```
    git remote set-url origin <new_repo_link>
    ```

### Additional Git Commands

- `git add --all`: Add all modified files to the staging area.
- `git rm --cached <file>`: Remove a file from the staging area.
- `git rm <file>`: Remove a file from the working directory and staging area.
- `git reset <file>`: Remove a file from the staging area.
- `git reset`: Remove all files from the staging area.
- `git rebase -i`: Clean up commit history interactively before pushing changes.

## About the Project

This Java project aims to provide comprehensive explanations of various Java concepts, from basic syntax to advanced topics. It is designed to facilitate learning through practical examples and clear explanations. Whether you're a beginner or looking to deepen your understanding of Java, this repository serves as a valuable resource for honing your skills.

Feel free to contribute by adding new examples, improving existing explanations, or suggesting enhancements to the repository. Happy learning!

