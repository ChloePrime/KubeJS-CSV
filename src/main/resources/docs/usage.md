## Example:
Using `CsvIO.parse` will convert the following CSV document to
```csv
Name,ID,HasPhone
Alice,1,true
Bob,2,false,Redundant Data
Chara,3
```
to
```json5
[
  {
    "Name": "Alice",
    "ID": 1,
    "HasPhone": true
  },
  {
    "Name": "Bob",
    "ID": 2,
    "HasPhone": false,
    // Redundant entries are ignored
  },
  {
    "Name": "Chara",
    "ID": 3
  }
]
```
## Primitives
If the value is `true` or `false`, it will be converted to a JavaScript **boolean**.<br>
If the value is **a number**, it will be converted to a JavaScript **number**.<br>
Elsewhere it will be converted to a JavaScript **string**.