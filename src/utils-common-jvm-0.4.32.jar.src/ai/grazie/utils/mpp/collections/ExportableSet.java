/*    */ package ai.grazie.utils.mpp.collections;
/*    */ @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0000\n\002\030\002\n\000\n\002\020\000\n\000\n\002\020\"\n\000\n\002\030\002\n\002\b\004\n\002\020\b\n\002\b\005\n\002\020\013\n\002\b\007\n\002\020\016\n\000\b\007\030\000*\004\b\000\020\0012\0020\002B\035\b\000\022\f\020\003\032\b\022\004\022\0028\0000\004\022\006\020\005\032\0020\006¢\006\002\020\007J\026\020\020\032\0020\0212\006\020\022\032\0028\000H\002¢\006\002\020\023J\023\020\024\032\0020\0212\b\020\025\032\004\030\0010\002H\002J\b\020\026\032\0020\013H\026J\006\020\027\032\0020\021J\b\020\030\032\0020\031H\026R\032\020\003\032\b\022\004\022\0028\0000\004X\004¢\006\b\n\000\032\004\b\b\020\tR\021\020\n\032\0020\0138F¢\006\006\032\004\b\f\020\rR\024\020\005\032\0020\006X\004¢\006\b\n\000\032\004\b\016\020\017¨\006\032"}, d2 = {"Lai/grazie/utils/mpp/collections/ExportableSet;", "T", "", "set", "", "type", "Lai/grazie/utils/mpp/collections/ExportableType;", "(Ljava/util/Set;Lai/grazie/utils/mpp/collections/ExportableType;)V", "getSet$utils_common", "()Ljava/util/Set;", "size", "", "getSize", "()I", "getType$utils_common", "()Lai/grazie/utils/mpp/collections/ExportableType;", "contains", "", "element", "(Ljava/lang/Object;)Z", "equals", "other", "hashCode", "isEmpty", "toString", "", "utils-common"})
/*    */ @SourceDebugExtension({"SMAP\nExportableSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ExportableSet.kt\nai/grazie/utils/mpp/collections/ExportableSet\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,80:1\n1863#2:81\n1864#2:83\n1#3:82\n*S KotlinDebug\n*F\n+ 1 ExportableSet.kt\nai/grazie/utils/mpp/collections/ExportableSet\n*L\n12#1:81\n12#1:83\n*E\n"})
/*    */ public final class ExportableSet<T> {
/*    */   @NotNull
/*    */   private final Set<T> set;
/*    */   
/*  8 */   public ExportableSet(@NotNull Set<T> set, @NotNull ExportableType type) { this.set = set;
/*  9 */     this.type = type;
/*    */ 
/*    */     
/* 12 */     Iterable<T> $this$forEach$iv = this.set; int $i$f$forEach = 0;
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
/* 81 */     Iterator<T> iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), element = element$iv; int $i$a$-forEach-ExportableSet$1 = 0; if (element != null)
/* 82 */       { Object it = element; int $i$a$-let-ExportableSet$1$1 = 0; ExportableTypeKt.requireIsInstance(this.type, it); } else {  }  }  } @NotNull private final ExportableType type; public final boolean contains(Object element) { if (element != null) { Object it = element; int $i$a$-let-ExportableSet$contains$1 = 0;
/*    */       ExportableTypeKt.requireIsInstance(this.type, it); }
/*    */     else
/*    */     {  }
/*    */     
/*    */     return this.set.contains(element); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public final Set<T> getSet$utils_common() {
/*    */     return this.set;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final ExportableType getType$utils_common() {
/*    */     return this.type;
/*    */   }
/*    */   
/*    */   public final int getSize() {
/*    */     return this.set.size();
/*    */   }
/*    */   
/*    */   public final boolean isEmpty() {
/*    */     return this.set.isEmpty();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (other == null || getClass() != other.getClass())
/*    */       return false; 
/*    */     (ExportableSet)other;
/*    */     if (!Intrinsics.areEqual(this.set, ((ExportableSet)other).set))
/*    */       return false; 
/*    */     return true;
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.set.hashCode();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "ExportableSet(set=" + this.set + ")";
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\utils-common-jvm-0.4.32.jar!\ai\grazi\\utils\mpp\collections\ExportableSet.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */