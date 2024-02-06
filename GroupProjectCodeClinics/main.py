import os 

# This code is for writting configuration data 
def write_configuration(data):
    # Specify the hidden file path in the user's home directory
    file_path = f"{os.path.expanduser('~')}/.config.txt"

    try:
        # Write the configuration data to the file
        with open(file_path, 'w') as file:
            file.write(data)
        print(f"Configuration written to {file_path}")
    except Exception as e:
        print(f"Error writing configuration: {e}")

# Example: Write configuration data to the hidden file
write_configuration("key1=value1\nkey2=value2")

# This code is for  reading configuration data
def read_configuration():
    # Specify the hidden file path in the user's home directory
    file_path = f"{os.path.expanduser('~')}/.config.txt"

    try:
        # Read the configuration data from the file
        with open(file_path, 'r') as file:
            return file.read()
    except FileNotFoundError:
        print(f"Configuration file not found at {file_path}")
    except Exception as e:
        print(f"Error reading configuration: {e}")

# Example: Read configuration data from the hidden file
configuration_data = read_configuration()
print(f"Configuration data:\n{configuration_data}")

