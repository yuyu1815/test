/*     */ package ai.grazie.tasks.codegen.model;
/*     */ 
/*     */ import java.nio.file.Path;
/*     */ 
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0002\n\002\030\002\n\002\020\000\n\002\b\003\n\002\020 \n\002\030\002\n\002\020\016\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\000\b6\030\0002\0020\001:\002\r\016B\t\b\004¢\006\004\b\002\020\003J\032\020\004\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\b0\0060\005H&J\"\020\t\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\b0\0060\0052\006\020\n\032\0020\013H\004J\f\020\f\032\0020\007*\0020\013H$\001\002\017\020¨\006\021"}, d2 = {"Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary;", "", "<init>", "()V", "read", "", "Lkotlin/Pair;", "", "Lio/swagger/v3/oas/models/OpenAPI;", "doRead", "root", "Ljava/nio/file/Path;", "toOpenApiLocation", "Local", "Classpath", "Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath;", "Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Local;", "tasks-codegen-model"})
/*     */ @SourceDebugExtension({"SMAP\nTasksOpenApiLibrary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1863#2:93\n1864#2:95\n1#3:94\n*S KotlinDebug\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary\n*L\n16#1:93\n16#1:95\n*E\n"})
/*     */ public abstract class TasksOpenApiLibrary {
/*     */   private TasksOpenApiLibrary() {}
/*     */   
/*     */   @NotNull
/*     */   public abstract List<Pair<String, OpenAPI>> read();
/*     */   
/*     */   @NotNull
/*  14 */   protected final List<Pair<String, OpenAPI>> doRead(@NotNull Path root) { Intrinsics.checkNotNullParameter(root, "root"); List<Pair<String, OpenAPI>> result = new ArrayList();
/*  15 */     DirectoryStream<Path> directoryStream = Files.newDirectoryStream(root); Throwable throwable = null; try { DirectoryStream<Path> it = directoryStream; int $i$a$-use-TasksOpenApiLibrary$doRead$1 = 0;
/*  16 */       Intrinsics.checkNotNull(it); Iterable<Path> $this$forEach$iv = it; int $i$f$forEach = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*  93 */       Iterator<Path> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(); Path path = (Path)element$iv; int $i$a$-forEach-TasksOpenApiLibrary$doRead$1$1 = 0; Intrinsics.checkNotNull(path); }  Unit unit = Unit.INSTANCE; } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(directoryStream, throwable); }  return result; } @NotNull protected abstract String toOpenApiLocation(@NotNull Path paramPath); @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\002\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005B\021\b\026\022\006\020\006\032\0020\007¢\006\004\b\004\020\bJ\032\020\013\032\024\022\020\022\016\022\004\022\0020\007\022\004\022\0020\0160\r0\fH\026J\f\020\017\032\0020\007*\0020\003H\024R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\t\020\n¨\006\020"}, d2 = {"Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Local;", "Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary;", "root", "Ljava/nio/file/Path;", "<init>", "(Ljava/nio/file/Path;)V", "rootPath", "", "(Ljava/lang/String;)V", "getRoot", "()Ljava/nio/file/Path;", "read", "", "Lkotlin/Pair;", "Lio/swagger/v3/oas/models/OpenAPI;", "toOpenApiLocation", "tasks-codegen-model"}) @SourceDebugExtension({"SMAP\nTasksOpenApiLibrary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Local\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,92:1\n1#2:93\n*E\n"}) public static final class Local extends TasksOpenApiLibrary { @NotNull private final Path root; public Local(@NotNull Path root) { super(null); this.root = root; if (!Files.exists(this.root, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) { int $i$a$-check-TasksOpenApiLibrary$Local$1 = 0; String str = "Tasks OpenAPI resources directory does not exist: " + this.root; throw new IllegalStateException(str.toString()); }  if (!Files.isDirectory(this.root, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) { int $i$a$-check-TasksOpenApiLibrary$Local$2 = 0; String str = "Tasks OpenAPI resources should be a directory"; throw new IllegalStateException(str.toString()); }  } @NotNull public final Path getRoot() { return this.root; } public Local(@NotNull String rootPath) { this(Paths.get(rootPath, new String[0])); } @NotNull public List<Pair<String, OpenAPI>> read() { return doRead(this.root); } @NotNull protected String toOpenApiLocation(@NotNull Path $this$toOpenApiLocation) { Intrinsics.checkNotNullParameter($this$toOpenApiLocation, "<this>"); URI uri = $this$toOpenApiLocation.toUri(); Intrinsics.checkNotNullExpressionValue((new URI(uri.getScheme(), null, uri.getPath(), uri.getQuery(), uri.getFragment())).toString(), "toString(...)"); return (new URI(uri.getScheme(), null, uri.getPath(), uri.getQuery(), uri.getFragment())).toString(); } } @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\020\036\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\030\0002\0020\001B\023\022\n\020\002\032\006\022\002\b\0030\003¢\006\004\b\004\020\005J\032\020\006\032\024\022\020\022\016\022\004\022\0020\t\022\004\022\0020\n0\b0\007H\026J\030\020\013\032\b\022\004\022\0020\t0\f*\b\022\004\022\0020\t0\007H\002J\035\020\r\032\n \017*\004\030\0010\0160\0162\006\020\020\032\0020\021H\002¢\006\002\020\022J\f\020\023\032\0020\t*\0020\024H\024R\022\020\002\032\006\022\002\b\0030\003X\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath;", "Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary;", "clazz", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "read", "", "Lkotlin/Pair;", "", "Lio/swagger/v3/oas/models/OpenAPI;", "duplicates", "", "getFileSystem", "Ljava/nio/file/FileSystem;", "kotlin.jvm.PlatformType", "uri", "Ljava/net/URI;", "(Ljava/net/URI;)Ljava/nio/file/FileSystem;", "toOpenApiLocation", "Ljava/nio/file/Path;", "tasks-codegen-model"}) @SourceDebugExtension({"SMAP\nTasksOpenApiLibrary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,92:1\n1#2:93\n1557#3:94\n1628#3,3:95\n1557#3:98\n1628#3,3:99\n1544#3:102\n535#4:103\n520#4,6:104\n*S KotlinDebug\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath\n*L\n59#1:94\n59#1:95,3\n73#1:98\n73#1:99,3\n80#1:102\n80#1:103\n80#1:104,6\n*E\n"}) public static final class Classpath extends TasksOpenApiLibrary { @NotNull private final Class<?> clazz; @NotNull public List<Pair<String, OpenAPI>> read() { Intrinsics.checkNotNullExpressionValue(this.clazz.getClassLoader().getResources("openapi"), "getResources(...)"); Intrinsics.checkNotNullExpressionValue(Collections.list(this.clazz.getClassLoader().getResources("openapi")), "list(...)"); List<URL> openApiResources = Collections.list(this.clazz.getClassLoader().getResources("openapi")); if (!(!openApiResources.isEmpty() ? 1 : 0)) { int $i$a$-check-TasksOpenApiLibrary$Classpath$read$1 = 0; String str = "No `openapi` folders found in resources"; throw new IllegalStateException(str.toString()); }
/*  94 */        Iterable<URL> $this$map$iv = openApiResources; int $i$f$map = 0; Iterable<URL> iterable2 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/*  95 */       for (URL item$iv$iv : iterable2) {
/*  96 */         URL uRL1 = item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-TasksOpenApiLibrary$Classpath$read$result$1 = 0; if (uRL1.toURI() == null) { uRL1.toURI(); throw new IllegalStateException(("Failed to convert " + uRL1 + " to URI").toString()); } 
/*  97 */       }  $this$map$iv = destination$iv$iv; $i$f$map = 0; Iterable<URL> $this$mapTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0; for (URL item$iv$iv : $this$mapTo$iv$iv) { URI uRI = (URI)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-TasksOpenApiLibrary$Classpath$read$result$2 = 0; String str = uRI.getScheme(); }  List result = (List)destination$iv$iv; Iterable iterable1 = CollectionsKt.flatten(result); int i = 0;
/*  98 */       Iterable iterable3 = iterable1; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int j = 0;
/*  99 */       for (Object item$iv$iv : iterable3) {
/* 100 */         Pair pair = (Pair)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-TasksOpenApiLibrary$Classpath$read$keys$1 = 0; collection1.add((String)pair.getFirst());
/* 101 */       }  List<String> keys = (List)collection; if (!((CollectionsKt.toSet(keys).size() == keys.size()) ? 1 : 0)) { int $i$a$-check-TasksOpenApiLibrary$Classpath$read$2 = 0; String str = "The processed OpenAPI resources contain duplicate keys: " + duplicates(keys); throw new IllegalStateException(str.toString()); }  return CollectionsKt.flatten(result); }
/* 102 */     public Classpath(@NotNull Class<?> clazz) { super(null); this.clazz = clazz; } private final Collection<String> duplicates(List $this$duplicates) { Iterable $this$groupingBy$iv = $this$duplicates; int $i$f$groupingBy = 0; Map $this$filter$iv = GroupingKt.eachCount(new TasksOpenApiLibrary$Classpath$duplicates$$inlined$groupingBy$1($this$groupingBy$iv)); int $i$f$filter = 0;
/* 103 */       Map map1 = $this$filter$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 104 */       for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 105 */         Map.Entry it = element$iv$iv; int $i$a$-filter-TasksOpenApiLibrary$Classpath$duplicates$2 = 0; if ((((Number)it.getValue()).intValue() > 1)) {
/* 106 */           destination$iv$iv.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*     */         }
/*     */       } 
/* 109 */       return destination$iv$iv.keySet(); }
/*     */ 
/*     */     
/*     */     private final FileSystem getFileSystem(URI uri) {
/*     */       FileSystem fileSystem;
/*     */       try {
/*     */         fileSystem = FileSystems.getFileSystem(uri);
/*     */       } catch (FileSystemNotFoundException e) {
/*     */         fileSystem = FileSystems.newFileSystem(uri, MapsKt.emptyMap());
/*     */       } 
/*     */       return fileSystem;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     protected String toOpenApiLocation(@NotNull Path $this$toOpenApiLocation) {
/*     */       Intrinsics.checkNotNullParameter($this$toOpenApiLocation, "<this>");
/*     */       return $this$toOpenApiLocation.toString();
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-codegen-model-0.4.32.jar!\ai\grazie\tasks\codegen\model\TasksOpenApiLibrary.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */