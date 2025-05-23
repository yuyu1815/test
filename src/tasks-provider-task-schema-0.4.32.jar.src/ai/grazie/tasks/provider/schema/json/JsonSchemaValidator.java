/*    */ package ai.grazie.tasks.provider.schema.json;
/*    */ import com.fasterxml.jackson.databind.JsonNode;
/*    */ import com.networknt.schema.JsonSchemaFactory;
/*    */ import java.util.Map;
/*    */ import kotlin.Unit;
/*    */ import kotlin.jvm.functions.Function1;
/*    */ 
/*    */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020\016\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\003\bÀ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J.\020\n\032\004\030\0010\0132\006\020\f\032\0020\r2\006\020\016\032\0020\0172\024\b\002\020\020\032\016\022\004\022\0020\022\022\004\022\0020\0230\021J.\020\024\032\004\030\0010\0132\006\020\f\032\0020\0172\006\020\016\032\0020\0172\022\020\020\032\016\022\004\022\0020\022\022\004\022\0020\0230\021H\002J\f\020\025\032\0020\017*\0020\rH\002R\016\020\004\032\0020\005X\004¢\006\002\n\000R\030\020\006\032\n \b*\004\030\0010\0070\007X\004¢\006\004\n\002\020\t¨\006\026"}, d2 = {"Lai/grazie/tasks/provider/schema/json/JsonSchemaValidator;", "", "<init>", "()V", "mapper", "Lcom/fasterxml/jackson/databind/ObjectMapper;", "config", "Lcom/networknt/schema/SchemaValidatorsConfig;", "kotlin.jvm.PlatformType", "Lcom/networknt/schema/SchemaValidatorsConfig;", "verify", "", "parameters", "Lai/grazie/utils/data/DataHolder;", "taskSchema", "Lcom/fasterxml/jackson/databind/JsonNode;", "customizer", "Lkotlin/Function1;", "Lcom/networknt/schema/JsonSchemaFactory$Builder;", "", "doVerify", "toJson", "tasks-provider-task-schema"})
/*    */ @SourceDebugExtension({"SMAP\nJsonSchemaValidator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JsonSchemaValidator.kt\nai/grazie/tasks/provider/schema/json/JsonSchemaValidator\n+ 2 _Maps.kt\nkotlin/collections/MapsKt___MapsKt\n+ 3 SerialFormat.kt\nkotlinx/serialization/SerialFormatKt\n*L\n1#1,50:1\n216#2:51\n217#2:53\n113#3:52\n*S KotlinDebug\n*F\n+ 1 JsonSchemaValidator.kt\nai/grazie/tasks/provider/schema/json/JsonSchemaValidator\n*L\n44#1:51\n44#1:53\n45#1:52\n*E\n"})
/*    */ public final class JsonSchemaValidator {
/*    */   @NotNull
/* 12 */   public static final JsonSchemaValidator INSTANCE = new JsonSchemaValidator(); @NotNull private static final ObjectMapper mapper = new ObjectMapper();
/*    */   
/* 14 */   private static final SchemaValidatorsConfig config = SchemaValidatorsConfig.builder()
/* 15 */     .failFast(true)
/* 16 */     .pathType(PathType.LEGACY)
/* 17 */     .build();
/*    */   
/* 19 */   private static final Unit verify$lambda$0(JsonSchemaFactory.Builder it) { Intrinsics.checkNotNullParameter(it, "it"); return Unit.INSTANCE; } @Nullable public final String verify(@NotNull DataHolder parameters, @NotNull JsonNode taskSchema, @NotNull Function1<? super JsonSchemaFactory.Builder, Unit> customizer) { JsonNode jsonNode1;
/* 20 */     Intrinsics.checkNotNullParameter(parameters, "parameters"); Intrinsics.checkNotNullParameter(taskSchema, "taskSchema"); Intrinsics.checkNotNullParameter(customizer, "customizer"); try {
/* 21 */       jsonNode1 = toJson(parameters);
/* 22 */     } catch (Exception e) {
/* 23 */       return ": Malformed task parameters";
/*    */     }  JsonNode jsonParameters = jsonNode1;
/* 25 */     return doVerify(jsonParameters, taskSchema, customizer); }
/*    */ 
/*    */   
/*    */   private final String doVerify(JsonNode parameters, JsonNode taskSchema, Function1 customizer) {
/* 29 */     JsonSchemaFactory jsonSchemaFactory = JsonSchemaFactory.getInstance(SpecVersion.VersionFlag.V202012, customizer::doVerify$lambda$1);
/*    */     
/* 31 */     JsonSchema jsonSchema = jsonSchemaFactory.getSchema(taskSchema, config);
/* 32 */     Set validationMessages = jsonSchema.validate(parameters);
/*    */     
/* 34 */     Intrinsics.checkNotNull(validationMessages); String errorMessage = CollectionsKt.joinToString$default(validationMessages, "\n", null, null, 0, null, null, 62, null);
/* 35 */     if ((((CharSequence)errorMessage).length() > 0)) {
/* 36 */       return StringsKt.removePrefix(errorMessage, "$");
/*    */     }
/*    */     
/* 39 */     return null;
/*    */   } private static final void doVerify$lambda$1(Function1 $tmp0, JsonSchemaFactory.Builder p0) {
/*    */     $tmp0.invoke(p0);
/*    */   } private final JsonNode toJson(DataHolder $this$toJson) {
/* 43 */     ObjectNode result = mapper.createObjectNode();
/* 44 */     Map $this$forEach$iv = (Map)$this$toJson; int $i$f$forEach = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 51 */     Iterator<Map.Entry> iterator = $this$forEach$iv.entrySet().iterator(); if (iterator.hasNext()) { Map.Entry element$iv = iterator.next(), entry1 = element$iv; int $i$a$-forEach-JsonSchemaValidator$toJson$1 = 0; String key = (String)entry1.getKey(); JsonElement value = (JsonElement)entry1.getValue(); StringFormat $this$encodeToString$iv = (StringFormat)Json.Default; int $i$f$encodeToString = 0;
/* 52 */       $this$encodeToString$iv.getSerializersModule(); }
/*    */     
/*    */     Intrinsics.checkNotNull(result);
/*    */     return (JsonNode)result;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\tasks-provider-task-schema-0.4.32.jar!\ai\grazie\tasks\provider\schema\json\JsonSchemaValidator.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */