### Protocol Buffers   
---
* Tips:
```
1. On main folder, create proto folder.
2. Go to File, Project Structure -> Modules, click on proto, and select Sources.
3. IntelliJ will recognize proto as src folder.

Plugin: Settings -> Plugings -> Proto Buffers Editor.
  
JS Files Auto Generate: On proto folder ->
../../../target/protoc-plugins/protoc-3.6.1-linux-x86_64.exe --js_out=./ *.proto
```