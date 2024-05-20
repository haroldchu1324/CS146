def is_anagram(s: str, t: str) -> bool:
    if len(s) != len(t):
        return False

    # Convert both strings to lowercase
    s = s.lower()
    t = t.lower()

    # Sort the strings
    sorted_s = sorted(s)
    sorted_t = sorted(t)

    # Compare the sorted strings
    return sorted_s == sorted_t
