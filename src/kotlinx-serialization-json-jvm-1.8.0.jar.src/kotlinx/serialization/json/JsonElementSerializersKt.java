/*     */ package kotlinx.serialization.json;
/*     */ 
/*     */ import java.lang.annotation.Annotation;
/*     */ import java.util.List;
/*     */ import kotlin.Lazy;
/*     */ import kotlin.LazyKt;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.functions.Function0;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Reflection;
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
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000,\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\020\020\000\032\0020\0012\006\020\002\032\0020\003H\002\032\020\020\000\032\0020\0012\006\020\004\032\0020\005H\002\032\f\020\006\032\0020\007*\0020\005H\000\032\f\020\b\032\0020\t*\0020\003H\000\032\026\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0130\rH\002¨\006\016"}, d2 = {"verify", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "asJsonDecoder", "Lkotlinx/serialization/json/JsonDecoder;", "asJsonEncoder", "Lkotlinx/serialization/json/JsonEncoder;", "defer", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "deferred", "Lkotlin/Function0;", "kotlinx-serialization-json"})
/*     */ public final class JsonElementSerializersKt
/*     */ {
/*     */   private static final void verify(Encoder encoder) {
/* 194 */     asJsonEncoder(encoder);
/*     */   }
/*     */   
/*     */   private static final void verify(Decoder decoder) {
/* 198 */     asJsonDecoder(decoder);
/*     */   }
/*     */   @NotNull
/* 201 */   public static final JsonDecoder asJsonDecoder(@NotNull Decoder $this$asJsonDecoder) { Intrinsics.checkNotNullParameter($this$asJsonDecoder, "<this>"); if ((($this$asJsonDecoder instanceof JsonDecoder) ? (JsonDecoder)$this$asJsonDecoder : null) == null) { ($this$asJsonDecoder instanceof JsonDecoder) ? (JsonDecoder)$this$asJsonDecoder : null;
/* 202 */       throw new IllegalStateException(
/* 203 */           "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got " + 
/* 204 */           Reflection.getOrCreateKotlinClass($this$asJsonDecoder.getClass())); }
/*     */     
/*     */     return ($this$asJsonDecoder instanceof JsonDecoder) ? (JsonDecoder)$this$asJsonDecoder : null; } @NotNull
/* 207 */   public static final JsonEncoder asJsonEncoder(@NotNull Encoder $this$asJsonEncoder) { Intrinsics.checkNotNullParameter($this$asJsonEncoder, "<this>"); if ((($this$asJsonEncoder instanceof JsonEncoder) ? (JsonEncoder)$this$asJsonEncoder : null) == null) { ($this$asJsonEncoder instanceof JsonEncoder) ? (JsonEncoder)$this$asJsonEncoder : null;
/* 208 */       throw new IllegalStateException(
/* 209 */           "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got " + 
/* 210 */           Reflection.getOrCreateKotlinClass($this$asJsonEncoder.getClass())); }
/*     */     
/*     */     return ($this$asJsonEncoder instanceof JsonEncoder) ? (JsonEncoder)$this$asJsonEncoder : null; }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final SerialDescriptor defer(Function0<? extends SerialDescriptor> deferred) {
/* 219 */     return new JsonElementSerializersKt$defer$1(deferred);
/*     */   } @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\0007\n\000\n\002\030\002\n\002\b\006\n\002\020\016\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\002\b\007\n\002\020 \n\002\020\033\n\002\b\002\n\002\020\013\n\000*\001\000\b\n\030\0002\0020\001J\020\020\023\032\0020\b2\006\020\024\032\0020\020H\026J\020\020\025\032\0020\0202\006\020\026\032\0020\bH\026J\026\020\027\032\b\022\004\022\0020\0310\0302\006\020\024\032\0020\020H\026J\020\020\032\032\0020\0012\006\020\024\032\0020\020H\026J\020\020\033\032\0020\0342\006\020\024\032\0020\020H\026R\033\020\002\032\0020\0018BX\002¢\006\f\n\004\b\005\020\006\032\004\b\003\020\004R\024\020\007\032\0020\b8VX\004¢\006\006\032\004\b\t\020\nR\024\020\013\032\0020\f8VX\004¢\006\006\032\004\b\r\020\016R\024\020\017\032\0020\0208VX\004¢\006\006\032\004\b\021\020\022¨\006\035"}, d2 = {"kotlinx/serialization/json/JsonElementSerializersKt$defer$1", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "original", "getOriginal", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "original$delegate", "Lkotlin/Lazy;", "serialName", "", "getSerialName", "()Ljava/lang/String;", "kind", "Lkotlinx/serialization/descriptors/SerialKind;", "getKind", "()Lkotlinx/serialization/descriptors/SerialKind;", "elementsCount", "", "getElementsCount", "()I", "getElementName", "index", "getElementIndex", "name", "getElementAnnotations", "", "", "getElementDescriptor", "isElementOptional", "", "kotlinx-serialization-json"})
/* 221 */   public static final class JsonElementSerializersKt$defer$1 implements SerialDescriptor { JsonElementSerializersKt$defer$1(Function0 $deferred) { this.original$delegate = LazyKt.lazy($deferred); } private final Lazy original$delegate; private final SerialDescriptor getOriginal() { Lazy lazy = this.original$delegate; return (SerialDescriptor)lazy.getValue(); }
/*     */     
/*     */     public String getSerialName() {
/* 224 */       return getOriginal().getSerialName();
/*     */     } public SerialKind getKind() {
/* 226 */       return getOriginal().getKind();
/*     */     } public int getElementsCount() {
/* 228 */       return getOriginal().getElementsCount();
/*     */     }
/* 230 */     public String getElementName(int index) { return getOriginal().getElementName(index); }
/* 231 */     public int getElementIndex(String name) { Intrinsics.checkNotNullParameter(name, "name"); return getOriginal().getElementIndex(name); }
/* 232 */     public List<Annotation> getElementAnnotations(int index) { return getOriginal().getElementAnnotations(index); }
/* 233 */     public SerialDescriptor getElementDescriptor(int index) { return getOriginal().getElementDescriptor(index); } public boolean isElementOptional(int index) {
/* 234 */       return getOriginal().isElementOptional(index);
/*     */     } }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\JsonElementSerializersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */