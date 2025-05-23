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
/*      */ @Metadata(mv = {1, 8, 0}, k = 1, xi = 48, d1 = {"\0004\n\002\030\002\n\002\030\002\n\000\n\002\020\b\n\002\b\003\n\002\020\013\n\000\n\002\020\007\n\002\b\002\n\002\020\024\n\000\n\002\020\002\n\002\b\023\n\002\020\t\n\000\030\0002\0020\001B\017\022\b\b\002\020\002\032\0020\003¢\006\002\020\004J\016\020\006\032\0020\0072\006\020\b\032\0020\tJ\016\020\n\032\0020\0072\006\020\013\032\0020\001J\016\020\n\032\0020\0072\006\020\013\032\0020\fJ\b\020\r\032\0020\016H\002J\006\020\017\032\0020\016J\020\020\020\032\0020\0032\006\020\b\032\0020\tH\002J\020\020\021\032\0020\0032\006\020\022\032\0020\003H\002J\b\020\023\032\0020\016H\002J\020\020\024\032\0020\0162\006\020\025\032\0020\003H\002J\020\020\026\032\0020\0162\006\020\002\032\0020\003H\002J\021\020\027\032\0020\0162\006\020\013\032\0020\001H\002J\021\020\027\032\0020\0162\006\020\b\032\0020\tH\002J\021\020\027\032\0020\0162\006\020\013\032\0020\fH\002J\021\020\030\032\0020\0162\006\020\013\032\0020\001H\002J\021\020\030\032\0020\0162\006\020\b\032\0020\tH\002J\021\020\030\032\0020\0162\006\020\013\032\0020\fH\002J\016\020\031\032\0020\0072\006\020\b\032\0020\tJ\016\020\032\032\0020\0072\006\020\013\032\0020\001J\016\020\032\032\0020\0072\006\020\013\032\0020\fJ\020\020\033\032\0020\0162\006\020\034\032\0020\003H\002J\020\020\035\032\0020\0162\006\020\036\032\0020\003H\002J\b\020\037\032\0020\003H\007J\031\020 \032\0020\0162\006\020\034\032\0020\0032\006\020!\032\0020\"H\bR\016\020\005\032\0020\003X\016¢\006\002\n\000¨\006#"}, d2 = {"Landroidx/collection/MutableFloatSet;", "Landroidx/collection/FloatSet;", "initialCapacity", "", "(I)V", "growthLimit", "add", "", "element", "", "addAll", "elements", "", "adjustStorage", "", "clear", "findAbsoluteInsertIndex", "findFirstAvailableSlot", "hash1", "initializeGrowth", "initializeMetadata", "capacity", "initializeStorage", "minusAssign", "plusAssign", "remove", "removeAll", "removeElementAt", "index", "resizeStorage", "newCapacity", "trim", "writeMetadata", "value", "", "collection"})
/*      */ @SourceDebugExtension({"SMAP\nFloatSet.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 ScatterMap.kt\nandroidx/collection/ScatterMapKt\n+ 4 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 5 FloatSet.kt\nandroidx/collection/FloatSet\n+ 6 FloatSet.kt\nandroidx/collection/FloatSetKt\n*L\n1#1,837:1\n816#1,2:981\n820#1,5:989\n816#1,2:1020\n820#1,5:1028\n816#1,2:1045\n820#1,5:1053\n1#2:838\n1656#3,6:839\n1810#3:858\n1672#3:862\n1603#3:879\n1599#3:882\n1779#3,3:886\n1793#3,3:890\n1717#3:894\n1705#3:896\n1699#3:897\n1712#3:902\n1802#3:904\n1603#3:918\n1599#3:921\n1779#3,3:925\n1793#3,3:929\n1717#3:933\n1705#3:935\n1699#3:936\n1712#3:941\n1802#3:943\n1810#3:965\n1672#3:969\n1656#3,6:983\n1656#3,6:994\n1599#3:1003\n1603#3:1004\n1779#3,3:1005\n1793#3,3:1008\n1717#3:1011\n1705#3:1012\n1699#3:1013\n1712#3:1014\n1802#3:1015\n1666#3:1016\n1645#3:1017\n1664#3:1018\n1645#3:1019\n1656#3,6:1022\n1779#3,3:1033\n1810#3:1036\n1699#3:1037\n1669#3:1038\n1645#3:1039\n1599#3:1043\n1603#3:1044\n1656#3,6:1047\n1656#3,6:1058\n1656#3,6:1064\n13614#4,2:845\n13614#4,2:952\n262#5,4:847\n232#5,7:851\n243#5,3:859\n246#5,2:863\n266#5,2:865\n249#5,6:867\n268#5:873\n442#5:874\n443#5:878\n445#5,2:880\n447#5,3:883\n450#5:889\n451#5:893\n452#5:895\n453#5,4:898\n459#5:903\n460#5,8:905\n442#5:913\n443#5:917\n445#5,2:919\n447#5,3:922\n450#5:928\n451#5:932\n452#5:934\n453#5,4:937\n459#5:942\n460#5,8:944\n262#5,4:954\n232#5,7:958\n243#5,3:966\n246#5,2:970\n266#5,2:972\n249#5,6:974\n268#5:980\n833#6,3:875\n833#6,3:914\n833#6,3:1000\n833#6,3:1040\n*S KotlinDebug\n*F\n+ 1 FloatSet.kt\nandroidx/collection/MutableFloatSet\n*L\n673#1:981,2\n673#1:989,5\n731#1:1020,2\n731#1:1028,5\n804#1:1045,2\n804#1:1053,5\n526#1:839,6\n595#1:858\n595#1:862\n607#1:879\n607#1:882\n607#1:886,3\n607#1:890,3\n607#1:894\n607#1:896\n607#1:897\n607#1:902\n607#1:904\n620#1:918\n620#1:921\n620#1:925,3\n620#1:929,3\n620#1:933\n620#1:935\n620#1:936\n620#1:941\n620#1:943\n663#1:965\n663#1:969\n673#1:983,6\n683#1:994,6\n697#1:1003\n698#1:1004\n705#1:1005,3\n706#1:1008,3\n707#1:1011\n708#1:1012\n708#1:1013\n712#1:1014\n715#1:1015\n724#1:1016\n724#1:1017\n730#1:1018\n730#1:1019\n731#1:1022,6\n745#1:1033,3\n746#1:1036\n748#1:1037\n799#1:1038\n799#1:1039\n802#1:1043\n804#1:1044\n804#1:1047,6\n817#1:1058,6\n823#1:1064,6\n573#1:845,2\n642#1:952,2\n595#1:847,4\n595#1:851,7\n595#1:859,3\n595#1:863,2\n595#1:865,2\n595#1:867,6\n595#1:873\n607#1:874\n607#1:878\n607#1:880,2\n607#1:883,3\n607#1:889\n607#1:893\n607#1:895\n607#1:898,4\n607#1:903\n607#1:905,8\n620#1:913\n620#1:917\n620#1:919,2\n620#1:922,3\n620#1:928\n620#1:932\n620#1:934\n620#1:937,4\n620#1:942\n620#1:944,8\n663#1:954,4\n663#1:958,7\n663#1:966,3\n663#1:970,2\n663#1:972,2\n663#1:974,6\n663#1:980\n607#1:875,3\n620#1:914,3\n696#1:1000,3\n801#1:1040,3\n*E\n"})
/*      */ public final class MutableFloatSet
/*      */   extends FloatSet
/*      */ {
/*      */   private int growthLimit;
/*      */   
/*      */   public MutableFloatSet(int initialCapacity) {
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
/*  838 */       int $i$a$-require-MutableFloatSet$1 = 0; String str = "Capacity must be a positive value."; throw new IllegalArgumentException(str.toString()); }  initializeStorage(ScatterMapKt.unloadedCapacity(initialCapacity));
/*  839 */   } private final void initializeStorage(int initialCapacity) { int newCapacity = (initialCapacity > 0) ? Math.max(7, ScatterMapKt.normalizeCapacity(initialCapacity)) : 0; this._capacity = newCapacity; initializeMetadata(newCapacity); this.elements = new float[newCapacity]; } private final void initializeMetadata(int capacity) { int size = (capacity + 1 + 7 + 7 & 0xFFFFFFF8) >> 3; long[] arrayOfLong2 = new long[size], arrayOfLong3 = arrayOfLong2; MutableFloatSet mutableFloatSet = this; int $i$a$-apply-MutableFloatSet$initializeMetadata$1 = 0; ArraysKt.fill$default(arrayOfLong3, -9187201950435737472L, 0, 0, 6, null); mutableFloatSet.metadata = (capacity == 0) ? ScatterMapKt.EmptyGroup : arrayOfLong2; long arrayOfLong1[] = this.metadata, value$iv = 255L; int $i$f$writeRawMetadata = 0; int i$iv = capacity >> 3;
/*  840 */     int b$iv = (capacity & 0x7) << 3;
/*      */ 
/*      */     
/*  843 */     arrayOfLong1[i$iv] = arrayOfLong1[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv; initializeGrowth(); } private final void initializeGrowth() { this.growthLimit = ScatterMapKt.loadedCapacity(getCapacity()) - this._size; } public final boolean add(float element) { int oldSize = this._size; int index = findAbsoluteInsertIndex(element); this.elements[index] = element; return (this._size != oldSize); } public final void plusAssign(float element) { int index = findAbsoluteInsertIndex(element); this.elements[index] = element; }
/*      */   public final boolean addAll(@NotNull float[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*  845 */   public final void plusAssign(@NotNull float[] elements) { Intrinsics.checkNotNullParameter(elements, "elements"); float[] $this$forEach$iv = elements; int $i$f$forEach = 0; byte b = 0; int i = $this$forEach$iv.length; if (b < i) { float element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableFloatSet$plusAssign$1 = 0; plusAssign(element); }
/*      */      } public final boolean addAll(@NotNull FloatSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; plusAssign(elements); return (oldSize != this._size); }
/*      */   public final void plusAssign(@NotNull FloatSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); FloatSet this_$iv = elements; int $i$f$forEach = 0;
/*  848 */     float[] k$iv = this_$iv.elements;
/*      */     
/*  850 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*      */   public final boolean remove(float element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/FloatSet
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: iconst_0
/*      */     //   9: istore #5
/*      */     //   11: fload_1
/*      */     //   12: invokestatic hashCode : (F)I
/*      */     //   15: ldc -862048943
/*      */     //   17: imul
/*      */     //   18: istore #6
/*      */     //   20: iload #6
/*      */     //   22: iload #6
/*      */     //   24: bipush #16
/*      */     //   26: ishl
/*      */     //   27: ixor
/*      */     //   28: istore #7
/*      */     //   30: iconst_0
/*      */     //   31: istore #6
/*      */     //   33: iload #7
/*      */     //   35: bipush #127
/*      */     //   37: iand
/*      */     //   38: istore #5
/*      */     //   40: aload_3
/*      */     //   41: getfield _capacity : I
/*      */     //   44: istore #6
/*      */     //   46: iconst_0
/*      */     //   47: istore #8
/*      */     //   49: iload #7
/*      */     //   51: bipush #7
/*      */     //   53: iushr
/*      */     //   54: iload #6
/*      */     //   56: iand
/*      */     //   57: istore #9
/*      */     //   59: iconst_0
/*      */     //   60: istore #8
/*      */     //   62: nop
/*      */     //   63: aload_3
/*      */     //   64: getfield metadata : [J
/*      */     //   67: astore #10
/*      */     //   69: iconst_0
/*      */     //   70: istore #11
/*      */     //   72: iload #9
/*      */     //   74: iconst_3
/*      */     //   75: ishr
/*      */     //   76: istore #12
/*      */     //   78: iload #9
/*      */     //   80: bipush #7
/*      */     //   82: iand
/*      */     //   83: iconst_3
/*      */     //   84: ishl
/*      */     //   85: istore #13
/*      */     //   87: aload #10
/*      */     //   89: iload #12
/*      */     //   91: laload
/*      */     //   92: iload #13
/*      */     //   94: lushr
/*      */     //   95: aload #10
/*      */     //   97: iload #12
/*      */     //   99: iconst_1
/*      */     //   100: iadd
/*      */     //   101: laload
/*      */     //   102: bipush #64
/*      */     //   104: iload #13
/*      */     //   106: isub
/*      */     //   107: lshl
/*      */     //   108: iload #13
/*      */     //   110: i2l
/*      */     //   111: lneg
/*      */     //   112: bipush #63
/*      */     //   114: lshr
/*      */     //   115: land
/*      */     //   116: lor
/*      */     //   117: lstore #14
/*      */     //   119: lload #14
/*      */     //   121: lstore #16
/*      */     //   123: iconst_0
/*      */     //   124: istore #18
/*      */     //   126: lload #16
/*      */     //   128: ldc2_w 72340172838076673
/*      */     //   131: iload #5
/*      */     //   133: i2l
/*      */     //   134: lmul
/*      */     //   135: lxor
/*      */     //   136: lstore #19
/*      */     //   138: lload #19
/*      */     //   140: ldc2_w 72340172838076673
/*      */     //   143: lsub
/*      */     //   144: lload #19
/*      */     //   146: ldc2_w -1
/*      */     //   149: lxor
/*      */     //   150: land
/*      */     //   151: ldc2_w -9187201950435737472
/*      */     //   154: land
/*      */     //   155: lstore #21
/*      */     //   157: lload #21
/*      */     //   159: lstore #16
/*      */     //   161: iconst_0
/*      */     //   162: istore #18
/*      */     //   164: lload #16
/*      */     //   166: lconst_0
/*      */     //   167: lcmp
/*      */     //   168: ifeq -> 175
/*      */     //   171: iconst_1
/*      */     //   172: goto -> 176
/*      */     //   175: iconst_0
/*      */     //   176: ifeq -> 253
/*      */     //   179: iload #9
/*      */     //   181: lload #21
/*      */     //   183: lstore #23
/*      */     //   185: iconst_0
/*      */     //   186: istore #25
/*      */     //   188: lload #23
/*      */     //   190: lstore #26
/*      */     //   192: iconst_0
/*      */     //   193: istore #28
/*      */     //   195: lload #26
/*      */     //   197: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   200: iconst_3
/*      */     //   201: ishr
/*      */     //   202: nop
/*      */     //   203: iadd
/*      */     //   204: iload #6
/*      */     //   206: iand
/*      */     //   207: istore #12
/*      */     //   209: aload_3
/*      */     //   210: getfield elements : [F
/*      */     //   213: iload #12
/*      */     //   215: faload
/*      */     //   216: fload_1
/*      */     //   217: fcmpg
/*      */     //   218: ifne -> 225
/*      */     //   221: iconst_1
/*      */     //   222: goto -> 226
/*      */     //   225: iconst_0
/*      */     //   226: ifeq -> 234
/*      */     //   229: iload #12
/*      */     //   231: goto -> 302
/*      */     //   234: lload #21
/*      */     //   236: lstore #23
/*      */     //   238: iconst_0
/*      */     //   239: istore #25
/*      */     //   241: lload #23
/*      */     //   243: lload #23
/*      */     //   245: lconst_1
/*      */     //   246: lsub
/*      */     //   247: land
/*      */     //   248: lstore #21
/*      */     //   250: goto -> 157
/*      */     //   253: lload #14
/*      */     //   255: lstore #16
/*      */     //   257: iconst_0
/*      */     //   258: istore #18
/*      */     //   260: lload #16
/*      */     //   262: lload #16
/*      */     //   264: ldc2_w -1
/*      */     //   267: lxor
/*      */     //   268: bipush #6
/*      */     //   270: lshl
/*      */     //   271: land
/*      */     //   272: ldc2_w -9187201950435737472
/*      */     //   275: land
/*      */     //   276: lconst_0
/*      */     //   277: lcmp
/*      */     //   278: ifeq -> 284
/*      */     //   281: goto -> 301
/*      */     //   284: iinc #8, 8
/*      */     //   287: nop
/*      */     //   288: iload #9
/*      */     //   290: iload #8
/*      */     //   292: iadd
/*      */     //   293: iload #6
/*      */     //   295: iand
/*      */     //   296: istore #9
/*      */     //   298: goto -> 62
/*      */     //   301: iconst_m1
/*      */     //   302: istore_2
/*      */     //   303: iload_2
/*      */     //   304: iflt -> 311
/*      */     //   307: iconst_1
/*      */     //   308: goto -> 312
/*      */     //   311: iconst_0
/*      */     //   312: istore_3
/*      */     //   313: iload_3
/*      */     //   314: ifeq -> 322
/*      */     //   317: aload_0
/*      */     //   318: iload_2
/*      */     //   319: invokespecial removeElementAt : (I)V
/*      */     //   322: iload_3
/*      */     //   323: ireturn
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #607	-> 0
/*      */     //   #874	-> 8
/*      */     //   #875	-> 11
/*      */     //   #877	-> 20
/*      */     //   #874	-> 28
/*      */     //   #878	-> 30
/*      */     //   #879	-> 33
/*      */     //   #878	-> 38
/*      */     //   #880	-> 40
/*      */     //   #881	-> 46
/*      */     //   #882	-> 49
/*      */     //   #881	-> 54
/*      */     //   #883	-> 59
/*      */     //   #884	-> 62
/*      */     //   #885	-> 63
/*      */     //   #886	-> 72
/*      */     //   #887	-> 78
/*      */     //   #888	-> 87
/*      */     //   #885	-> 117
/*      */     //   #889	-> 119
/*      */     //   #890	-> 126
/*      */     //   #892	-> 138
/*      */     //   #889	-> 155
/*      */     //   #893	-> 157
/*      */     //   #894	-> 164
/*      */     //   #895	-> 179
/*      */     //   #896	-> 188
/*      */     //   #897	-> 195
/*      */     //   #897	-> 200
/*      */     //   #896	-> 202
/*      */     //   #895	-> 203
/*      */     //   #898	-> 209
/*      */     //   #899	-> 229
/*      */     //   #901	-> 234
/*      */     //   #902	-> 241
/*      */     //   #901	-> 248
/*      */     //   #903	-> 253
/*      */     //   #904	-> 260
/*      */     //   #903	-> 276
/*      */     //   #905	-> 281
/*      */     //   #908	-> 287
/*      */     //   #909	-> 288
/*      */     //   #912	-> 301
/*      */     //   #607	-> 302
/*      */     //   #608	-> 303
/*      */     //   #609	-> 313
/*      */     //   #610	-> 317
/*      */     //   #612	-> 322
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   11	17	5	$i$f$hash	I
/*      */     //   20	8	6	hash$iv$iv	I
/*      */     //   33	5	6	$i$f$h2	I
/*      */     //   49	5	8	$i$f$h1	I
/*      */     //   72	45	11	$i$f$group	I
/*      */     //   78	39	12	i$iv$iv	I
/*      */     //   87	30	13	b$iv$iv	I
/*      */     //   69	48	10	metadata$iv$iv	[J
/*      */     //   126	29	18	$i$f$match	I
/*      */     //   138	17	19	x$iv$iv	J
/*      */     //   123	32	16	$this$match$iv$iv	J
/*      */     //   164	12	18	$i$f$hasNext	I
/*      */     //   161	15	16	$this$hasNext$iv$iv	J
/*      */     //   195	7	28	$i$f$lowestBitSet	I
/*      */     //   192	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   188	15	25	$i$f$get	I
/*      */     //   185	18	23	$this$get$iv$iv	J
/*      */     //   241	7	25	$i$f$next	I
/*      */     //   238	10	23	$this$next$iv$iv	J
/*      */     //   209	41	12	index$iv	I
/*      */     //   260	16	18	$i$f$maskEmpty	I
/*      */     //   257	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   119	179	14	g$iv	J
/*      */     //   157	141	21	m$iv	J
/*      */     //   8	294	4	$i$f$findElementIndex$collection	I
/*      */     //   30	272	7	hash$iv	I
/*      */     //   40	262	5	hash2$iv	I
/*      */     //   46	256	6	probeMask$iv	I
/*      */     //   59	243	9	probeOffset$iv	I
/*      */     //   62	240	8	probeIndex$iv	I
/*      */     //   5	297	3	this_$iv	Landroidx/collection/FloatSet;
/*      */     //   303	21	2	index	I
/*      */     //   313	11	3	exists	Z
/*      */     //   0	324	0	this	Landroidx/collection/MutableFloatSet;
/*      */     //   0	324	1	element	F
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
/*      */   public final void minusAssign(float element) {
/*      */     // Byte code:
/*      */     //   0: aload_0
/*      */     //   1: checkcast androidx/collection/FloatSet
/*      */     //   4: astore_3
/*      */     //   5: iconst_0
/*      */     //   6: istore #4
/*      */     //   8: iconst_0
/*      */     //   9: istore #5
/*      */     //   11: fload_1
/*      */     //   12: invokestatic hashCode : (F)I
/*      */     //   15: ldc -862048943
/*      */     //   17: imul
/*      */     //   18: istore #6
/*      */     //   20: iload #6
/*      */     //   22: iload #6
/*      */     //   24: bipush #16
/*      */     //   26: ishl
/*      */     //   27: ixor
/*      */     //   28: istore #7
/*      */     //   30: iconst_0
/*      */     //   31: istore #6
/*      */     //   33: iload #7
/*      */     //   35: bipush #127
/*      */     //   37: iand
/*      */     //   38: istore #5
/*      */     //   40: aload_3
/*      */     //   41: getfield _capacity : I
/*      */     //   44: istore #6
/*      */     //   46: iconst_0
/*      */     //   47: istore #8
/*      */     //   49: iload #7
/*      */     //   51: bipush #7
/*      */     //   53: iushr
/*      */     //   54: iload #6
/*      */     //   56: iand
/*      */     //   57: istore #9
/*      */     //   59: iconst_0
/*      */     //   60: istore #8
/*      */     //   62: nop
/*      */     //   63: aload_3
/*      */     //   64: getfield metadata : [J
/*      */     //   67: astore #10
/*      */     //   69: iconst_0
/*      */     //   70: istore #11
/*      */     //   72: iload #9
/*      */     //   74: iconst_3
/*      */     //   75: ishr
/*      */     //   76: istore #12
/*      */     //   78: iload #9
/*      */     //   80: bipush #7
/*      */     //   82: iand
/*      */     //   83: iconst_3
/*      */     //   84: ishl
/*      */     //   85: istore #13
/*      */     //   87: aload #10
/*      */     //   89: iload #12
/*      */     //   91: laload
/*      */     //   92: iload #13
/*      */     //   94: lushr
/*      */     //   95: aload #10
/*      */     //   97: iload #12
/*      */     //   99: iconst_1
/*      */     //   100: iadd
/*      */     //   101: laload
/*      */     //   102: bipush #64
/*      */     //   104: iload #13
/*      */     //   106: isub
/*      */     //   107: lshl
/*      */     //   108: iload #13
/*      */     //   110: i2l
/*      */     //   111: lneg
/*      */     //   112: bipush #63
/*      */     //   114: lshr
/*      */     //   115: land
/*      */     //   116: lor
/*      */     //   117: lstore #14
/*      */     //   119: lload #14
/*      */     //   121: lstore #16
/*      */     //   123: iconst_0
/*      */     //   124: istore #18
/*      */     //   126: lload #16
/*      */     //   128: ldc2_w 72340172838076673
/*      */     //   131: iload #5
/*      */     //   133: i2l
/*      */     //   134: lmul
/*      */     //   135: lxor
/*      */     //   136: lstore #19
/*      */     //   138: lload #19
/*      */     //   140: ldc2_w 72340172838076673
/*      */     //   143: lsub
/*      */     //   144: lload #19
/*      */     //   146: ldc2_w -1
/*      */     //   149: lxor
/*      */     //   150: land
/*      */     //   151: ldc2_w -9187201950435737472
/*      */     //   154: land
/*      */     //   155: lstore #21
/*      */     //   157: lload #21
/*      */     //   159: lstore #16
/*      */     //   161: iconst_0
/*      */     //   162: istore #18
/*      */     //   164: lload #16
/*      */     //   166: lconst_0
/*      */     //   167: lcmp
/*      */     //   168: ifeq -> 175
/*      */     //   171: iconst_1
/*      */     //   172: goto -> 176
/*      */     //   175: iconst_0
/*      */     //   176: ifeq -> 253
/*      */     //   179: iload #9
/*      */     //   181: lload #21
/*      */     //   183: lstore #23
/*      */     //   185: iconst_0
/*      */     //   186: istore #25
/*      */     //   188: lload #23
/*      */     //   190: lstore #26
/*      */     //   192: iconst_0
/*      */     //   193: istore #28
/*      */     //   195: lload #26
/*      */     //   197: invokestatic numberOfTrailingZeros : (J)I
/*      */     //   200: iconst_3
/*      */     //   201: ishr
/*      */     //   202: nop
/*      */     //   203: iadd
/*      */     //   204: iload #6
/*      */     //   206: iand
/*      */     //   207: istore #12
/*      */     //   209: aload_3
/*      */     //   210: getfield elements : [F
/*      */     //   213: iload #12
/*      */     //   215: faload
/*      */     //   216: fload_1
/*      */     //   217: fcmpg
/*      */     //   218: ifne -> 225
/*      */     //   221: iconst_1
/*      */     //   222: goto -> 226
/*      */     //   225: iconst_0
/*      */     //   226: ifeq -> 234
/*      */     //   229: iload #12
/*      */     //   231: goto -> 302
/*      */     //   234: lload #21
/*      */     //   236: lstore #23
/*      */     //   238: iconst_0
/*      */     //   239: istore #25
/*      */     //   241: lload #23
/*      */     //   243: lload #23
/*      */     //   245: lconst_1
/*      */     //   246: lsub
/*      */     //   247: land
/*      */     //   248: lstore #21
/*      */     //   250: goto -> 157
/*      */     //   253: lload #14
/*      */     //   255: lstore #16
/*      */     //   257: iconst_0
/*      */     //   258: istore #18
/*      */     //   260: lload #16
/*      */     //   262: lload #16
/*      */     //   264: ldc2_w -1
/*      */     //   267: lxor
/*      */     //   268: bipush #6
/*      */     //   270: lshl
/*      */     //   271: land
/*      */     //   272: ldc2_w -9187201950435737472
/*      */     //   275: land
/*      */     //   276: lconst_0
/*      */     //   277: lcmp
/*      */     //   278: ifeq -> 284
/*      */     //   281: goto -> 301
/*      */     //   284: iinc #8, 8
/*      */     //   287: nop
/*      */     //   288: iload #9
/*      */     //   290: iload #8
/*      */     //   292: iadd
/*      */     //   293: iload #6
/*      */     //   295: iand
/*      */     //   296: istore #9
/*      */     //   298: goto -> 62
/*      */     //   301: iconst_m1
/*      */     //   302: istore_2
/*      */     //   303: iload_2
/*      */     //   304: iflt -> 312
/*      */     //   307: aload_0
/*      */     //   308: iload_2
/*      */     //   309: invokespecial removeElementAt : (I)V
/*      */     //   312: return
/*      */     // Line number table:
/*      */     //   Java source line number -> byte code offset
/*      */     //   #620	-> 0
/*      */     //   #913	-> 8
/*      */     //   #914	-> 11
/*      */     //   #916	-> 20
/*      */     //   #913	-> 28
/*      */     //   #917	-> 30
/*      */     //   #918	-> 33
/*      */     //   #917	-> 38
/*      */     //   #919	-> 40
/*      */     //   #920	-> 46
/*      */     //   #921	-> 49
/*      */     //   #920	-> 54
/*      */     //   #922	-> 59
/*      */     //   #923	-> 62
/*      */     //   #924	-> 63
/*      */     //   #925	-> 72
/*      */     //   #926	-> 78
/*      */     //   #927	-> 87
/*      */     //   #924	-> 117
/*      */     //   #928	-> 119
/*      */     //   #929	-> 126
/*      */     //   #931	-> 138
/*      */     //   #928	-> 155
/*      */     //   #932	-> 157
/*      */     //   #933	-> 164
/*      */     //   #934	-> 179
/*      */     //   #935	-> 188
/*      */     //   #936	-> 195
/*      */     //   #936	-> 200
/*      */     //   #935	-> 202
/*      */     //   #934	-> 203
/*      */     //   #937	-> 209
/*      */     //   #938	-> 229
/*      */     //   #940	-> 234
/*      */     //   #941	-> 241
/*      */     //   #940	-> 248
/*      */     //   #942	-> 253
/*      */     //   #943	-> 260
/*      */     //   #942	-> 276
/*      */     //   #944	-> 281
/*      */     //   #947	-> 287
/*      */     //   #948	-> 288
/*      */     //   #951	-> 301
/*      */     //   #620	-> 302
/*      */     //   #621	-> 303
/*      */     //   #622	-> 307
/*      */     //   #624	-> 312
/*      */     // Local variable table:
/*      */     //   start	length	slot	name	descriptor
/*      */     //   11	17	5	$i$f$hash	I
/*      */     //   20	8	6	hash$iv$iv	I
/*      */     //   33	5	6	$i$f$h2	I
/*      */     //   49	5	8	$i$f$h1	I
/*      */     //   72	45	11	$i$f$group	I
/*      */     //   78	39	12	i$iv$iv	I
/*      */     //   87	30	13	b$iv$iv	I
/*      */     //   69	48	10	metadata$iv$iv	[J
/*      */     //   126	29	18	$i$f$match	I
/*      */     //   138	17	19	x$iv$iv	J
/*      */     //   123	32	16	$this$match$iv$iv	J
/*      */     //   164	12	18	$i$f$hasNext	I
/*      */     //   161	15	16	$this$hasNext$iv$iv	J
/*      */     //   195	7	28	$i$f$lowestBitSet	I
/*      */     //   192	10	26	$this$lowestBitSet$iv$iv$iv	J
/*      */     //   188	15	25	$i$f$get	I
/*      */     //   185	18	23	$this$get$iv$iv	J
/*      */     //   241	7	25	$i$f$next	I
/*      */     //   238	10	23	$this$next$iv$iv	J
/*      */     //   209	41	12	index$iv	I
/*      */     //   260	16	18	$i$f$maskEmpty	I
/*      */     //   257	19	16	$this$maskEmpty$iv$iv	J
/*      */     //   119	179	14	g$iv	J
/*      */     //   157	141	21	m$iv	J
/*      */     //   8	294	4	$i$f$findElementIndex$collection	I
/*      */     //   30	272	7	hash$iv	I
/*      */     //   40	262	5	hash2$iv	I
/*      */     //   46	256	6	probeMask$iv	I
/*      */     //   59	243	9	probeOffset$iv	I
/*      */     //   62	240	8	probeIndex$iv	I
/*      */     //   5	297	3	this_$iv	Landroidx/collection/FloatSet;
/*      */     //   303	10	2	index	I
/*      */     //   0	313	0	this	Landroidx/collection/MutableFloatSet;
/*      */     //   0	313	1	element	F
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
/*      */   public final boolean removeAll(@NotNull float[] elements) {
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
/*      */   public final void minusAssign(@NotNull float[] elements) {
/*      */     Intrinsics.checkNotNullParameter(elements, "elements");
/*      */     float[] $this$forEach$iv = elements;
/*      */     int $i$f$forEach = 0;
/*  952 */     byte b = 0; int i = $this$forEach$iv.length; if (b < i) { float element$iv = $this$forEach$iv[b], element = element$iv; int $i$a$-forEach-MutableFloatSet$minusAssign$1 = 0; minusAssign(element); }
/*      */   
/*      */   } public final boolean removeAll(@NotNull FloatSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); int oldSize = this._size; minusAssign(elements); return (oldSize != this._size); } public final void minusAssign(@NotNull FloatSet elements) { Intrinsics.checkNotNullParameter(elements, "elements"); FloatSet this_$iv = elements; int $i$f$forEach = 0;
/*  955 */     float[] k$iv = this_$iv.elements;
/*      */     
/*  957 */     FloatSet this_$iv$iv = this_$iv; int $i$f$forEachIndex = 0;
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
/*  981 */      } private final void removeElementAt(int index) { this._size--; MutableFloatSet mutableFloatSet = this; long value$iv = 254L; int $i$f$writeMetadata = 0; long[] m$iv = mutableFloatSet.metadata;
/*  982 */     int $i$f$writeRawMetadata = 0;
/*  983 */     int i$iv$iv = index >> 3;
/*  984 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/*  987 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/*  989 */     int c$iv = mutableFloatSet._capacity;
/*  990 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/*  991 */       0x7 & c$iv);
/*  992 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; } public final void clear() { this._size = 0; if (this.metadata != ScatterMapKt.EmptyGroup) {
/*      */       ArraysKt.fill$default(this.metadata, -9187201950435737472L, 0, 0, 6, null); long[] arrayOfLong = this.metadata; int i = this._capacity; long value$iv = 255L; int $i$f$writeRawMetadata = 0;
/*  994 */       int i$iv = i >> 3;
/*  995 */       int b$iv = (i & 0x7) << 3;
/*      */ 
/*      */       
/*  998 */       arrayOfLong[i$iv] = arrayOfLong[i$iv] & (255L << b$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv;
/*      */     }  initializeGrowth(); } private final int findAbsoluteInsertIndex(float element) { int $i$f$hash = 0;
/* 1000 */     int hash$iv = Float.hashCode(element) * -862048943;
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
/* 1019 */       metadata$iv[index >> 3] >> (index & 0x7) << 3 & 0xFFL) == 128L)) ? 1 : 0; MutableFloatSet mutableFloatSet = this; long value$iv = hash2; int $i$f$writeMetadata = 0;
/* 1020 */     long[] m$iv = mutableFloatSet.metadata;
/* 1021 */     int $i$f$writeRawMetadata = 0;
/* 1022 */     int i$iv$iv = index >> 3;
/* 1023 */     int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */     
/* 1026 */     m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */     
/* 1028 */     int c$iv = mutableFloatSet._capacity;
/* 1029 */     int cloneIndex$iv = (index - 7 & c$iv) + (
/* 1030 */       0x7 & c$iv);
/* 1031 */     int i = 0; int j = cloneIndex$iv >> 3; int k = (cloneIndex$iv & 0x7) << 3; m$iv[j] = m$iv[j] & (255L << k ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << k; return index; } private final int findFirstAvailableSlot(int hash1) { int probeMask = this._capacity; int probeOffset = hash1 & probeMask; int probeIndex = 0; while (true)
/*      */     { long[] metadata$iv = this.metadata; int $i$f$group = 0;
/* 1033 */       int i$iv = probeOffset >> 3;
/* 1034 */       int b$iv = (probeOffset & 0x7) << 3;
/* 1035 */       long g = metadata$iv[i$iv] >>> b$iv | metadata$iv[i$iv + 1] << 64 - b$iv & -(b$iv) >> 63L; long $this$maskEmptyOrDeleted$iv = g; int $i$f$maskEmptyOrDeleted = 0;
/* 1036 */       long m = $this$maskEmptyOrDeleted$iv & ($this$maskEmptyOrDeleted$iv ^ 0xFFFFFFFFFFFFFFFFL) << 7L & 0x8080808080808080L; if (m != 0L)
/* 1037 */       { long $this$lowestBitSet$iv = m; int $i$f$lowestBitSet = 0; return probeOffset + (Long.numberOfTrailingZeros($this$lowestBitSet$iv) >> 3) & probeMask; }  probeIndex += 8; probeOffset = probeOffset + probeIndex & probeMask; }  }
/* 1038 */   @IntRange(from = 0L) public final int trim() { int previousCapacity = this._capacity; int newCapacity = ScatterMapKt.normalizeCapacity(ScatterMapKt.unloadedCapacity(this._size)); if (newCapacity < previousCapacity) { resizeStorage(newCapacity); return previousCapacity - this._capacity; }  return 0; } private final void resizeStorage(int newCapacity) { long[] previousMetadata = this.metadata; float[] previousElements = this.elements; int previousCapacity = this._capacity; initializeStorage(newCapacity); float[] newElements = this.elements; for (int i = 0; i < previousCapacity; i++) { int $i$f$isFull = 0; int $i$f$readRawMetadata = 0; if (((
/* 1039 */         previousMetadata[i >> 3] >> (i & 0x7) << 3 & 0xFFL) < 128L))
/* 1040 */       { float previousElement = previousElements[i]; int $i$f$hash = 0; int hash$iv = Float.hashCode(previousElement) * -862048943;
/*      */         
/* 1042 */         int hash = hash$iv ^ hash$iv << 16;
/* 1043 */         int $i$f$h1 = 0, index = findFirstAvailableSlot(hash >>> 7); MutableFloatSet mutableFloatSet = this; int $i$f$h2 = 0;
/* 1044 */         long value$iv = (hash & 0x7F); int $i$f$writeMetadata = 0;
/* 1045 */         long[] m$iv = mutableFloatSet.metadata;
/* 1046 */         int $i$f$writeRawMetadata = 0;
/* 1047 */         int i$iv$iv = index >> 3;
/* 1048 */         int b$iv$iv = (index & 0x7) << 3;
/*      */ 
/*      */         
/* 1051 */         m$iv[i$iv$iv] = m$iv[i$iv$iv] & (255L << b$iv$iv ^ 0xFFFFFFFFFFFFFFFFL) | value$iv << b$iv$iv;
/*      */         
/* 1053 */         int c$iv = mutableFloatSet._capacity;
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
/*      */   public MutableFloatSet() {
/*      */     this(0, 1, (DefaultConstructorMarker)null);
/*      */   }
/*      */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\collection-jvm-1.4.0.jar!\androidx\collection\MutableFloatSet.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */