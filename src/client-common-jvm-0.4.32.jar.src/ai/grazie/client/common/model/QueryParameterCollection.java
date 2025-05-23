/*    */ package ai.grazie.client.common.model;@Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\0006\n\002\030\002\n\002\020\000\n\002\b\002\n\002\020\021\n\002\020\016\n\002\b\003\n\002\030\002\n\002\020!\n\002\030\002\n\000\n\002\020\002\n\002\b\004\n\002\020\013\n\002\b\006\b\007\030\000 \0272\0020\001:\001\027B\005¢\006\002\020\002J\026\020\f\032\0020\r2\006\020\016\032\0020\0052\006\020\017\032\0020\005J%\020\020\032\n\022\004\022\0020\005\030\0010\0042\006\020\016\032\0020\0052\b\b\002\020\021\032\0020\022¢\006\002\020\023J\016\020\024\032\0020\r2\006\020\016\032\0020\005J!\020\025\032\0020\r2\006\020\016\032\0020\0052\f\020\b\032\b\022\004\022\0020\0050\004¢\006\002\020\026R\027\020\003\032\b\022\004\022\0020\0050\0048F¢\006\006\032\004\b\006\020\007R6\020\b\032*\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\n0\tj\024\022\004\022\0020\005\022\n\022\b\022\004\022\0020\0050\n`\013X\004¢\006\002\n\000¨\006\030"}, d2 = {"Lai/grazie/client/common/model/QueryParameterCollection;", "", "()V", "keys", "", "", "getKeys", "()[Ljava/lang/String;", "values", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "add", "", "key", "value", "get", "caseSensitive", "", "(Ljava/lang/String;Z)[Ljava/lang/String;", "remove", "set", "(Ljava/lang/String;[Ljava/lang/String;)V", "Companion", "client-common"})
/*    */ @SourceDebugExtension({"SMAP\nQueryParameterCollection.kt\nKotlin\n*S Kotlin\n*F\n+ 1 QueryParameterCollection.kt\nai/grazie/client/common/model/QueryParameterCollection\n+ 2 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 3 ArraysJVM.kt\nkotlin/collections/ArraysKt__ArraysJVMKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,55:1\n381#2,7:56\n37#3:63\n36#3,3:64\n37#3:68\n36#3,3:69\n37#3:72\n36#3,3:73\n1#4:67\n*S KotlinDebug\n*F\n+ 1 QueryParameterCollection.kt\nai/grazie/client/common/model/QueryParameterCollection\n*L\n18#1:56,7\n27#1:63\n27#1:64,3\n29#1:68\n29#1:69,3\n34#1:72\n34#1:73,3\n*E\n"})
/*    */ public final class QueryParameterCollection { @NotNull
/*    */   public static final Companion Companion = new Companion(null);
/*    */   @Metadata(mv = {1, 7, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\000\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002J\006\020\003\032\0020\004¨\006\005"}, d2 = {"Lai/grazie/client/common/model/QueryParameterCollection$Companion;", "", "()V", "empty", "Lai/grazie/client/common/model/QueryParameterCollection;", "client-common"})
/*    */   public static final class Companion { @NotNull
/*    */     public final QueryParameterCollection empty() {
/*  8 */       return new QueryParameterCollection();
/*    */     } private Companion() {} }
/*    */   @NotNull
/* 11 */   private final HashMap<String, List<String>> values = new HashMap<>();
/*    */   
/*    */   public final void set(@NotNull String key, @NotNull String[] values) {
/* 14 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(values, "values"); this.values.put(key, ArraysKt.toMutableList((Object[])values));
/*    */   }
/*    */   
/*    */   public final void add(@NotNull String key, @NotNull String value) {
/* 18 */     Intrinsics.checkNotNullParameter(key, "key"); Intrinsics.checkNotNullParameter(value, "value"); Map<String, List<String>> $this$getOrPut$iv = this.values; int $i$f$getOrPut = 0;
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
/* 56 */     Object<String> value$iv = (Object<String>)$this$getOrPut$iv.get(key);
/* 57 */     if (value$iv == null) {
/* 58 */       int $i$a$-getOrPut-QueryParameterCollection$add$1 = 0; Object answer$iv = new ArrayList();
/* 59 */       $this$getOrPut$iv.put(key, answer$iv);
/*    */     } 
/*    */     
/* 62 */     ((List<String>)value$iv).add(value); } public final void remove(@NotNull String key) {
/*    */     Intrinsics.checkNotNullParameter(key, "key");
/*    */     this.values.remove(key);
/*    */   } @Nullable
/*    */   public final String[] get(@NotNull String key, boolean caseSensitive) {
/*    */     // Byte code:
/*    */     //   0: aload_1
/*    */     //   1: ldc 'key'
/*    */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   6: iload_2
/*    */     //   7: ifeq -> 57
/*    */     //   10: aload_0
/*    */     //   11: getfield values : Ljava/util/HashMap;
/*    */     //   14: aload_1
/*    */     //   15: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*    */     //   18: checkcast java/util/List
/*    */     //   21: dup
/*    */     //   22: ifnull -> 52
/*    */     //   25: checkcast java/util/Collection
/*    */     //   28: astore_3
/*    */     //   29: iconst_0
/*    */     //   30: istore #4
/*    */     //   32: aload_3
/*    */     //   33: astore #5
/*    */     //   35: aload #5
/*    */     //   37: iconst_0
/*    */     //   38: anewarray java/lang/String
/*    */     //   41: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   46: checkcast [Ljava/lang/String;
/*    */     //   49: goto -> 216
/*    */     //   52: pop
/*    */     //   53: aconst_null
/*    */     //   54: goto -> 216
/*    */     //   57: aload_0
/*    */     //   58: getfield values : Ljava/util/HashMap;
/*    */     //   61: invokevirtual entrySet : ()Ljava/util/Set;
/*    */     //   64: dup
/*    */     //   65: ldc 'this.values.entries'
/*    */     //   67: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   70: checkcast java/lang/Iterable
/*    */     //   73: astore #4
/*    */     //   75: aload #4
/*    */     //   77: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   82: astore #5
/*    */     //   84: aload #5
/*    */     //   86: invokeinterface hasNext : ()Z
/*    */     //   91: ifeq -> 165
/*    */     //   94: aload #5
/*    */     //   96: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   101: astore #6
/*    */     //   103: aload #6
/*    */     //   105: checkcast java/util/Map$Entry
/*    */     //   108: astore #7
/*    */     //   110: iconst_0
/*    */     //   111: istore #8
/*    */     //   113: aload #7
/*    */     //   115: invokeinterface getKey : ()Ljava/lang/Object;
/*    */     //   120: dup
/*    */     //   121: ldc 'it.key'
/*    */     //   123: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   126: checkcast java/lang/String
/*    */     //   129: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   132: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   135: dup
/*    */     //   136: ldc 'toLowerCase(...)'
/*    */     //   138: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   141: aload_1
/*    */     //   142: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*    */     //   145: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*    */     //   148: dup
/*    */     //   149: ldc 'toLowerCase(...)'
/*    */     //   151: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*    */     //   154: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   157: ifeq -> 84
/*    */     //   160: aload #6
/*    */     //   162: goto -> 166
/*    */     //   165: aconst_null
/*    */     //   166: checkcast java/util/Map$Entry
/*    */     //   169: dup
/*    */     //   170: ifnull -> 214
/*    */     //   173: invokeinterface getValue : ()Ljava/lang/Object;
/*    */     //   178: checkcast java/util/List
/*    */     //   181: dup
/*    */     //   182: ifnull -> 214
/*    */     //   185: checkcast java/util/Collection
/*    */     //   188: astore #4
/*    */     //   190: iconst_0
/*    */     //   191: istore #5
/*    */     //   193: aload #4
/*    */     //   195: astore #6
/*    */     //   197: aload #6
/*    */     //   199: iconst_0
/*    */     //   200: anewarray java/lang/String
/*    */     //   203: invokeinterface toArray : ([Ljava/lang/Object;)[Ljava/lang/Object;
/*    */     //   208: checkcast [Ljava/lang/String;
/*    */     //   211: goto -> 216
/*    */     //   214: pop
/*    */     //   215: aconst_null
/*    */     //   216: areturn
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #26	-> 6
/*    */     //   #27	-> 10
/*    */     //   #63	-> 32
/*    */     //   #64	-> 33
/*    */     //   #66	-> 35
/*    */     //   #27	-> 52
/*    */     //   #29	-> 57
/*    */     //   #67	-> 110
/*    */     //   #29	-> 113
/*    */     //   #29	-> 141
/*    */     //   #29	-> 154
/*    */     //   #29	-> 157
/*    */     //   #29	-> 166
/*    */     //   #68	-> 193
/*    */     //   #69	-> 195
/*    */     //   #71	-> 197
/*    */     //   #29	-> 214
/*    */     //   #26	-> 216
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   32	14	4	$i$f$toTypedArray	I
/*    */     //   35	11	5	thisCollection$iv	Ljava/util/Collection;
/*    */     //   29	17	3	$this$toTypedArray$iv	Ljava/util/Collection;
/*    */     //   113	44	8	$i$a$-find-QueryParameterCollection$get$1	I
/*    */     //   110	47	7	it	Ljava/util/Map$Entry;
/*    */     //   193	15	5	$i$f$toTypedArray	I
/*    */     //   197	11	6	thisCollection$iv	Ljava/util/Collection;
/*    */     //   190	18	4	$this$toTypedArray$iv	Ljava/util/Collection;
/*    */     //   0	217	0	this	Lai/grazie/client/common/model/QueryParameterCollection;
/*    */     //   0	217	1	key	Ljava/lang/String;
/*    */     //   0	217	2	caseSensitive	Z
/*    */   } @NotNull
/*    */   public final String[] getKeys() {
/*    */     Intrinsics.checkNotNullExpressionValue(this.values.keySet(), "this.values.keys");
/*    */     Collection<String> $this$toTypedArray$iv = this.values.keySet();
/*    */     int $i$f$toTypedArray = 0;
/* 73 */     Collection<String> thisCollection$iv = $this$toTypedArray$iv;
/*    */     
/* 75 */     return thisCollection$iv.<String>toArray(new String[0]);
/*    */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\client-common-jvm-0.4.32.jar!\ai\grazie\client\common\model\QueryParameterCollection.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */