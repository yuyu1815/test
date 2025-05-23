/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import java.lang.annotation.Annotation;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.PublishedApi;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlinx.serialization.ExperimentalSerializationApi;
/*     */ import kotlinx.serialization.KSerializer;
/*     */ import kotlinx.serialization.builtins.BuiltinSerializersKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.descriptors.SerialKind;
/*     */ import kotlinx.serialization.encoding.Decoder;
/*     */ import kotlinx.serialization.encoding.Encoder;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\bÁ\002\030\0002\b\022\004\022\0020\0020\001:\001\021B\t\b\002¢\006\004\b\003\020\004J\030\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\002H\026J\020\020\016\032\0020\0022\006\020\017\032\0020\020H\026R\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\007\020\b¨\006\022"}, d2 = {"Lkotlinx/serialization/json/JsonArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "JsonArrayDescriptor", "kotlinx-serialization-json"})
/*     */ @PublishedApi
/*     */ public final class JsonArraySerializer
/*     */   implements KSerializer<JsonArray>
/*     */ {
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\004\n\002\020 \n\002\020\033\n\000\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\n\n\002\030\002\n\002\b\003\bÂ\002\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003J\027\020\t\032\b\022\004\022\0020\0130\n2\006\020\f\032\0020\rH\001J\021\020\016\032\0020\0012\006\020\f\032\0020\rH\001J\021\020\017\032\0020\r2\006\020\020\032\0020\005H\001J\021\020\021\032\0020\0052\006\020\f\032\0020\rH\001J\021\020\022\032\0020\0232\006\020\f\032\0020\rH\001R\034\020\004\032\0020\0058\026XD¢\006\016\n\000\022\004\b\006\020\003\032\004\b\007\020\bR\032\020\024\032\b\022\004\022\0020\0130\n8VX\005¢\006\006\032\004\b\025\020\026R\022\020\027\032\0020\rX\005¢\006\006\032\004\b\030\020\031R\024\020\032\032\0020\0238VX\005¢\006\006\032\004\b\032\020\033R\024\020\034\032\0020\0238VX\005¢\006\006\032\004\b\034\020\033R\022\020\035\032\0020\036X\005¢\006\006\032\004\b\037\020 ¨\006!"}, d2 = {"Lkotlinx/serialization/json/JsonArraySerializer$JsonArrayDescriptor;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "<init>", "()V", "serialName", "", "getSerialName$annotations", "getSerialName", "()Ljava/lang/String;", "getElementAnnotations", "", "", "index", "", "getElementDescriptor", "getElementIndex", "name", "getElementName", "isElementOptional", "", "annotations", "getAnnotations", "()Ljava/util/List;", "elementsCount", "getElementsCount", "()I", "isInline", "()Z", "isNullable", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "kotlinx-serialization-json"})
/*     */   private static final class JsonArrayDescriptor
/*     */     implements SerialDescriptor
/*     */   {
/*     */     @NotNull
/*     */     public String getSerialName() {
/* 176 */       return serialName; } @NotNull
/* 177 */     public static final JsonArrayDescriptor INSTANCE = new JsonArrayDescriptor(); @NotNull public String getElementName(int index) { return this.$$delegate_0.getElementName(index); } public int getElementIndex(@NotNull String name) { Intrinsics.checkNotNullParameter(name, "name"); return this.$$delegate_0.getElementIndex(name); } @NotNull public List<Annotation> getElementAnnotations(int index) { return this.$$delegate_0.getElementAnnotations(index); } @NotNull public SerialDescriptor getElementDescriptor(int index) { return this.$$delegate_0.getElementDescriptor(index); } public boolean isElementOptional(int index) { return this.$$delegate_0.isElementOptional(index); } @NotNull private static final String serialName = "kotlinx.serialization.json.JsonArray";
/*     */     @NotNull public SerialKind getKind() { return this.$$delegate_0.getKind(); }
/*     */     public boolean isNullable() { return this.$$delegate_0.isNullable(); } public boolean isInline() { return this.$$delegate_0.isInline(); } public int getElementsCount() { return this.$$delegate_0.getElementsCount(); } @NotNull public List<Annotation> getAnnotations() { return this.$$delegate_0.getAnnotations(); }
/* 180 */   } @NotNull public static final JsonArraySerializer INSTANCE = new JsonArraySerializer(); @NotNull private static final SerialDescriptor descriptor = JsonArrayDescriptor.INSTANCE; @NotNull public SerialDescriptor getDescriptor() { return descriptor; }
/*     */   
/*     */   public void serialize(@NotNull Encoder encoder, @NotNull JsonArray value) {
/* 183 */     Intrinsics.checkNotNullParameter(encoder, "encoder"); Intrinsics.checkNotNullParameter(value, "value"); JsonElementSerializersKt.access$verify(encoder);
/* 184 */     BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).serialize(encoder, value);
/*     */   }
/*     */   @NotNull
/*     */   public JsonArray deserialize(@NotNull Decoder decoder) {
/* 188 */     Intrinsics.checkNotNullParameter(decoder, "decoder"); JsonElementSerializersKt.access$verify(decoder);
/* 189 */     return new JsonArray((List<? extends JsonElement>)BuiltinSerializersKt.ListSerializer(JsonElementSerializer.INSTANCE).deserialize(decoder));
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonArraySerializer.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */