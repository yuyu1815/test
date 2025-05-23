/*    */ package ai.grazie.tasks.provider.schema.json.validation;
/*    */ import com.fasterxml.jackson.databind.JsonNode;
/*    */ import java.io.InputStream;
/*    */ import java.net.URI;
/*    */ import java.nio.file.Path;
/*    */ import java.util.Map;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\002\b\002\bÆ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\016\020\b\032\0020\t2\006\020\n\032\0020\013J\032\020\b\032\0020\t2\n\020\f\032\006\022\002\b\0030\r2\006\020\n\032\0020\016J\016\020\b\032\0020\t2\006\020\017\032\0020\020J\016\020\b\032\0020\t2\006\020\021\032\0020\016J\b\020\022\032\0020\007H\002J/\020\023\032\002H\024\"\004\b\000\020\0242\006\020\025\032\0020\0262\022\020\027\032\016\022\004\022\0020\013\022\004\022\002H\0240\030H\002¢\006\002\020\031R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000¨\006\032"}, d2 = {"Lai/grazie/tasks/provider/schema/json/validation/JsonSchemaReader;", "", "<init>", "()V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "jsonSchema", "Lcom/networknt/schema/JsonSchema;", "readSchema", "Lcom/fasterxml/jackson/databind/JsonNode;", "path", "Ljava/nio/file/Path;", "context", "Ljava/lang/Class;", "", "input", "Ljava/io/InputStream;", "schema", "readBaseSchema", "withPath", "T", "uri", "Ljava/net/URI;", "block", "Lkotlin/Function1;", "(Ljava/net/URI;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "tasks-provider-task-schema"})
/*    */ @SourceDebugExtension({"SMAP\nJsonSchemaReader.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonSchemaReader.kt\nai/grazie/tasks/provider/schema/json/validation/JsonSchemaReader\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,78:1\n1#2:79\n1187#3,2:80\n1261#3,4:82\n*S KotlinDebug\n*F\n+ 1 JsonSchemaReader.kt\nai/grazie/tasks/provider/schema/json/validation/JsonSchemaReader\n*L\n54#1:80,2\n54#1:82,4\n*E\n"})
/*    */ public final class JsonSchemaReader {
/*    */   @NotNull
/* 14 */   public static final JsonSchemaReader INSTANCE = new JsonSchemaReader(); @NotNull private static final ObjectMapper mapper = new ObjectMapper((JsonFactory)new YAMLFactory());
/*    */   @NotNull
/* 16 */   private static final JsonSchema jsonSchema = INSTANCE.readBaseSchema();
/*    */   @NotNull
/*    */   public final JsonNode readSchema(@NotNull Path path) {
/* 19 */     Intrinsics.checkNotNullParameter(path, "path"); return readSchema(PathsKt.readText$default(path, null, 1, null));
/*    */   } @NotNull
/*    */   public final JsonNode readSchema(@NotNull Class context, @NotNull String path) {
/*    */     InputStream inputStream;
/* 23 */     Intrinsics.checkNotNullParameter(context, "context"); Intrinsics.checkNotNullParameter(path, "path"); if (context.getClassLoader().getResourceAsStream(path) == null) { context.getClassLoader().getResourceAsStream(path); throw new IllegalStateException(("missing resource " + path).toString()); }
/* 24 */      return readSchema(inputStream);
/*    */   }
/*    */   @NotNull
/*    */   public final JsonNode readSchema(@NotNull InputStream input) {
/* 28 */     Intrinsics.checkNotNullParameter(input, "input"); InputStream inputStream = input; Charset charset = Charsets.UTF_8; return readSchema(TextStreamsKt.readText(new InputStreamReader(inputStream, charset)));
/*    */   } @NotNull
/*    */   public final JsonNode readSchema(@NotNull String schema) {
/*    */     JsonNode jsonNode1;
/* 32 */     Intrinsics.checkNotNullParameter(schema, "schema"); try {
/* 33 */       jsonNode1 = mapper.readTree(schema);
/* 34 */     } catch (Exception e) {
/* 35 */       throw new IllegalStateException("provided schema is not a JSON node", (Throwable)e);
/*    */     }  JsonNode data = jsonNode1;
/* 37 */     if (data.isMissingNode()) throw new IllegalStateException(
/* 38 */           "provided schema is not a JSON node".toString());
/*    */ 
/*    */     
/* 41 */     Intrinsics.checkNotNullExpressionValue(jsonSchema.validate(data), "validate(...)"); ValidationMessage validationMessage = (ValidationMessage)CollectionsKt.firstOrNull(jsonSchema.validate(data)); if (validationMessage != null) { ValidationMessage it = validationMessage; int $i$a$-let-JsonSchemaReader$readSchema$1 = 0;
/* 42 */       Intrinsics.checkNotNullExpressionValue(it.getMessage(), "getMessage(...)"); String str = "provided schema is not a valid JSON schema - " + StringsKt.removePrefix(StringsKt.removePrefix(it.getMessage(), "$"), "."); throw new IllegalStateException(str.toString()); }
/*    */ 
/*    */     
/* 45 */     Intrinsics.checkNotNull(data); return data;
/*    */   }
/*    */   
/*    */   private final JsonSchema readBaseSchema() { URI mainSchema;
/* 49 */     if (getClass().getClassLoader().getResource("json_schema_202012/schema.json") == null || getClass().getClassLoader().getResource("json_schema_202012/schema.json").toURI() == null) { getClass().getClassLoader().getResource("json_schema_202012/schema.json").toURI(); throw new IllegalStateException("Failed to find JSON schema resource file".toString()); }
/* 50 */      Intrinsics.checkNotNullExpressionValue(withPath(mainSchema, JsonSchemaReader::readBaseSchema$lambda$5), "withPath(...)"); return (JsonSchema)withPath(mainSchema, JsonSchemaReader::readBaseSchema$lambda$5); } private static final JsonSchema readBaseSchema$lambda$5(Path mainSchemaPath) {
/* 51 */     Intrinsics.checkNotNullParameter(mainSchemaPath, "mainSchemaPath"); Path metaPath = mainSchemaPath.resolveSibling("meta");
/* 52 */     Intrinsics.checkNotNull(metaPath); if (!Files.exists(metaPath, Arrays.<LinkOption>copyOf(new LinkOption[0], (new LinkOption[0]).length))) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 79 */       int $i$a$-check-JsonSchemaReader$readBaseSchema$1$1 = 0; String str = "Failed to find JSON schema 'meta' folder"; throw new IllegalStateException(str.toString());
/* 80 */     }  Iterable $this$associate$iv = PathsKt.listDirectoryEntries$default(metaPath, null, 1, null); int $i$f$associate = 0; int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
/* 81 */     Iterable iterable1 = $this$associate$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 82 */     for (Object element$iv$iv : iterable1) {
/* 83 */       Map<Object, Object> map = destination$iv$iv; Path it = (Path)element$iv$iv; int $i$a$-associate-JsonSchemaReader$readBaseSchema$1$schemaLib$1 = 0; Pair pair = TuplesKt.to("meta/" + PathsKt.getName(it), PathsKt.readText$default(it, null, 1, null)); map.put(pair.getFirst(), pair.getSecond());
/*    */     } 
/* 85 */     Map<Object, Object> schemaLib = destination$iv$iv;
/*    */     JsonSchemaFactory factory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012, schemaLib::readBaseSchema$lambda$5$lambda$4);
/*    */     SchemaValidatorsConfig config = SchemaValidatorsConfig.builder().failFast(true).pathType(PathType.LEGACY).build();
/*    */     return factory.getSchema(PathsKt.readText$default(mainSchemaPath, null, 1, null), config);
/*    */   }
/*    */   
/*    */   private static final void readBaseSchema$lambda$5$lambda$4$lambda$3(Map $schemaLib, SchemaLoaders.Builder builder) {
/*    */     builder.schemas($schemaLib);
/*    */   }
/*    */   
/*    */   private static final void readBaseSchema$lambda$5$lambda$4(Map $schemaLib, JsonSchemaFactory.Builder it) {
/*    */     it.schemaLoaders($schemaLib::readBaseSchema$lambda$5$lambda$4$lambda$3);
/*    */   }
/*    */   
/*    */   private final <T> T withPath(URI uri, Function1 block) {
/*    */     Object object;
/*    */     try {
/*    */       Intrinsics.checkNotNullExpressionValue(Paths.get(uri), "get(...)");
/*    */       object = block.invoke(Paths.get(uri));
/*    */     } catch (FileSystemNotFoundException e) {
/*    */       FileSystem fileSystem = FileSystems.newFileSystem(uri, MapsKt.emptyMap());
/*    */       Throwable throwable = null;
/*    */       try {
/*    */         FileSystem it = fileSystem;
/*    */         int $i$a$-use-JsonSchemaReader$withPath$1 = 0;
/*    */         Intrinsics.checkNotNullExpressionValue(Paths.get(uri), "get(...)");
/*    */         Object object1 = block.invoke(Paths.get(uri));
/*    */       } catch (Throwable throwable1) {
/*    */         throwable = throwable1 = null;
/*    */         throw throwable1;
/*    */       } finally {
/*    */         CloseableKt.closeFinally(fileSystem, throwable);
/*    */       } 
/*    */       object = object1;
/*    */     } 
/*    */     return (T)object;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-task-schema-0.4.32.jar!\ai\grazie\tasks\provider\schema\json\validation\JsonSchemaReader.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */