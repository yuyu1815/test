/*    */ package kotlinx.serialization.json.internal;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\000\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\000¨\006\006"}, d2 = {"StringJsonLexer", "Lkotlinx/serialization/json/internal/StringJsonLexer;", "json", "Lkotlinx/serialization/json/Json;", "source", "", "kotlinx-serialization-json"})
/*    */ public final class StringJsonLexerKt {
/*    */   @NotNull
/*    */   public static final StringJsonLexer StringJsonLexer(@NotNull Json json, @NotNull String source) {
/* 11 */     Intrinsics.checkNotNullParameter(json, "json"); Intrinsics.checkNotNullParameter(source, "source"); return !json.getConfiguration().getAllowComments() ? new StringJsonLexer(source) : new StringJsonLexerWithComments(source);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\StringJsonLexerKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */