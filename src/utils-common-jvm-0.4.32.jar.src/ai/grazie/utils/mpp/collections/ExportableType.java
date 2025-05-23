/*    */ package ai.grazie.utils.mpp.collections;
/*    */ 
/*    */ import kotlin.reflect.KClass;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\021\n\002\b\007\n\002\020\013\n\002\b\002\n\002\020\b\n\000\b\007\030\0002\0020\001B\037\b\000\022\n\020\002\032\006\022\002\b\0030\003\022\n\020\004\032\006\022\002\b\0030\005¢\006\002\020\006J\023\020\f\032\0020\r2\b\020\016\032\004\030\0010\001H\002J\b\020\017\032\0020\020H\026R\032\020\004\032\006\022\002\b\0030\005X\004¢\006\n\n\002\020\t\032\004\b\007\020\bR\030\020\002\032\006\022\002\b\0030\003X\004¢\006\b\n\000\032\004\b\n\020\013¨\006\021"}, d2 = {"Lai/grazie/utils/mpp/collections/ExportableType;", "", "klass", "Lkotlin/reflect/KClass;", "emptyArray", "", "(Lkotlin/reflect/KClass;[Ljava/lang/Object;)V", "getEmptyArray$utils_common", "()[Ljava/lang/Object;", "[Ljava/lang/Object;", "getKlass$utils_common", "()Lkotlin/reflect/KClass;", "equals", "", "other", "hashCode", "", "utils-common"})
/*    */ public final class ExportableType {
/*    */   @NotNull
/*    */   private final KClass<?> klass;
/*    */   @NotNull
/*    */   private final Object[] emptyArray;
/*    */   
/* 14 */   public ExportableType(@NotNull KClass<?> klass, @NotNull Object[] emptyArray) { this.klass = klass; this.emptyArray = emptyArray; } @NotNull public final KClass<?> getKlass$utils_common() { return this.klass; } @NotNull public final Object[] getEmptyArray$utils_common() { return this.emptyArray; }
/*    */    public boolean equals(@Nullable Object other) {
/* 16 */     if (this == other) return true; 
/* 17 */     if (other == null || getClass() != other.getClass()) return false;
/*    */     
/* 19 */     (ExportableType)other;
/*    */     
/* 21 */     if (!Intrinsics.areEqual(this.klass, ((ExportableType)other).klass)) return false;
/*    */     
/* 23 */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/* 27 */     return this.klass.hashCode();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\collections\ExportableType.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */