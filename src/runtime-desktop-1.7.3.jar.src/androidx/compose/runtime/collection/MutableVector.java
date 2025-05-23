/*      */ package androidx.compose.runtime.collection;
/*      */ 
/*      */ import java.util.Collection;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.ListIterator;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.PublishedApi;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.jvm.functions.Function1;
/*      */ import kotlin.jvm.functions.Function2;
/*      */ import kotlin.jvm.functions.Function3;
/*      */ import kotlin.jvm.internal.CollectionToArray;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.ranges.IntRange;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ import org.jetbrains.annotations.Nullable;
/*      */ 
/*      */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000z\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\000\n\002\020\b\n\002\b\t\n\002\030\002\n\002\b\006\n\002\020!\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\005\n\002\020\036\n\002\020 \n\002\b\002\n\002\030\002\n\002\b\020\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b,\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\001\n\002\b\004\b\007\030\000*\004\b\000\020\0012\0060\002j\002`\003:\003stuB\037\b\001\022\016\020\004\032\n\022\006\022\004\030\0018\0000\005\022\006\020\006\032\0020\007¢\006\002\020\bJ\023\020\033\032\0020\0342\006\020\035\032\0028\000¢\006\002\020\036J\033\020\033\032\0020\0372\006\020 \032\0020\0072\006\020\035\032\0028\000¢\006\002\020!J\027\020\"\032\0020\0342\f\020#\032\b\022\004\022\0028\0000\000H\bJ\031\020\"\032\0020\0342\f\020#\032\b\022\004\022\0028\0000\005¢\006\002\020$J\034\020\"\032\0020\0342\006\020 \032\0020\0072\f\020#\032\b\022\004\022\0028\0000\000J\034\020\"\032\0020\0342\006\020 \032\0020\0072\f\020#\032\b\022\004\022\0028\0000%J\034\020\"\032\0020\0342\006\020 \032\0020\0072\f\020#\032\b\022\004\022\0028\0000&J\024\020\"\032\0020\0342\f\020#\032\b\022\004\022\0028\0000%J\027\020\"\032\0020\0342\f\020#\032\b\022\004\022\0028\0000&H\bJ+\020'\032\0020\0342\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\f\020*\032\b\022\004\022\0028\0000\030J\006\020+\032\0020\037J\026\020,\032\0020\0342\006\020\035\032\0028\000H\002¢\006\002\020\036J\024\020-\032\0020\0342\f\020#\032\b\022\004\022\0028\0000\000J\024\020-\032\0020\0342\f\020#\032\b\022\004\022\0028\0000%J\024\020-\032\0020\0342\f\020#\032\b\022\004\022\0028\0000&J\024\020.\032\0020\0342\f\020/\032\b\022\004\022\0028\0000\000J\016\0200\032\0020\0372\006\0201\032\0020\007J\013\0202\032\0028\000¢\006\002\0203J0\0202\032\0028\0002\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0204J\020\0205\032\004\030\0018\000H\b¢\006\002\0203J2\0205\032\004\030\0018\0002\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0204JS\0206\032\002H7\"\004\b\001\02072\006\0208\032\002H72'\0209\032#\022\023\022\021H7¢\006\f\b;\022\b\b<\022\004\b\b(=\022\004\022\0028\000\022\004\022\002H70:H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020>Jh\020?\032\002H7\"\004\b\001\02072\006\0208\032\002H72<\0209\0328\022\023\022\0210\007¢\006\f\b;\022\b\b<\022\004\b\b( \022\023\022\021H7¢\006\f\b;\022\b\b<\022\004\b\b(=\022\004\022\0028\000\022\004\022\002H70@H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020AJS\020B\032\002H7\"\004\b\001\02072\006\0208\032\002H72'\0209\032#\022\004\022\0028\000\022\023\022\021H7¢\006\f\b;\022\b\b<\022\004\b\b(=\022\004\022\002H70:H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020>Jh\020C\032\002H7\"\004\b\001\02072\006\0208\032\002H72<\0209\0328\022\023\022\0210\007¢\006\f\b;\022\b\b<\022\004\b\b( \022\004\022\0028\000\022\023\022\021H7¢\006\f\b;\022\b\b<\022\004\b\b(=\022\004\022\002H70@H\bø\001\000\002\b\n\006\b\001\022\002\020\002¢\006\002\020AJ+\020D\032\0020\0372\022\020E\032\016\022\004\022\0028\000\022\004\022\0020\0370)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J1\020F\032\0020\0372\030\020E\032\024\022\004\022\0020\007\022\004\022\0028\000\022\004\022\0020\0370:H\bø\001\000\002\b\n\006\b\001\022\002\020\001J+\020G\032\0020\0372\022\020E\032\016\022\004\022\0028\000\022\004\022\0020\0370)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J1\020H\032\0020\0372\030\020E\032\024\022\004\022\0020\007\022\004\022\0028\000\022\004\022\0020\0370:H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\026\020I\032\0028\0002\006\020 \032\0020\007H\n¢\006\002\020JJ\023\020K\032\0020\0072\006\020\035\032\0028\000¢\006\002\020LJ+\020M\032\0020\0072\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J+\020N\032\0020\0072\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\006\020O\032\0020\034J\006\020P\032\0020\034J\013\020Q\032\0028\000¢\006\002\0203J0\020Q\032\0028\0002\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0204J\023\020R\032\0020\0072\006\020\035\032\0028\000¢\006\002\020LJ\020\020S\032\004\030\0018\000H\b¢\006\002\0203J2\020S\032\004\030\0018\0002\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\0204J>\020T\032\b\022\004\022\002H70\005\"\006\b\001\0207\030\0012\022\020U\032\016\022\004\022\0028\000\022\004\022\002H70)H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020VJS\020W\032\b\022\004\022\002H70\005\"\006\b\001\0207\030\0012'\020U\032#\022\023\022\0210\007¢\006\f\b;\022\b\b<\022\004\b\b( \022\004\022\0028\000\022\004\022\002H70:H\bø\001\000\002\b\n\006\b\001\022\002\020\001¢\006\002\020XJP\020Y\032\b\022\004\022\002H70\000\"\006\b\001\0207\030\0012)\020U\032%\022\023\022\0210\007¢\006\f\b;\022\b\b<\022\004\b\b( \022\004\022\0028\000\022\006\022\004\030\001H70:H\bø\001\000\002\b\n\006\b\001\022\002\020\001J;\020Z\032\b\022\004\022\002H70\000\"\006\b\001\0207\030\0012\024\020U\032\020\022\004\022\0028\000\022\006\022\004\030\001H70)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\026\020[\032\0020\0372\006\020\035\032\0028\000H\n¢\006\002\020\\J\026\020]\032\0020\0372\006\020\035\032\0028\000H\n¢\006\002\020\\J\023\020^\032\0020\0342\006\020\035\032\0028\000¢\006\002\020\036J\024\020_\032\0020\0342\f\020#\032\b\022\004\022\0028\0000\000J\024\020_\032\0020\0342\f\020#\032\b\022\004\022\0028\0000%J\024\020_\032\0020\0342\f\020#\032\b\022\004\022\0028\0000&J\023\020`\032\0028\0002\006\020 \032\0020\007¢\006\002\020JJ \020a\032\0020\0372\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000J\026\020b\032\0020\0372\006\020c\032\0020\0072\006\020d\032\0020\007J\024\020e\032\0020\0342\f\020#\032\b\022\004\022\0028\0000%J+\020f\032\0020\0342\022\020(\032\016\022\004\022\0028\000\022\004\022\0020\0340)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\036\020g\032\0028\0002\006\020 \032\0020\0072\006\020\035\032\0028\000H\002¢\006\002\020hJ\020\020i\032\0020\0372\006\020j\032\0020\007H\001J\036\020k\032\0020\0372\026\020l\032\022\022\004\022\0028\0000mj\b\022\004\022\0028\000`nJ+\020o\032\0020\0072\022\020p\032\016\022\004\022\0028\000\022\004\022\0020\0070)H\bø\001\000\002\b\n\006\b\001\022\002\020\001J\b\020q\032\0020rH\001R.\020\004\032\n\022\006\022\004\030\0018\0000\0058\000@\000X\016¢\006\026\n\002\020\017\022\004\b\t\020\n\032\004\b\013\020\f\"\004\b\r\020\016R\022\020\020\032\0020\0218Æ\002¢\006\006\032\004\b\022\020\023R\022\020\024\032\0020\0078Æ\002¢\006\006\032\004\b\025\020\026R\026\020\027\032\n\022\004\022\0028\000\030\0010\030X\016¢\006\002\n\000R\036\020\006\032\0020\0072\006\020\031\032\0020\007@BX\016¢\006\b\n\000\032\004\b\032\020\026\002\007\n\005\b20\001¨\006v"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector;", "T", "Ljava/util/RandomAccess;", "Lkotlin/collections/RandomAccess;", "content", "", "size", "", "([Ljava/lang/Object;I)V", "getContent$annotations", "()V", "getContent", "()[Ljava/lang/Object;", "setContent", "([Ljava/lang/Object;)V", "[Ljava/lang/Object;", "indices", "Lkotlin/ranges/IntRange;", "getIndices", "()Lkotlin/ranges/IntRange;", "lastIndex", "getLastIndex", "()I", "list", "", "<set-?>", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "([Ljava/lang/Object;)Z", "", "", "any", "predicate", "Lkotlin/Function1;", "asMutableList", "clear", "contains", "containsAll", "contentEquals", "other", "ensureCapacity", "capacity", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "fold", "R", "initial", "operation", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "acc", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Ljava/lang/Object;", "foldIndexed", "Lkotlin/Function3;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function3;)Ljava/lang/Object;", "foldRight", "foldRightIndexed", "forEach", "block", "forEachIndexed", "forEachReversed", "forEachReversedIndexed", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "indexOfFirst", "indexOfLast", "isEmpty", "isNotEmpty", "last", "lastIndexOf", "lastOrNull", "map", "transform", "(Lkotlin/jvm/functions/Function1;)[Ljava/lang/Object;", "mapIndexed", "(Lkotlin/jvm/functions/Function2;)[Ljava/lang/Object;", "mapIndexedNotNull", "mapNotNull", "minusAssign", "(Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "removeIf", "removeRange", "start", "end", "retainAll", "reversedAny", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "setSize", "newSize", "sortWith", "comparator", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "sumBy", "selector", "throwNoSuchElementException", "", "MutableVectorList", "SubList", "VectorListIterator", "runtime"})
/*      */ @StabilityInferred(parameters = 0)
/*      */ @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n48#1:1224\n48#1:1225\n523#1:1226\n53#1:1229\n523#1:1230\n48#1:1231\n523#1:1232\n523#1:1233\n523#1:1234\n48#1:1235\n523#1:1236\n48#1:1237\n523#1:1238\n523#1:1239\n523#1:1240\n48#1:1241\n523#1:1242\n48#1:1245\n48#1:1246\n48#1:1247\n523#1:1248\n1864#2,3:1221\n1855#2,2:1227\n1855#2,2:1243\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n249#1:1224\n259#1:1225\n260#1:1226\n292#1:1229\n293#1:1230\n307#1:1231\n308#1:1232\n334#1:1233\n359#1:1234\n595#1:1235\n595#1:1236\n637#1:1237\n637#1:1238\n665#1:1239\n675#1:1240\n768#1:1241\n769#1:1242\n794#1:1245\n821#1:1246\n859#1:1247\n860#1:1248\n185#1:1221,3\n281#1:1227,2\n782#1:1243,2\n*E\n"})
/*      */ public final class MutableVector<T> implements RandomAccess {
/*      */   @NotNull
/*      */   private T[] content;
/*      */   @Nullable
/*      */   private List<T> list;
/*      */   private int size;
/*      */   public static final int $stable = 8;
/*      */   
/*      */   @PublishedApi
/*   31 */   public MutableVector(@NotNull Object[] content, int size) { this.content = (T[])content;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*   42 */     this.size = size; } @NotNull public final T[] getContent() { return this.content; } public final void setContent(@NotNull Object[] <set-?>) { Intrinsics.checkNotNullParameter(<set-?>, "<set-?>"); this.content = (T[])<set-?>; } public final int getSize() { return this.size; }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final int getLastIndex() {
/*   48 */     int $i$f$getLastIndex = 0; return getSize() - 1;
/*      */   }
/*      */   
/*      */   @NotNull
/*      */   public final IntRange getIndices() {
/*   53 */     int $i$f$getIndices = 0; return new IntRange(0, getSize() - 1);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean add(Object element) {
/*   59 */     ensureCapacity(this.size + 1);
/*   60 */     this.content[this.size] = (T)element;
/*   61 */     int i = this.size; this.size = i + 1;
/*   62 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void add(int index, Object element) {
/*   70 */     ensureCapacity(this.size + 1);
/*   71 */     T[] arrayOfT = this.content;
/*   72 */     if (index != this.size) {
/*   73 */       ArraysKt.copyInto((Object[])arrayOfT, 
/*   74 */           (Object[])arrayOfT, 
/*   75 */           index + 1, 
/*   76 */           index, 
/*   77 */           this.size);
/*      */     }
/*      */     
/*   80 */     arrayOfT[index] = (T)element;
/*   81 */     int i = this.size; this.size = i + 1;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(int index, @NotNull List<T> elements) {
/*   89 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty()) return false; 
/*   90 */     ensureCapacity(this.size + elements.size());
/*   91 */     T[] arrayOfT = this.content;
/*   92 */     if (index != this.size) {
/*   93 */       ArraysKt.copyInto((Object[])arrayOfT, 
/*   94 */           (Object[])arrayOfT, 
/*   95 */           index + elements.size(), 
/*   96 */           index, 
/*   97 */           this.size);
/*      */     }
/*      */     
/*  100 */     for (int i = 0, j = elements.size(); i < j; i++) {
/*  101 */       arrayOfT[index + i] = elements.get(i);
/*      */     }
/*  103 */     this.size += elements.size();
/*  104 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(int index, @NotNull MutableVector elements) {
/*  112 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty()) return false; 
/*  113 */     ensureCapacity(this.size + elements.size);
/*  114 */     T[] arrayOfT = this.content;
/*  115 */     if (index != this.size) {
/*  116 */       ArraysKt.copyInto((Object[])arrayOfT, 
/*  117 */           (Object[])arrayOfT, 
/*  118 */           index + elements.size, 
/*  119 */           index, 
/*  120 */           this.size);
/*      */     }
/*      */     
/*  123 */     ArraysKt.copyInto((Object[])elements.content, 
/*  124 */         (Object[])arrayOfT, 
/*  125 */         index, 
/*  126 */         0, 
/*  127 */         elements.size);
/*      */     
/*  129 */     this.size += elements.size;
/*  130 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(@NotNull List<? extends T> elements) {
/*  138 */     Intrinsics.checkNotNullParameter(elements, "elements"); int $i$f$addAll = 0; return addAll(getSize(), elements);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(@NotNull MutableVector<T> elements) {
/*  146 */     Intrinsics.checkNotNullParameter(elements, "elements"); int $i$f$addAll = 0; return addAll(getSize(), elements);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(@NotNull Object[] elements) {
/*  157 */     Intrinsics.checkNotNullParameter(elements, "elements"); if ((elements.length == 0)) {
/*  158 */       return false;
/*      */     }
/*  160 */     ensureCapacity(this.size + elements.length);
/*  161 */     ArraysKt.copyInto$default(elements, 
/*  162 */         (Object[])this.content, 
/*  163 */         this.size, 0, 0, 12, null);
/*      */     
/*  165 */     this.size += elements.length;
/*  166 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean addAll(int index, @NotNull Collection elements) {
/*  174 */     Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty()) return false; 
/*  175 */     ensureCapacity(this.size + elements.size());
/*  176 */     T[] arrayOfT = this.content;
/*  177 */     if (index != this.size) {
/*  178 */       ArraysKt.copyInto((Object[])arrayOfT, 
/*  179 */           (Object[])arrayOfT, 
/*  180 */           index + elements.size(), 
/*  181 */           index, 
/*  182 */           this.size);
/*      */     }
/*      */     
/*  185 */     Iterable $this$forEachIndexed$iv = elements; int $i$f$forEachIndexed = 0;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/* 1221 */     int index$iv = 0;
/* 1222 */     Iterator iterator = $this$forEachIndexed$iv.iterator(); if (iterator.hasNext()) { Object item$iv = iterator.next(); int j = index$iv++; if (j < 0) CollectionsKt.throwIndexOverflow();  Object object1 = item$iv; int i = j, $i$a$-forEachIndexed-MutableVector$addAll$1 = 0; arrayOfT[index + i] = (T)object1; }  this.size += elements.size(); return true;
/*      */   } public final boolean addAll(@NotNull Collection<? extends T> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); return addAll(this.size, elements); } public final boolean any(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$any = 0; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { if (((Boolean)predicate.invoke(content[i])).booleanValue()) return true;  ++i; } while (i < size); }  return false; } public final boolean reversedAny(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$reversedAny = 0; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { if (((Boolean)predicate.invoke(content[i])).booleanValue()) return true;  --i; } while (i >= 0); }  return false; } @NotNull public final List<T> asMutableList() { if (this.list == null) { MutableVectorList<T> mutableVectorList1 = new MutableVectorList(this), it = mutableVectorList1; int $i$a$-also-MutableVector$asMutableList$1 = 0; this.list = it; }  return mutableVectorList1; }
/* 1224 */   public final void clear() { T[] arrayOfT = this.content; int i; MutableVector this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv.getSize() - 1; -1 < i; i--)
/* 1225 */       arrayOfT[i] = null;  this.size = 0; } public final boolean contains(Object element) { int i = 0; MutableVector this_$iv = this; int $i$f$getLastIndex = 0, j = this_$iv.getSize() - 1; if (i <= j)
/* 1226 */       while (true) { this_$iv = this; int $i$f$get = 0; if (Intrinsics.areEqual(this_$iv.getContent()[i], element)) return true;  if (i != j) { i++; continue; }  break; }   return false; } public final boolean containsAll(@NotNull List<T> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); for (int i = 0, j = elements.size(); i < j; i++) { if (!contains(elements.get(i))) return false;  }  return true; }
/* 1227 */   public final boolean containsAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); Iterable $this$forEach$iv = elements; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-MutableVector$containsAll$1 = 0; if (!contains((T)it))
/*      */         return false;  }
/* 1229 */      return true; } public final boolean containsAll(@NotNull MutableVector elements) { Intrinsics.checkNotNullParameter(elements, "elements"); MutableVector this_$iv = elements; int $i$f$getIndices = 0; IntRange intRange = new IntRange(0, this_$iv.getSize() - 1); int i = intRange.getFirst(); $i$f$getIndices = intRange.getLast(); if (i <= $i$f$getIndices)
/* 1230 */       while (true) { MutableVector mutableVector = elements; int $i$f$get = 0; if (!contains(mutableVector.getContent()[i])) return false;  if (i != $i$f$getIndices) { i++; continue; }  break; }   return true; } public final boolean contentEquals(@NotNull MutableVector other) { Intrinsics.checkNotNullParameter(other, "other"); if (other.size != this.size)
/* 1231 */       return false;  int i = 0; MutableVector this_$iv = this; int $i$f$getLastIndex = 0, j = this_$iv.getSize() - 1; if (i <= j)
/* 1232 */       while (true) { this_$iv = other; int $i$f$get = 0; this_$iv = this; $i$f$get = 0; if (!Intrinsics.areEqual(this_$iv.getContent()[i], this_$iv.getContent()[i])) return false;  if (i != j) { i++; continue; }  break; }   return true; } public final void ensureCapacity(int capacity) { T[] arrayOfT = this.content; if (arrayOfT.length < capacity) { int newSize = Math.max(capacity, arrayOfT.length * 2); Intrinsics.checkNotNullExpressionValue(Arrays.copyOf(arrayOfT, newSize), "copyOf(...)"); this.content = Arrays.copyOf(arrayOfT, newSize); }  }
/* 1233 */   public final T first() { if (isEmpty()) throw new NoSuchElementException("MutableVector is empty.");  MutableVector mutableVector = this; int index$iv = 0, $i$f$get = 0; return mutableVector.getContent()[index$iv]; }
/* 1234 */   public final T first(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$first = 0; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { Object item = content[i]; if (((Boolean)predicate.invoke(item)).booleanValue()) return (T)item;  ++i; } while (i < size); }  throwNoSuchElementException(); throw new KotlinNothingValueException(); } @Nullable public final T firstOrNull(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$firstOrNull = 0; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { Object item = content[i]; if (((Boolean)predicate.invoke(item)).booleanValue()) return (T)item;  ++i; } while (i < size); }  return null; } public final <R> R fold(Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$fold = 0; Object acc = initial; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { acc = operation.invoke(acc, content[i]); ++i; } while (i < size); }  return (R)acc; } public final <R> R foldIndexed(Object initial, @NotNull Function3 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldIndexed = 0; Object acc = initial; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { acc = operation.invoke(Integer.valueOf(i), acc, content[i]); ++i; } while (i < size); }  return (R)acc; } public final <R> R foldRight(Object initial, @NotNull Function2 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldRight = 0; Object acc = initial; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { acc = operation.invoke(content[i], acc); --i; } while (i >= 0); }  return (R)acc; } public final <R> R foldRightIndexed(Object initial, @NotNull Function3 operation) { Intrinsics.checkNotNullParameter(operation, "operation"); int $i$f$foldRightIndexed = 0; Object acc = initial; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { acc = operation.invoke(Integer.valueOf(i), content[i], acc); --i; } while (i >= 0); }  return (R)acc; } public final void forEach(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEach = 0; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { block.invoke(content[i]); ++i; } while (i < size); }  } public final void forEachIndexed(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachIndexed = 0; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { block.invoke(Integer.valueOf(i), content[i]); ++i; } while (i < size); }  } public final void forEachReversed(@NotNull Function1 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachReversed = 0; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { block.invoke(content[i]); --i; } while (i >= 0); }  } @Nullable public final T firstOrNull() { int $i$f$firstOrNull = 0; MutableVector mutableVector = this; int index$iv = 0, $i$f$get = 0; return isEmpty() ? null : mutableVector.getContent()[index$iv]; }
/* 1235 */   public final void forEachReversedIndexed(@NotNull Function2 block) { Intrinsics.checkNotNullParameter(block, "block"); int $i$f$forEachReversedIndexed = 0; if (getSize() > 0) { int i = getSize() - 1; Object[] content = (Object[])getContent(); do { block.invoke(Integer.valueOf(i), content[i]); --i; } while (i >= 0); }  } public final T get(int index) { int $i$f$get = 0; return getContent()[index]; } public final int indexOf(Object element) { int size = this.size; if (size > 0) { int i = 0; T[] arrayOfT = this.content; do { if (Intrinsics.areEqual(element, arrayOfT[i])) return i;  ++i; } while (i < size); }  return -1; } public final int indexOfFirst(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$indexOfFirst = 0; int size = getSize(); if (size > 0) { int i = 0; Object[] content = (Object[])getContent(); do { if (((Boolean)predicate.invoke(content[i])).booleanValue()) return i;  ++i; } while (i < size); }  return -1; } public final int indexOfLast(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$indexOfLast = 0; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { if (((Boolean)predicate.invoke(content[i])).booleanValue()) return i;  --i; } while (i >= 0); }  return -1; } public final boolean isEmpty() { return (this.size == 0); } public final boolean isNotEmpty() { return (this.size != 0); } public final T last() { if (isEmpty()) throw new NoSuchElementException("MutableVector is empty.");  MutableVector mutableVector1 = this, this_$iv = this; int $i$f$getLastIndex = 0; int i = this_$iv.getSize() - 1; int $i$f$get = 0;
/* 1236 */     return mutableVector1.getContent()[i]; } public final T last(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$last = 0; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { Object item = content[i]; if (((Boolean)predicate.invoke(item)).booleanValue()) return (T)item;  --i; } while (i >= 0); }  throwNoSuchElementException(); throw new KotlinNothingValueException(); } public final int lastIndexOf(Object element) { int size = this.size; if (size > 0) { int i = size - 1; T[] arrayOfT = this.content; do { if (Intrinsics.areEqual(element, arrayOfT[i])) return i;  --i; } while (i >= 0); }  return -1; }
/* 1237 */   @Nullable public final T lastOrNull() { int $i$f$lastOrNull = 0; MutableVector mutableVector1 = this, this_$iv = this; int $i$f$getLastIndex = 0; int i = this_$iv.getSize() - 1; int $i$f$get = 0;
/* 1238 */     return isEmpty() ? null : mutableVector1.getContent()[i]; } @Nullable public final T lastOrNull(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$lastOrNull = 0; int size = getSize(); if (size > 0) { int i = size - 1; Object[] content = (Object[])getContent(); do { Object item = content[i]; if (((Boolean)predicate.invoke(item)).booleanValue()) return (T)item;  --i; } while (i >= 0); }  return null; } public final void plusAssign(Object element) { int $i$f$plusAssign = 0; add((T)element); } public final void minusAssign(Object element) { int $i$f$minusAssign = 0; remove((T)element); }
/*      */   public final boolean remove(Object element) { int index = indexOf((T)element); if (index >= 0) { removeAt(index); return true; }  return false; }
/*      */   public final boolean removeAll(@NotNull List<T> elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this.size; for (int i = 0, j = elements.size(); i < j; i++) remove(elements.get(i));  return (initialSize != this.size); }
/* 1241 */   public final boolean removeAll(@NotNull MutableVector elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this.size; int i = 0; MutableVector this_$iv = elements; int $i$f$getLastIndex = 0, j = this_$iv.getSize() - 1; if (i <= j)
/* 1242 */       while (true) { this_$iv = elements; int $i$f$get = 0; remove(this_$iv.getContent()[i]); if (i != j) { i++; continue; }  break; }   return (initialSize != this.size); } public final boolean removeAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); if (elements.isEmpty())
/* 1243 */       return false;  int initialSize = this.size; Iterable $this$forEach$iv = elements; int $i$f$forEach = 0; Iterator iterator = $this$forEach$iv.iterator(); if (iterator.hasNext()) { Object element$iv = iterator.next(), it = element$iv; int $i$a$-forEach-MutableVector$removeAll$1 = 0; remove((T)it); }
/*      */      return (initialSize != this.size); } public final T removeAt(int index) { T[] arrayOfT = this.content; Object item = arrayOfT[index]; MutableVector this_$iv = this; int $i$f$getLastIndex = 0;
/* 1245 */     if (index != this_$iv.getSize() - 1) ArraysKt.copyInto((Object[])arrayOfT, (Object[])arrayOfT, index, index + 1, this.size);  int i = this.size; this.size = i + -1; arrayOfT[this.size] = null; return (T)item; } public final void removeRange(int start, int end) { if (end > start) { if (end < this.size)
/* 1246 */         ArraysKt.copyInto((Object[])this.content, (Object[])this.content, start, end, this.size);  int newSize = this.size - end - start; int i = newSize; MutableVector this_$iv = this; int $i$f$getLastIndex = 0, j = this_$iv.getSize() - 1; if (i <= j) while (true) { this.content[i] = null; if (i != j) { i++; continue; }  break; }   this.size = newSize; }  } @PublishedApi public final void setSize(int newSize) { this.size = newSize; } public final void removeIf(@NotNull Function1 predicate) { Intrinsics.checkNotNullParameter(predicate, "predicate"); int $i$f$removeIf = 0, gap = 0; int size = getSize(); for (int i = 0; i < size; i++) { if (((Boolean)predicate.invoke(getContent()[i])).booleanValue()) { gap++; } else if (gap > 0) { getContent()[i - gap] = getContent()[i]; }  }  ArraysKt.fill((Object[])getContent(), null, size - gap, size); setSize(size - gap); }
/* 1247 */   public final boolean retainAll(@NotNull Collection elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int initialSize = this.size; int i; MutableVector this_$iv; int $i$f$getLastIndex; for (this_$iv = this, $i$f$getLastIndex = 0, i = this_$iv.getSize() - 1; -1 < i; i--) {
/* 1248 */       MutableVector mutableVector = this; int $i$f$get = 0; Object item = mutableVector.getContent()[i];
/*      */       if (!elements.contains(item))
/*      */         removeAt(i); 
/*      */     } 
/*      */     return (initialSize != this.size); }
/*      */ 
/*      */   
/*      */   public final T set(int index, Object element) {
/*      */     T[] arrayOfT = this.content;
/*      */     Object old = arrayOfT[index];
/*      */     arrayOfT[index] = (T)element;
/*      */     return (T)old;
/*      */   }
/*      */   
/*      */   public final void sortWith(@NotNull Comparator comparator) {
/*      */     Intrinsics.checkNotNullParameter(comparator, "comparator");
/*      */     ArraysKt.sortWith((Object[])this.content, comparator, 0, this.size);
/*      */   }
/*      */   
/*      */   public final int sumBy(@NotNull Function1 selector) {
/*      */     Intrinsics.checkNotNullParameter(selector, "selector");
/*      */     int $i$f$sumBy = 0;
/*      */     int sum = 0;
/*      */     int size = getSize();
/*      */     if (size > 0) {
/*      */       Object[] content = (Object[])getContent();
/*      */       int i = 0;
/*      */       do {
/*      */         sum += ((Number)selector.invoke(content[i])).intValue();
/*      */         ++i;
/*      */       } while (i < size);
/*      */     } 
/*      */     return sum;
/*      */   }
/*      */   
/*      */   @PublishedApi
/*      */   @NotNull
/*      */   public final Void throwNoSuchElementException() {
/*      */     throw new NoSuchElementException("MutableVector contains no element matching the predicate.");
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\000\n\002\020+\n\000\n\002\020!\n\000\n\002\020\b\n\002\b\002\n\002\020\002\n\002\b\003\n\002\020\013\n\002\b\t\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\033\022\f\020\003\032\b\022\004\022\0028\0010\004\022\006\020\005\032\0020\006¢\006\002\020\007J\025\020\b\032\0020\t2\006\020\n\032\0028\001H\026¢\006\002\020\013J\t\020\f\032\0020\rH\002J\b\020\016\032\0020\rH\026J\016\020\017\032\0028\001H\002¢\006\002\020\020J\b\020\021\032\0020\006H\026J\r\020\022\032\0028\001H\026¢\006\002\020\020J\b\020\023\032\0020\006H\026J\b\020\024\032\0020\tH\026J\025\020\025\032\0020\t2\006\020\n\032\0028\001H\026¢\006\002\020\013R\016\020\005\032\0020\006X\016¢\006\002\n\000R\024\020\003\032\b\022\004\022\0028\0010\004X\004¢\006\002\n\000¨\006\026"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$VectorListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "runtime"})
/*      */   private static final class VectorListIterator<T> implements ListIterator<T>, KMutableListIterator {
/*      */     @NotNull
/*      */     private final List<T> list;
/*      */     private int index;
/*      */     
/*      */     public VectorListIterator(@NotNull List<T> list, int index) {
/*      */       this.list = list;
/*      */       this.index = index;
/*      */     }
/*      */     
/*      */     public boolean hasNext() {
/*      */       return (this.index < this.list.size());
/*      */     }
/*      */     
/*      */     public T next() {
/*      */       int i = this.index;
/*      */       this.index = i + 1;
/*      */       return this.list.get(i);
/*      */     }
/*      */     
/*      */     public void remove() {
/*      */       int i = this.index;
/*      */       this.index = i + -1;
/*      */       this.list.remove(this.index);
/*      */     }
/*      */     
/*      */     public boolean hasPrevious() {
/*      */       return (this.index > 0);
/*      */     }
/*      */     
/*      */     public int nextIndex() {
/*      */       return this.index;
/*      */     }
/*      */     
/*      */     public T previous() {
/*      */       int i = this.index;
/*      */       this.index = i + -1;
/*      */       return this.list.get(this.index);
/*      */     }
/*      */     
/*      */     public int previousIndex() {
/*      */       return this.index - 1;
/*      */     }
/*      */     
/*      */     public void add(Object element) {
/*      */       this.list.add(this.index, (T)element);
/*      */       int i = this.index;
/*      */       this.index = i + 1;
/*      */     }
/*      */     
/*      */     public void set(Object element) {
/*      */       this.list.set(this.index, (T)element);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000D\n\002\030\002\n\000\n\002\020!\n\000\n\002\030\002\n\002\b\002\n\002\020\b\n\002\b\003\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\t\n\002\020)\n\002\b\002\n\002\020+\n\002\b\n\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B\023\022\f\020\003\032\b\022\004\022\0028\0010\004¢\006\002\020\005J\025\020\n\032\0020\0132\006\020\f\032\0028\001H\026¢\006\002\020\rJ\035\020\n\032\0020\0162\006\020\017\032\0020\0072\006\020\f\032\0028\001H\026¢\006\002\020\020J\036\020\021\032\0020\0132\006\020\017\032\0020\0072\f\020\022\032\b\022\004\022\0028\0010\023H\026J\026\020\021\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\b\020\024\032\0020\016H\026J\026\020\025\032\0020\0132\006\020\f\032\0028\001H\002¢\006\002\020\rJ\026\020\026\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\026\020\027\032\0028\0012\006\020\017\032\0020\007H\002¢\006\002\020\030J\025\020\031\032\0020\0072\006\020\f\032\0028\001H\026¢\006\002\020\032J\b\020\033\032\0020\013H\026J\017\020\034\032\b\022\004\022\0028\0010\035H\002J\025\020\036\032\0020\0072\006\020\f\032\0028\001H\026¢\006\002\020\032J\016\020\037\032\b\022\004\022\0028\0010 H\026J\026\020\037\032\b\022\004\022\0028\0010 2\006\020\017\032\0020\007H\026J\025\020!\032\0020\0132\006\020\f\032\0028\001H\026¢\006\002\020\rJ\026\020\"\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\025\020#\032\0028\0012\006\020\017\032\0020\007H\026¢\006\002\020\030J\026\020$\032\0020\0132\f\020\022\032\b\022\004\022\0028\0010\023H\026J\036\020%\032\0028\0012\006\020\017\032\0020\0072\006\020\f\032\0028\001H\002¢\006\002\020&J\036\020'\032\b\022\004\022\0028\0010\0022\006\020(\032\0020\0072\006\020)\032\0020\007H\026R\024\020\006\032\0020\0078VX\004¢\006\006\032\004\b\b\020\tR\024\020\003\032\b\022\004\022\0028\0010\004X\004¢\006\002\n\000¨\006*"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$MutableVectorList;", "T", "", "vector", "Landroidx/compose/runtime/collection/MutableVector;", "(Landroidx/compose/runtime/collection/MutableVector;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime"})
/*      */   @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n+ 2 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector\n*L\n1#1,1220:1\n523#2:1221\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$MutableVectorList\n*L\n967#1:1221\n*E\n"})
/*      */   private static final class MutableVectorList<T> implements List<T>, KMutableList {
/*      */     @NotNull
/*      */     private final MutableVector<T> vector;
/*      */     
/*      */     public MutableVectorList(@NotNull MutableVector<T> vector) {
/*      */       this.vector = vector;
/*      */     }
/*      */     
/*      */     public int getSize() {
/*      */       return this.vector.getSize();
/*      */     }
/*      */     
/*      */     public boolean contains(Object element) {
/*      */       return this.vector.contains((T)element);
/*      */     }
/*      */     
/*      */     public boolean containsAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.vector.containsAll(elements);
/*      */     }
/*      */     
/*      */     public T get(int index) {
/*      */       MutableVectorKt.access$checkIndex(this, index);
/*      */       MutableVector<T> this_$iv = this.vector;
/*      */       int $i$f$get = 0;
/*      */       return this_$iv.getContent()[index];
/*      */     }
/*      */     
/*      */     public int indexOf(Object element) {
/*      */       return this.vector.indexOf((T)element);
/*      */     }
/*      */     
/*      */     public boolean isEmpty() {
/*      */       return this.vector.isEmpty();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Iterator<T> iterator() {
/*      */       return new MutableVector.VectorListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     public int lastIndexOf(Object element) {
/*      */       return this.vector.lastIndexOf((T)element);
/*      */     }
/*      */     
/*      */     public boolean add(Object element) {
/*      */       return this.vector.add((T)element);
/*      */     }
/*      */     
/*      */     public void add(int index, Object element) {
/*      */       this.vector.add(index, (T)element);
/*      */     }
/*      */     
/*      */     public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.vector.addAll(index, elements);
/*      */     }
/*      */     
/*      */     public boolean addAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.vector.addAll(elements);
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       this.vector.clear();
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator() {
/*      */       return new MutableVector.VectorListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator(int index) {
/*      */       return new MutableVector.VectorListIterator<>(this, index);
/*      */     }
/*      */     
/*      */     public boolean remove(Object element) {
/*      */       return this.vector.remove((T)element);
/*      */     }
/*      */     
/*      */     public boolean removeAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.vector.removeAll(elements);
/*      */     }
/*      */     
/*      */     public T removeAt(int index) {
/*      */       MutableVectorKt.access$checkIndex(this, index);
/*      */       return this.vector.removeAt(index);
/*      */     }
/*      */     
/*      */     public boolean retainAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       return this.vector.retainAll(elements);
/*      */     }
/*      */     
/*      */     public T set(int index, Object element) {
/*      */       MutableVectorKt.access$checkIndex(this, index);
/*      */       return this.vector.set(index, (T)element);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public List<T> subList(int fromIndex, int toIndex) {
/*      */       MutableVectorKt.access$checkSubIndex(this, fromIndex, toIndex);
/*      */       return new MutableVector.SubList<>(this, fromIndex, toIndex);
/*      */     }
/*      */     
/*      */     public <T> T[] toArray(Object[] array) {
/*      */       Intrinsics.checkNotNullParameter(array, "array");
/*      */       return (T[])CollectionToArray.toArray(this, array);
/*      */     }
/*      */     
/*      */     public Object[] toArray() {
/*      */       return CollectionToArray.toArray(this);
/*      */     }
/*      */   }
/*      */   
/*      */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000>\n\002\030\002\n\000\n\002\020!\n\002\b\002\n\002\020\b\n\002\b\006\n\002\020\013\n\002\b\002\n\002\020\002\n\002\b\004\n\002\020\036\n\002\b\t\n\002\020)\n\002\b\002\n\002\020+\n\002\b\n\b\002\030\000*\004\b\001\020\0012\b\022\004\022\002H\0010\002B#\022\f\020\003\032\b\022\004\022\0028\0010\002\022\006\020\004\032\0020\005\022\006\020\006\032\0020\005¢\006\002\020\007J\025\020\013\032\0020\f2\006\020\r\032\0028\001H\026¢\006\002\020\016J\035\020\013\032\0020\0172\006\020\020\032\0020\0052\006\020\r\032\0028\001H\026¢\006\002\020\021J\036\020\022\032\0020\f2\006\020\020\032\0020\0052\f\020\023\032\b\022\004\022\0028\0010\024H\026J\026\020\022\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\b\020\025\032\0020\017H\026J\026\020\026\032\0020\f2\006\020\r\032\0028\001H\002¢\006\002\020\016J\026\020\027\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\026\020\030\032\0028\0012\006\020\020\032\0020\005H\002¢\006\002\020\031J\025\020\032\032\0020\0052\006\020\r\032\0028\001H\026¢\006\002\020\033J\b\020\034\032\0020\fH\026J\017\020\035\032\b\022\004\022\0028\0010\036H\002J\025\020\037\032\0020\0052\006\020\r\032\0028\001H\026¢\006\002\020\033J\016\020 \032\b\022\004\022\0028\0010!H\026J\026\020 \032\b\022\004\022\0028\0010!2\006\020\020\032\0020\005H\026J\025\020\"\032\0020\f2\006\020\r\032\0028\001H\026¢\006\002\020\016J\026\020#\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\025\020$\032\0028\0012\006\020\020\032\0020\005H\026¢\006\002\020\031J\026\020%\032\0020\f2\f\020\023\032\b\022\004\022\0028\0010\024H\026J\036\020&\032\0028\0012\006\020\020\032\0020\0052\006\020\r\032\0028\001H\002¢\006\002\020'J\036\020(\032\b\022\004\022\0028\0010\0022\006\020)\032\0020\0052\006\020*\032\0020\005H\026R\016\020\006\032\0020\005X\016¢\006\002\n\000R\024\020\003\032\b\022\004\022\0028\0010\002X\004¢\006\002\n\000R\024\020\b\032\0020\0058VX\004¢\006\006\032\004\b\t\020\nR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006+"}, d2 = {"Landroidx/compose/runtime/collection/MutableVector$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "runtime"})
/*      */   @SourceDebugExtension({"SMAP\nMutableVector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,1220:1\n1855#2,2:1221\n1855#2,2:1223\n*S KotlinDebug\n*F\n+ 1 MutableVector.kt\nandroidx/compose/runtime/collection/MutableVector$SubList\n*L\n1039#1:1221,2\n1121#1:1223,2\n*E\n"})
/*      */   private static final class SubList<T> implements List<T>, KMutableList {
/*      */     @NotNull
/*      */     private final List<T> list;
/*      */     private final int start;
/*      */     private int end;
/*      */     
/*      */     public SubList(@NotNull List<T> list, int start, int end) {
/*      */       this.list = list;
/*      */       this.start = start;
/*      */       this.end = end;
/*      */     }
/*      */     
/*      */     public int getSize() {
/*      */       return this.end - this.start;
/*      */     }
/*      */     
/*      */     public boolean contains(Object element) {
/*      */       for (int i = this.start, j = this.end; i < j; i++) {
/*      */         if (Intrinsics.areEqual(this.list.get(i), element))
/*      */           return true; 
/*      */       } 
/*      */       return false;
/*      */     }
/*      */     
/*      */     public boolean containsAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       Iterable $this$forEach$iv = elements;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv = iterator.next(), it = element$iv;
/*      */         int $i$a$-forEach-MutableVector$SubList$containsAll$1 = 0;
/*      */         if (!contains(it))
/*      */           return false; 
/*      */       } 
/*      */       return true;
/*      */     }
/*      */     
/*      */     public T get(int index) {
/*      */       MutableVectorKt.access$checkIndex(this, index);
/*      */       return this.list.get(index + this.start);
/*      */     }
/*      */     
/*      */     public int indexOf(Object element) {
/*      */       for (int i = this.start, j = this.end; i < j; i++) {
/*      */         if (Intrinsics.areEqual(this.list.get(i), element))
/*      */           return i - this.start; 
/*      */       } 
/*      */       return -1;
/*      */     }
/*      */     
/*      */     public boolean isEmpty() {
/*      */       return (this.end == this.start);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public Iterator<T> iterator() {
/*      */       return new MutableVector.VectorListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     public int lastIndexOf(Object element) {
/*      */       int i = this.end - 1, j = this.start;
/*      */       if (j <= i)
/*      */         while (true) {
/*      */           if (Intrinsics.areEqual(this.list.get(i), element))
/*      */             return i - this.start; 
/*      */           if (i != j) {
/*      */             i--;
/*      */             continue;
/*      */           } 
/*      */           break;
/*      */         }  
/*      */       return -1;
/*      */     }
/*      */     
/*      */     public boolean add(Object element) {
/*      */       int i = this.end;
/*      */       this.end = i + 1;
/*      */       this.list.add(i, (T)element);
/*      */       return true;
/*      */     }
/*      */     
/*      */     public void add(int index, Object element) {
/*      */       this.list.add(index + this.start, (T)element);
/*      */       int i = this.end;
/*      */       this.end = i + 1;
/*      */     }
/*      */     
/*      */     public boolean addAll(int index, @NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       this.list.addAll(index + this.start, elements);
/*      */       this.end += elements.size();
/*      */       return (elements.size() > 0);
/*      */     }
/*      */     
/*      */     public boolean addAll(@NotNull Collection<? extends T> elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       this.list.addAll(this.end, elements);
/*      */       this.end += elements.size();
/*      */       return (elements.size() > 0);
/*      */     }
/*      */     
/*      */     public void clear() {
/*      */       int i = this.end - 1, j = this.start;
/*      */       if (j <= i)
/*      */         while (true) {
/*      */           this.list.remove(i);
/*      */           if (i != j) {
/*      */             i--;
/*      */             continue;
/*      */           } 
/*      */           break;
/*      */         }  
/*      */       this.end = this.start;
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator() {
/*      */       return new MutableVector.VectorListIterator<>(this, 0);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public ListIterator<T> listIterator(int index) {
/*      */       return new MutableVector.VectorListIterator<>(this, index);
/*      */     }
/*      */     
/*      */     public boolean remove(Object element) {
/*      */       for (int i = this.start, j = this.end; i < j; i++) {
/*      */         if (Intrinsics.areEqual(this.list.get(i), element)) {
/*      */           this.list.remove(i);
/*      */           int k = this.end;
/*      */           this.end = k + -1;
/*      */           return true;
/*      */         } 
/*      */       } 
/*      */       return false;
/*      */     }
/*      */     
/*      */     public boolean removeAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       int originalEnd = this.end;
/*      */       Iterable $this$forEach$iv = elements;
/*      */       int $i$f$forEach = 0;
/*      */       Iterator iterator = $this$forEach$iv.iterator();
/*      */       if (iterator.hasNext()) {
/*      */         Object element$iv = iterator.next(), it = element$iv;
/*      */         int $i$a$-forEach-MutableVector$SubList$removeAll$1 = 0;
/*      */         remove(it);
/*      */       } 
/*      */       return (originalEnd != this.end);
/*      */     }
/*      */     
/*      */     public T removeAt(int index) {
/*      */       MutableVectorKt.access$checkIndex(this, index);
/*      */       Object item = this.list.remove(index + this.start);
/*      */       int i = this.end;
/*      */       this.end = i + -1;
/*      */       return (T)item;
/*      */     }
/*      */     
/*      */     public boolean retainAll(@NotNull Collection elements) {
/*      */       Intrinsics.checkNotNullParameter(elements, "elements");
/*      */       int originalEnd = this.end;
/*      */       int i = this.end - 1, j = this.start;
/*      */       if (j <= i)
/*      */         while (true) {
/*      */           Object item = this.list.get(i);
/*      */           if (!elements.contains(item)) {
/*      */             this.list.remove(i);
/*      */             int k = this.end;
/*      */             this.end = k + -1;
/*      */           } 
/*      */           if (i != j) {
/*      */             i--;
/*      */             continue;
/*      */           } 
/*      */           break;
/*      */         }  
/*      */       return (originalEnd != this.end);
/*      */     }
/*      */     
/*      */     public T set(int index, Object element) {
/*      */       MutableVectorKt.access$checkIndex(this, index);
/*      */       return this.list.set(index + this.start, (T)element);
/*      */     }
/*      */     
/*      */     @NotNull
/*      */     public List<T> subList(int fromIndex, int toIndex) {
/*      */       MutableVectorKt.access$checkSubIndex(this, fromIndex, toIndex);
/*      */       return new SubList(this, fromIndex, toIndex);
/*      */     }
/*      */     
/*      */     public <T> T[] toArray(Object[] array) {
/*      */       Intrinsics.checkNotNullParameter(array, "array");
/*      */       return (T[])CollectionToArray.toArray(this, array);
/*      */     }
/*      */     
/*      */     public Object[] toArray() {
/*      */       return CollectionToArray.toArray(this);
/*      */     }
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\collection\MutableVector.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */