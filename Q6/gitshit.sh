#./bin/bash
read commit
git add .
git commit -m $commit .
git push origin master

