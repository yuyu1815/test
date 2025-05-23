/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.internal;
/*    */ import java.util.Collection;
/*    */ import kotlin.jvm.JvmStatic;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000(\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\002\n\000\n\002\020\b\n\002\b\t\n\002\020\013\n\000\n\002\020\036\n\002\b\005\bÀ\002\030\0002\0020\001B\007\b\002¢\006\002\020\002J\035\020\003\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\001¢\006\002\b\bJ\035\020\t\032\0020\0042\006\020\005\032\0020\0062\006\020\007\032\0020\006H\001¢\006\002\b\nJ%\020\013\032\0020\0042\006\020\f\032\0020\0062\006\020\r\032\0020\0062\006\020\007\032\0020\006H\001¢\006\002\b\016J%\020\017\032\0020\0202\n\020\021\032\006\022\002\b\0030\0222\n\020\023\032\006\022\002\b\0030\022H\001¢\006\002\b\024J\031\020\025\032\0020\0062\n\020\021\032\006\022\002\b\0030\022H\001¢\006\002\b\026¨\006\027"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/internal/ListImplementation;", "", "()V", "checkElementIndex", "", "index", "", "size", "checkElementIndex$runtime", "checkPositionIndex", "checkPositionIndex$runtime", "checkRangeIndexes", "fromIndex", "toIndex", "checkRangeIndexes$runtime", "orderedEquals", "", "c", "", "other", "orderedEquals$runtime", "orderedHashCode", "orderedHashCode$runtime", "runtime"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class ListImplementation {
/*    */   @NotNull
/*    */   public static final ListImplementation INSTANCE = new ListImplementation();
/*    */   
/*    */   @JvmStatic
/*    */   public static final void checkElementIndex$runtime(int index, int size) {
/* 14 */     if (index < 0 || index >= size)
/* 15 */       throw new IndexOutOfBoundsException("index: " + index + ", size: " + size); 
/*    */   }
/*    */   public static final int $stable;
/*    */   
/*    */   @JvmStatic
/*    */   public static final void checkPositionIndex$runtime(int index, int size) {
/* 21 */     if (index < 0 || index > size) {
/* 22 */       throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
/*    */     }
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   public static final void checkRangeIndexes$runtime(int fromIndex, int toIndex, int size) {
/* 28 */     if (fromIndex < 0 || toIndex > size) {
/* 29 */       throw new IndexOutOfBoundsException("fromIndex: " + fromIndex + ", toIndex: " + toIndex + ", size: " + size);
/*    */     }
/* 31 */     if (fromIndex > toIndex) {
/* 32 */       throw new IllegalArgumentException("fromIndex: " + fromIndex + " > toIndex: " + toIndex);
/*    */     }
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   public static final int orderedHashCode$runtime(@NotNull Collection c) {
/* 38 */     Intrinsics.checkNotNullParameter(c, "c"); int hashCode = 1;
/* 39 */     for (Object e : c) {
/* 40 */       hashCode = 31 * hashCode + ((e != null) ? e.hashCode() : 0);
/*    */     }
/* 42 */     return hashCode;
/*    */   }
/*    */   
/*    */   @JvmStatic
/*    */   public static final boolean orderedEquals$runtime(@NotNull Collection c, @NotNull Collection other) {
/* 47 */     Intrinsics.checkNotNullParameter(c, "c"); Intrinsics.checkNotNullParameter(other, "other"); if (c.size() != other.size()) return false;
/*    */     
/* 49 */     Iterator otherIterator = other.iterator();
/* 50 */     for (Object elem : c) {
/* 51 */       Object elemOther = otherIterator.next();
/* 52 */       if (!Intrinsics.areEqual(elem, elemOther)) {
/* 53 */         return false;
/*    */       }
/*    */     } 
/* 56 */     return true;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\internal\ListImplementation.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */