/*     */ package androidx.compose.runtime.reflect;
/*     */ 
/*     */ import androidx.compose.runtime.Composer;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.IntIterator;
/*     */ import kotlin.jvm.JvmName;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.jvm.internal.SpreadBuilder;
/*     */ import kotlin.ranges.RangesKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0006\n\000\n\002\020\b\n\002\b\005\n\002\030\002\n\002\030\002\n\000\n\002\020\021\n\002\b\004\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\003\n\002\020\000\n\000\032\030\020\002\032\0020\0012\006\020\003\032\0020\0012\006\020\004\032\0020\001H\002\032\020\020\005\032\0020\0012\006\020\003\032\0020\001H\002\032\f\020\006\032\004\030\0010\007*\0020\b\032(\020\t\032\b\022\004\022\002H\0130\n\"\006\b\000\020\013\030\001*\002H\0132\006\020\f\032\0020\001H\b¢\006\002\020\r\032\f\020\016\032\0020\017*\0020\bH\002\0327\020\020\032\0020\007*\006\022\002\b\0030\0212\006\020\022\032\0020\0232\032\020\024\032\016\022\n\b\001\022\006\022\002\b\0030\0210\n\"\006\022\002\b\0030\021¢\006\002\020\025\032\022\020\026\032\004\030\0010\027*\006\022\002\b\0030\021H\002\"\016\020\000\032\0020\001XT¢\006\002\n\000¨\006\030"}, d2 = {"BITS_PER_INT", "", "changedParamCount", "realValueParams", "thisParams", "defaultParamCount", "asComposableMethod", "Landroidx/compose/runtime/reflect/ComposableMethod;", "Ljava/lang/reflect/Method;", "dup", "", "T", "count", "(Ljava/lang/Object;I)[Ljava/lang/Object;", "getComposableInfo", "Landroidx/compose/runtime/reflect/ComposableInfo;", "getDeclaredComposableMethod", "Ljava/lang/Class;", "methodName", "", "args", "(Ljava/lang/Class;Ljava/lang/String;[Ljava/lang/Class;)Landroidx/compose/runtime/reflect/ComposableMethod;", "getDefaultValue", "", "runtime"})
/*     */ @JvmName(name = "ComposableMethodKt")
/*     */ @SourceDebugExtension({"SMAP\nComposableMethod.jvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n*L\n1#1,222:1\n187#1:235\n187#1:242\n187#1:249\n1735#2,6:223\n1549#3:229\n1620#3,3:230\n1549#3:236\n1620#3,3:237\n1549#3:243\n1620#3,3:244\n1549#3:250\n1620#3,3:251\n37#4,2:233\n37#4,2:240\n37#4,2:247\n37#4,2:254\n*S KotlinDebug\n*F\n+ 1 ComposableMethod.jvm.kt\nandroidx/compose/runtime/reflect/ComposableMethodKt\n*L\n203#1:235\n212#1:242\n213#1:249\n59#1:223,6\n187#1:229\n187#1:230,3\n203#1:236\n203#1:237,3\n212#1:243\n212#1:244,3\n213#1:250\n213#1:251,3\n187#1:233,2\n203#1:240,2\n212#1:247,2\n213#1:254,2\n*E\n"})
/*     */ public final class ComposableMethodKt
/*     */ {
/*     */   private static final int BITS_PER_INT = 31;
/*     */   
/*     */   private static final int changedParamCount(int realValueParams, int thisParams) {
/*  31 */     if (realValueParams == 0) return 1; 
/*  32 */     int totalParams = realValueParams + thisParams;
/*  33 */     return 
/*     */       
/*  35 */       (int)Math.ceil(totalParams / 10.0D);
/*     */   }
/*     */   
/*     */   private static final int defaultParamCount(int realValueParams) {
/*  39 */     return 
/*     */       
/*  41 */       (int)Math.ceil(realValueParams / 31.0D);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final ComposableInfo getComposableInfo(Method $this$getComposableInfo) {
/*     */     // Byte code:
/*     */     //   0: aload_0
/*     */     //   1: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*     */     //   4: dup
/*     */     //   5: ldc 'getParameterTypes(...)'
/*     */     //   7: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   10: checkcast [Ljava/lang/Object;
/*     */     //   13: astore_2
/*     */     //   14: iconst_0
/*     */     //   15: istore_3
/*     */     //   16: aload_2
/*     */     //   17: arraylength
/*     */     //   18: iconst_m1
/*     */     //   19: iadd
/*     */     //   20: istore #4
/*     */     //   22: iconst_0
/*     */     //   23: iload #4
/*     */     //   25: if_icmpgt -> 68
/*     */     //   28: iload #4
/*     */     //   30: istore #5
/*     */     //   32: iinc #4, -1
/*     */     //   35: aload_2
/*     */     //   36: iload #5
/*     */     //   38: aaload
/*     */     //   39: checkcast java/lang/Class
/*     */     //   42: astore #6
/*     */     //   44: iconst_0
/*     */     //   45: istore #7
/*     */     //   47: aload #6
/*     */     //   49: ldc androidx/compose/runtime/Composer
/*     */     //   51: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   54: ifeq -> 62
/*     */     //   57: iload #5
/*     */     //   59: goto -> 69
/*     */     //   62: iconst_0
/*     */     //   63: iload #4
/*     */     //   65: if_icmple -> 28
/*     */     //   68: iconst_m1
/*     */     //   69: istore_1
/*     */     //   70: iload_1
/*     */     //   71: iconst_m1
/*     */     //   72: if_icmpne -> 91
/*     */     //   75: new androidx/compose/runtime/reflect/ComposableInfo
/*     */     //   78: dup
/*     */     //   79: iconst_0
/*     */     //   80: aload_0
/*     */     //   81: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*     */     //   84: arraylength
/*     */     //   85: iconst_0
/*     */     //   86: iconst_0
/*     */     //   87: invokespecial <init> : (ZIII)V
/*     */     //   90: areturn
/*     */     //   91: aload_0
/*     */     //   92: invokevirtual getModifiers : ()I
/*     */     //   95: invokestatic isStatic : (I)Z
/*     */     //   98: ifeq -> 105
/*     */     //   101: iconst_0
/*     */     //   102: goto -> 106
/*     */     //   105: iconst_1
/*     */     //   106: istore_2
/*     */     //   107: iload_1
/*     */     //   108: iload_2
/*     */     //   109: invokestatic changedParamCount : (II)I
/*     */     //   112: istore_3
/*     */     //   113: iload_1
/*     */     //   114: iconst_1
/*     */     //   115: iadd
/*     */     //   116: iload_3
/*     */     //   117: iadd
/*     */     //   118: istore #4
/*     */     //   120: aload_0
/*     */     //   121: invokevirtual getParameterTypes : ()[Ljava/lang/Class;
/*     */     //   124: arraylength
/*     */     //   125: istore #5
/*     */     //   127: iload #5
/*     */     //   129: iload #4
/*     */     //   131: if_icmpeq -> 138
/*     */     //   134: iconst_1
/*     */     //   135: goto -> 139
/*     */     //   138: iconst_0
/*     */     //   139: istore #6
/*     */     //   141: iload #6
/*     */     //   143: ifeq -> 153
/*     */     //   146: iload_1
/*     */     //   147: invokestatic defaultParamCount : (I)I
/*     */     //   150: goto -> 154
/*     */     //   153: iconst_0
/*     */     //   154: istore #7
/*     */     //   156: new androidx/compose/runtime/reflect/ComposableInfo
/*     */     //   159: dup
/*     */     //   160: iload #4
/*     */     //   162: iload #7
/*     */     //   164: iadd
/*     */     //   165: iload #5
/*     */     //   167: if_icmpne -> 174
/*     */     //   170: iconst_1
/*     */     //   171: goto -> 175
/*     */     //   174: iconst_0
/*     */     //   175: iload_1
/*     */     //   176: iload_3
/*     */     //   177: iload #7
/*     */     //   179: invokespecial <init> : (ZIII)V
/*     */     //   182: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #59	-> 0
/*     */     //   #223	-> 16
/*     */     //   #224	-> 35
/*     */     //   #59	-> 47
/*     */     //   #224	-> 54
/*     */     //   #225	-> 57
/*     */     //   #223	-> 62
/*     */     //   #228	-> 68
/*     */     //   #59	-> 69
/*     */     //   #60	-> 70
/*     */     //   #61	-> 75
/*     */     //   #63	-> 91
/*     */     //   #64	-> 107
/*     */     //   #65	-> 113
/*     */     //   #66	-> 114
/*     */     //   #65	-> 115
/*     */     //   #67	-> 116
/*     */     //   #65	-> 117
/*     */     //   #68	-> 120
/*     */     //   #69	-> 127
/*     */     //   #70	-> 141
/*     */     //   #71	-> 146
/*     */     //   #73	-> 153
/*     */     //   #70	-> 154
/*     */     //   #74	-> 156
/*     */     //   #75	-> 160
/*     */     //   #76	-> 175
/*     */     //   #77	-> 176
/*     */     //   #78	-> 177
/*     */     //   #74	-> 179
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   47	7	7	$i$a$-indexOfLast-ComposableMethodKt$getComposableInfo$realParamsCount$1	I
/*     */     //   44	10	6	it	Ljava/lang/Class;
/*     */     //   32	36	5	index$iv	I
/*     */     //   16	53	3	$i$f$indexOfLast	I
/*     */     //   14	55	2	$this$indexOfLast$iv	[Ljava/lang/Object;
/*     */     //   70	113	1	realParamsCount	I
/*     */     //   107	76	2	thisParams	I
/*     */     //   113	70	3	changedParams	I
/*     */     //   120	63	4	totalParamsWithoutDefaults	I
/*     */     //   127	56	5	totalParams	I
/*     */     //   141	42	6	isDefault	Z
/*     */     //   156	27	7	defaultParams	I
/*     */     //   0	183	0	$this$getComposableInfo	Ljava/lang/reflect/Method;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final Object getDefaultValue(Class $this$getDefaultValue) {
/*  86 */     String str = $this$getDefaultValue.getName(); if (str != null) switch (str.hashCode()) { case 64711720: if (!str.equals("boolean")) break; case 3039496: if (!str.equals("byte")) break; case -1325958191: if (!str.equals("double")) break; case 3052374: if (!str.equals("char")) break; case 109413500: if (!str.equals("short")) break; case 97526364: if (!str.equals("float")) break; case 104431: if (!str.equals("int")) break; case 3327612: if (!str.equals("long")) {
/*     */             break;
/*     */           } }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     
/*     */     
/*  95 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public static final ComposableMethod asComposableMethod(@NotNull Method $this$asComposableMethod) {
/* 179 */     Intrinsics.checkNotNullParameter($this$asComposableMethod, "<this>"); ComposableInfo composableInfo = getComposableInfo($this$asComposableMethod);
/* 180 */     if (composableInfo.isComposable()) {
/* 181 */       return new ComposableMethod($this$asComposableMethod, composableInfo);
/*     */     }
/* 183 */     return null;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   @NotNull
/*     */   public static final ComposableMethod getDeclaredComposableMethod(@NotNull Class $this$getDeclaredComposableMethod, @NotNull String methodName, @NotNull Class... args) throws NoSuchMethodException {
/*     */     Method method, method1;
/* 196 */     Intrinsics.checkNotNullParameter($this$getDeclaredComposableMethod, "<this>"); Intrinsics.checkNotNullParameter(methodName, "methodName"); Intrinsics.checkNotNullParameter(args, "args"); int changedParams = changedParamCount(args.length, 0);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 201 */     try { SpreadBuilder spreadBuilder1 = new SpreadBuilder(3); spreadBuilder1.addSpread(args); spreadBuilder1.add(Composer.class); Class<int> clazz = int.class;
/*     */       
/* 203 */       SpreadBuilder spreadBuilder2 = spreadBuilder1; String str = methodName; Class clazz1 = $this$getDeclaredComposableMethod; int $i$f$dup = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 235 */       Iterable $this$map$iv$iv = (Iterable)RangesKt.until(0, changedParams); int $i$f$map = 0;
/* 236 */       Iterable iterable2 = $this$map$iv$iv; Collection<Class<int>> destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10)); int $i$f$mapTo = 0;
/* 237 */       for (Iterator iterator = iterable2.iterator(); iterator.hasNext(); ) { int item$iv$iv$iv = ((IntIterator)iterator).nextInt();
/* 238 */         int i = item$iv$iv$iv; Collection<Class<int>> collection = destination$iv$iv$iv; int $i$a$-map-ComposableMethodKt$dup$1$iv = 0; collection.add(clazz); }
/* 239 */        $this$map$iv$iv = destination$iv$iv$iv; int $i$f$toTypedArray = 0;
/* 240 */       Iterable iterable1 = $this$map$iv$iv;
/* 241 */       Object[] arrayOfObject = iterable1.toArray((Object[])new Class[0]); spreadBuilder2.addSpread(arrayOfObject); method1 = clazz1.getDeclaredMethod(str, (Class[])spreadBuilder1.toArray((Object[])new Class[spreadBuilder1.size()])); }
/* 242 */     catch (ReflectiveOperationException e) { Object $this$dup$iv; Method method2; int defaultParams = defaultParamCount(args.length); try { SpreadBuilder spreadBuilder1 = new SpreadBuilder(4); spreadBuilder1.addSpread(args); spreadBuilder1.add(Composer.class); Class<int> clazz = int.class; SpreadBuilder spreadBuilder2 = spreadBuilder1; String str = methodName; Class clazz1 = $this$getDeclaredComposableMethod; int $i$f$dup = 0; Iterable $this$map$iv$iv = (Iterable)RangesKt.until(0, changedParams); int j = 0;
/* 243 */         Iterable iterable2 = $this$map$iv$iv; Collection<Class<int>> collection = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10)); int $i$f$mapTo = 0; Iterator iterator;
/* 244 */         for (iterator = iterable2.iterator(); iterator.hasNext(); ) { int item$iv$iv$iv = ((IntIterator)iterator).nextInt();
/* 245 */           int k = item$iv$iv$iv; Collection<Class<int>> collection1 = collection; int $i$a$-map-ComposableMethodKt$dup$1$iv = 0; collection1.add(clazz); }
/* 246 */          $this$map$iv$iv = collection; int i = 0;
/* 247 */         Iterable iterable1 = $this$map$iv$iv;
/* 248 */         Object[] arrayOfObject = iterable1.toArray((Object[])new Class[0]); spreadBuilder2.addSpread(arrayOfObject); Object<int> object = (Object<int>)int.class; spreadBuilder2 = spreadBuilder1; str = str; clazz1 = clazz1; $i$f$dup = 0;
/* 249 */         $this$map$iv$iv = (Iterable)RangesKt.until(0, defaultParams); int $i$f$map = 0;
/* 250 */         Iterable $this$mapTo$iv$iv$iv = $this$map$iv$iv; Collection<Object<int>> destination$iv$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv$iv, 10)); $i$f$mapTo = 0;
/* 251 */         for (iterator = $this$mapTo$iv$iv$iv.iterator(); iterator.hasNext(); ) { int item$iv$iv$iv = ((IntIterator)iterator).nextInt();
/* 252 */           int it$iv = item$iv$iv$iv; Collection<Object<int>> collection1 = destination$iv$iv$iv; int $i$a$-map-ComposableMethodKt$dup$1$iv = 0; collection1.add(object); }
/* 253 */          Collection $this$toTypedArray$iv$iv = destination$iv$iv$iv; int $i$f$toTypedArray = 0;
/* 254 */         Collection thisCollection$iv$iv = $this$toTypedArray$iv$iv;
/* 255 */         arrayOfObject = thisCollection$iv$iv.toArray((Object[])new Class[0]);
/*     */         spreadBuilder2.addSpread(arrayOfObject);
/*     */         method2 = clazz1.getDeclaredMethod(str, (Class[])spreadBuilder1.toArray((Object[])new Class[spreadBuilder1.size()])); }
/*     */       catch (ReflectiveOperationException e2)
/*     */       { Object object;
/*     */         method2 = null; }
/*     */       
/*     */       method1 = method2; }
/*     */     
/*     */     if (method1 == null)
/*     */       throw new NoSuchMethodException($this$getDeclaredComposableMethod.getName() + '.' + methodName); 
/*     */     Intrinsics.checkNotNull(asComposableMethod(method));
/*     */     return asComposableMethod(method);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\runtime-desktop-1.7.3.jar!\androidx\compose\runtime\reflect\ComposableMethodKt.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */