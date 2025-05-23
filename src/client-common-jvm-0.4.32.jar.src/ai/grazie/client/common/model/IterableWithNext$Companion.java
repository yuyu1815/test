/*   */ package ai.grazie.client.common.model;
/*   */ 
/*   */ 
/*   */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\022\020\003\032\b\022\004\022\002H\0050\004\"\004\b\001\020\005J)\020\006\032\016\022\n\022\b\022\004\022\002H\b0\0040\007\"\004\b\001\020\b2\f\020\t\032\b\022\004\022\002H\b0\007HÆ\001¨\006\n"}, d2 = {"Lai/grazie/client/common/model/IterableWithNext$Companion;", "", "()V", "empty", "Lai/grazie/client/common/model/IterableWithNext;", "T", "serializer", "Lkotlinx/serialization/KSerializer;", "T0", "typeSerial0", "client-common"})
/*   */ public final class Companion {
/*   */   @NotNull
/* 7 */   public final <T0> KSerializer<IterableWithNext<T0>> serializer(@NotNull KSerializer typeSerial0) { Intrinsics.checkNotNullParameter(typeSerial0, "typeSerial0"); return (KSerializer<IterableWithNext<T0>>)new IterableWithNext.$serializer(typeSerial0); } private Companion() {} @NotNull
/* 8 */   public final <T> IterableWithNext<T> empty() { return new IterableWithNext<>(CollectionsKt.emptyList(), false); }
/*   */ 
/*   */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\IterableWithNext$Companion.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */