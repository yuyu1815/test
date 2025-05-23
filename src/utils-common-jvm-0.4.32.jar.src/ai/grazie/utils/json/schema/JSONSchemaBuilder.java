/*    */ package ai.grazie.utils.json.schema;
/*    */ import ai.grazie.utils.json.JSON;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\002\n\002\030\002\n\000\n\002\020\016\n\000\030\0002\0020\001B\005¢\006\002\020\002J\037\020\005\032\0020\0002\027\020\006\032\023\022\004\022\0020\004\022\004\022\0020\b0\007¢\006\002\b\tJ\006\020\n\032\0020\013R\016\020\003\032\0020\004X\004¢\006\002\n\000¨\006\f"}, d2 = {"Lai/grazie/utils/json/schema/JSONSchemaBuilder;", "", "()V", "root", "Lai/grazie/utils/json/schema/JSONSchemaType$JSONObjectType;", "invoke", "init", "Lkotlin/Function1;", "", "Lkotlin/ExtensionFunctionType;", "schema", "", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nJSONSchema.kt\nKotlin\n*S Kotlin\n*F\n+ 1 JSONSchema.kt\nai/grazie/utils/json/schema/JSONSchemaBuilder\n+ 2 JSON.kt\nai/grazie/utils/json/JSON\n*L\n1#1,26:1\n28#2:27\n*S KotlinDebug\n*F\n+ 1 JSONSchema.kt\nai/grazie/utils/json/schema/JSONSchemaBuilder\n*L\n15#1:27\n*E\n"})
/*    */ public final class JSONSchemaBuilder {
/*    */   @NotNull
/*  8 */   private final JSONSchemaType.JSONObjectType root = new JSONSchemaType.JSONObjectType(null, new HashMap<>(), null, 4, null);
/*    */   @NotNull
/*    */   public final JSONSchemaBuilder invoke(@NotNull Function1 init) {
/* 11 */     Intrinsics.checkNotNullParameter(init, "init"); JSONSchemaType.JSONObjectType jSONObjectType = this.root; init.invoke(jSONObjectType);
/* 12 */     return this;
/*    */   } @NotNull
/*    */   public final String schema() {
/* 15 */     JSON jSON = (JSON)JSON.Default.INSTANCE; Intrinsics.checkNotNull(this.root, "null cannot be cast to non-null type ai.grazie.utils.json.schema.JSONSchemaType"); Object value$iv = this.root; int $i$f$string = 0; return 
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
/* 27 */       jSON.string((SerializationStrategy)JSONSchemaType.Companion.serializer(), value$iv);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\json\schema\JSONSchemaBuilder.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */