/*    */ package org.jetbrains.jewel.foundation.lazy.tree;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\0008\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\020\000\n\002\b\004\b\027\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\036\020\n\032\0020\0132\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\017\032\0020\020H\026J&\020\021\032\0020\0132\006\020\022\032\0020\0232\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\017\032\0020\020H\002J4\020\024\032\0020\0132\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\022\032\0020\0232\f\020\025\032\b\022\004\022\0020\0230\r2\006\020\017\032\0020\020H\002J\036\020\026\032\0020\0132\f\020\f\032\b\022\004\022\0020\0160\r2\006\020\017\032\0020\020H\026R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\b\020\tR\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\027"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent;", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewOnKeyEvent;", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;", "treeState", "Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;", "<init>", "(Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;)V", "getKeybindings", "()Lorg/jetbrains/jewel/foundation/lazy/tree/TreeViewKeybindings;", "onSelectParent", "", "keys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "state", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "handleNodeCase", "currentKey", "", "handleLeafCase", "keyNodeList", "onSelectChild", "foundation"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nDefaultTreeViewOnKeyEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DefaultTreeViewOnKeyEvent.kt\norg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,74:1\n1549#2:75\n1620#2,3:76\n223#2,2:79\n288#2,2:81\n223#2,2:84\n350#2,7:86\n1549#2:93\n1620#2,3:94\n1#3:83\n*S KotlinDebug\n*F\n+ 1 DefaultTreeViewOnKeyEvent.kt\norg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent\n*L\n12#1:75\n12#1:76,3\n27#1:79,2\n32#1:81,2\n35#1:84,2\n39#1:86,7\n67#1:93\n67#1:94,3\n*E\n"})
/*    */ public class DefaultTreeViewOnKeyEvent implements TreeViewOnKeyEvent { @NotNull
/*    */   private final TreeViewKeybindings keybindings; @NotNull
/*    */   private final TreeState treeState; public static final int $stable = 8;
/*  7 */   public DefaultTreeViewOnKeyEvent(@NotNull TreeViewKeybindings keybindings, @NotNull TreeState treeState) { this.keybindings = keybindings;
/*  8 */     this.treeState = treeState; }
/*    */   public void onSelectFirstItem(@NotNull List<? extends SelectableLazyListKey> allKeys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onSelectFirstItem(this, allKeys, state); }
/*    */   public void onExtendSelectionToFirst(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onExtendSelectionToFirst(this, keys, state); }
/* 11 */   public void onSelectLastItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onSelectLastItem(this, keys, state); } public void onExtendSelectionToLastItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onExtendSelectionToLastItem(this, keys, state); } public void onSelectPreviousItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onSelectPreviousItem(this, keys, state); } public void onExtendSelectionWithPreviousItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onExtendSelectionWithPreviousItem(this, keys, state); } public void onSelectNextItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onSelectNextItem(this, keys, state); } public void onSelectParent(@NotNull List<SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); state.getLastActiveItemIndex(); Object currentKey = ((SelectableLazyListKey)keys.get((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0)).getKey();
/* 12 */     Iterable $this$map$iv = (Iterable)this.treeState.getAllNodes$foundation(); int $i$f$map = 0;
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
/* 75 */     Iterable iterable1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 76 */     for (Object item$iv$iv : iterable1) {
/* 77 */       Pair pair = (Pair)item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-DefaultTreeViewOnKeyEvent$onSelectParent$keyNodeList$1 = 0; collection.add(pair.getFirst());
/* 78 */     }  List<? extends Object> keyNodeList = (List)destination$iv$iv; if (!keyNodeList.contains(currentKey)) { handleLeafCase(keys, currentKey, keyNodeList, state); } else { handleNodeCase(currentKey, keys, state); }
/*    */      }
/*    */   public void onExtendSelectionWithNextItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onExtendSelectionWithNextItem(this, keys, state); }
/*    */   public void onScrollPageUpAndSelectItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onScrollPageUpAndSelectItem(this, keys, state); }
/*    */   public void onScrollPageUpAndExtendSelection(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onScrollPageUpAndExtendSelection(this, keys, state); }
/*    */   public void onScrollPageDownAndSelectItem(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onScrollPageDownAndSelectItem(this, keys, state); }
/*    */   public void onScrollPageDownAndExtendSelection(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onScrollPageDownAndExtendSelection(this, keys, state); }
/*    */   public void onEdit() { TreeViewOnKeyEvent.DefaultImpls.onEdit(this); }
/*    */   public void onSelectAll(@NotNull List<? extends SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { TreeViewOnKeyEvent.DefaultImpls.onSelectAll(this, keys, state); }
/*    */   @NotNull public TreeViewKeybindings getKeybindings() { return this.keybindings; }
/*    */   private final void handleNodeCase(Object currentKey, List keys, SelectableLazyListState state) { // Byte code:
/*    */     //   0: aload_0
/*    */     //   1: getfield treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   4: invokevirtual getOpenNodes : ()Ljava/util/Set;
/*    */     //   7: aload_1
/*    */     //   8: invokeinterface contains : (Ljava/lang/Object;)Z
/*    */     //   13: ifeq -> 25
/*    */     //   16: aload_0
/*    */     //   17: getfield treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   20: aload_1
/*    */     //   21: invokevirtual toggleNode : (Ljava/lang/Object;)V
/*    */     //   24: return
/*    */     //   25: aload_0
/*    */     //   26: getfield treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   29: invokevirtual getAllNodes$foundation : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*    */     //   32: checkcast java/lang/Iterable
/*    */     //   35: astore #4
/*    */     //   37: nop
/*    */     //   38: iconst_0
/*    */     //   39: istore #5
/*    */     //   41: aload #4
/*    */     //   43: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   48: astore #6
/*    */     //   50: aload #6
/*    */     //   52: invokeinterface hasNext : ()Z
/*    */     //   57: ifeq -> 96
/*    */     //   60: aload #6
/*    */     //   62: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   67: astore #7
/*    */     //   69: aload #7
/*    */     //   71: checkcast kotlin/Pair
/*    */     //   74: astore #8
/*    */     //   76: iconst_0
/*    */     //   77: istore #9
/*    */     //   79: aload #8
/*    */     //   81: invokevirtual getFirst : ()Ljava/lang/Object;
/*    */     //   84: aload_1
/*    */     //   85: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   88: ifeq -> 50
/*    */     //   91: aload #7
/*    */     //   93: goto -> 106
/*    */     //   96: new java/util/NoSuchElementException
/*    */     //   99: dup
/*    */     //   100: ldc 'Collection contains no element matching the predicate.'
/*    */     //   102: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   105: athrow
/*    */     //   106: checkcast kotlin/Pair
/*    */     //   109: astore #5
/*    */     //   111: iconst_0
/*    */     //   112: istore #6
/*    */     //   114: aload_0
/*    */     //   115: getfield treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   118: invokevirtual getAllNodes$foundation : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*    */     //   121: iconst_0
/*    */     //   122: aload_0
/*    */     //   123: getfield treeState : Lorg/jetbrains/jewel/foundation/lazy/tree/TreeState;
/*    */     //   126: invokevirtual getAllNodes$foundation : ()Landroidx/compose/runtime/snapshots/SnapshotStateList;
/*    */     //   129: aload #5
/*    */     //   131: invokevirtual indexOf : (Ljava/lang/Object;)I
/*    */     //   134: invokevirtual subList : (II)Ljava/util/List;
/*    */     //   137: checkcast java/lang/Iterable
/*    */     //   140: invokestatic reversed : (Ljava/lang/Iterable;)Ljava/util/List;
/*    */     //   143: checkcast java/lang/Iterable
/*    */     //   146: astore #7
/*    */     //   148: nop
/*    */     //   149: iconst_0
/*    */     //   150: istore #8
/*    */     //   152: aload #7
/*    */     //   154: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   159: astore #9
/*    */     //   161: aload #9
/*    */     //   163: invokeinterface hasNext : ()Z
/*    */     //   168: ifeq -> 228
/*    */     //   171: aload #9
/*    */     //   173: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   178: astore #10
/*    */     //   180: aload #10
/*    */     //   182: checkcast kotlin/Pair
/*    */     //   185: astore #11
/*    */     //   187: iconst_0
/*    */     //   188: istore #12
/*    */     //   190: aload #11
/*    */     //   192: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   195: checkcast java/lang/Number
/*    */     //   198: invokevirtual intValue : ()I
/*    */     //   201: aload #5
/*    */     //   203: invokevirtual getSecond : ()Ljava/lang/Object;
/*    */     //   206: checkcast java/lang/Number
/*    */     //   209: invokevirtual intValue : ()I
/*    */     //   212: if_icmpge -> 219
/*    */     //   215: iconst_1
/*    */     //   216: goto -> 220
/*    */     //   219: iconst_0
/*    */     //   220: ifeq -> 161
/*    */     //   223: aload #10
/*    */     //   225: goto -> 229
/*    */     //   228: aconst_null
/*    */     //   229: checkcast kotlin/Pair
/*    */     //   232: astore #13
/*    */     //   234: aload #13
/*    */     //   236: ifnull -> 477
/*    */     //   239: aload #13
/*    */     //   241: astore #8
/*    */     //   243: iconst_0
/*    */     //   244: istore #9
/*    */     //   246: aload #8
/*    */     //   248: invokevirtual component1 : ()Ljava/lang/Object;
/*    */     //   251: astore #10
/*    */     //   253: aload_2
/*    */     //   254: checkcast java/lang/Iterable
/*    */     //   257: astore #11
/*    */     //   259: nop
/*    */     //   260: iconst_0
/*    */     //   261: istore #12
/*    */     //   263: aload #11
/*    */     //   265: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   270: astore #14
/*    */     //   272: aload #14
/*    */     //   274: invokeinterface hasNext : ()Z
/*    */     //   279: ifeq -> 319
/*    */     //   282: aload #14
/*    */     //   284: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   289: astore #15
/*    */     //   291: aload #15
/*    */     //   293: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*    */     //   296: astore #16
/*    */     //   298: iconst_0
/*    */     //   299: istore #17
/*    */     //   301: aload #16
/*    */     //   303: invokevirtual getKey : ()Ljava/lang/Object;
/*    */     //   306: aload #10
/*    */     //   308: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   311: ifeq -> 272
/*    */     //   314: aload #15
/*    */     //   316: goto -> 329
/*    */     //   319: new java/util/NoSuchElementException
/*    */     //   322: dup
/*    */     //   323: ldc 'Collection contains no element matching the predicate.'
/*    */     //   325: invokespecial <init> : (Ljava/lang/String;)V
/*    */     //   328: athrow
/*    */     //   329: astore #11
/*    */     //   331: aload #11
/*    */     //   333: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*    */     //   336: astore #12
/*    */     //   338: iconst_0
/*    */     //   339: istore #14
/*    */     //   341: aload #12
/*    */     //   343: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*    */     //   346: ifeq -> 354
/*    */     //   349: aload #11
/*    */     //   351: goto -> 355
/*    */     //   354: aconst_null
/*    */     //   355: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*    */     //   358: astore #18
/*    */     //   360: aload #18
/*    */     //   362: ifnull -> 472
/*    */     //   365: aload #18
/*    */     //   367: astore #12
/*    */     //   369: iconst_0
/*    */     //   370: istore #14
/*    */     //   372: aload_3
/*    */     //   373: aload_2
/*    */     //   374: astore #15
/*    */     //   376: astore #16
/*    */     //   378: iconst_0
/*    */     //   379: istore #17
/*    */     //   381: iconst_0
/*    */     //   382: istore #19
/*    */     //   384: aload #15
/*    */     //   386: invokeinterface iterator : ()Ljava/util/Iterator;
/*    */     //   391: astore #20
/*    */     //   393: aload #20
/*    */     //   395: invokeinterface hasNext : ()Z
/*    */     //   400: ifeq -> 446
/*    */     //   403: aload #20
/*    */     //   405: invokeinterface next : ()Ljava/lang/Object;
/*    */     //   410: astore #21
/*    */     //   412: aload #21
/*    */     //   414: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*    */     //   417: astore #22
/*    */     //   419: iconst_0
/*    */     //   420: istore #23
/*    */     //   422: aload #22
/*    */     //   424: invokevirtual getKey : ()Ljava/lang/Object;
/*    */     //   427: aload #10
/*    */     //   429: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*    */     //   432: ifeq -> 440
/*    */     //   435: iload #19
/*    */     //   437: goto -> 447
/*    */     //   440: iinc #19, 1
/*    */     //   443: goto -> 393
/*    */     //   446: iconst_m1
/*    */     //   447: istore #24
/*    */     //   449: aload #16
/*    */     //   451: iload #24
/*    */     //   453: invokestatic valueOf : (I)Ljava/lang/Integer;
/*    */     //   456: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*    */     //   459: aload_3
/*    */     //   460: aload #10
/*    */     //   462: invokestatic setOf : (Ljava/lang/Object;)Ljava/util/Set;
/*    */     //   465: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*    */     //   468: nop
/*    */     //   469: goto -> 473
/*    */     //   472: nop
/*    */     //   473: nop
/*    */     //   474: goto -> 478
/*    */     //   477: nop
/*    */     //   478: nop
/*    */     //   479: nop
/*    */     //   480: return
/*    */     // Line number table:
/*    */     //   Java source line number -> byte code offset
/*    */     //   #22	-> 0
/*    */     //   #23	-> 16
/*    */     //   #24	-> 24
/*    */     //   #26	-> 25
/*    */     //   #27	-> 37
/*    */     //   #79	-> 41
/*    */     //   #27	-> 79
/*    */     //   #79	-> 88
/*    */     //   #80	-> 96
/*    */     //   #28	-> 106
/*    */     //   #33	-> 114
/*    */     //   #29	-> 114
/*    */     //   #30	-> 121
/*    */     //   #31	-> 140
/*    */     //   #32	-> 148
/*    */     //   #81	-> 152
/*    */     //   #32	-> 190
/*    */     //   #81	-> 220
/*    */     //   #82	-> 228
/*    */     //   #32	-> 229
/*    */     //   #33	-> 234
/*    */     //   #29	-> 239
/*    */     //   #33	-> 241
/*    */     //   #83	-> 243
/*    */     //   #33	-> 246
/*    */     //   #37	-> 253
/*    */     //   #34	-> 253
/*    */     //   #35	-> 259
/*    */     //   #84	-> 263
/*    */     //   #35	-> 301
/*    */     //   #84	-> 311
/*    */     //   #85	-> 319
/*    */     //   #35	-> 329
/*    */     //   #36	-> 331
/*    */     //   #83	-> 338
/*    */     //   #36	-> 341
/*    */     //   #36	-> 346
/*    */     //   #36	-> 355
/*    */     //   #37	-> 360
/*    */     //   #34	-> 365
/*    */     //   #37	-> 367
/*    */     //   #38	-> 372
/*    */     //   #39	-> 373
/*    */     //   #86	-> 381
/*    */     //   #87	-> 384
/*    */     //   #88	-> 412
/*    */     //   #39	-> 422
/*    */     //   #88	-> 432
/*    */     //   #89	-> 435
/*    */     //   #90	-> 440
/*    */     //   #92	-> 446
/*    */     //   #38	-> 456
/*    */     //   #40	-> 459
/*    */     //   #41	-> 468
/*    */     //   #37	-> 469
/*    */     //   #37	-> 472
/*    */     //   #41	-> 473
/*    */     //   #33	-> 474
/*    */     //   #33	-> 477
/*    */     //   #42	-> 478
/*    */     //   #28	-> 479
/*    */     //   #44	-> 480
/*    */     // Local variable table:
/*    */     //   start	length	slot	name	descriptor
/*    */     //   79	9	9	$i$a$-first-DefaultTreeViewOnKeyEvent$handleNodeCase$1	I
/*    */     //   76	12	8	it	Lkotlin/Pair;
/*    */     //   69	27	7	element$iv	Ljava/lang/Object;
/*    */     //   41	65	5	$i$f$first	I
/*    */     //   38	68	4	$this$first$iv	Ljava/lang/Iterable;
/*    */     //   190	30	12	$i$a$-firstOrNull-DefaultTreeViewOnKeyEvent$handleNodeCase$2$1	I
/*    */     //   187	33	11	it	Lkotlin/Pair;
/*    */     //   180	48	10	element$iv	Ljava/lang/Object;
/*    */     //   152	77	8	$i$f$firstOrNull	I
/*    */     //   149	80	7	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*    */     //   301	10	17	$i$a$-first-DefaultTreeViewOnKeyEvent$handleNodeCase$2$2$1	I
/*    */     //   298	13	16	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*    */     //   291	28	15	element$iv	Ljava/lang/Object;
/*    */     //   263	66	12	$i$f$first	I
/*    */     //   260	69	11	$this$first$iv	Ljava/lang/Iterable;
/*    */     //   341	5	14	$i$a$-takeIf-DefaultTreeViewOnKeyEvent$handleNodeCase$2$2$2	I
/*    */     //   338	8	12	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*    */     //   422	10	23	$i$a$-indexOfFirst-DefaultTreeViewOnKeyEvent$handleNodeCase$2$2$3$1	I
/*    */     //   419	13	22	selectableKey	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*    */     //   412	31	21	item$iv	Ljava/lang/Object;
/*    */     //   381	66	17	$i$f$indexOfFirst	I
/*    */     //   384	63	19	index$iv	I
/*    */     //   378	69	15	$this$indexOfFirst$iv	Ljava/util/List;
/*    */     //   372	97	14	$i$a$-let-DefaultTreeViewOnKeyEvent$handleNodeCase$2$2$3	I
/*    */     //   369	100	12	it	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*    */     //   246	228	9	$i$a$-let-DefaultTreeViewOnKeyEvent$handleNodeCase$2$2	I
/*    */     //   253	221	10	parentNodeKey	Ljava/lang/Object;
/*    */     //   114	365	6	$i$a$-let-DefaultTreeViewOnKeyEvent$handleNodeCase$2	I
/*    */     //   111	368	5	currentNode	Lkotlin/Pair;
/*    */     //   0	481	0	this	Lorg/jetbrains/jewel/foundation/lazy/tree/DefaultTreeViewOnKeyEvent;
/*    */     //   0	481	1	currentKey	Ljava/lang/Object;
/*    */     //   0	481	2	keys	Ljava/util/List;
/*    */     //   0	481	3	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState; }
/*    */   private final void handleLeafCase(List<SelectableLazyListKey> keys, Object currentKey, List keyNodeList, SelectableLazyListState state) { int index = CollectionsKt.indexOf(keys, currentKey); if (index < 0)
/*    */       return;  for (int i = index; -1 < i; i--) { if (keyNodeList.contains(((SelectableLazyListKey)keys.get(i)).getKey())) { if (keys.get(i) instanceof SelectableLazyListKey.Selectable) { state.setLastActiveItemIndex(Integer.valueOf(i)); state.setSelectedKeys(SetsKt.setOf(((SelectableLazyListKey)keys.get(i)).getKey())); }
/*    */          break; }
/*    */        }
/* 93 */      } public void onSelectChild(@NotNull List<SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); state.getLastActiveItemIndex(); Object currentKey = ((SelectableLazyListKey)keys.get((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0)).getKey(); Iterable $this$map$iv = (Iterable)this.treeState.getAllNodes$foundation(); int $i$f$map = 0; Iterable iterable1 = $this$map$iv; Collection<Object> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10)); int $i$f$mapTo = 0;
/* 94 */     for (Object item$iv$iv : iterable1) {
/* 95 */       Pair pair = (Pair)item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-DefaultTreeViewOnKeyEvent$onSelectChild$1 = 0; collection.add(pair.getFirst());
/* 96 */     }  if (((List)destination$iv$iv).contains(currentKey) && !this.treeState.getOpenNodes().contains(currentKey)) {
/*    */       this.treeState.toggleNode(currentKey);
/*    */     } else {
/*    */       TreeViewOnKeyEvent.DefaultImpls.onSelectNextItem(this, keys, state);
/*    */     }  }
/*    */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\tree\DefaultTreeViewOnKeyEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */