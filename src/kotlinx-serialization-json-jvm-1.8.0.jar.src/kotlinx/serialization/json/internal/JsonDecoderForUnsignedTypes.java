/*     */ package kotlinx.serialization.json.internal;
/*     */ 
/*     */ import kotlin.KotlinNothingValueException;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.text.UStringsKt;
/*     */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*     */ import kotlinx.serialization.encoding.AbstractDecoder;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import kotlinx.serialization.modules.SerializersModule;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000@\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\030\002\n\002\b\002\n\002\020\t\n\000\n\002\020\005\n\000\n\002\020\n\n\000\b\000\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\020\020\f\032\0020\r2\006\020\016\032\0020\017H\026J\b\020\020\032\0020\rH\026J\b\020\021\032\0020\022H\026J\b\020\023\032\0020\024H\026J\b\020\025\032\0020\026H\026R\016\020\002\032\0020\003X\004¢\006\002\n\000R\024\020\b\032\0020\tX\004¢\006\b\n\000\032\004\b\n\020\013¨\006\027"}, d2 = {"Lkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes;", "Lkotlinx/serialization/encoding/AbstractDecoder;", "lexer", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "<init>", "(Lkotlinx/serialization/json/internal/AbstractJsonLexer;Lkotlinx/serialization/json/Json;)V", "serializersModule", "Lkotlinx/serialization/modules/SerializersModule;", "getSerializersModule", "()Lkotlinx/serialization/modules/SerializersModule;", "decodeElementIndex", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeInt", "decodeLong", "", "decodeByte", "", "decodeShort", "", "kotlinx-serialization-json"})
/*     */ @SourceDebugExtension({"SMAP\nStreamingJsonDecoder.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n+ 2 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/StreamingJsonDecoderKt\n*L\n1#1,392:1\n385#2,5:393\n385#2,5:398\n385#2,5:403\n385#2,5:408\n*S KotlinDebug\n*F\n+ 1 StreamingJsonDecoder.kt\nkotlinx/serialization/json/internal/JsonDecoderForUnsignedTypes\n*L\n378#1:393,5\n379#1:398,5\n380#1:403,5\n381#1:408,5\n*E\n"})
/*     */ public final class JsonDecoderForUnsignedTypes
/*     */   extends AbstractDecoder
/*     */ {
/*     */   @NotNull
/*     */   private final AbstractJsonLexer lexer;
/*     */   @NotNull
/*     */   private final SerializersModule serializersModule;
/*     */   
/*     */   public JsonDecoderForUnsignedTypes(@NotNull AbstractJsonLexer lexer, @NotNull Json json) {
/* 372 */     this.lexer = lexer;
/*     */ 
/*     */     
/* 375 */     this.serializersModule = json.getSerializersModule(); } @NotNull public SerializersModule getSerializersModule() { return this.serializersModule; } public int decodeElementIndex(@NotNull SerialDescriptor descriptor) {
/* 376 */     Intrinsics.checkNotNullParameter(descriptor, "descriptor"); throw new IllegalStateException("unsupported".toString());
/*     */   }
/* 378 */   public int decodeInt() { AbstractJsonLexer abstractJsonLexer = this.lexer; String expectedType$iv = "UInt"; int $i$f$parseString = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 393 */     String input$iv = abstractJsonLexer.consumeStringLenient();
/*     */     try {
/* 395 */       String $this$decodeInt_u24lambda_u240 = input$iv; int $i$a$-parseString-JsonDecoderForUnsignedTypes$decodeInt$1 = 0;
/* 396 */     } catch (IllegalArgumentException e$iv) {
/* 397 */       AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, null, 6, null); throw new KotlinNothingValueException();
/* 398 */     }  return UStringsKt.toUInt($this$decodeInt_u24lambda_u240); } public long decodeLong() { AbstractJsonLexer abstractJsonLexer = this.lexer; String expectedType$iv = "ULong"; int $i$f$parseString = 0; String input$iv = abstractJsonLexer.consumeStringLenient();
/*     */     try {
/* 400 */       String $this$decodeLong_u24lambda_u241 = input$iv; int $i$a$-parseString-JsonDecoderForUnsignedTypes$decodeLong$1 = 0;
/* 401 */     } catch (IllegalArgumentException e$iv) {
/* 402 */       AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, null, 6, null); throw new KotlinNothingValueException();
/* 403 */     }  return UStringsKt.toULong($this$decodeLong_u24lambda_u241); } public byte decodeByte() { AbstractJsonLexer abstractJsonLexer = this.lexer; String expectedType$iv = "UByte"; int $i$f$parseString = 0; String input$iv = abstractJsonLexer.consumeStringLenient();
/*     */     try {
/* 405 */       String $this$decodeByte_u24lambda_u242 = input$iv; int $i$a$-parseString-JsonDecoderForUnsignedTypes$decodeByte$1 = 0;
/* 406 */     } catch (IllegalArgumentException e$iv) {
/* 407 */       AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, null, 6, null); throw new KotlinNothingValueException();
/* 408 */     }  return UStringsKt.toUByte($this$decodeByte_u24lambda_u242); } public short decodeShort() { AbstractJsonLexer abstractJsonLexer = this.lexer; String expectedType$iv = "UShort"; int $i$f$parseString = 0; String input$iv = abstractJsonLexer.consumeStringLenient();
/*     */     try {
/* 410 */       String $this$decodeShort_u24lambda_u243 = input$iv; int $i$a$-parseString-JsonDecoderForUnsignedTypes$decodeShort$1 = 0;
/* 411 */     } catch (IllegalArgumentException e$iv) {
/* 412 */       AbstractJsonLexer.fail$default(abstractJsonLexer, "Failed to parse type '" + expectedType$iv + "' for input '" + input$iv + '\'', 0, null, 6, null); throw new KotlinNothingValueException();
/*     */     } 
/*     */     return UStringsKt.toUShort($this$decodeShort_u24lambda_u243); }
/*     */ 
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonDecoderForUnsignedTypes.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */