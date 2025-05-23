/*    */ package androidx.compose.runtime.external.kotlinx.collections.immutable.implementations.immutableList;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentCollection;
/*    */ import androidx.compose.runtime.external.kotlinx.collections.immutable.PersistentList;
/*    */ import java.util.Collection;
/*    */ import java.util.List;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\b\n\000\n\002\020\036\n\002\b\003\n\002\020\013\n\002\b\004\n\002\020(\n\000\n\002\020*\n\002\b\005\n\002\030\002\n\002\b\003\b \030\000*\004\b\000\020\0012\b\022\004\022\002H\0010\0022\b\022\004\022\002H\0010\003B\005¢\006\002\020\004J$\020\005\032\b\022\004\022\0028\0000\0022\006\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0028\0000\tH\026J\034\020\005\032\b\022\004\022\0028\0000\0022\f\020\n\032\b\022\004\022\0028\0000\tH\026J\016\020\013\032\b\022\004\022\0028\0000\002H\026J\026\020\f\032\0020\r2\006\020\016\032\0028\000H\002¢\006\002\020\017J\026\020\020\032\0020\r2\f\020\n\032\b\022\004\022\0028\0000\tH\026J\017\020\021\032\b\022\004\022\0028\0000\022H\002J\016\020\023\032\b\022\004\022\0028\0000\024H\026J\033\020\025\032\b\022\004\022\0028\0000\0022\006\020\016\032\0028\000H\026¢\006\002\020\026J\034\020\027\032\b\022\004\022\0028\0000\0022\f\020\n\032\b\022\004\022\0028\0000\tH\026J\034\020\030\032\b\022\004\022\0028\0000\0022\f\020\n\032\b\022\004\022\0028\0000\tH\026J\036\020\031\032\b\022\004\022\0028\0000\0322\006\020\033\032\0020\0072\006\020\034\032\0020\007H\026¨\006\035"}, d2 = {"Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;", "E", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "Lkotlin/collections/AbstractList;", "()V", "addAll", "index", "", "c", "", "elements", "clear", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "iterator", "", "listIterator", "", "remove", "(Ljava/lang/Object;)Landroidx/compose/runtime/external/kotlinx/collections/immutable/PersistentList;", "removeAll", "retainAll", "subList", "Landroidx/compose/runtime/external/kotlinx/collections/immutable/ImmutableList;", "fromIndex", "toIndex", "runtime"})
/*    */ @StabilityInferred(parameters = 2)
/*    */ @SourceDebugExtension({"SMAP\nAbstractPersistentList.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n+ 2 extensions.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/ExtensionsKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,60:1\n41#2:61\n41#2:62\n1726#3,3:63\n*S KotlinDebug\n*F\n+ 1 AbstractPersistentList.kt\nandroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList\n*L\n18#1:61\n22#1:62\n50#1:63,3\n*E\n"})
/*    */ public abstract class AbstractPersistentList<E> extends AbstractList<E> implements PersistentList<E> {
/*    */   @NotNull
/*    */   public ImmutableList<E> subList(int fromIndex, int toIndex) {
/* 14 */     return super.subList(fromIndex, toIndex);
/*    */   } public static final int $stable;
/*    */   @NotNull
/*    */   public PersistentList<E> addAll(@NotNull Collection elements) {
/* 18 */     Intrinsics.checkNotNullParameter(elements, "elements"); PersistentList $this$mutate$iv = this; int $i$f$mutate = 0;
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
/* 61 */     PersistentList.Builder builder = $this$mutate$iv.builder(); List it = (List)builder; int $i$a$-mutate-AbstractPersistentList$addAll$1 = 0; it.addAll(elements); return builder.build(); } @NotNull public PersistentList<E> addAll(int index, @NotNull Collection c) { Intrinsics.checkNotNullParameter(c, "c"); PersistentList $this$mutate$iv = this; int $i$f$mutate = 0;
/* 62 */     PersistentList.Builder builder = $this$mutate$iv.builder(); List it = (List)builder; int $i$a$-mutate-AbstractPersistentList$addAll$2 = 0; it.addAll(index, c); return builder.build(); }
/*    */ 
/*    */   
/*    */   @NotNull
/*    */   public PersistentList<E> remove(Object element) {
/*    */     int index = indexOf(element);
/*    */     if (index != -1)
/*    */       return removeAt(index); 
/*    */     return this;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentList<E> removeAll(@NotNull Collection<? extends E> elements) {
/*    */     Intrinsics.checkNotNullParameter(elements, "elements");
/*    */     return removeAll(new AbstractPersistentList$removeAll$1(elements));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"})
/*    */   static final class AbstractPersistentList$removeAll$1 extends Lambda implements Function1<E, Boolean> {
/*    */     AbstractPersistentList$removeAll$1(Collection<E> $elements) {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Boolean invoke(Object it) {
/*    */       return Boolean.valueOf(this.$elements.contains(it));
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentList<E> retainAll(@NotNull Collection<? extends E> elements) {
/*    */     Intrinsics.checkNotNullParameter(elements, "elements");
/*    */     return removeAll(new AbstractPersistentList$retainAll$1(elements));
/*    */   }
/*    */   
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\013\n\002\b\004\020\000\032\0020\001\"\004\b\000\020\0022\006\020\003\032\002H\002H\n¢\006\004\b\004\020\005"}, d2 = {"<anonymous>", "", "E", "it", "invoke", "(Ljava/lang/Object;)Ljava/lang/Boolean;"})
/*    */   static final class AbstractPersistentList$retainAll$1 extends Lambda implements Function1<E, Boolean> {
/*    */     AbstractPersistentList$retainAll$1(Collection<E> $elements) {
/*    */       super(1);
/*    */     }
/*    */     
/*    */     @NotNull
/*    */     public final Boolean invoke(Object it) {
/*    */       return Boolean.valueOf(!this.$elements.contains(it));
/*    */     }
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public PersistentList<E> clear() {
/*    */     return UtilsKt.persistentVectorOf();
/*    */   }
/*    */   
/*    */   public boolean contains(Object element) {
/*    */     return (indexOf(element) != -1);
/*    */   }
/*    */   
/*    */   public boolean containsAll(@NotNull Collection elements) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'elements'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: aload_1
/*    */     //   7: checkcast java/lang/Iterable
/*    */     //   10: astore_2
/*    */     //   11: iconst_0
/*    */     //   12: istore_3
/*    */     //   13: aload_2
/*    */     //   14: checkcast java/util/Collection
/*    */     //   17: invokeinterface isEmpty : ()Z
/*    */     //   22: ifeq -> 29
/*    */     //   25: iconst_1
/*    */     //   26: goto -> 77
/*    */     //   29: aload_2
/*    */     //   30: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   35: astore #4
/*    */     //   37: aload #4
/*    */     //   39: invokeinterface hasNext : ()Z
/*    */     //   44: ifeq -> 76
/*    */     //   47: aload #4
/*    */     //   49: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   54: astore #5
/*    */     //   56: aload #5
/*    */     //   58: astore #6
/*    */     //   60: iconst_0
/*    */     //   61: istore #7
/*    */     //   63: aload_0
/*    */     //   64: aload #6
/*    */     //   66: invokevirtual contains : (Ljava/lang/Object;)Z
/*    */     //   69: ifne -> 37
/*    */     //   72: iconst_0
/*    */     //   73: goto -> 77
/*    */     //   76: iconst_1
/*    */     //   77: ireturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #50	-> 6
/*    */     //   #63	-> 13
/*    */     //   #64	-> 29
/*    */     //   #50	-> 63
/*    */     //   #64	-> 69
/*    */     //   #65	-> 76
/*    */     //   #50	-> 77
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   63	6	7	$i$a$-all-AbstractPersistentList$containsAll$1	I
/*    */     //   60	9	6	it	Ljava/lang/Object;
/*    */     //   56	20	5	element$iv	Ljava/lang/Object;
/*    */     //   13	64	3	$i$f$all	I
/*    */     //   11	66	2	$this$all$iv	Ljava/lang/Iterable;
/*    */     //   0	78	0	this	Landroidx/compose/runtime/external/kotlinx/collections/immutable/implementations/immutableList/AbstractPersistentList;
/*    */     //   0	78	1	elements	Ljava/util/Collection;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public Iterator<E> iterator() {
/*    */     return listIterator();
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public ListIterator<E> listIterator() {
/*    */     return listIterator(0);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\external\kotlinx\collections\immutable\implementations\immutableList\AbstractPersistentList.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */