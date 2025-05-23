/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.KotlinNothingValueException;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.ranges.RangesKt;
/*    */ import kotlinx.serialization.descriptors.SerialDescriptor;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000<\n\000\n\002\030\002\n\000\n\002\020\b\n\000\n\002\020\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\n\002\020\004\n\002\b\002\n\002\020\001\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\005\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\000\032 \020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\000\032\030\020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\f\032\0020\005H\000\032\024\020\r\032\0020\016*\0020\0172\006\020\020\032\0020\013H\000\032\026\020\021\032\0020\016*\0020\0172\b\b\002\020\022\032\0020\005H\000\032\020\020\023\032\0020\t2\006\020\024\032\0020\025H\000\032 \020\b\032\0020\t2\006\020\n\032\0020\0132\006\020\026\032\0020\0052\006\020\f\032\0020\005H\000\032 \020\027\032\0020\0012\006\020\n\032\0020\0132\006\020\026\032\0020\0052\006\020\f\032\0020\005H\000\032 \020\030\032\0020\0052\006\020\n\032\0020\0132\006\020\026\032\0020\0052\006\020\f\032\0020\005H\002\032\026\020\031\032\0020\007*\0020\0072\b\b\002\020\002\032\0020\003H\000¨\006\032"}, d2 = {"JsonDecodingException", "Lkotlinx/serialization/json/internal/JsonDecodingException;", "offset", "", "message", "", "input", "", "InvalidFloatingPointEncoded", "Lkotlinx/serialization/json/internal/JsonEncodingException;", "value", "", "output", "throwInvalidFloatingPointDecoded", "", "Lkotlinx/serialization/json/internal/AbstractJsonLexer;", "result", "invalidTrailingComma", "entity", "InvalidKeyKindException", "keyDescriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "key", "InvalidFloatingPointDecoded", "unexpectedFpErrorMessage", "minify", "kotlinx-serialization-json"})
/*    */ public final class JsonExceptionsKt
/*    */ {
/*    */   @NotNull
/*    */   public static final JsonDecodingException JsonDecodingException(int offset, @NotNull String message) {
/* 24 */     Intrinsics.checkNotNullParameter(message, "message"); return new JsonDecodingException((offset >= 0) ? ("Unexpected JSON token at offset " + offset + ": " + message) : message);
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final JsonDecodingException JsonDecodingException(int offset, @NotNull String message, @NotNull CharSequence input) {
/* 32 */     Intrinsics.checkNotNullParameter(message, "message"); Intrinsics.checkNotNullParameter(input, "input"); return JsonDecodingException(offset, message + "\nJSON input: " + minify(input, offset)); } @NotNull
/*    */   public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number value, @NotNull String output) {
/* 34 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(output, "output"); return new JsonEncodingException(
/* 35 */         "Unexpected special floating-point value " + value + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + 
/*    */ 
/*    */         
/* 38 */         minify$default(output, 0, 1, null));
/*    */   }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final Void throwInvalidFloatingPointDecoded(@NotNull AbstractJsonLexer $this$throwInvalidFloatingPointDecoded, @NotNull Number result) {
/* 44 */     Intrinsics.checkNotNullParameter($this$throwInvalidFloatingPointDecoded, "<this>"); Intrinsics.checkNotNullParameter(result, "result"); AbstractJsonLexer.fail$default($this$throwInvalidFloatingPointDecoded, "Unexpected special floating-point value " + result + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification", 0, 
/*    */         
/* 46 */         "It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'", 2, null);
/*    */     throw new KotlinNothingValueException();
/*    */   } @NotNull
/*    */   public static final Void invalidTrailingComma(@NotNull AbstractJsonLexer $this$invalidTrailingComma, @NotNull String entity) {
/* 50 */     Intrinsics.checkNotNullParameter($this$invalidTrailingComma, "<this>"); Intrinsics.checkNotNullParameter(entity, "entity"); $this$invalidTrailingComma.fail("Trailing comma before the end of JSON " + entity, 
/* 51 */         $this$invalidTrailingComma.currentPosition - 1, 
/* 52 */         "Trailing commas are non-complaint JSON and not allowed by default. Use 'allowTrailingComma = true' in 'Json {}' builder to support them.");
/*    */     throw new KotlinNothingValueException();
/*    */   }
/*    */   @NotNull
/*    */   public static final JsonEncodingException InvalidKeyKindException(@NotNull SerialDescriptor keyDescriptor) {
/* 57 */     Intrinsics.checkNotNullParameter(keyDescriptor, "keyDescriptor"); return new JsonEncodingException(
/* 58 */         "Value of type '" + keyDescriptor.getSerialName() + "' can't be used in JSON as a key in the map. It should have either primitive or enum kind, but its kind is '" + 
/* 59 */         keyDescriptor.getKind() + "'.\nUse 'allowStructuredMapKeys = true' in 'Json {}' builder to convert such maps to [key1, value1, key2, value2,...] arrays.");
/*    */   }
/*    */ 
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public static final JsonEncodingException InvalidFloatingPointEncoded(@NotNull Number value, @NotNull String key, @NotNull String output) {
/* 66 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(output, "output"); return new JsonEncodingException(unexpectedFpErrorMessage(value, key, output));
/*    */   } @NotNull
/*    */   public static final JsonDecodingException InvalidFloatingPointDecoded(@NotNull Number value, @NotNull String key, @NotNull String output) {
/* 69 */     Intrinsics.checkNotNullParameter(value, "value"); Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(output, "output"); return JsonDecodingException(-1, unexpectedFpErrorMessage(value, key, output));
/*    */   }
/*    */   private static final String unexpectedFpErrorMessage(Number value, String key, String output) {
/* 72 */     return "Unexpected special floating-point value " + value + " with key " + key + ". By default, non-finite floating point values are prohibited because they do not conform JSON specification. It is possible to deserialize them using 'JsonBuilder.allowSpecialFloatingPointValues = true'\nCurrent output: " + 
/*    */ 
/*    */       
/* 75 */       minify$default(output, 0, 1, null);
/*    */   }
/*    */   @NotNull
/*    */   public static final CharSequence minify(@NotNull CharSequence $this$minify, int offset) {
/* 79 */     Intrinsics.checkNotNullParameter($this$minify, "<this>"); if ($this$minify.length() < 200) return $this$minify; 
/* 80 */     if (offset == -1) {
/* 81 */       int i = $this$minify.length() - 60;
/* 82 */       if (i <= 0) return $this$minify; 
/* 83 */       CharSequence charSequence = $this$minify; int j = charSequence.length(); return "....." + charSequence.subSequence(i, j).toString();
/*    */     } 
/*    */     
/* 86 */     int start = offset - 30;
/* 87 */     int end = offset + 30;
/* 88 */     String prefix = (start <= 0) ? "" : ".....";
/* 89 */     String suffix = (end >= $this$minify.length()) ? "" : ".....";
/* 90 */     return prefix + $this$minify.subSequence(RangesKt.coerceAtLeast(start, 0), RangesKt.coerceAtMost(end, $this$minify.length())).toString() + suffix;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\JsonExceptionsKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */