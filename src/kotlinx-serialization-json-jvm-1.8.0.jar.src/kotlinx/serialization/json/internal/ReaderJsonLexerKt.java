/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.json.Json;
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
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\"\n\000\n\002\020\b\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\031\n\000\032\"\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\b2\b\b\002\020\t\032\0020\nH\000\"\016\020\000\032\0020\001XT¢\006\002\n\000\"\016\020\002\032\0020\001XT¢\006\002\n\000¨\006\013"}, d2 = {"BATCH_SIZE", "", "DEFAULT_THRESHOLD", "ReaderJsonLexer", "Lkotlinx/serialization/json/internal/ReaderJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "reader", "Lkotlinx/serialization/json/internal/InternalJsonReader;", "buffer", "", "kotlinx-serialization-json"})
/*    */ public final class ReaderJsonLexerKt
/*    */ {
/*    */   public static final int BATCH_SIZE = 16384;
/*    */   private static final int DEFAULT_THRESHOLD = 128;
/*    */   
/*    */   @NotNull
/*    */   public static final ReaderJsonLexer ReaderJsonLexer(@NotNull Json json, @NotNull InternalJsonReader reader, @NotNull char[] buffer) {
/* 42 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(reader, "reader"); Intrinsics.checkNotNullParameter(buffer, "buffer"); return !json.getConfiguration().getAllowComments() ? new ReaderJsonLexer(reader, buffer) : new ReaderJsonLexerWithComments(reader, buffer);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ReaderJsonLexerKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */