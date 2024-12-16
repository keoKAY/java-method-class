#!/bin/bash
message="$1"
if [ -z "$message" ]; then
  echo "Usage is : $0 <commit-message>"
  exit
fi

git add .
git commit -m "$message"
git push -u origin "$(git branch --show-current)"