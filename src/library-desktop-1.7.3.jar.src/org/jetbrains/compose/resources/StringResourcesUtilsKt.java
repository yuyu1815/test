/*    */ package org.jetbrains.compose.resources;
/*    */ 
/*    */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000F\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\020\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020 \n\000\032\b\020\006\032\0020\007H\000\032\036\020\b\032\0020\0052\006\020\t\032\0020\n2\006\020\013\032\0020\fH@¢\006\002\020\r\032\f\020\016\032\0020\017*\0020\004H\002\032\f\020\020\032\0020\021*\0020\004H\002\032\f\020\022\032\0020\023*\0020\004H\002\032\032\020\024\032\0020\004*\0020\0042\f\020\025\032\b\022\004\022\0020\0040\026H\000\"\016\020\000\032\0020\001X\004¢\006\002\n\000\"\032\020\002\032\016\022\004\022\0020\004\022\004\022\0020\0050\003X\004¢\006\002\n\000¨\006\027"}, d2 = {"SimpleStringFormatRegex", "Lkotlin/text/Regex;", "stringItemsCache", "Lorg/jetbrains/compose/resources/AsyncCache;", "", "Lorg/jetbrains/compose/resources/StringItem;", "dropStringItemsCache", "", "getStringItem", "resourceItem", "Lorg/jetbrains/compose/resources/ResourceItem;", "resourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "(Lorg/jetbrains/compose/resources/ResourceItem;Lorg/jetbrains/compose/resources/ResourceReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "decodeAsArray", "Lorg/jetbrains/compose/resources/StringItem$Array;", "decodeAsPlural", "Lorg/jetbrains/compose/resources/StringItem$Plurals;", "decodeAsString", "Lorg/jetbrains/compose/resources/StringItem$Value;", "replaceWithArgs", "args", "", "library"})
/*    */ @SourceDebugExtension({"SMAP\nStringResourcesUtils.kt\nKotlin\n*S Kotlin\n*F\n+ 1 StringResourcesUtils.kt\norg/jetbrains/compose/resources/StringResourcesUtilsKt\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,65:1\n1549#2:66\n1620#2,3:67\n1179#2,2:70\n1253#2,4:72\n*S KotlinDebug\n*F\n+ 1 StringResourcesUtils.kt\norg/jetbrains/compose/resources/StringResourcesUtilsKt\n*L\n52#1:66\n52#1:67,3\n59#1:70,2\n59#1:72,4\n*E\n"})
/*    */ public final class StringResourcesUtilsKt {
/*    */   @NotNull
/*  7 */   private static final Regex SimpleStringFormatRegex = new Regex("%(\\d)\\$[ds]"); @NotNull
/*  8 */   public static final String replaceWithArgs(@NotNull String $this$replaceWithArgs, @NotNull List<String> args) { Intrinsics.checkNotNullParameter($this$replaceWithArgs, "<this>"); Intrinsics.checkNotNullParameter(args, "args"); return SimpleStringFormatRegex.replace($this$replaceWithArgs, new StringResourcesUtilsKt$replaceWithArgs$1(args)); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\r\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "matchResult", "Lkotlin/text/MatchResult;", "invoke"}) static final class StringResourcesUtilsKt$replaceWithArgs$1 extends Lambda implements Function1<MatchResult, CharSequence> { @NotNull
/*  9 */     public final CharSequence invoke(@NotNull MatchResult matchResult) { Intrinsics.checkNotNullParameter(matchResult, "matchResult"); return this.$args.get(Integer.parseInt(matchResult.getGroupValues().get(1)) - 1); }
/*    */ 
/*    */     
/*    */     StringResourcesUtilsKt$replaceWithArgs$1(List<String> $args) {
/*    */       super(1);
/*    */     } }
/*    */ 
/*    */   
/*    */   @NotNull
/* 18 */   private static final AsyncCache<String, StringItem> stringItemsCache = new AsyncCache<>();
/*    */   
/*    */   public static final void dropStringItemsCache() {
/* 21 */     stringItemsCache.clear();
/*    */   }
/*    */ 
/*    */   
/*    */   @Nullable
/*    */   public static final Object getStringItem(@NotNull ResourceItem resourceItem, @NotNull ResourceReader resourceReader, @NotNull Continuation<? super StringItem> $completion) {
/* 27 */     return stringItemsCache.getOrLoad(
/* 28 */         resourceItem.getPath$library() + "/" + resourceItem.getPath$library() + "-" + resourceItem.getOffset$library(), new StringResourcesUtilsKt$getStringItem$2(resourceReader, resourceItem, null), $completion);
/*    */   } @DebugMetadata(f = "StringResourcesUtils.kt", l = {30}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.StringResourcesUtilsKt$getStringItem$2")
/*    */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H@"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/StringItem;"})
/*    */   static final class StringResourcesUtilsKt$getStringItem$2 extends SuspendLambda implements Function1<Continuation<? super StringItem>, Object> {
/*    */     int label; StringResourcesUtilsKt$getStringItem$2(ResourceReader $resourceReader, ResourceItem $resourceItem, Continuation $completion) {
/*    */       super(1, $completion);
/*    */     } @Nullable
/*    */     public final Object invokeSuspend(@NotNull Object $result) {
/*    */       // Byte code:
/*    */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*    */       //   3: astore #7
/*    */       //   5: aload_0
/*    */       //   6: getfield label : I
/*    */       //   9: tableswitch default -> 195, 0 -> 32, 1 -> 84
/*    */       //   32: aload_1
/*    */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   36: aload_0
/*    */       //   37: getfield $resourceReader : Lorg/jetbrains/compose/resources/ResourceReader;
/*    */       //   40: aload_0
/*    */       //   41: getfield $resourceItem : Lorg/jetbrains/compose/resources/ResourceItem;
/*    */       //   44: invokevirtual getPath$library : ()Ljava/lang/String;
/*    */       //   47: aload_0
/*    */       //   48: getfield $resourceItem : Lorg/jetbrains/compose/resources/ResourceItem;
/*    */       //   51: invokevirtual getOffset$library : ()J
/*    */       //   54: aload_0
/*    */       //   55: getfield $resourceItem : Lorg/jetbrains/compose/resources/ResourceItem;
/*    */       //   58: invokevirtual getSize$library : ()J
/*    */       //   61: aload_0
/*    */       //   62: checkcast kotlin/coroutines/Continuation
/*    */       //   65: aload_0
/*    */       //   66: iconst_1
/*    */       //   67: putfield label : I
/*    */       //   70: invokeinterface readPart : (Ljava/lang/String;JJLkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*    */       //   75: dup
/*    */       //   76: aload #7
/*    */       //   78: if_acmpne -> 89
/*    */       //   81: aload #7
/*    */       //   83: areturn
/*    */       //   84: aload_1
/*    */       //   85: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*    */       //   88: aload_1
/*    */       //   89: checkcast [B
/*    */       //   92: invokestatic decodeToString : ([B)Ljava/lang/String;
/*    */       //   95: astore_2
/*    */       //   96: aload_2
/*    */       //   97: checkcast java/lang/CharSequence
/*    */       //   100: iconst_1
/*    */       //   101: newarray char
/*    */       //   103: astore #4
/*    */       //   105: aload #4
/*    */       //   107: iconst_0
/*    */       //   108: bipush #124
/*    */       //   110: castore
/*    */       //   111: aload #4
/*    */       //   113: iconst_0
/*    */       //   114: iconst_0
/*    */       //   115: bipush #6
/*    */       //   117: aconst_null
/*    */       //   118: invokestatic split$default : (Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;
/*    */       //   121: astore_3
/*    */       //   122: aload_3
/*    */       //   123: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*    */       //   126: checkcast java/lang/String
/*    */       //   129: astore #4
/*    */       //   131: aload_3
/*    */       //   132: invokestatic last : (Ljava/util/List;)Ljava/lang/Object;
/*    */       //   135: checkcast java/lang/String
/*    */       //   138: astore #5
/*    */       //   140: aload #4
/*    */       //   142: astore #6
/*    */       //   144: aload #6
/*    */       //   146: ldc 'plurals'
/*    */       //   148: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   151: ifeq -> 165
/*    */       //   154: aload #5
/*    */       //   156: invokestatic access$decodeAsPlural : (Ljava/lang/String;)Lorg/jetbrains/compose/resources/StringItem$Plurals;
/*    */       //   159: checkcast org/jetbrains/compose/resources/StringItem
/*    */       //   162: goto -> 194
/*    */       //   165: aload #6
/*    */       //   167: ldc 'string-array'
/*    */       //   169: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */       //   172: ifeq -> 186
/*    */       //   175: aload #5
/*    */       //   177: invokestatic access$decodeAsArray : (Ljava/lang/String;)Lorg/jetbrains/compose/resources/StringItem$Array;
/*    */       //   180: checkcast org/jetbrains/compose/resources/StringItem
/*    */       //   183: goto -> 194
/*    */       //   186: aload #5
/*    */       //   188: invokestatic access$decodeAsString : (Ljava/lang/String;)Lorg/jetbrains/compose/resources/StringItem$Value;
/*    */       //   191: checkcast org/jetbrains/compose/resources/StringItem
/*    */       //   194: areturn
/*    */       //   195: new java/lang/IllegalStateException
/*    */       //   198: dup
/*    */       //   199: ldc 'call to 'resume' before 'invoke' with coroutine'
/*    */       //   201: invokespecial <init> : (Ljava/lang/String;)V
/*    */       //   204: athrow
/*    */       // Line number table:
/*    */       //   Java source line number -> byte code offset
/*    */       //   #29	-> 3
/*    */       //   #30	-> 36
/*    */       //   #31	-> 40
/*    */       //   #32	-> 47
/*    */       //   #33	-> 54
/*    */       //   #30	-> 65
/*    */       //   #29	-> 81
/*    */       //   #34	-> 92
/*    */       //   #30	-> 95
/*    */       //   #35	-> 96
/*    */       //   #36	-> 122
/*    */       //   #37	-> 131
/*    */       //   #38	-> 140
/*    */       //   #39	-> 144
/*    */       //   #40	-> 165
/*    */       //   #41	-> 186
/*    */       //   #38	-> 194
/*    */       //   #29	-> 195
/*    */       // Local variable table:
/*    */       //   start	length	slot	name	descriptor
/*    */       //   96	9	2	record	Ljava/lang/String;
/*    */       //   122	18	3	recordItems	Ljava/util/List;
/*    */       //   131	13	4	recordType	Ljava/lang/String;
/*    */       //   140	25	5	recordData	Ljava/lang/String;
/*    */       //   165	21	5	recordData	Ljava/lang/String;
/*    */       //   186	8	5	recordData	Ljava/lang/String;
/*    */       //   36	159	0	this	Lorg/jetbrains/compose/resources/StringResourcesUtilsKt$getStringItem$2;
/*    */       //   36	159	1	$result	Ljava/lang/Object;
/*    */     } @NotNull
/*    */     public final Continuation<Unit> create(@NotNull Continuation<? super StringResourcesUtilsKt$getStringItem$2> $completion) {
/*    */       return (Continuation<Unit>)new StringResourcesUtilsKt$getStringItem$2(this.$resourceReader, this.$resourceItem, $completion);
/*    */     }
/*    */     @Nullable
/*    */     public final Object invoke(@Nullable Continuation<?> p1) {
/*    */       return ((StringResourcesUtilsKt$getStringItem$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*    */     } }
/*    */   private static final StringItem.Value decodeAsString(String $this$decodeAsString) {
/* 46 */     return new StringItem.Value(
/* 47 */         StringsKt.decodeToString(Base64.decode$default((Base64)Base64.Default, $this$decodeAsString, 0, 0, 6, null)));
/*    */   }
/*    */ 
/*    */   
/*    */   private static final StringItem.Array decodeAsArray(String $this$decodeAsArray) {
/* 52 */     String[] arrayOfString = new String[1]; arrayOfString[0] = ","; Iterable $this$map$iv = StringsKt.split$default($this$decodeAsArray, arrayOfString, false, 0, 6, null); int $i$f$map = 0;
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
/* 66 */     Iterable iterable1 = $this$map$iv; Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 67 */     for (Object item$iv$iv : iterable1) {
/* 68 */       String str = (String)item$iv$iv; Collection<String> collection = destination$iv$iv; int $i$a$-map-StringResourcesUtilsKt$decodeAsArray$1 = 0; collection.add(StringsKt.decodeToString(Base64.decode$default((Base64)Base64.Default, str, 0, 0, 6, null)));
/* 69 */     }  List<String> list = (List)destination$iv$iv; return new StringItem.Array(list); } private static final StringItem.Plurals decodeAsPlural(String $this$decodeAsPlural) { String[] arrayOfString = new String[1]; arrayOfString[0] = ","; Iterable $this$associate$iv = StringsKt.split$default($this$decodeAsPlural, arrayOfString, false, 0, 6, null); int $i$f$associate = 0;
/* 70 */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault($this$associate$iv, 10)), 16);
/* 71 */     Iterable iterable1 = $this$associate$iv; Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(capacity$iv); int $i$f$associateTo = 0;
/* 72 */     for (Object element$iv$iv : iterable1) {
/* 73 */       Map<Object, Object> map = destination$iv$iv; String item = (String)element$iv$iv; int $i$a$-associate-StringResourcesUtilsKt$decodeAsPlural$1 = 0; String category = StringsKt.substringBefore$default(item, ':', null, 2, null); String valueBase64 = StringsKt.substringAfter$default(item, ':', null, 2, null); Intrinsics.checkNotNull(PluralCategory.Companion.fromString(category)); Pair pair = TuplesKt.to(PluralCategory.Companion.fromString(category), StringsKt.decodeToString(Base64.decode$default((Base64)Base64.Default, valueBase64, 0, 0, 6, null))); map.put(pair.getFirst(), pair.getSecond());
/*    */     } 
/* 75 */     Map<Object, Object> map1 = destination$iv$iv;
/*    */     return new StringItem.Plurals((Map)map1); }
/*    */ 
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\StringResourcesUtilsKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */