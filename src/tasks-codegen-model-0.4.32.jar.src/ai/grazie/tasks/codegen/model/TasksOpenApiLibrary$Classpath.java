/*     */ package ai.grazie.tasks.codegen.model;
/*     */ 
/*     */ import io.swagger.v3.oas.models.OpenAPI;
/*     */ import java.net.URI;
/*     */ import java.net.URL;
/*     */ import java.nio.file.FileSystem;
/*     */ import java.nio.file.FileSystemNotFoundException;
/*     */ import java.nio.file.FileSystems;
/*     */ import java.nio.file.Path;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Collections;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.GroupingKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import org.jetbrains.annotations.NotNull;
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
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\020\036\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\030\0002\0020\001B\023\022\n\020\002\032\006\022\002\b\0030\003¢\006\004\b\004\020\005J\032\020\006\032\024\022\020\022\016\022\004\022\0020\t\022\004\022\0020\n0\b0\007H\026J\030\020\013\032\b\022\004\022\0020\t0\f*\b\022\004\022\0020\t0\007H\002J\035\020\r\032\n \017*\004\030\0010\0160\0162\006\020\020\032\0020\021H\002¢\006\002\020\022J\f\020\023\032\0020\t*\0020\024H\024R\022\020\002\032\006\022\002\b\0030\003X\004¢\006\002\n\000¨\006\025"}, d2 = {"Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath;", "Lai/grazie/tasks/codegen/model/TasksOpenApiLibrary;", "clazz", "Ljava/lang/Class;", "<init>", "(Ljava/lang/Class;)V", "read", "", "Lkotlin/Pair;", "", "Lio/swagger/v3/oas/models/OpenAPI;", "duplicates", "", "getFileSystem", "Ljava/nio/file/FileSystem;", "kotlin.jvm.PlatformType", "uri", "Ljava/net/URI;", "(Ljava/net/URI;)Ljava/nio/file/FileSystem;", "toOpenApiLocation", "Ljava/nio/file/Path;", "tasks-codegen-model"})
/*     */ @SourceDebugExtension({"SMAP\nTasksOpenApiLibrary.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n*L\n1#1,92:1\n1#2:93\n1557#3:94\n1628#3,3:95\n1557#3:98\n1628#3,3:99\n1544#3:102\n535#4:103\n520#4,6:104\n*S KotlinDebug\n*F\n+ 1 TasksOpenApiLibrary.kt\nai/grazie/tasks/codegen/model/TasksOpenApiLibrary$Classpath\n*L\n59#1:94\n59#1:95,3\n73#1:98\n73#1:99,3\n80#1:102\n80#1:103\n80#1:104,6\n*E\n"})
/*     */ public final class Classpath
/*     */   extends TasksOpenApiLibrary
/*     */ {
/*     */   @NotNull
/*     */   private final Class<?> clazz;
/*     */   
/*     */   public Classpath(@NotNull Class<?> clazz) {
/*  54 */     super(null); this.clazz = clazz;
/*     */   } @NotNull
/*  56 */   public List<Pair<String, OpenAPI>> read() { Intrinsics.checkNotNullExpressionValue(this.clazz.getClassLoader().getResources("openapi"), "getResources(...)"); Intrinsics.checkNotNullExpressionValue(Collections.list(this.clazz.getClassLoader().getResources("openapi")), "list(...)"); List<URL> openApiResources = Collections.list(this.clazz.getClassLoader().getResources("openapi"));
/*  57 */     if (!(!openApiResources.isEmpty() ? 1 : 0)) {
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
/*  93 */       int $i$a$-check-TasksOpenApiLibrary$Classpath$read$1 = 0; String str = "No `openapi` folders found in resources"; throw new IllegalStateException(str.toString());
/*  94 */     }  Iterable<URL> $this$map$iv = openApiResources; int $i$f$map = 0; Iterable<URL> iterable2 = $this$map$iv; Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/*  95 */     for (URL item$iv$iv : iterable2) {
/*  96 */       URL uRL1 = item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-TasksOpenApiLibrary$Classpath$read$result$1 = 0; if (uRL1.toURI() == null) { uRL1.toURI(); throw new IllegalStateException(("Failed to convert " + uRL1 + " to URI").toString()); } 
/*  97 */     }  $this$map$iv = destination$iv$iv; $i$f$map = 0; Iterable<URL> $this$mapTo$iv$iv = $this$map$iv; destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); $i$f$mapTo = 0; for (URL item$iv$iv : $this$mapTo$iv$iv) { URI uRI = (URI)item$iv$iv; Collection collection1 = destination$iv$iv; int $i$a$-map-TasksOpenApiLibrary$Classpath$read$result$2 = 0; String str = uRI.getScheme(); }  List result = (List)destination$iv$iv; Iterable iterable1 = CollectionsKt.flatten(result); int i = 0;
/*  98 */     Iterable iterable3 = iterable1; Collection<String> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault(iterable1, 10)); int j = 0;
/*  99 */     for (Object item$iv$iv : iterable3) {
/* 100 */       Pair pair = (Pair)item$iv$iv; Collection<String> collection1 = collection; int $i$a$-map-TasksOpenApiLibrary$Classpath$read$keys$1 = 0; collection1.add((String)pair.getFirst());
/* 101 */     }  List<String> keys = (List)collection; if (!((CollectionsKt.toSet(keys).size() == keys.size()) ? 1 : 0)) { int $i$a$-check-TasksOpenApiLibrary$Classpath$read$2 = 0; String str = "The processed OpenAPI resources contain duplicate keys: " + duplicates(keys); throw new IllegalStateException(str.toString()); }
/* 102 */      return CollectionsKt.flatten(result); } private final Collection<String> duplicates(List $this$duplicates) { Iterable $this$groupingBy$iv = $this$duplicates; int $i$f$groupingBy = 0; Map $this$filter$iv = GroupingKt.eachCount(new TasksOpenApiLibrary$Classpath$duplicates$$inlined$groupingBy$1($this$groupingBy$iv)); int $i$f$filter = 0;
/* 103 */     Map map1 = $this$filter$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(); int $i$f$filterTo = 0;
/* 104 */     for (Map.Entry element$iv$iv : map1.entrySet()) {
/* 105 */       Map.Entry it = element$iv$iv; int $i$a$-filter-TasksOpenApiLibrary$Classpath$duplicates$2 = 0; if ((((Number)it.getValue()).intValue() > 1)) {
/* 106 */         destination$iv$iv.put(element$iv$iv.getKey(), element$iv$iv.getValue());
/*     */       }
/*     */     } 
/* 109 */     return destination$iv$iv.keySet(); }
/*     */ 
/*     */   
/*     */   private final FileSystem getFileSystem(URI uri) {
/*     */     FileSystem fileSystem;
/*     */     try {
/*     */       fileSystem = FileSystems.getFileSystem(uri);
/*     */     } catch (FileSystemNotFoundException e) {
/*     */       fileSystem = FileSystems.newFileSystem(uri, MapsKt.emptyMap());
/*     */     } 
/*     */     return fileSystem;
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   protected String toOpenApiLocation(@NotNull Path $this$toOpenApiLocation) {
/*     */     Intrinsics.checkNotNullParameter($this$toOpenApiLocation, "<this>");
/*     */     return $this$toOpenApiLocation.toString();
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-codegen-model-0.4.32.jar!\ai\grazie\tasks\codegen\model\TasksOpenApiLibrary$Classpath.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */