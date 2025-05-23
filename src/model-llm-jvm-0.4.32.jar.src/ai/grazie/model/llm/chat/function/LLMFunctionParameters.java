/*    */ package ai.grazie.model.llm.chat.function;
/*    */ 
/*    */ import ai.grazie.utils.json.JSONObject;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import kotlinx.serialization.encoding.Decoder;
/*    */ import kotlinx.serialization.encoding.Encoder;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Serializable(with = LLMFunctionParameters.FunctionParametersSerializer.class)
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\b\n\000\n\002\020\016\n\002\b\003\b\b\030\000 \0232\0020\001:\002\023\024B\017\b\026\022\006\020\002\032\0020\003¢\006\002\020\004B\r\022\006\020\005\032\0020\006¢\006\002\020\007J\t\020\n\032\0020\006HÆ\003J\023\020\013\032\0020\0002\b\b\002\020\005\032\0020\006HÆ\001J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001HÖ\003J\t\020\017\032\0020\020HÖ\001J\b\020\021\032\0020\022H\026R\021\020\005\032\0020\006¢\006\b\n\000\032\004\b\b\020\t¨\006\025"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionParameters;", "", "dto", "Lai/grazie/utils/json/schema/WithSchema;", "(Lai/grazie/utils/json/schema/WithSchema;)V", "schema", "Lai/grazie/utils/json/JSONObject;", "(Lai/grazie/utils/json/JSONObject;)V", "getSchema", "()Lai/grazie/utils/json/JSONObject;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Companion", "FunctionParametersSerializer", "model-llm"})
/*    */ public final class LLMFunctionParameters {
/*    */   @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @NotNull
/*    */   private final JSONObject schema;
/*    */   
/* 19 */   public LLMFunctionParameters(@NotNull JSONObject schema) { this.schema = schema; } @NotNull public final JSONObject getSchema() { return this.schema; }
/*    */   
/* 21 */   public LLMFunctionParameters(@NotNull WithSchema dto) { this(JSONObject.Companion.invoke$default(JSONObject.Companion, dto.getSchema(), null, 2, null)); }
/*    */   @NotNull public final JSONObject component1() { return this.schema; }
/*    */   @NotNull public final LLMFunctionParameters copy(@NotNull JSONObject schema) { Intrinsics.checkNotNullParameter(schema, "schema");
/* 24 */     return new LLMFunctionParameters(schema); } @NotNull public String toString() { return this.schema.getContent(); } public int hashCode() { return this.schema.hashCode(); } public boolean equals(@Nullable Object other) { if (this == other) return true;  if (!(other instanceof LLMFunctionParameters))
/*    */       return false;  LLMFunctionParameters lLMFunctionParameters = (LLMFunctionParameters)other; return !!Intrinsics.areEqual(this.schema, lLMFunctionParameters.schema); } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\016\020\003\032\0020\0042\006\020\005\032\0020\006J\017\020\007\032\b\022\004\022\0020\0040\bHÆ\001¨\006\t"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionParameters$Companion;", "", "()V", "fromJsonString", "Lai/grazie/model/llm/chat/function/LLMFunctionParameters;", "json", "", "serializer", "Lkotlinx/serialization/KSerializer;", "model-llm"}) public static final class Companion
/*    */   {
/* 27 */     private Companion() {} @NotNull public final KSerializer<LLMFunctionParameters> serializer() { return LLMFunctionParameters.FunctionParametersSerializer.INSTANCE; } @NotNull
/* 28 */     public final LLMFunctionParameters fromJsonString(@NotNull String json) { Intrinsics.checkNotNullParameter(json, "json"); return new LLMFunctionParameters(JSONObject.Companion.invoke$default(JSONObject.Companion, json, null, 2, null)); }
/*    */      } @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\004\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\002\b\002\bÀ\002\030\0002\b\022\004\022\0020\0020\001B\007\b\002¢\006\002\020\003J\020\020\b\032\0020\0022\006\020\t\032\0020\nH\026J\030\020\013\032\0020\f2\006\020\r\032\0020\0162\006\020\017\032\0020\002H\026R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\006\020\007¨\006\020"}, d2 = {"Lai/grazie/model/llm/chat/function/LLMFunctionParameters$FunctionParametersSerializer;", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/model/llm/chat/function/LLMFunctionParameters;", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "model-llm"})
/*    */   @SourceDebugExtension({"SMAP\nLLMFunctionParameters.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LLMFunctionParameters.kt\nai/grazie/model/llm/chat/function/LLMFunctionParameters$FunctionParametersSerializer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,45:1\n1#2:46\n*E\n"})
/*    */   public static final class FunctionParametersSerializer implements KSerializer<LLMFunctionParameters> { @NotNull
/* 32 */     public static final FunctionParametersSerializer INSTANCE = new FunctionParametersSerializer(); @NotNull private static final SerialDescriptor descriptor = JsonElement.Companion.serializer().getDescriptor(); @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*    */     
/*    */     @NotNull
/* 35 */     public LLMFunctionParameters deserialize(@NotNull Decoder decoder) { Intrinsics.checkNotNullParameter(decoder, "decoder"); if (!(decoder instanceof JsonDecoder))
/*    */       
/*    */       { 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 46 */         int $i$a$-require-LLMFunctionParameters$FunctionParametersSerializer$deserialize$1 = 0; String str = "This decoder is not a JsonDecoder. Cannot deserialize `FunctionParameters`."; throw new IllegalArgumentException(str.toString()); }  return new LLMFunctionParameters(JSONObject.Companion.invoke$default(JSONObject.Companion, ((JsonDecoder)decoder).decodeJsonElement().toString(), null, 2, null)); } public void serialize(@NotNull Encoder encoder, @NotNull LLMFunctionParameters value) { Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); if (!(encoder instanceof JsonEncoder)) { int $i$a$-require-LLMFunctionParameters$FunctionParametersSerializer$serialize$1 = 0;
/*    */         String str = "This encoder is not a JsonEncoder. Cannot serialize `FunctionParameters`.";
/*    */         throw new IllegalArgumentException(str.toString()); }
/*    */       
/*    */       ((JsonEncoder)encoder).encodeJsonElement(JSON.Default.INSTANCE.parseJsonElement(value.getSchema().getContent())); }
/*    */      }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\model-llm-jvm-0.4.32.jar!\ai\grazie\model\llm\chat\function\LLMFunctionParameters.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */