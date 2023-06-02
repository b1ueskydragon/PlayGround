algorithms, data structures, quizzes, design patterns🦁


leetcode directory is moved to https://github.com/b1ueskydragon/leetcode
```
# From PlayGround repository
$ git checkout master
$ git subtree split -P src/main/java/leetcode -b tmp_branch
$ git remote add new_origin https://github.com/b1ueskydragon/leetcode.git
$ git push new_origin tmp_branch:main -f

# Count commits
$ git log --oneline -- src/main/java/leetcode | wc -l
442
```
