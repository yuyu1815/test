/*    */ package ai.grazie.utils.attributes;
/*    */ 
/*    */ import java.util.Map;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlinx.serialization.KSerializer;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\"\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\n\002\020$\n\002\020\016\n\000\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\032\020\003\032\0020\0042\022\020\005\032\016\022\004\022\0020\007\022\004\022\0020\0070\006J\017\020\b\032\b\022\004\022\0020\0040\tHÆ\001¨\006\n"}, d2 = {"Lai/grazie/utils/attributes/StringProperties$Companion;", "", "()V", "fromMap", "Lai/grazie/utils/attributes/StringProperties;", "map", "", "", "serializer", "Lkotlinx/serialization/KSerializer;", "utils-common"})
/*    */ public final class Companion {
/*    */   private Companion() {}
/*    */   
/*    */   @NotNull
/* 14 */   public final KSerializer<StringProperties> serializer() { return new StringProperties.Serializer(); } @NotNull
/*    */   public final StringProperties fromMap(@NotNull Map map) {
/* 16 */     Intrinsics.checkNotNullParameter(map, "map"); return new StringProperties(map, null);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\attributes\StringProperties$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */