/*   */ package ai.grazie.nlp.utils;
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\005\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002JC\020\003\032\024\022\020\022\016\022\004\022\002H\006\022\004\022\002H\0070\0050\004\"\004\b\002\020\006\"\004\b\003\020\0072\f\020\b\032\b\022\004\022\002H\0060\0042\f\020\t\032\b\022\004\022\002H\0070\004HÆ\001¨\006\n"}, d2 = {"Lai/grazie/nlp/utils/TwoWayMutableMap$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lai/grazie/nlp/utils/TwoWayMutableMap;", "T0", "T1", "typeSerial0", "typeSerial1", "nlp-common"})
/*   */ public final class Companion {
/*   */   @NotNull
/*   */   public final <T0, T1> KSerializer<TwoWayMutableMap<T0, T1>> serializer(@NotNull KSerializer typeSerial0, @NotNull KSerializer typeSerial1) {
/* 6 */     Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); Intrinsics.checkNotNullParameter(typeSerial1, "typeSerial1"); return (KSerializer<TwoWayMutableMap<T0, T1>>)new TwoWayMutableMap.$serializer<>(typeSerial0, typeSerial1);
/*   */   }
/*   */   
/*   */   private Companion() {}
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\nlp-common-jvm-0.4.32.jar!\ai\grazie\nl\\utils\TwoWayMutableMap$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */