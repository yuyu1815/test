/*    */ package kotlinx.serialization.json.internal;
/*    */ 
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.json.Json;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000\024\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\032\030\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\000¨\006\006"}, d2 = {"Composer", "Lkotlinx/serialization/json/internal/Composer;", "sb", "Lkotlinx/serialization/json/internal/InternalJsonWriter;", "json", "Lkotlinx/serialization/json/Json;", "kotlinx-serialization-json"})
/*    */ public final class ComposersKt
/*    */ {
/*    */   @NotNull
/*    */   public static final Composer Composer(@NotNull InternalJsonWriter sb, @NotNull Json json) {
/* 13 */     Intrinsics.checkNotNullParameter(sb, "sb"); Intrinsics.checkNotNullParameter(json, "json"); return json.getConfiguration().getPrettyPrint() ? new ComposerWithPrettyPrint(sb, json) : new Composer(sb);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\kotlinx-serialization-json-jvm-1.8.0.jar!\kotlinx\serialization\json\internal\ComposersKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */