user_details = {
    "first_name": "bolaji",
    "last_name": "jibola",
    "age": 29,
    "state": "ogun",    "skills": {
        "soft": ["communication", "verbal", "violence"],
        "technical": ["python", "java", "javascript", "csharp"]
    },
    "height": 5.9
}
val = user_details["skills"]["soft"][1] = [1, False, "varbal", "Hello"]
# print(user_details["skills"]["technical"][3])
val = user_details["skills"]["soft"][1]

# result = user_details.pop("height")
result = user_details.get("first_name")
#print(result)
print(user_details)