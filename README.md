# automation-Learning
Git commands to link your local repo with remote repo
1. git init -b main (initialize git repository)
2. git status
3. git add <filename>
4. git status (to check which files are added)
5. git commit -m "commit message"
6. git remote add origin <repo clone link> i.e https://github.com/AGdivya/automation-Learning.git 
7. git remote -v (to validate git remote repo is linked with local or not)
8. git push 
     if it will through this error "refusing to merge unrelated histories"
9. Run this "git pull origin main --allow-unrelated-histories"
10. Add commit message then run 
11. git push origin main