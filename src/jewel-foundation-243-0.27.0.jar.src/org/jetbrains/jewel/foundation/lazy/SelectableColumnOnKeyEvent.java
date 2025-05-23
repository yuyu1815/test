/*     */ package org.jetbrains.jewel.foundation.lazy;@Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000*\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\000\n\002\020 \n\002\030\002\n\000\n\002\030\002\n\002\b\017\bf\030\0002\0020\001J\036\020\006\032\0020\0072\f\020\b\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\r\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\017\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\020\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\021\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\022\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\023\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\024\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\025\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\026\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\027\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\036\020\030\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026J\b\020\031\032\0020\007H\026J\036\020\032\032\0020\0072\f\020\016\032\b\022\004\022\0020\n0\t2\006\020\013\032\0020\fH\026R\022\020\002\032\0020\003X¦\004¢\006\006\032\004\b\004\020\005¨\006\033"}, d2 = {"Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;", "", "keybindings", "Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "getKeybindings", "()Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnKeybindings;", "onSelectFirstItem", "", "allKeys", "", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;", "state", "Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;", "onExtendSelectionToFirst", "keys", "onSelectLastItem", "onExtendSelectionToLastItem", "onSelectPreviousItem", "onExtendSelectionWithPreviousItem", "onSelectNextItem", "onExtendSelectionWithNextItem", "onScrollPageUpAndSelectItem", "onScrollPageUpAndExtendSelection", "onScrollPageDownAndSelectItem", "onScrollPageDownAndExtendSelection", "onEdit", "onSelectAll", "foundation"})
/*     */ public interface SelectableColumnOnKeyEvent { @NotNull
/*     */   SelectableColumnKeybindings getKeybindings(); void onSelectFirstItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onExtendSelectionToFirst(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onSelectLastItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onExtendSelectionToLastItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onSelectPreviousItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onExtendSelectionWithPreviousItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onSelectNextItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onExtendSelectionWithNextItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState); void onScrollPageUpAndSelectItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState);
/*     */   void onScrollPageUpAndExtendSelection(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState);
/*     */   void onScrollPageDownAndSelectItem(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState);
/*     */   void onScrollPageDownAndExtendSelection(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState);
/*     */   void onEdit();
/*     */   void onSelectAll(@NotNull List<? extends SelectableLazyListKey> paramList, @NotNull SelectableLazyListState paramSelectableLazyListState);
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   @SourceDebugExtension({"SMAP\nSelectableColumnOnKeyEvent.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SelectableColumnOnKeyEvent.kt\norg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent$DefaultImpls\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,179:1\n1#2:180\n766#3:181\n857#3,2:182\n1549#3:184\n1620#3,3:185\n800#3,11:188\n1549#3:199\n1620#3,3:200\n800#3,11:203\n1549#3:214\n1620#3,3:215\n*S KotlinDebug\n*F\n+ 1 SelectableColumnOnKeyEvent.kt\norg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent$DefaultImpls\n*L\n137#1:181\n137#1:182,2\n138#1:184\n138#1:185,3\n156#1:188,11\n157#1:199\n157#1:200,3\n171#1:203,11\n171#1:214\n171#1:215,3\n*E\n"})
/*     */   public static final class DefaultImpls { public static void onSelectFirstItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List<SelectableLazyListKey> allKeys, @NotNull SelectableLazyListState state) {
/*  12 */       Intrinsics.checkNotNullParameter(allKeys, "allKeys"); Intrinsics.checkNotNullParameter(state, "state"); for (int index = 0, i = allKeys.size(); index < i; index++) {
/*  13 */         SelectableLazyListKey key = allKeys.get(index);
/*  14 */         if (key instanceof SelectableLazyListKey.Selectable) {
/*  15 */           state.setSelectedKeys(SetsKt.setOf(((SelectableLazyListKey.Selectable)key).getKey()));
/*  16 */           state.setLastActiveItemIndex(Integer.valueOf(index));
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static void onExtendSelectionToFirst(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'keys'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'state'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */       //   16: dup
/*     */       //   17: ifnull -> 26
/*     */       //   20: invokevirtual intValue : ()I
/*     */       //   23: goto -> 28
/*     */       //   26: pop
/*     */       //   27: return
/*     */       //   28: istore_3
/*     */       //   29: new java/util/HashSet
/*     */       //   32: dup
/*     */       //   33: iload_3
/*     */       //   34: aload_2
/*     */       //   35: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   38: invokeinterface size : ()I
/*     */       //   43: invokestatic max : (II)I
/*     */       //   46: invokespecial <init> : (I)V
/*     */       //   49: astore #5
/*     */       //   51: aload #5
/*     */       //   53: astore #6
/*     */       //   55: iconst_0
/*     */       //   56: istore #7
/*     */       //   58: aload #6
/*     */       //   60: aload_2
/*     */       //   61: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   64: checkcast java/util/Collection
/*     */       //   67: invokevirtual addAll : (Ljava/util/Collection;)Z
/*     */       //   70: pop
/*     */       //   71: aload #5
/*     */       //   73: astore #4
/*     */       //   75: iload_3
/*     */       //   76: istore #5
/*     */       //   78: iload_3
/*     */       //   79: iconst_1
/*     */       //   80: isub
/*     */       //   81: istore #6
/*     */       //   83: iconst_m1
/*     */       //   84: iload #6
/*     */       //   86: if_icmpge -> 134
/*     */       //   89: aload_1
/*     */       //   90: iload #6
/*     */       //   92: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   97: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*     */       //   100: astore #7
/*     */       //   102: aload #7
/*     */       //   104: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   107: ifeq -> 128
/*     */       //   110: aload #4
/*     */       //   112: aload #7
/*     */       //   114: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   117: invokevirtual getKey : ()Ljava/lang/Object;
/*     */       //   120: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   123: pop
/*     */       //   124: iload #6
/*     */       //   126: istore #5
/*     */       //   128: iinc #6, -1
/*     */       //   131: goto -> 83
/*     */       //   134: aload_2
/*     */       //   135: iload #5
/*     */       //   137: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   140: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*     */       //   143: aload_2
/*     */       //   144: aload #4
/*     */       //   146: checkcast java/util/Set
/*     */       //   149: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*     */       //   152: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #24	-> 12
/*     */       //   #25	-> 29
/*     */       //   #25	-> 46
/*     */       //   #180	-> 55
/*     */       //   #25	-> 58
/*     */       //   #25	-> 71
/*     */       //   #25	-> 73
/*     */       //   #26	-> 75
/*     */       //   #27	-> 78
/*     */       //   #28	-> 89
/*     */       //   #29	-> 102
/*     */       //   #30	-> 110
/*     */       //   #31	-> 124
/*     */       //   #27	-> 128
/*     */       //   #34	-> 134
/*     */       //   #35	-> 143
/*     */       //   #36	-> 152
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   58	13	7	$i$a$-apply-SelectableColumnOnKeyEvent$onExtendSelectionToFirst$newSelection$1	I
/*     */       //   55	16	6	$this$onExtendSelectionToFirst_u24lambda_u240	Ljava/util/HashSet;
/*     */       //   102	26	7	key	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*     */       //   83	51	6	index	I
/*     */       //   29	124	3	initialIndex	I
/*     */       //   75	78	4	newSelection	Ljava/util/HashSet;
/*     */       //   78	75	5	lastActiveItemIndex	I
/*     */       //   0	153	0	$this	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;
/*     */       //   0	153	1	keys	Ljava/util/List;
/*     */       //   0	153	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static void onSelectLastItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List<SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) {
/*  40 */       Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); for (int index = CollectionsKt.getLastIndex(keys); -1 < index; index--) {
/*  41 */         SelectableLazyListKey key = keys.get(index);
/*  42 */         if (key instanceof SelectableLazyListKey.Selectable) {
/*  43 */           state.setSelectedKeys(SetsKt.setOf(((SelectableLazyListKey.Selectable)key).getKey()));
/*  44 */           state.setLastActiveItemIndex(Integer.valueOf(index));
/*     */           return;
/*     */         } 
/*     */       } 
/*     */     }
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
/*     */     public static void onExtendSelectionToLastItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'keys'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'state'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */       //   16: dup
/*     */       //   17: ifnull -> 26
/*     */       //   20: invokevirtual intValue : ()I
/*     */       //   23: goto -> 28
/*     */       //   26: pop
/*     */       //   27: return
/*     */       //   28: istore_3
/*     */       //   29: new java/util/HashSet
/*     */       //   32: dup
/*     */       //   33: aload_1
/*     */       //   34: invokeinterface size : ()I
/*     */       //   39: iload_3
/*     */       //   40: isub
/*     */       //   41: aload_2
/*     */       //   42: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   45: invokeinterface size : ()I
/*     */       //   50: invokestatic max : (II)I
/*     */       //   53: invokespecial <init> : (I)V
/*     */       //   56: astore #5
/*     */       //   58: aload #5
/*     */       //   60: astore #6
/*     */       //   62: iconst_0
/*     */       //   63: istore #7
/*     */       //   65: aload #6
/*     */       //   67: aload_2
/*     */       //   68: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   71: checkcast java/util/Collection
/*     */       //   74: invokevirtual addAll : (Ljava/util/Collection;)Z
/*     */       //   77: pop
/*     */       //   78: aload #5
/*     */       //   80: astore #4
/*     */       //   82: iload_3
/*     */       //   83: istore #5
/*     */       //   85: iload_3
/*     */       //   86: iconst_1
/*     */       //   87: iadd
/*     */       //   88: istore #6
/*     */       //   90: aload_1
/*     */       //   91: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */       //   94: istore #7
/*     */       //   96: iload #6
/*     */       //   98: iload #7
/*     */       //   100: if_icmpgt -> 155
/*     */       //   103: aload_1
/*     */       //   104: iload #6
/*     */       //   106: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   111: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*     */       //   114: astore #8
/*     */       //   116: aload #8
/*     */       //   118: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   121: ifeq -> 142
/*     */       //   124: aload #4
/*     */       //   126: aload #8
/*     */       //   128: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   131: invokevirtual getKey : ()Ljava/lang/Object;
/*     */       //   134: invokevirtual add : (Ljava/lang/Object;)Z
/*     */       //   137: pop
/*     */       //   138: iload #6
/*     */       //   140: istore #5
/*     */       //   142: iload #6
/*     */       //   144: iload #7
/*     */       //   146: if_icmpeq -> 155
/*     */       //   149: iinc #6, 1
/*     */       //   152: goto -> 103
/*     */       //   155: aload_2
/*     */       //   156: iload #5
/*     */       //   158: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   161: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*     */       //   164: aload_2
/*     */       //   165: aload #4
/*     */       //   167: checkcast java/util/Set
/*     */       //   170: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*     */       //   173: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #52	-> 12
/*     */       //   #54	-> 29
/*     */       //   #54	-> 53
/*     */       //   #180	-> 62
/*     */       //   #54	-> 65
/*     */       //   #54	-> 78
/*     */       //   #54	-> 80
/*     */       //   #53	-> 80
/*     */       //   #55	-> 82
/*     */       //   #56	-> 85
/*     */       //   #57	-> 103
/*     */       //   #58	-> 116
/*     */       //   #59	-> 124
/*     */       //   #60	-> 138
/*     */       //   #56	-> 142
/*     */       //   #63	-> 155
/*     */       //   #64	-> 164
/*     */       //   #65	-> 173
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   65	13	7	$i$a$-apply-SelectableColumnOnKeyEvent$onExtendSelectionToLastItem$newSelection$1	I
/*     */       //   62	16	6	$this$onExtendSelectionToLastItem_u24lambda_u241	Ljava/util/HashSet;
/*     */       //   116	26	8	key	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*     */       //   90	65	6	index	I
/*     */       //   29	145	3	initialIndex	I
/*     */       //   82	92	4	newSelection	Ljava/util/HashSet;
/*     */       //   85	89	5	lastActiveItemIndex	I
/*     */       //   0	174	0	$this	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;
/*     */       //   0	174	1	keys	Ljava/util/List;
/*     */       //   0	174	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     }
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
/*     */     public static void onSelectPreviousItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'keys'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'state'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */       //   16: dup
/*     */       //   17: ifnull -> 26
/*     */       //   20: invokevirtual intValue : ()I
/*     */       //   23: goto -> 28
/*     */       //   26: pop
/*     */       //   27: return
/*     */       //   28: istore_3
/*     */       //   29: iload_3
/*     */       //   30: iconst_1
/*     */       //   31: isub
/*     */       //   32: istore #4
/*     */       //   34: iconst_m1
/*     */       //   35: iload #4
/*     */       //   37: if_icmpge -> 92
/*     */       //   40: aload_1
/*     */       //   41: iload #4
/*     */       //   43: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   48: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*     */       //   51: astore #5
/*     */       //   53: aload #5
/*     */       //   55: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   58: ifeq -> 86
/*     */       //   61: aload_2
/*     */       //   62: aload #5
/*     */       //   64: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   67: invokevirtual getKey : ()Ljava/lang/Object;
/*     */       //   70: invokestatic setOf : (Ljava/lang/Object;)Ljava/util/Set;
/*     */       //   73: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*     */       //   76: aload_2
/*     */       //   77: iload #4
/*     */       //   79: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   82: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*     */       //   85: return
/*     */       //   86: iinc #4, -1
/*     */       //   89: goto -> 34
/*     */       //   92: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #69	-> 12
/*     */       //   #70	-> 29
/*     */       //   #71	-> 40
/*     */       //   #72	-> 53
/*     */       //   #73	-> 61
/*     */       //   #74	-> 76
/*     */       //   #75	-> 85
/*     */       //   #70	-> 86
/*     */       //   #78	-> 92
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   53	33	5	key	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*     */       //   34	58	4	index	I
/*     */       //   29	64	3	initialIndex	I
/*     */       //   0	93	0	$this	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;
/*     */       //   0	93	1	keys	Ljava/util/List;
/*     */       //   0	93	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     }
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
/*     */     public static void onExtendSelectionWithPreviousItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'keys'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'state'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */       //   16: dup
/*     */       //   17: ifnull -> 26
/*     */       //   20: invokevirtual intValue : ()I
/*     */       //   23: goto -> 28
/*     */       //   26: pop
/*     */       //   27: return
/*     */       //   28: istore_3
/*     */       //   29: iload_3
/*     */       //   30: iconst_1
/*     */       //   31: isub
/*     */       //   32: istore #4
/*     */       //   34: iconst_m1
/*     */       //   35: iload #4
/*     */       //   37: if_icmpge -> 96
/*     */       //   40: aload_1
/*     */       //   41: iload #4
/*     */       //   43: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   48: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*     */       //   51: astore #5
/*     */       //   53: aload #5
/*     */       //   55: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   58: ifeq -> 90
/*     */       //   61: aload_2
/*     */       //   62: aload_2
/*     */       //   63: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   66: aload #5
/*     */       //   68: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   71: invokevirtual getKey : ()Ljava/lang/Object;
/*     */       //   74: invokestatic plus : (Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
/*     */       //   77: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*     */       //   80: aload_2
/*     */       //   81: iload #4
/*     */       //   83: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   86: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*     */       //   89: return
/*     */       //   90: iinc #4, -1
/*     */       //   93: goto -> 34
/*     */       //   96: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #83	-> 12
/*     */       //   #84	-> 29
/*     */       //   #85	-> 40
/*     */       //   #86	-> 53
/*     */       //   #87	-> 61
/*     */       //   #88	-> 80
/*     */       //   #89	-> 89
/*     */       //   #84	-> 90
/*     */       //   #92	-> 96
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   53	37	5	key	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*     */       //   34	62	4	index	I
/*     */       //   29	68	3	initialIndex	I
/*     */       //   0	97	0	$this	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;
/*     */       //   0	97	1	keys	Ljava/util/List;
/*     */       //   0	97	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     }
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
/*     */     public static void onSelectNextItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'keys'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'state'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */       //   16: dup
/*     */       //   17: ifnull -> 26
/*     */       //   20: invokevirtual intValue : ()I
/*     */       //   23: goto -> 28
/*     */       //   26: pop
/*     */       //   27: return
/*     */       //   28: istore_3
/*     */       //   29: iload_3
/*     */       //   30: iconst_1
/*     */       //   31: iadd
/*     */       //   32: istore #4
/*     */       //   34: aload_1
/*     */       //   35: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */       //   38: istore #5
/*     */       //   40: iload #4
/*     */       //   42: iload #5
/*     */       //   44: if_icmpgt -> 106
/*     */       //   47: aload_1
/*     */       //   48: iload #4
/*     */       //   50: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   55: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*     */       //   58: astore #6
/*     */       //   60: aload #6
/*     */       //   62: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   65: ifeq -> 93
/*     */       //   68: aload_2
/*     */       //   69: aload #6
/*     */       //   71: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   74: invokevirtual getKey : ()Ljava/lang/Object;
/*     */       //   77: invokestatic setOf : (Ljava/lang/Object;)Ljava/util/Set;
/*     */       //   80: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*     */       //   83: aload_2
/*     */       //   84: iload #4
/*     */       //   86: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   89: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*     */       //   92: return
/*     */       //   93: iload #4
/*     */       //   95: iload #5
/*     */       //   97: if_icmpeq -> 106
/*     */       //   100: iinc #4, 1
/*     */       //   103: goto -> 47
/*     */       //   106: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #96	-> 12
/*     */       //   #97	-> 29
/*     */       //   #98	-> 47
/*     */       //   #99	-> 60
/*     */       //   #100	-> 68
/*     */       //   #101	-> 83
/*     */       //   #102	-> 92
/*     */       //   #97	-> 93
/*     */       //   #105	-> 106
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   60	33	6	key	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*     */       //   34	72	4	index	I
/*     */       //   29	78	3	initialIndex	I
/*     */       //   0	107	0	$this	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;
/*     */       //   0	107	1	keys	Ljava/util/List;
/*     */       //   0	107	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static void onExtendSelectionWithNextItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/*     */       // Byte code:
/*     */       //   0: aload_1
/*     */       //   1: ldc 'keys'
/*     */       //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   6: aload_2
/*     */       //   7: ldc 'state'
/*     */       //   9: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   12: aload_2
/*     */       //   13: invokevirtual getLastActiveItemIndex : ()Ljava/lang/Integer;
/*     */       //   16: dup
/*     */       //   17: ifnull -> 26
/*     */       //   20: invokevirtual intValue : ()I
/*     */       //   23: goto -> 28
/*     */       //   26: pop
/*     */       //   27: return
/*     */       //   28: istore_3
/*     */       //   29: iload_3
/*     */       //   30: iconst_1
/*     */       //   31: iadd
/*     */       //   32: istore #4
/*     */       //   34: aload_1
/*     */       //   35: invokestatic getLastIndex : (Ljava/util/List;)I
/*     */       //   38: istore #5
/*     */       //   40: iload #4
/*     */       //   42: iload #5
/*     */       //   44: if_icmpgt -> 110
/*     */       //   47: aload_1
/*     */       //   48: iload #4
/*     */       //   50: invokeinterface get : (I)Ljava/lang/Object;
/*     */       //   55: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey
/*     */       //   58: astore #6
/*     */       //   60: aload #6
/*     */       //   62: instanceof org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   65: ifeq -> 97
/*     */       //   68: aload_2
/*     */       //   69: aload_2
/*     */       //   70: invokevirtual getSelectedKeys : ()Ljava/util/Set;
/*     */       //   73: aload #6
/*     */       //   75: checkcast org/jetbrains/jewel/foundation/lazy/SelectableLazyListKey$Selectable
/*     */       //   78: invokevirtual getKey : ()Ljava/lang/Object;
/*     */       //   81: invokestatic plus : (Ljava/util/Set;Ljava/lang/Object;)Ljava/util/Set;
/*     */       //   84: invokevirtual setSelectedKeys : (Ljava/util/Set;)V
/*     */       //   87: aload_2
/*     */       //   88: iload #4
/*     */       //   90: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */       //   93: invokevirtual setLastActiveItemIndex : (Ljava/lang/Integer;)V
/*     */       //   96: return
/*     */       //   97: iload #4
/*     */       //   99: iload #5
/*     */       //   101: if_icmpeq -> 110
/*     */       //   104: iinc #4, 1
/*     */       //   107: goto -> 47
/*     */       //   110: return
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #110	-> 12
/*     */       //   #111	-> 29
/*     */       //   #112	-> 47
/*     */       //   #113	-> 60
/*     */       //   #114	-> 68
/*     */       //   #115	-> 87
/*     */       //   #116	-> 96
/*     */       //   #111	-> 97
/*     */       //   #119	-> 110
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   60	37	6	key	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListKey;
/*     */       //   34	76	4	index	I
/*     */       //   29	82	3	initialIndex	I
/*     */       //   0	111	0	$this	Lorg/jetbrains/jewel/foundation/lazy/SelectableColumnOnKeyEvent;
/*     */       //   0	111	1	keys	Ljava/util/List;
/*     */       //   0	111	2	state	Lorg/jetbrains/jewel/foundation/lazy/SelectableLazyListState;
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     public static void onScrollPageUpAndSelectItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List<SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) {
/* 123 */       Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); int visibleSize = state.getLayoutInfo().getVisibleItemsInfo().size();
/* 124 */       state.getLastActiveItemIndex(); int i = ((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0) - visibleSize; boolean bool = false; int targetIndex = Math.max(i, bool);
/* 125 */       state.setSelectedKeys(SetsKt.setOf(((SelectableLazyListKey)keys.get(targetIndex)).getKey()));
/* 126 */       state.setLastActiveItemIndex(Integer.valueOf(targetIndex));
/*     */     }
/*     */ 
/*     */     
/*     */     public static void onScrollPageUpAndExtendSelection(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) {
/* 131 */       Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); int visibleSize = state.getLayoutInfo().getVisibleItemsInfo().size();
/* 132 */       state.getLastActiveItemIndex(); int i = ((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0) - visibleSize; boolean bool = false; int targetIndex = Math.max(i, bool);
/*     */ 
/*     */       
/* 135 */       state.getLastActiveItemIndex();
/* 136 */       Iterable iterable1 = CollectionsKt.withIndex(keys.subList(targetIndex, (state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0));
/* 137 */       int $i$f$filter = 0;
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
/* 181 */       Iterable iterable2 = iterable1; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterTo = 0;
/* 182 */       for (Object element$iv$iv : iterable2) { IndexedValue indexedValue = (IndexedValue)element$iv$iv; int $i$a$-filter-SelectableColumnOnKeyEvent$onScrollPageUpAndExtendSelection$newSelectionList$1 = 0; if (indexedValue.getValue() instanceof SelectableLazyListKey.Selectable) destination$iv$iv.add(element$iv$iv);  }
/* 183 */        List<Object> it = (List)destination$iv$iv; int $i$a$-let-SelectableColumnOnKeyEvent$onScrollPageUpAndExtendSelection$newSelectionList$2 = 0; destination$iv$iv = it; Set<Object> set = state.getSelectedKeys(); int $i$f$map = 0;
/* 184 */       Collection<Object> collection1 = destination$iv$iv, collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(destination$iv$iv, 10)); int $i$f$mapTo = 0;
/* 185 */       for (Object item$iv$iv : collection1) {
/* 186 */         IndexedValue indexedValue = (IndexedValue)item$iv$iv; Collection<Object> collection = collection2; int $i$a$-map-SelectableColumnOnKeyEvent$onScrollPageUpAndExtendSelection$newSelectionList$2$1 = 0; collection.add(((SelectableLazyListKey)indexedValue.getValue()).getKey());
/* 187 */       }  Set<? extends Object> newSelectionList = SetsKt.plus(set, collection2); state.setSelectedKeys(newSelectionList); state.setLastActiveItemIndex(Integer.valueOf(targetIndex)); }
/* 188 */     public static void onScrollPageDownAndSelectItem(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List<SelectableLazyListKey> keys, @NotNull SelectableLazyListState state) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); int visibleSize = state.getLayoutInfo().getVisibleItemsInfo().size(); state.getLastActiveItemIndex(); int i = ((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0) + visibleSize, j = CollectionsKt.getLastIndex(keys), targetIndex = Math.min(i, j); state.setSelectedKeys(SetsKt.setOf(((SelectableLazyListKey)keys.get(targetIndex)).getKey())); state.setLastActiveItemIndex(Integer.valueOf(targetIndex)); } public static void onScrollPageDownAndExtendSelection(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); int visibleSize = state.getLayoutInfo().getVisibleItemsInfo().size(); state.getLastActiveItemIndex(); int i = ((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0) + visibleSize, j = CollectionsKt.getLastIndex(keys), targetIndex = Math.min(i, j); state.getLastActiveItemIndex(); Iterable $this$filterIsInstance$iv = keys.subList((state.getLastActiveItemIndex() != null) ? state.getLastActiveItemIndex().intValue() : 0, targetIndex); int $i$f$filterIsInstance = 0; Iterable iterable1 = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 197 */       for (Object element$iv$iv : iterable1) { if (element$iv$iv instanceof SelectableLazyListKey.Selectable) destination$iv$iv.add(element$iv$iv);  }
/* 198 */        List<Object> it = (List)destination$iv$iv; int $i$a$-let-SelectableColumnOnKeyEvent$onScrollPageDownAndExtendSelection$newSelectionList$1 = 0; destination$iv$iv = it; Set<Object> set = state.getSelectedKeys(); int $i$f$map = 0;
/* 199 */       Collection<Object> collection1 = destination$iv$iv, collection2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(destination$iv$iv, 10)); int $i$f$mapTo = 0;
/* 200 */       for (Object item$iv$iv : collection1) {
/* 201 */         SelectableLazyListKey.Selectable selectable = (SelectableLazyListKey.Selectable)item$iv$iv; Collection<Object> collection = collection2; int $i$a$-map-SelectableColumnOnKeyEvent$onScrollPageDownAndExtendSelection$newSelectionList$1$1 = 0; collection.add(selectable.getKey());
/* 202 */       }  Set<? extends Object> newSelectionList = SetsKt.plus(set, collection2); state.setSelectedKeys(newSelectionList); state.setLastActiveItemIndex(Integer.valueOf(targetIndex)); } public static void onEdit(@NotNull SelectableColumnOnKeyEvent $this) {} public static void onSelectAll(@NotNull SelectableColumnOnKeyEvent $this, @NotNull List keys, @NotNull SelectableLazyListState state) { Intrinsics.checkNotNullParameter(keys, "keys"); Intrinsics.checkNotNullParameter(state, "state"); List list1 = keys; SelectableLazyListState selectableLazyListState = state; int $i$f$filterIsInstance = 0;
/* 203 */       List list2 = list1; Collection<Object> collection1 = new ArrayList(); int $i$f$filterIsInstanceTo = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 212 */       for (Object element$iv$iv : list2) { if (element$iv$iv instanceof SelectableLazyListKey.Selectable) collection1.add(element$iv$iv);  }
/* 213 */        Iterable $this$filterIsInstance$iv = collection1; selectableLazyListState = selectableLazyListState; int $i$f$map = 0;
/* 214 */       Iterable $this$filterIsInstanceTo$iv$iv = $this$filterIsInstance$iv; Collection<Object> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filterIsInstance$iv, 10)); int $i$f$mapTo = 0;
/* 215 */       for (Object item$iv$iv : $this$filterIsInstanceTo$iv$iv) {
/* 216 */         SelectableLazyListKey.Selectable selectable = (SelectableLazyListKey.Selectable)item$iv$iv; Collection<Object> collection = destination$iv$iv; int $i$a$-map-SelectableColumnOnKeyEvent$onSelectAll$1 = 0; collection.add(selectable.getKey());
/* 217 */       }  selectableLazyListState.setSelectedKeys(CollectionsKt.toSet(destination$iv$iv)); }
/*     */      }
/*     */    }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-foundation-243-0.27.0.jar!\org\jetbrains\jewel\foundation\lazy\SelectableColumnOnKeyEvent.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */