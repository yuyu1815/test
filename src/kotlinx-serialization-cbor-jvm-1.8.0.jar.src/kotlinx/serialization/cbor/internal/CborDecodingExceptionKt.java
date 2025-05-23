/*    */ package kotlinx.serialization.cbor.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\026\n\000\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\b\n\002\b\003\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\000\032\020\020\006\032\0020\0032\006\020\007\032\0020\005H\000¨\006\b"}, d2 = {"CborDecodingException", "Lkotlinx/serialization/cbor/internal/CborDecodingException;", "expected", "", "foundByte", "", "printByte", "b", "kotlinx-serialization-cbor"})
/*    */ public final class CborDecodingExceptionKt
/*    */ {
/*    */   @NotNull
/*    */   public static final CborDecodingException CborDecodingException(@NotNull String expected, int foundByte) {
/* 13 */     Intrinsics.checkNotNullParameter(expected, "expected"); return new CborDecodingException("Expected " + expected + ", but found " + printByte(foundByte));
/*    */   } @NotNull
/*    */   public static final String printByte(int b) {
/* 16 */     String hexCode = "0123456789ABCDEF";
/* 17 */     StringBuilder stringBuilder1 = new StringBuilder(), $this$printByte_u24lambda_u240 = stringBuilder1; int $i$a$-buildString-CborDecodingExceptionKt$printByte$1 = 0;
/* 18 */     $this$printByte_u24lambda_u240.append(hexCode.charAt(b >> 4 & 0xF));
/* 19 */     $this$printByte_u24lambda_u240.append(hexCode.charAt(b & 0xF));
/*    */     return stringBuilder1.toString();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-cbor-jvm-1.8.0.jar!\kotlinx\serialization\cbor\internal\CborDecodingExceptionKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */