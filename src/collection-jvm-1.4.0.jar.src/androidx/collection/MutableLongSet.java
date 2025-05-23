/*      */ package androidx.collection;
/*      */ 
/*      */ import androidx.annotation.IntRange;
/*      */ import kotlin.Metadata;
/*      */ import kotlin.ULong;
/*      */ import kotlin.collections.ArraysKt;
/*      */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*      */ import kotlin.jvm.internal.Intrinsics;
/*      */ import kotlin.jvm.internal.SourceDebugExtension;
/*      */ import org.jetbrains.annotations.NotNull;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\000.\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\t\n\002\b\002\n\002\020\026\n\000\n\002\020\002\n\002\b\024\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\016\020\006\032\0020\0072\006\020\b\032\0020\tJ\016\020\n\032\0020\0072\006\020\013\032\0020\001J\016\020\n\032\0020\0072\006\020\013\032\0020\fJ\b\020\r\032\0020\016H\002J\006\020\017\032\0020\016J\020\020\020\032\0020\0032\006\020\b\032\0020\tH\002J\020\020\021\032\0020\0032\006\020\022\032\0020\003H\002J\b\020\023\032\0020\016H\002J\020\020\024\032\0020\0162\006\020\025\032\0020\003H\002J\020\020\026\032\0020\0162\006\020\002\032\0020\003H\002J\021\020\027\032\0020\0162\006\020\013\032\0020\001H\002J\021\020\027\032\0020\0162\006\020\b\032\0020\tH\002J\021\020\027\032\0020\0162\006\020\013\032\0020\fH\002J\021\020\030\032\0020\0162\006\020\013\032\0020\001H\002J\021\020\030\032\0020\0162\006\020\b\032\0020\tH\002J\021\020\030\032\0020\0162\006\020\013\032\0020\fH\002J\016\020\031\032\0020\0072\006\020\b\032\0020\tJ\016\020\032\032\0020\0072\006\020\013\032\0020\001J\016\020\032\032\0020\0072\006\020\013\032\0020\fJ\020\020\033\032\0020\0162\006\020\034\032\0020\003H\002J\020\020\035\032\0020\0162\006\020\036\032\0020\003H\002J\b\020\037\032\0020\003H\007J\031\020 \032\0020\0162\006\020\034\032\0020\0032\006\020!\032\0020\tH\bR\016\020\005\032\0020\003X\016¢\006\002\n\000¨\006\""}, d2 = {"Landroidx/collection/MutableLongSet;", "Landroidx/collection/LongSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "", "addAll", "elements", "", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "plusAssign", "remove", "removeAll", "removeElementAt", "index", "resizeStorage", "newCapacity", "trim", "writeMetadata", "value", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nLongSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 LongSet.kt\nandroidx/collection/LongSet\n+ 6 LongSet.kt\nandroidx/collection/LongSetKt\n*L\n1#1,837:1\n816#1,2:981\n820#1,5:989\n816#1,2:1020\n820#1,5:1028\n816#1,2:1045\n820#1,5:1053\n1#2:838\n1656#3,6:839\n1810#3:858\n1672#3:862\n1603#3:879\n1599#3:882\n1779#3,3:886\n1793#3,3:890\n1717#3:894\n1705#3:896\n1699#3:897\n1712#3:902\n1802#3:904\n1603#3:918\n1599#3:921\n1779#3,3:925\n1793#3,3:929\n1717#3:933\n1705#3:935\n1699#3:936\n1712#3:941\n1802#3:943\n1810#3:965\n1672#3:969\n1656#3,6:983\n1656#3,6:994\n1599#3:1003\n1603#3:1004\n1779#3,3:1005\n1793#3,3:1008\n1717#3:1011\n1705#3:1012\n1699#3:1013\n1712#3:1014\n1802#3:1015\n1666#3:1016\n1645#3:1017\n1664#3:1018\n1645#3:1019\n1656#3,6:1022\n1779#3,3:1033\n1810#3:1036\n1699#3:1037\n1669#3:1038\n1645#3:1039\n1599#3:1043\n1603#3:1044\n1656#3,6:1047\n1656#3,6:1058\n1656#3,6:1064\n13607#4,2:845\n13607#4,2:952\n262#5,4:847\n232#5,7:851\n243#5,3:859\n246#5,2:863\n266#5,2:865\n249#5,6:867\n268#5:873\n442#5:874\n443#5:878\n445#5,2:880\n447#5,3:883\n450#5:889\n451#5:893\n452#5:895\n453#5,4:898\n459#5:903\n460#5,8:905\n442#5:913\n443#5:917\n445#5,2:919\n447#5,3:922\n450#5:928\n451#5:932\n452#5:934\n453#5,4:937\n459#5:942\n460#5,8:944\n262#5,4:954\n232#5,7:958\n243#5,3:966\n246#5,2:970\n266#5,2:972\n249#5,6:974\n268#5:980\n833#6,3:875\n833#6,3:914\n833#6,3:1000\n833#6,3:1040\n*S KotlinDebug\n*F\n+ 1 LongSet.kt\nandroidx/collection/MutableLongSet\n*L\n673#1:981,2\n673#1:989,5\n731#1:1020,2\n731#1:1028,5\n804#1:1045,2\n804#1:1053,5\n526#1:839,6\n595#1:858\n595#1:862\n607#1:879\n607#1:882\n607#1:886,3\n607#1:890,3\n607#1:894\n607#1:896\n607#1:897\n607#1:902\n607#1:904\n620#1:918\n620#1:921\n620#1:925,3\n620#1:929,3\n620#1:933\n620#1:935\n620#1:936\n620#1:941\n620#1:943\n663#1:965\n663#1:969\n673#1:983,6\n683#1:994,6\n697#1:1003\n698#1:1004\n705#1:1005,3\n706#1:1008,3\n707#1:1011\n708#1:1012\n708#1:1013\n712#1:1014\n715#1:1015\n724#1:1016\n724#1:1017\n730#1:1018\n730#1:1019\n731#1:1022,6\n745#1:1033,3\n746#1:1036\n748#1:1037\n799#1:1038\n799#1:1039\n802#1:1043\n804#1:1044\n804#1:1047,6\n817#1:1058,6\n823#1:1064,6\n573#1:845,2\n642#1:952,2\n595#1:847,4\n595#1:851,7\n595#1:859,3\n595#1:863,2\n595#1:865,2\n595#1:867,6\n595#1:873\n607#1:874\n607#1:878\n607#1:880,2\n607#1:883,3\n607#1:889\n607#1:893\n607#1:895\n607#1:898,4\n607#1:903\n607#1:905,8\n620#1:913\n620#1:917\n620#1:919,2\n620#1:922,3\n620#1:928\n620#1:932\n620#1:934\n620#1:937,4\n620#1:942\n620#1:944,8\n663#1:954,4\n663#1:958,7\n663#1:966,3\n663#1:970,2\n663#1:972,2\n663#1:974,6\n663#1:980\n607#1:875,3\n620#1:914,3\n696#1:1000,3\n801#1:1040,3\n*E\n"})
/*      */ public final class MutableLongSet
/*      */   extends LongSet
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableLongSet(int initialCapacity) {
/*  494 */     super(null);
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  499 */     if (!((initialCapacity >= 0) ? 1 : 0))
/*      */     
/*      */     { 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  838 */       int $i$a$-require-MutableLongSet$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/*  839 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.elements = new long[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableLongSet mutableLongSet = this; int $i$a$-apply-MutableLongSet$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableLongSet.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/*  840 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/*  843 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); } private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; } public final boolean add(long element) { int oldSize = this._size; int index = findAbsoluteInsertIndex(element); this.elements[index] = element; return (this._size != oldSize); } public final void plusAssign(long element) { int index = findAbsoluteInsertIndex(element); this.elements[index] = element; }
/*      */   public final boolean addAll(@NotNull long[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*  845 */   public final void plusAssign(@NotNull long[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); long[] $this$forEach$iv = elements; int $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { long element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableLongSet$plusAssign$1 = 0; plusAssign(element); }
/*      */      } public final boolean addAll(@NotNull LongSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*      */   public final void plusAssign(@NotNull LongSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); LongSet this_$iv = elements; int $i$f$forEach = 0;
/*  848 */     long[] k$iv = this_$iv.elements;
/*      */     
/*  850 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  852 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  853 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  855 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  856 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  857 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  858 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L) {
/*  859 */           int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  860 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  869 */           if (bitCount$iv$iv == 8) {
/*      */             continue;
/*      */           }
/*      */           break;
/*      */         } 
/*      */         continue;
/*      */         if (i$iv$iv != lastIndex$iv$iv) {
/*      */           i$iv$iv++;
/*      */           continue;
/*      */         } 
/*      */         // Byte code: goto -> 207
/*      */       }  }
/*      */     else
/*      */     {  }
/*      */      }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean remove(long element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/LongSet
/*      */     //   4: astore #4
/*      */     //   6: iconst_0
/*      */     //   7: istore #5
/*      */     //   9: iconst_0
/*      */     //   10: istore #6
/*      */     //   12: lload_1
/*      */     //   13: invokestatic hashCode : (J)I
/*      */     //   16: ldc -862048943
/*      */     //   18: imul
/*      */     //   19: istore #7
/*      */     //   21: iload #7
/*      */     //   23: iload #7
/*      */     //   25: bipush #16
/*      */     //   27: ishl
/*      */     //   28: ixor
/*      */     //   29: istore #8
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: iload #8
/*      */     //   36: bipush #127
/*      */     //   38: iand
/*      */     //   39: istore #6
/*      */     //   41: aload #4
/*      */     //   43: getfield _capacity : I
/*      */     //   46: istore #7
/*      */     //   48: iconst_0
/*      */     //   49: istore #9
/*      */     //   51: iload #8
/*      */     //   53: bipush #7
/*      */     //   55: iushr
/*      */     //   56: iload #7
/*      */     //   58: iand
/*      */     //   59: istore #10
/*      */     //   61: iconst_0
/*      */     //   62: istore #9
/*      */     //   64: nop
/*      */     //   65: aload #4
/*      */     //   67: getfield metadata : [J
/*      */     //   70: astore #11
/*      */     //   72: iconst_0
/*      */     //   73: istore #12
/*      */     //   75: iload #10
/*      */     //   77: iconst_3
/*      */     //   78: ishr
/*      */     //   79: istore #13
/*      */     //   81: iload #10
/*      */     //   83: bipush #7
/*      */     //   85: iand
/*      */     //   86: iconst_3
/*      */     //   87: ishl
/*      */     //   88: istore #14
/*      */     //   90: aload #11
/*      */     //   92: iload #13
/*      */     //   94: laload
/*      */     //   95: iload #14
/*      */     //   97: lushr
/*      */     //   98: aload #11
/*      */     //   100: iload #13
/*      */     //   102: iconst_1
/*      */     //   103: iadd
/*      */     //   104: laload
/*      */     //   105: bipush #64
/*      */     //   107: iload #14
/*      */     //   109: isub
/*      */     //   110: lshl
/*      */     //   111: iload #14
/*      */     //   113: i2l
/*      */     //   114: lneg
/*      */     //   115: bipush #63
/*      */     //   117: lshr
/*      */     //   118: land
/*      */     //   119: lor
/*      */     //   120: lstore #15
/*      */     //   122: lload #15
/*      */     //   124: lstore #17
/*      */     //   126: iconst_0
/*      */     //   127: istore #19
/*      */     //   129: lload #17
/*      */     //   131: ldc2_w 72340172838076673
/*      */     //   134: iload #6
/*      */     //   136: i2l
/*      */     //   137: lmul
/*      */     //   138: lxor
/*      */     //   139: lstore #20
/*      */     //   141: lload #20
/*      */     //   143: ldc2_w 72340172838076673
/*      */     //   146: lsub
/*      */     //   147: lload #20
/*      */     //   149: ldc2_w -1
/*      */     //   152: lxor
/*      */     //   153: land
/*      */     //   154: ldc2_w -9187201950435737472
/*      */     //   157: land
/*      */     //   158: lstore #22
/*      */     //   160: lload #22
/*      */     //   162: lstore #17
/*      */     //   164: iconst_0
/*      */     //   165: istore #19
/*      */     //   167: lload #17
/*      */     //   169: lconst_0
/*      */     //   170: lcmp
/*      */     //   171: ifeq -> 178
/*      */     //   174: iconst_1
/*      */     //   175: goto -> 179
/*      */     //   178: iconst_0
/*      */     //   179: ifeq -> 249
/*      */     //   182: iload #10
/*      */     //   184: lload #22
/*      */     //   186: lstore #24
/*      */     //   188: iconst_0
/*      */     //   189: istore #26
/*      */     //   191: lload #24
/*      */     //   193: lstore #27
/*      */     //   195: iconst_0
/*      */     //   196: istore #29
/*      */     //   198: lload #27
/*      */     //   200: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   203: iconst_3
/*      */     //   204: ishr
/*      */     //   205: nop
/*      */     //   206: iadd
/*      */     //   207: iload #7
/*      */     //   209: iand
/*      */     //   210: istore #13
/*      */     //   212: aload #4
/*      */     //   214: getfield elements : [J
/*      */     //   217: iload #13
/*      */     //   219: laload
/*      */     //   220: lload_1
/*      */     //   221: lcmp
/*      */     //   222: ifne -> 230
/*      */     //   225: iload #13
/*      */     //   227: goto -> 298
/*      */     //   230: lload #22
/*      */     //   232: lstore #24
/*      */     //   234: iconst_0
/*      */     //   235: istore #26
/*      */     //   237: lload #24
/*      */     //   239: lload #24
/*      */     //   241: lconst_1
/*      */     //   242: lsub
/*      */     //   243: land
/*      */     //   244: lstore #22
/*      */     //   246: goto -> 160
/*      */     //   249: lload #15
/*      */     //   251: lstore #17
/*      */     //   253: iconst_0
/*      */     //   254: istore #19
/*      */     //   256: lload #17
/*      */     //   258: lload #17
/*      */     //   260: ldc2_w -1
/*      */     //   263: lxor
/*      */     //   264: bipush #6
/*      */     //   266: lshl
/*      */     //   267: land
/*      */     //   268: ldc2_w -9187201950435737472
/*      */     //   271: land
/*      */     //   272: lconst_0
/*      */     //   273: lcmp
/*      */     //   274: ifeq -> 280
/*      */     //   277: goto -> 297
/*      */     //   280: iinc #9, 8
/*      */     //   283: nop
/*      */     //   284: iload #10
/*      */     //   286: iload #9
/*      */     //   288: iadd
/*      */     //   289: iload #7
/*      */     //   291: iand
/*      */     //   292: istore #10
/*      */     //   294: goto -> 64
/*      */     //   297: iconst_m1
/*      */     //   298: istore_3
/*      */     //   299: iload_3
/*      */     //   300: iflt -> 307
/*      */     //   303: iconst_1
/*      */     //   304: goto -> 308
/*      */     //   307: iconst_0
/*      */     //   308: istore #4
/*      */     //   310: iload #4
/*      */     //   312: ifeq -> 320
/*      */     //   315: aload_0
/*      */     //   316: iload_3
/*      */     //   317: invokespecial removeElementAt : (I)V
/*      */     //   320: iload #4
/*      */     //   322: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #607	-> 0
/*      */     //   #874	-> 9
/*      */     //   #875	-> 12
/*      */     //   #877	-> 21
/*      */     //   #874	-> 29
/*      */     //   #878	-> 31
/*      */     //   #879	-> 34
/*      */     //   #878	-> 39
/*      */     //   #880	-> 41
/*      */     //   #881	-> 48
/*      */     //   #882	-> 51
/*      */     //   #881	-> 56
/*      */     //   #883	-> 61
/*      */     //   #884	-> 64
/*      */     //   #885	-> 65
/*      */     //   #886	-> 75
/*      */     //   #887	-> 81
/*      */     //   #888	-> 90
/*      */     //   #885	-> 120
/*      */     //   #889	-> 122
/*      */     //   #890	-> 129
/*      */     //   #892	-> 141
/*      */     //   #889	-> 158
/*      */     //   #893	-> 160
/*      */     //   #894	-> 167
/*      */     //   #895	-> 182
/*      */     //   #896	-> 191
/*      */     //   #897	-> 198
/*      */     //   #897	-> 203
/*      */     //   #896	-> 205
/*      */     //   #895	-> 206
/*      */     //   #898	-> 212
/*      */     //   #899	-> 225
/*      */     //   #901	-> 230
/*      */     //   #902	-> 237
/*      */     //   #901	-> 244
/*      */     //   #903	-> 249
/*      */     //   #904	-> 256
/*      */     //   #903	-> 272
/*      */     //   #905	-> 277
/*      */     //   #908	-> 283
/*      */     //   #909	-> 284
/*      */     //   #912	-> 297
/*      */     //   #607	-> 298
/*      */     //   #608	-> 299
/*      */     //   #609	-> 310
/*      */     //   #610	-> 315
/*      */     //   #612	-> 320
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   12	17	6	$i$f$hash	I
/*      */     //   21	8	7	hash$iv$iv	I
/*      */     //   34	5	7	$i$f$h2	I
/*      */     //   51	5	9	$i$f$h1	I
/*      */     //   75	45	12	$i$f$group	I
/*      */     //   81	39	13	i$iv$iv	I
/*      */     //   90	30	14	b$iv$iv	I
/*      */     //   72	48	11	metadata$iv$iv	[J
/*      */     //   129	29	19	$i$f$match	I
/*      */     //   141	17	20	x$iv$iv	J
/*      */     //   126	32	17	$this$match$iv$iv	J
/*      */     //   167	12	19	$i$f$hasNext	I
/*      */     //   164	15	17	$this$hasNext$iv$iv	J
/*      */     //   198	7	29	$i$f$lowestBitSet	I
/*      */     //   195	10	27	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   191	15	26	$i$f$get	I
/*      */     //   188	18	24	$this$get$iv$iv	J
/*      */     //   237	7	26	$i$f$next	I
/*      */     //   234	10	24	$this$next$iv$iv	J
/*      */     //   212	34	13	index$iv	I
/*      */     //   256	16	19	$i$f$maskEmpty	I
/*      */     //   253	19	17	$this$maskEmpty$iv$iv	J
/*      */     //   122	172	15	g$iv	J
/*      */     //   160	134	22	m$iv	J
/*      */     //   9	289	5	$i$f$findElementIndex$collection	I
/*      */     //   31	267	8	hash$iv	I
/*      */     //   41	257	6	hash2$iv	I
/*      */     //   48	250	7	probeMask$iv	I
/*      */     //   61	237	10	probeOffset$iv	I
/*      */     //   64	234	9	probeIndex$iv	I
/*      */     //   6	292	4	this_$iv	Landroidx/collection/LongSet;
/*      */     //   299	24	3	index	I
/*      */     //   310	13	4	exists	Z
/*      */     //   0	323	0	this	Landroidx/collection/MutableLongSet;
/*      */     //   0	323	1	element	J
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void minusAssign(long element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/LongSet
/*      */     //   4: astore #4
/*      */     //   6: iconst_0
/*      */     //   7: istore #5
/*      */     //   9: iconst_0
/*      */     //   10: istore #6
/*      */     //   12: lload_1
/*      */     //   13: invokestatic hashCode : (J)I
/*      */     //   16: ldc -862048943
/*      */     //   18: imul
/*      */     //   19: istore #7
/*      */     //   21: iload #7
/*      */     //   23: iload #7
/*      */     //   25: bipush #16
/*      */     //   27: ishl
/*      */     //   28: ixor
/*      */     //   29: istore #8
/*      */     //   31: iconst_0
/*      */     //   32: istore #7
/*      */     //   34: iload #8
/*      */     //   36: bipush #127
/*      */     //   38: iand
/*      */     //   39: istore #6
/*      */     //   41: aload #4
/*      */     //   43: getfield _capacity : I
/*      */     //   46: istore #7
/*      */     //   48: iconst_0
/*      */     //   49: istore #9
/*      */     //   51: iload #8
/*      */     //   53: bipush #7
/*      */     //   55: iushr
/*      */     //   56: iload #7
/*      */     //   58: iand
/*      */     //   59: istore #10
/*      */     //   61: iconst_0
/*      */     //   62: istore #9
/*      */     //   64: nop
/*      */     //   65: aload #4
/*      */     //   67: getfield metadata : [J
/*      */     //   70: astore #11
/*      */     //   72: iconst_0
/*      */     //   73: istore #12
/*      */     //   75: iload #10
/*      */     //   77: iconst_3
/*      */     //   78: ishr
/*      */     //   79: istore #13
/*      */     //   81: iload #10
/*      */     //   83: bipush #7
/*      */     //   85: iand
/*      */     //   86: iconst_3
/*      */     //   87: ishl
/*      */     //   88: istore #14
/*      */     //   90: aload #11
/*      */     //   92: iload #13
/*      */     //   94: laload
/*      */     //   95: iload #14
/*      */     //   97: lushr
/*      */     //   98: aload #11
/*      */     //   100: iload #13
/*      */     //   102: iconst_1
/*      */     //   103: iadd
/*      */     //   104: laload
/*      */     //   105: bipush #64
/*      */     //   107: iload #14
/*      */     //   109: isub
/*      */     //   110: lshl
/*      */     //   111: iload #14
/*      */     //   113: i2l
/*      */     //   114: lneg
/*      */     //   115: bipush #63
/*      */     //   117: lshr
/*      */     //   118: land
/*      */     //   119: lor
/*      */     //   120: lstore #15
/*      */     //   122: lload #15
/*      */     //   124: lstore #17
/*      */     //   126: iconst_0
/*      */     //   127: istore #19
/*      */     //   129: lload #17
/*      */     //   131: ldc2_w 72340172838076673
/*      */     //   134: iload #6
/*      */     //   136: i2l
/*      */     //   137: lmul
/*      */     //   138: lxor
/*      */     //   139: lstore #20
/*      */     //   141: lload #20
/*      */     //   143: ldc2_w 72340172838076673
/*      */     //   146: lsub
/*      */     //   147: lload #20
/*      */     //   149: ldc2_w -1
/*      */     //   152: lxor
/*      */     //   153: land
/*      */     //   154: ldc2_w -9187201950435737472
/*      */     //   157: land
/*      */     //   158: lstore #22
/*      */     //   160: lload #22
/*      */     //   162: lstore #17
/*      */     //   164: iconst_0
/*      */     //   165: istore #19
/*      */     //   167: lload #17
/*      */     //   169: lconst_0
/*      */     //   170: lcmp
/*      */     //   171: ifeq -> 178
/*      */     //   174: iconst_1
/*      */     //   175: goto -> 179
/*      */     //   178: iconst_0
/*      */     //   179: ifeq -> 249
/*      */     //   182: iload #10
/*      */     //   184: lload #22
/*      */     //   186: lstore #24
/*      */     //   188: iconst_0
/*      */     //   189: istore #26
/*      */     //   191: lload #24
/*      */     //   193: lstore #27
/*      */     //   195: iconst_0
/*      */     //   196: istore #29
/*      */     //   198: lload #27
/*      */     //   200: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   203: iconst_3
/*      */     //   204: ishr
/*      */     //   205: nop
/*      */     //   206: iadd
/*      */     //   207: iload #7
/*      */     //   209: iand
/*      */     //   210: istore #13
/*      */     //   212: aload #4
/*      */     //   214: getfield elements : [J
/*      */     //   217: iload #13
/*      */     //   219: laload
/*      */     //   220: lload_1
/*      */     //   221: lcmp
/*      */     //   222: ifne -> 230
/*      */     //   225: iload #13
/*      */     //   227: goto -> 298
/*      */     //   230: lload #22
/*      */     //   232: lstore #24
/*      */     //   234: iconst_0
/*      */     //   235: istore #26
/*      */     //   237: lload #24
/*      */     //   239: lload #24
/*      */     //   241: lconst_1
/*      */     //   242: lsub
/*      */     //   243: land
/*      */     //   244: lstore #22
/*      */     //   246: goto -> 160
/*      */     //   249: lload #15
/*      */     //   251: lstore #17
/*      */     //   253: iconst_0
/*      */     //   254: istore #19
/*      */     //   256: lload #17
/*      */     //   258: lload #17
/*      */     //   260: ldc2_w -1
/*      */     //   263: lxor
/*      */     //   264: bipush #6
/*      */     //   266: lshl
/*      */     //   267: land
/*      */     //   268: ldc2_w -9187201950435737472
/*      */     //   271: land
/*      */     //   272: lconst_0
/*      */     //   273: lcmp
/*      */     //   274: ifeq -> 280
/*      */     //   277: goto -> 297
/*      */     //   280: iinc #9, 8
/*      */     //   283: nop
/*      */     //   284: iload #10
/*      */     //   286: iload #9
/*      */     //   288: iadd
/*      */     //   289: iload #7
/*      */     //   291: iand
/*      */     //   292: istore #10
/*      */     //   294: goto -> 64
/*      */     //   297: iconst_m1
/*      */     //   298: istore_3
/*      */     //   299: iload_3
/*      */     //   300: iflt -> 308
/*      */     //   303: aload_0
/*      */     //   304: iload_3
/*      */     //   305: invokespecial removeElementAt : (I)V
/*      */     //   308: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #620	-> 0
/*      */     //   #913	-> 9
/*      */     //   #914	-> 12
/*      */     //   #916	-> 21
/*      */     //   #913	-> 29
/*      */     //   #917	-> 31
/*      */     //   #918	-> 34
/*      */     //   #917	-> 39
/*      */     //   #919	-> 41
/*      */     //   #920	-> 48
/*      */     //   #921	-> 51
/*      */     //   #920	-> 56
/*      */     //   #922	-> 61
/*      */     //   #923	-> 64
/*      */     //   #924	-> 65
/*      */     //   #925	-> 75
/*      */     //   #926	-> 81
/*      */     //   #927	-> 90
/*      */     //   #924	-> 120
/*      */     //   #928	-> 122
/*      */     //   #929	-> 129
/*      */     //   #931	-> 141
/*      */     //   #928	-> 158
/*      */     //   #932	-> 160
/*      */     //   #933	-> 167
/*      */     //   #934	-> 182
/*      */     //   #935	-> 191
/*      */     //   #936	-> 198
/*      */     //   #936	-> 203
/*      */     //   #935	-> 205
/*      */     //   #934	-> 206
/*      */     //   #937	-> 212
/*      */     //   #938	-> 225
/*      */     //   #940	-> 230
/*      */     //   #941	-> 237
/*      */     //   #940	-> 244
/*      */     //   #942	-> 249
/*      */     //   #943	-> 256
/*      */     //   #942	-> 272
/*      */     //   #944	-> 277
/*      */     //   #947	-> 283
/*      */     //   #948	-> 284
/*      */     //   #951	-> 297
/*      */     //   #620	-> 298
/*      */     //   #621	-> 299
/*      */     //   #622	-> 303
/*      */     //   #624	-> 308
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   12	17	6	$i$f$hash	I
/*      */     //   21	8	7	hash$iv$iv	I
/*      */     //   34	5	7	$i$f$h2	I
/*      */     //   51	5	9	$i$f$h1	I
/*      */     //   75	45	12	$i$f$group	I
/*      */     //   81	39	13	i$iv$iv	I
/*      */     //   90	30	14	b$iv$iv	I
/*      */     //   72	48	11	metadata$iv$iv	[J
/*      */     //   129	29	19	$i$f$match	I
/*      */     //   141	17	20	x$iv$iv	J
/*      */     //   126	32	17	$this$match$iv$iv	J
/*      */     //   167	12	19	$i$f$hasNext	I
/*      */     //   164	15	17	$this$hasNext$iv$iv	J
/*      */     //   198	7	29	$i$f$lowestBitSet	I
/*      */     //   195	10	27	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   191	15	26	$i$f$get	I
/*      */     //   188	18	24	$this$get$iv$iv	J
/*      */     //   237	7	26	$i$f$next	I
/*      */     //   234	10	24	$this$next$iv$iv	J
/*      */     //   212	34	13	index$iv	I
/*      */     //   256	16	19	$i$f$maskEmpty	I
/*      */     //   253	19	17	$this$maskEmpty$iv$iv	J
/*      */     //   122	172	15	g$iv	J
/*      */     //   160	134	22	m$iv	J
/*      */     //   9	289	5	$i$f$findElementIndex$collection	I
/*      */     //   31	267	8	hash$iv	I
/*      */     //   41	257	6	hash2$iv	I
/*      */     //   48	250	7	probeMask$iv	I
/*      */     //   61	237	10	probeOffset$iv	I
/*      */     //   64	234	9	probeIndex$iv	I
/*      */     //   6	292	4	this_$iv	Landroidx/collection/LongSet;
/*      */     //   299	10	3	index	I
/*      */     //   0	309	0	this	Landroidx/collection/MutableLongSet;
/*      */     //   0	309	1	element	J
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final boolean removeAll(@NotNull long[] elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     int oldSize = this._size;
/*      */     minusAssign(elements);
/*      */     return (oldSize != this._size);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public final void minusAssign(@NotNull long[] elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     long[] $this$forEach$iv = elements;
/*      */     int $i$f$forEach = 0;
/*  952 */     byte b = 0; int i = $this$forEach$iv.length; if (b < i) { long element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableLongSet$minusAssign$1 = 0; minusAssign(element); }
/*      */   
/*      */   } public final boolean removeAll(@NotNull LongSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; minusAssign(elements); return (oldSize != this._size); } public final void minusAssign(@NotNull LongSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); LongSet this_$iv = elements; int $i$f$forEach = 0;
/*  955 */     long[] k$iv = this_$iv.elements;
/*      */     
/*  957 */     LongSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
/*      */     
/*  959 */     long[] m$iv$iv = this_$iv$iv.metadata;
/*  960 */     int lastIndex$iv$iv = m$iv$iv.length - 2;
/*      */     
/*  962 */     int i$iv$iv = 0; if (i$iv$iv <= lastIndex$iv$iv) { while (true) {
/*  963 */         long slot$iv$iv = m$iv$iv[i$iv$iv];
/*  964 */         long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv; int $i$f$maskEmptyOrDeleted = 0;
/*  965 */         if (($this$maskEmptyOrDeleted$iv$iv$iv & ($this$maskEmptyOrDeleted$iv$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L) != -9187201950435737472L)
/*  966 */         { int bitCount$iv$iv = 8 - ((i$iv$iv - lastIndex$iv$iv ^ 0xFFFFFFFF) >>> 31);
/*  967 */           for (int j$iv$iv = 0;; j$iv$iv++);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  976 */           if (bitCount$iv$iv == 8)
/*      */             continue;  break; }  continue; if (i$iv$iv != lastIndex$iv$iv) { i$iv$iv++; continue; }
/*      */          // Byte code: goto -> 207
/*      */       }  }
/*      */     else {  }
/*  981 */      } private final void removeElementAt(int index) { this._size--; MutableLongSet mutableLongSet = this; long value$iv = 254L; int $i$f$writeMetadata = 0; long[] m$iv = mutableLongSet.metadata;
/*  982 */     int $i$f$writeRawMetadata = 0;
/*  983 */     int i$iv$iv = index >> 3;
/*  984 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/*  987 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/*  989 */     int c$iv = mutableLongSet._capacity;
/*  990 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/*  991 */       0x7 & c$iv);
/*  992 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/*  994 */       int i$iv = i >> 3;
/*  995 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/*  998 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  initializeGrowth(); } private final int findAbsoluteInsertIndex(long element) { int $i$f$hash = 0;
/* 1000 */     int hash$iv = Long.hashCode(element) * -862048943;
/*      */     
/* 1002 */     int hash = hash$iv ^ hash$iv << 16;
/* 1003 */     int $i$f$h1 = 0, hash1 = hash >>> 7;
/* 1004 */     int $i$f$h2 = 0, hash2 = hash & 0x7F; int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true) {
/* 1005 */       long[] arrayOfLong = this.metadata; int $i$f$group = 0; int i$iv = probeOffset >> 3;
/* 1006 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1007 */       long g = arrayOfLong[i$iv] >>> b$iv | arrayOfLong[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$match$iv = g; int $i$f$match = 0;
/* 1008 */       long x$iv = $this$match$iv ^ 72340172838076673L * hash2;
/*      */       
/* 1010 */       long m = x$iv - 72340172838076673L & (x$iv ^ 0xFFFFFFFFFFFFFFFFL) & 0x8080808080808080L; while (true)
/* 1011 */       { long $this$hasNext$iv = m; int $i$f$hasNext = 0; if (($this$hasNext$iv != 0L)) {
/* 1012 */           long $this$get$iv = m; int $i$f$get = 0; long $this$lowestBitSet$iv$iv = $this$get$iv; int $i$f$lowestBitSet = 0;
/* 1013 */           int n = probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv$iv) >> 3) & probeMask;
/*      */         }  long $this$maskEmpty$iv = g; int $i$f$maskEmpty = 0;
/* 1015 */         if (($this$maskEmpty$iv & ($this$maskEmpty$iv ^ 0xFFFFFFFFFFFFFFFFL) << 6L & 0x8080808080808080L) != 0L); break; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask;
/* 1016 */     }  int index = findFirstAvailableSlot(hash1); if (this.growthLimit == 0) { long[] arrayOfLong = this.metadata; int $i$f$isDeleted = 0; int m = 0; if (!(((
/* 1017 */         arrayOfLong[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 254L) ? 1 : 0)) { adjustStorage(); index = findFirstAvailableSlot(hash1); }  }
/* 1018 */      this._size++; long[] metadata$iv = this.metadata; int $i$f$isEmpty = 0; int $i$f$readRawMetadata = 0; this.growthLimit -= (((
/* 1019 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableLongSet mutableLongSet = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1020 */     long[] m$iv = mutableLongSet.metadata;
/* 1021 */     int $i$f$writeRawMetadata = 0;
/* 1022 */     int i$iv$iv = index >> 3;
/* 1023 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1026 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1028 */     int c$iv = mutableLongSet._capacity;
/* 1029 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1030 */       0x7 & c$iv);
/* 1031 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1033 */       int i$iv = probeOffset >> 3;
/* 1034 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1035 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1036 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1037 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  }
/* 1038 */   @IntRange(from = 0L) public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; long[] previousElements = this.elements; int previousCapacity = this._capacity; initializeStorage(newCapacity); long[] newElements = this.elements; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1039 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L))
/* 1040 */       { long previousElement = previousElements[i]; int $i$f$hash = 0; int hash$iv = Long.hashCode(previousElement) * -862048943;
/*      */         
/* 1042 */         int hash = hash$iv ^ hash$iv << 16;
/* 1043 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableLongSet mutableLongSet = this; int $i$f$h2 = 0;
/* 1044 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1045 */         long[] m$iv = mutableLongSet.metadata;
/* 1046 */         int $i$f$writeRawMetadata = 0;
/* 1047 */         int i$iv$iv = index >> 3;
/* 1048 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1051 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1053 */         int c$iv = mutableLongSet._capacity;
/* 1054 */         int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1055 */           0x7 & c$iv);
/* 1056 */         int j = 0; int k = cloneIndex$iv >> 3; int m = (cloneIndex$iv & 0x7) << 3; m$iv[k] = m$iv[k] & (255L << m ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << m; newElements[index] = previousElement; }  }  }
/*      */   private final void adjustStorage() { if (this._capacity > 8 && Long.compareUnsigned(ULong.constructor-impl(ULong.constructor-impl(this._size) * 32L), ULong.constructor-impl(ULong.constructor-impl(this._capacity) * 25L)) <= 0) { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); } else { resizeStorage(ScatterMapKt.nextCapacity(this._capacity)); }
/* 1058 */      } private final void writeMetadata(int index, long value) { int $i$f$writeMetadata = 0; long[] m = this.metadata; int $i$f$writeRawMetadata = 0; int i$iv = index >> 3;
/* 1059 */     int b$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1062 */     m[i$iv] = m[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value << b$iv; int c = this._capacity; int cloneIndex = (index - 7 & c) + (0x7 & c);
/*      */     int i = 0;
/* 1064 */     int j = cloneIndex >> 3;
/* 1065 */     int k = (cloneIndex & 0x7) << 3;
/*      */ 
/*      */     
/* 1068 */     m[j] = m[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value << k; }
/*      */ 
/*      */   
/*      */   public MutableLongSet() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableLongSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */