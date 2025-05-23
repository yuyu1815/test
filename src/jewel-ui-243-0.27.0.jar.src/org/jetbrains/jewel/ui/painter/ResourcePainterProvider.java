/*     */ package org.jetbrains.jewel.ui.painter;
/*     */ @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000|\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\000\n\002\020\021\n\002\030\002\n\002\b\003\n\002\030\002\n\002\020\"\n\000\n\002\030\002\n\002\020\b\n\002\030\002\n\000\n\002\020 \n\000\n\002\030\002\n\002\b\003\n\002\020\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001:\0015B#\022\006\020\002\032\0020\003\022\022\020\004\032\n\022\006\b\001\022\0020\0060\005\"\0020\006¢\006\004\b\007\020\bJ\024\020\026\032\0020\027*\0020\0302\006\020\031\032\0020\032H\002J'\020\033\032\b\022\004\022\0020\0170\0342\022\020\035\032\n\022\006\b\001\022\0020\0320\005\"\0020\032H\027¢\006\002\020\036J\025\020\037\032\0020\0172\006\020 \032\0020\030H\003¢\006\002\020!J\036\020\"\032\020\022\004\022\0020\030\022\004\022\0020$\030\0010#2\006\020 \032\0020\030H\002J\035\020%\032\0020\0172\006\020 \032\0020\0302\006\020&\032\0020$H\003¢\006\002\020'J&\020(\032\0020)2\006\020 \032\0020\0302\006\020*\032\0020)2\f\020\035\032\b\022\004\022\0020\0320\021H\002J\035\020+\032\0020\0172\006\020 \032\0020\0302\006\020&\032\0020$H\003¢\006\002\020'J\025\020,\032\0020\0172\006\020&\032\0020$H\003¢\006\002\020-JH\020.\032\0020\017\"\004\b\000\020/2\006\020&\032\0020$2\022\0200\032\016\022\004\022\0020$\022\004\022\002H/012\027\0202\032\023\022\004\022\002H/\022\004\022\0020\01701¢\006\002\b3H\003¢\006\002\0204R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\t\032\0020\nX\004¢\006\002\n\000R\024\020\004\032\b\022\004\022\0020\0060\013X\004¢\006\002\n\000R\032\020\f\032\016\022\004\022\0020\016\022\004\022\0020\0170\rX\004¢\006\002\n\000R\024\020\020\032\b\022\004\022\0020\0060\021X\004¢\006\002\n\000R\030\020\022\032\n \024*\004\030\0010\0230\023X\004¢\006\004\n\002\020\025¨\0066"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;", "Lorg/jetbrains/jewel/ui/painter/PainterProvider;", "basePath", "", "classLoaders", "", "Ljava/lang/ClassLoader;", "<init>", "(Ljava/lang/String;[Ljava/lang/ClassLoader;)V", "logger", "Lorg/jetbrains/jewel/foundation/util/JewelLogger;", "", "cache", "Ljava/util/concurrent/ConcurrentHashMap;", "", "Landroidx/compose/ui/graphics/painter/Painter;", "contextClassLoaders", "", "documentBuilderFactory", "Ljavax/xml/parsers/DocumentBuilderFactory;", "kotlin.jvm.PlatformType", "Ljavax/xml/parsers/DocumentBuilderFactory;", "resolveHint", "", "Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;", "hint", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "getPainter", "Landroidx/compose/runtime/State;", "hints", "([Lorg/jetbrains/jewel/ui/painter/PainterHint;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;", "loadPainter", "scope", "(Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "resolveResource", "Lkotlin/Pair;", "Ljava/net/URL;", "createSvgPainter", "url", "(Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Ljava/net/URL;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "patchSvg", "Ljava/io/InputStream;", "inputStream", "createVectorDrawablePainter", "createBitmapPainter", "(Ljava/net/URL;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "tryLoadingResource", "T", "loadingAction", "Lkotlin/Function1;", "paintAction", "Landroidx/compose/runtime/Composable;", "(Ljava/net/URL;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "Scope", "ui"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nResourcePainterProvider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ResourcePainterProvider.kt\norg/jetbrains/jewel/ui/painter/ResourcePainterProvider\n+ 2 JewelLogger.kt\norg/jetbrains/jewel/foundation/util/JewelLoggerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 7 MapsJVM.kt\nkotlin/collections/MapsKt__MapsJVMKt\n+ 8 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,274:1\n9#2:275\n1#3:276\n1#3:288\n77#4:277\n77#4:278\n77#4:285\n1855#5,2:279\n1855#5,2:283\n1360#5:289\n1446#5,5:290\n1726#5,3:301\n1855#5,2:304\n13309#6,2:281\n72#7,2:286\n1225#8,6:295\n1225#8,6:306\n1225#8,6:312\n*S KotlinDebug\n*F\n+ 1 ResourcePainterProvider.kt\norg/jetbrains/jewel/ui/painter/ResourcePainterProvider\n*L\n47#1:275\n85#1:288\n68#1:277\n71#1:278\n78#1:285\n72#1:279,2\n76#1:283,2\n99#1:289\n99#1:290,5\n155#1:301,3\n163#1:304,2\n74#1:281,2\n85#1:286,2\n145#1:295,6\n180#1:306,6\n191#1:312,6\n*E\n"})
/*     */ public final class ResourcePainterProvider implements PainterProvider { @NotNull
/*     */   private final String basePath; @NotNull
/*     */   private final JewelLogger logger; @NotNull
/*     */   private final Set<ClassLoader> classLoaders;
/*     */   @NotNull
/*     */   private final ConcurrentHashMap<Integer, Painter> cache;
/*     */   @NotNull
/*     */   private final List<ClassLoader> contextClassLoaders;
/*     */   private final DocumentBuilderFactory documentBuilderFactory;
/*     */   public static final int $stable = 8;
/*     */   
/*     */   private final void resolveHint(Scope $this$resolveHint, PainterHint hint) {
/*     */     PainterHint $this$resolveHint_u24lambda_u241 = hint;
/*     */     int $i$a$-with-ResourcePainterProvider$resolveHint$1 = 0;
/*     */     if ($this$resolveHint_u24lambda_u241.canApply($this$resolveHint))
/*     */       $this$resolveHint.getAcceptedHints().add(hint); 
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public State<Painter> getPainter(@NotNull PainterHint[] hints, @Nullable Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'hints'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc -1146828077
/*     */     //   9: invokeinterface startReplaceGroup : (I)V
/*     */     //   14: invokestatic isTraceInProgress : ()Z
/*     */     //   17: ifeq -> 29
/*     */     //   20: ldc -1146828077
/*     */     //   22: iload_3
/*     */     //   23: iconst_m1
/*     */     //   24: ldc 'org.jetbrains.jewel.ui.painter.ResourcePainterProvider.getPainter (ResourcePainterProvider.kt:66)'
/*     */     //   26: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   29: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   32: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   35: astore #5
/*     */     //   37: iconst_0
/*     */     //   38: istore #6
/*     */     //   40: iconst_0
/*     */     //   41: istore #7
/*     */     //   43: aload_2
/*     */     //   44: ldc 2023513938
/*     */     //   46: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   48: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   51: aload_2
/*     */     //   52: aload #5
/*     */     //   54: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   59: astore #8
/*     */     //   61: aload_2
/*     */     //   62: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   65: aload #8
/*     */     //   67: checkcast androidx/compose/ui/unit/Density
/*     */     //   70: astore #4
/*     */     //   72: new org/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope
/*     */     //   75: dup
/*     */     //   76: aload #4
/*     */     //   78: aload_0
/*     */     //   79: getfield basePath : Ljava/lang/String;
/*     */     //   82: aload_0
/*     */     //   83: getfield classLoaders : Ljava/util/Set;
/*     */     //   86: aconst_null
/*     */     //   87: aconst_null
/*     */     //   88: bipush #24
/*     */     //   90: aconst_null
/*     */     //   91: invokespecial <init> : (Landroidx/compose/ui/unit/Density;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   94: astore #5
/*     */     //   96: invokestatic getLocalPainterHintsProvider : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   99: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   102: astore #7
/*     */     //   104: bipush #6
/*     */     //   106: istore #8
/*     */     //   108: iconst_0
/*     */     //   109: istore #9
/*     */     //   111: aload_2
/*     */     //   112: ldc 2023513938
/*     */     //   114: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   116: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   119: aload_2
/*     */     //   120: aload #7
/*     */     //   122: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   127: astore #10
/*     */     //   129: aload_2
/*     */     //   130: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   133: aload #10
/*     */     //   135: checkcast org/jetbrains/jewel/ui/painter/PainterHintsProvider
/*     */     //   138: astore #6
/*     */     //   140: aload #6
/*     */     //   142: aload_0
/*     */     //   143: getfield basePath : Ljava/lang/String;
/*     */     //   146: aload_2
/*     */     //   147: iconst_0
/*     */     //   148: invokeinterface priorityHints : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
/*     */     //   153: checkcast java/lang/Iterable
/*     */     //   156: astore #7
/*     */     //   158: iconst_0
/*     */     //   159: istore #8
/*     */     //   161: aload #7
/*     */     //   163: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   168: astore #9
/*     */     //   170: aload #9
/*     */     //   172: invokeinterface hasNext : ()Z
/*     */     //   177: ifeq -> 211
/*     */     //   180: aload #9
/*     */     //   182: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   187: astore #10
/*     */     //   189: aload #10
/*     */     //   191: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   194: astore #11
/*     */     //   196: iconst_0
/*     */     //   197: istore #12
/*     */     //   199: aload_0
/*     */     //   200: aload #5
/*     */     //   202: aload #11
/*     */     //   204: invokespecial resolveHint : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Lorg/jetbrains/jewel/ui/painter/PainterHint;)V
/*     */     //   207: nop
/*     */     //   208: goto -> 170
/*     */     //   211: nop
/*     */     //   212: aload_1
/*     */     //   213: astore #7
/*     */     //   215: iconst_0
/*     */     //   216: istore #8
/*     */     //   218: iconst_0
/*     */     //   219: istore #9
/*     */     //   221: aload #7
/*     */     //   223: arraylength
/*     */     //   224: istore #10
/*     */     //   226: iload #9
/*     */     //   228: iload #10
/*     */     //   230: if_icmpge -> 262
/*     */     //   233: aload #7
/*     */     //   235: iload #9
/*     */     //   237: aaload
/*     */     //   238: astore #11
/*     */     //   240: aload #11
/*     */     //   242: astore #12
/*     */     //   244: iconst_0
/*     */     //   245: istore #13
/*     */     //   247: aload_0
/*     */     //   248: aload #5
/*     */     //   250: aload #12
/*     */     //   252: invokespecial resolveHint : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Lorg/jetbrains/jewel/ui/painter/PainterHint;)V
/*     */     //   255: nop
/*     */     //   256: iinc #9, 1
/*     */     //   259: goto -> 226
/*     */     //   262: nop
/*     */     //   263: aload #6
/*     */     //   265: aload_0
/*     */     //   266: getfield basePath : Ljava/lang/String;
/*     */     //   269: aload_2
/*     */     //   270: iconst_0
/*     */     //   271: invokeinterface hints : (Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
/*     */     //   276: checkcast java/lang/Iterable
/*     */     //   279: astore #7
/*     */     //   281: iconst_0
/*     */     //   282: istore #8
/*     */     //   284: aload #7
/*     */     //   286: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   291: astore #9
/*     */     //   293: aload #9
/*     */     //   295: invokeinterface hasNext : ()Z
/*     */     //   300: ifeq -> 334
/*     */     //   303: aload #9
/*     */     //   305: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   310: astore #10
/*     */     //   312: aload #10
/*     */     //   314: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   317: astore #11
/*     */     //   319: iconst_0
/*     */     //   320: istore #12
/*     */     //   322: aload_0
/*     */     //   323: aload #5
/*     */     //   325: aload #11
/*     */     //   327: invokespecial resolveHint : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Lorg/jetbrains/jewel/ui/painter/PainterHint;)V
/*     */     //   330: nop
/*     */     //   331: goto -> 293
/*     */     //   334: nop
/*     */     //   335: aload #5
/*     */     //   337: invokevirtual getAcceptedHints : ()Ljava/util/List;
/*     */     //   340: invokevirtual hashCode : ()I
/*     */     //   343: bipush #31
/*     */     //   345: imul
/*     */     //   346: invokestatic getLocalDensity : ()Landroidx/compose/runtime/ProvidableCompositionLocal;
/*     */     //   349: checkcast androidx/compose/runtime/CompositionLocal
/*     */     //   352: astore #8
/*     */     //   354: iconst_0
/*     */     //   355: istore #9
/*     */     //   357: iconst_0
/*     */     //   358: istore #10
/*     */     //   360: aload_2
/*     */     //   361: ldc 2023513938
/*     */     //   363: ldc 'CC:CompositionLocal.kt#9igjgp'
/*     */     //   365: invokestatic sourceInformationMarkerStart : (Landroidx/compose/runtime/Composer;ILjava/lang/String;)V
/*     */     //   368: aload_2
/*     */     //   369: aload #8
/*     */     //   371: invokeinterface consume : (Landroidx/compose/runtime/CompositionLocal;)Ljava/lang/Object;
/*     */     //   376: astore #11
/*     */     //   378: aload_2
/*     */     //   379: invokestatic sourceInformationMarkerEnd : (Landroidx/compose/runtime/Composer;)V
/*     */     //   382: aload #11
/*     */     //   384: invokevirtual hashCode : ()I
/*     */     //   387: iadd
/*     */     //   388: istore #7
/*     */     //   390: aload_0
/*     */     //   391: getfield cache : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   394: iload #7
/*     */     //   396: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   399: invokevirtual get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   402: ifnull -> 441
/*     */     //   405: aload_0
/*     */     //   406: getfield logger : Lorg/jetbrains/jewel/foundation/util/JewelLogger;
/*     */     //   409: aload_0
/*     */     //   410: getfield basePath : Ljava/lang/String;
/*     */     //   413: aload #5
/*     */     //   415: invokevirtual getAcceptedHints : ()Ljava/util/List;
/*     */     //   418: checkcast java/lang/Iterable
/*     */     //   421: aconst_null
/*     */     //   422: aconst_null
/*     */     //   423: aconst_null
/*     */     //   424: iconst_0
/*     */     //   425: aconst_null
/*     */     //   426: aconst_null
/*     */     //   427: bipush #63
/*     */     //   429: aconst_null
/*     */     //   430: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   433: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   438: invokevirtual trace : (Ljava/lang/String;)V
/*     */     //   441: aload_2
/*     */     //   442: ldc 2118716379
/*     */     //   444: invokeinterface startReplaceGroup : (I)V
/*     */     //   449: aload_0
/*     */     //   450: getfield cache : Ljava/util/concurrent/ConcurrentHashMap;
/*     */     //   453: checkcast java/util/concurrent/ConcurrentMap
/*     */     //   456: astore #10
/*     */     //   458: iload #7
/*     */     //   460: invokestatic valueOf : (I)Ljava/lang/Integer;
/*     */     //   463: astore #11
/*     */     //   465: iconst_0
/*     */     //   466: istore #12
/*     */     //   468: aload #10
/*     */     //   470: aload #11
/*     */     //   472: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   477: dup
/*     */     //   478: ifnonnull -> 556
/*     */     //   481: pop
/*     */     //   482: iconst_0
/*     */     //   483: istore #13
/*     */     //   485: aload_0
/*     */     //   486: getfield logger : Lorg/jetbrains/jewel/foundation/util/JewelLogger;
/*     */     //   489: aload_0
/*     */     //   490: getfield basePath : Ljava/lang/String;
/*     */     //   493: aload #5
/*     */     //   495: invokevirtual getAcceptedHints : ()Ljava/util/List;
/*     */     //   498: checkcast java/lang/Iterable
/*     */     //   501: aconst_null
/*     */     //   502: aconst_null
/*     */     //   503: aconst_null
/*     */     //   504: iconst_0
/*     */     //   505: aconst_null
/*     */     //   506: aconst_null
/*     */     //   507: bipush #63
/*     */     //   509: aconst_null
/*     */     //   510: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   513: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   518: invokevirtual trace : (Ljava/lang/String;)V
/*     */     //   521: aload_0
/*     */     //   522: aload #5
/*     */     //   524: aload_2
/*     */     //   525: bipush #112
/*     */     //   527: iload_3
/*     */     //   528: iand
/*     */     //   529: invokespecial loadPainter : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   532: astore #14
/*     */     //   534: iconst_0
/*     */     //   535: istore #15
/*     */     //   537: aload #10
/*     */     //   539: aload #11
/*     */     //   541: aload #14
/*     */     //   543: invokeinterface putIfAbsent : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   548: dup
/*     */     //   549: ifnonnull -> 555
/*     */     //   552: pop
/*     */     //   553: aload #14
/*     */     //   555: nop
/*     */     //   556: nop
/*     */     //   557: checkcast androidx/compose/ui/graphics/painter/Painter
/*     */     //   560: astore #9
/*     */     //   562: aload_2
/*     */     //   563: invokeinterface endReplaceGroup : ()V
/*     */     //   568: aload #9
/*     */     //   570: astore #8
/*     */     //   572: aload #8
/*     */     //   574: aload_2
/*     */     //   575: iconst_0
/*     */     //   576: invokestatic rememberUpdatedState : (Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Landroidx/compose/runtime/State;
/*     */     //   579: astore #9
/*     */     //   581: invokestatic isTraceInProgress : ()Z
/*     */     //   584: ifeq -> 590
/*     */     //   587: invokestatic traceEventEnd : ()V
/*     */     //   590: aload_2
/*     */     //   591: invokeinterface endReplaceGroup : ()V
/*     */     //   596: aload #9
/*     */     //   598: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #67	-> 26
/*     */     //   #68	-> 29
/*     */     //   #277	-> 48
/*     */     //   #68	-> 67
/*     */     //   #69	-> 72
/*     */     //   #71	-> 96
/*     */     //   #278	-> 116
/*     */     //   #71	-> 135
/*     */     //   #72	-> 140
/*     */     //   #279	-> 161
/*     */     //   #72	-> 199
/*     */     //   #279	-> 207
/*     */     //   #280	-> 211
/*     */     //   #74	-> 212
/*     */     //   #281	-> 218
/*     */     //   #74	-> 247
/*     */     //   #281	-> 255
/*     */     //   #282	-> 262
/*     */     //   #76	-> 263
/*     */     //   #283	-> 284
/*     */     //   #76	-> 322
/*     */     //   #283	-> 330
/*     */     //   #284	-> 334
/*     */     //   #78	-> 335
/*     */     //   #285	-> 365
/*     */     //   #78	-> 384
/*     */     //   #80	-> 390
/*     */     //   #81	-> 405
/*     */     //   #85	-> 449
/*     */     //   #286	-> 468
/*     */     //   #287	-> 482
/*     */     //   #86	-> 485
/*     */     //   #87	-> 521
/*     */     //   #287	-> 532
/*     */     //   #288	-> 534
/*     */     //   #287	-> 537
/*     */     //   #287	-> 555
/*     */     //   #286	-> 556
/*     */     //   #85	-> 557
/*     */     //   #84	-> 570
/*     */     //   #90	-> 572
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   43	24	7	$i$f$getCurrent	I
/*     */     //   40	27	5	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   40	27	6	$changed$iv	I
/*     */     //   111	24	9	$i$f$getCurrent	I
/*     */     //   108	27	7	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   108	27	8	$changed$iv	I
/*     */     //   199	8	12	$i$a$-forEach-ResourcePainterProvider$getPainter$1	I
/*     */     //   196	11	11	it	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   189	19	10	element$iv	Ljava/lang/Object;
/*     */     //   161	51	8	$i$f$forEach	I
/*     */     //   158	54	7	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   247	8	13	$i$a$-forEach-ResourcePainterProvider$getPainter$2	I
/*     */     //   244	11	12	it	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   240	16	11	element$iv	Ljava/lang/Object;
/*     */     //   218	45	8	$i$f$forEach	I
/*     */     //   215	48	7	$this$forEach$iv	[Ljava/lang/Object;
/*     */     //   322	8	12	$i$a$-forEach-ResourcePainterProvider$getPainter$3	I
/*     */     //   319	11	11	it	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   312	19	10	element$iv	Ljava/lang/Object;
/*     */     //   284	51	8	$i$f$forEach	I
/*     */     //   281	54	7	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   360	24	10	$i$f$getCurrent	I
/*     */     //   357	27	8	this_$iv	Landroidx/compose/runtime/CompositionLocal;
/*     */     //   357	27	9	$changed$iv	I
/*     */     //   485	47	13	$i$a$-getOrPut-ResourcePainterProvider$getPainter$painter$1	I
/*     */     //   537	18	15	$i$a$-let-MapsKt__MapsJVMKt$getOrPut$1$iv	I
/*     */     //   534	21	14	default$iv	Ljava/lang/Object;
/*     */     //   468	89	12	$i$f$getOrPut	I
/*     */     //   465	92	10	$this$getOrPut$iv	Ljava/util/concurrent/ConcurrentMap;
/*     */     //   465	92	11	key$iv	Ljava/lang/Object;
/*     */     //   72	527	4	density	Landroidx/compose/ui/unit/Density;
/*     */     //   96	503	5	scope	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   140	459	6	currentHintsProvider	Lorg/jetbrains/jewel/ui/painter/PainterHintsProvider;
/*     */     //   390	209	7	cacheKey	I
/*     */     //   572	27	8	painter	Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   0	599	0	this	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;
/*     */     //   0	599	1	hints	[Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   0	599	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	599	3	$changed	I
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private final Painter loadPainter(Scope scope, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w 2056400810
/*     */     //   4: invokeinterface startReplaceGroup : (I)V
/*     */     //   9: invokestatic isTraceInProgress : ()Z
/*     */     //   12: ifeq -> 26
/*     */     //   15: ldc_w 2056400810
/*     */     //   18: iload_3
/*     */     //   19: iconst_m1
/*     */     //   20: ldc_w 'org.jetbrains.jewel.ui.painter.ResourcePainterProvider.loadPainter (ResourcePainterProvider.kt:93)'
/*     */     //   23: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   26: aload_1
/*     */     //   27: invokestatic listOf : (Ljava/lang/Object;)Ljava/util/List;
/*     */     //   30: astore #4
/*     */     //   32: aload_1
/*     */     //   33: invokevirtual getAcceptedHints : ()Ljava/util/List;
/*     */     //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   41: astore #5
/*     */     //   43: aload #5
/*     */     //   45: invokeinterface hasNext : ()Z
/*     */     //   50: ifeq -> 198
/*     */     //   53: aload #5
/*     */     //   55: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   60: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   63: astore #6
/*     */     //   65: aload #6
/*     */     //   67: instanceof org/jetbrains/jewel/ui/painter/PainterPathHint
/*     */     //   70: ifeq -> 43
/*     */     //   73: aload #4
/*     */     //   75: checkcast java/lang/Iterable
/*     */     //   78: astore #7
/*     */     //   80: iconst_0
/*     */     //   81: istore #8
/*     */     //   83: aload #7
/*     */     //   85: astore #9
/*     */     //   87: new java/util/ArrayList
/*     */     //   90: dup
/*     */     //   91: invokespecial <init> : ()V
/*     */     //   94: checkcast java/util/Collection
/*     */     //   97: astore #10
/*     */     //   99: iconst_0
/*     */     //   100: istore #11
/*     */     //   102: aload #9
/*     */     //   104: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   109: astore #12
/*     */     //   111: aload #12
/*     */     //   113: invokeinterface hasNext : ()Z
/*     */     //   118: ifeq -> 187
/*     */     //   121: aload #12
/*     */     //   123: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   128: astore #13
/*     */     //   130: aload #13
/*     */     //   132: checkcast org/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope
/*     */     //   135: astore #14
/*     */     //   137: iconst_0
/*     */     //   138: istore #15
/*     */     //   140: iconst_2
/*     */     //   141: anewarray org/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope
/*     */     //   144: astore #16
/*     */     //   146: aload #16
/*     */     //   148: iconst_0
/*     */     //   149: aload #14
/*     */     //   151: aload #6
/*     */     //   153: checkcast org/jetbrains/jewel/ui/painter/PainterPathHint
/*     */     //   156: invokevirtual apply : (Lorg/jetbrains/jewel/ui/painter/PainterPathHint;)Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   159: aastore
/*     */     //   160: aload #16
/*     */     //   162: iconst_1
/*     */     //   163: aload #14
/*     */     //   165: aastore
/*     */     //   166: aload #16
/*     */     //   168: invokestatic listOfNotNull : ([Ljava/lang/Object;)Ljava/util/List;
/*     */     //   171: checkcast java/lang/Iterable
/*     */     //   174: astore #14
/*     */     //   176: aload #10
/*     */     //   178: aload #14
/*     */     //   180: invokestatic addAll : (Ljava/util/Collection;Ljava/lang/Iterable;)Z
/*     */     //   183: pop
/*     */     //   184: goto -> 111
/*     */     //   187: aload #10
/*     */     //   189: checkcast java/util/List
/*     */     //   192: nop
/*     */     //   193: astore #4
/*     */     //   195: goto -> 43
/*     */     //   198: aload #4
/*     */     //   200: checkcast java/lang/Iterable
/*     */     //   203: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   208: astore #8
/*     */     //   210: aload #8
/*     */     //   212: invokeinterface hasNext : ()Z
/*     */     //   217: ifeq -> 253
/*     */     //   220: aload #8
/*     */     //   222: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   227: checkcast org/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope
/*     */     //   230: astore #9
/*     */     //   232: iconst_0
/*     */     //   233: istore #10
/*     */     //   235: aload_0
/*     */     //   236: aload #9
/*     */     //   238: invokespecial resolveResource : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;)Lkotlin/Pair;
/*     */     //   241: astore #9
/*     */     //   243: aload #9
/*     */     //   245: ifnull -> 210
/*     */     //   248: aload #9
/*     */     //   250: goto -> 254
/*     */     //   253: aconst_null
/*     */     //   254: dup
/*     */     //   255: ifnonnull -> 331
/*     */     //   258: pop
/*     */     //   259: aload_0
/*     */     //   260: checkcast org/jetbrains/jewel/ui/painter/ResourcePainterProvider
/*     */     //   263: astore #8
/*     */     //   265: iconst_0
/*     */     //   266: istore #9
/*     */     //   268: aload #8
/*     */     //   270: getfield logger : Lorg/jetbrains/jewel/foundation/util/JewelLogger;
/*     */     //   273: aload #8
/*     */     //   275: getfield basePath : Ljava/lang/String;
/*     */     //   278: aload_1
/*     */     //   279: invokevirtual getAcceptedHints : ()Ljava/util/List;
/*     */     //   282: checkcast java/lang/Iterable
/*     */     //   285: aconst_null
/*     */     //   286: aconst_null
/*     */     //   287: aconst_null
/*     */     //   288: iconst_0
/*     */     //   289: aconst_null
/*     */     //   290: aconst_null
/*     */     //   291: bipush #63
/*     */     //   293: aconst_null
/*     */     //   294: invokestatic joinToString$default : (Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   297: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   302: invokevirtual error : (Ljava/lang/String;)V
/*     */     //   305: invokestatic access$getErrorPainter$p : ()Landroidx/compose/ui/graphics/painter/ColorPainter;
/*     */     //   308: astore #10
/*     */     //   310: invokestatic isTraceInProgress : ()Z
/*     */     //   313: ifeq -> 319
/*     */     //   316: invokestatic traceEventEnd : ()V
/*     */     //   319: aload_2
/*     */     //   320: invokeinterface endReplaceGroup : ()V
/*     */     //   325: aload #10
/*     */     //   327: checkcast androidx/compose/ui/graphics/painter/Painter
/*     */     //   330: areturn
/*     */     //   331: astore #5
/*     */     //   333: aload #5
/*     */     //   335: invokevirtual component1 : ()Ljava/lang/Object;
/*     */     //   338: checkcast org/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope
/*     */     //   341: astore #6
/*     */     //   343: aload #5
/*     */     //   345: invokevirtual component2 : ()Ljava/lang/Object;
/*     */     //   348: checkcast java/net/URL
/*     */     //   351: astore #7
/*     */     //   353: aload_0
/*     */     //   354: getfield basePath : Ljava/lang/String;
/*     */     //   357: ldc_w '.'
/*     */     //   360: aconst_null
/*     */     //   361: iconst_2
/*     */     //   362: aconst_null
/*     */     //   363: invokestatic substringAfterLast$default : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Ljava/lang/String;
/*     */     //   366: getstatic java/util/Locale.ROOT : Ljava/util/Locale;
/*     */     //   369: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
/*     */     //   372: dup
/*     */     //   373: ldc_w 'toLowerCase(...)'
/*     */     //   376: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   379: astore #8
/*     */     //   381: aconst_null
/*     */     //   382: astore #9
/*     */     //   384: aload #8
/*     */     //   386: astore #10
/*     */     //   388: aload #10
/*     */     //   390: ldc_w 'svg'
/*     */     //   393: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   396: ifeq -> 437
/*     */     //   399: aload_2
/*     */     //   400: ldc_w 527008855
/*     */     //   403: invokeinterface startReplaceGroup : (I)V
/*     */     //   408: aload_0
/*     */     //   409: aload #6
/*     */     //   411: aload #7
/*     */     //   413: aload_2
/*     */     //   414: sipush #896
/*     */     //   417: iload_3
/*     */     //   418: iconst_3
/*     */     //   419: ishl
/*     */     //   420: iand
/*     */     //   421: invokespecial createSvgPainter : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Ljava/net/URL;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   424: astore #11
/*     */     //   426: aload_2
/*     */     //   427: invokeinterface endReplaceGroup : ()V
/*     */     //   432: aload #11
/*     */     //   434: goto -> 516
/*     */     //   437: aload #10
/*     */     //   439: ldc_w 'xml'
/*     */     //   442: invokestatic areEqual : (Ljava/lang/Object;Ljava/lang/Object;)Z
/*     */     //   445: ifeq -> 486
/*     */     //   448: aload_2
/*     */     //   449: ldc_w 527010786
/*     */     //   452: invokeinterface startReplaceGroup : (I)V
/*     */     //   457: aload_0
/*     */     //   458: aload #6
/*     */     //   460: aload #7
/*     */     //   462: aload_2
/*     */     //   463: sipush #896
/*     */     //   466: iload_3
/*     */     //   467: iconst_3
/*     */     //   468: ishl
/*     */     //   469: iand
/*     */     //   470: invokespecial createVectorDrawablePainter : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Ljava/net/URL;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   473: astore #11
/*     */     //   475: aload_2
/*     */     //   476: invokeinterface endReplaceGroup : ()V
/*     */     //   481: aload #11
/*     */     //   483: goto -> 516
/*     */     //   486: aload_2
/*     */     //   487: ldc_w 527013005
/*     */     //   490: invokeinterface startReplaceGroup : (I)V
/*     */     //   495: aload_0
/*     */     //   496: aload #7
/*     */     //   498: aload_2
/*     */     //   499: bipush #112
/*     */     //   501: iload_3
/*     */     //   502: iand
/*     */     //   503: invokespecial createBitmapPainter : (Ljava/net/URL;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   506: astore #11
/*     */     //   508: aload_2
/*     */     //   509: invokeinterface endReplaceGroup : ()V
/*     */     //   514: aload #11
/*     */     //   516: astore #9
/*     */     //   518: aload_1
/*     */     //   519: invokevirtual getAcceptedHints : ()Ljava/util/List;
/*     */     //   522: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   527: astore #10
/*     */     //   529: aload #10
/*     */     //   531: invokeinterface hasNext : ()Z
/*     */     //   536: ifeq -> 589
/*     */     //   539: aload #10
/*     */     //   541: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   546: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   549: astore #11
/*     */     //   551: aload #11
/*     */     //   553: instanceof org/jetbrains/jewel/ui/painter/PainterWrapperHint
/*     */     //   556: ifeq -> 529
/*     */     //   559: aload #11
/*     */     //   561: checkcast org/jetbrains/jewel/ui/painter/PainterWrapperHint
/*     */     //   564: astore #13
/*     */     //   566: iconst_0
/*     */     //   567: istore #14
/*     */     //   569: aload #13
/*     */     //   571: aload #6
/*     */     //   573: checkcast org/jetbrains/jewel/ui/painter/PainterProviderScope
/*     */     //   576: aload #9
/*     */     //   578: invokeinterface wrap : (Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;Landroidx/compose/ui/graphics/painter/Painter;)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   583: astore #9
/*     */     //   585: nop
/*     */     //   586: goto -> 529
/*     */     //   589: aload #9
/*     */     //   591: astore #10
/*     */     //   593: invokestatic isTraceInProgress : ()Z
/*     */     //   596: ifeq -> 602
/*     */     //   599: invokestatic traceEventEnd : ()V
/*     */     //   602: aload_2
/*     */     //   603: invokeinterface endReplaceGroup : ()V
/*     */     //   608: aload #10
/*     */     //   610: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #94	-> 23
/*     */     //   #95	-> 26
/*     */     //   #97	-> 32
/*     */     //   #98	-> 65
/*     */     //   #99	-> 73
/*     */     //   #289	-> 83
/*     */     //   #290	-> 102
/*     */     //   #291	-> 130
/*     */     //   #99	-> 140
/*     */     //   #291	-> 174
/*     */     //   #292	-> 176
/*     */     //   #294	-> 187
/*     */     //   #289	-> 192
/*     */     //   #99	-> 193
/*     */     //   #103	-> 198
/*     */     //   #276	-> 232
/*     */     //   #103	-> 235
/*     */     //   #103	-> 241
/*     */     //   #103	-> 254
/*     */     //   #104	-> 259
/*     */     //   #105	-> 268
/*     */     //   #106	-> 305
/*     */     //   #103	-> 331
/*     */     //   #102	-> 331
/*     */     //   #109	-> 353
/*     */     //   #109	-> 379
/*     */     //   #111	-> 381
/*     */     //   #112	-> 384
/*     */     //   #113	-> 388
/*     */     //   #114	-> 437
/*     */     //   #115	-> 486
/*     */     //   #111	-> 516
/*     */     //   #118	-> 518
/*     */     //   #119	-> 551
/*     */     //   #120	-> 559
/*     */     //   #276	-> 566
/*     */     //   #120	-> 569
/*     */     //   #120	-> 585
/*     */     //   #123	-> 589
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   140	34	15	$i$a$-flatMap-ResourcePainterProvider$loadPainter$1	I
/*     */     //   137	37	14	it	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   176	8	14	list$iv$iv	Ljava/lang/Iterable;
/*     */     //   130	54	13	element$iv$iv	Ljava/lang/Object;
/*     */     //   102	87	11	$i$f$flatMapTo	I
/*     */     //   99	90	9	$this$flatMapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   99	90	10	destination$iv$iv	Ljava/util/Collection;
/*     */     //   83	110	8	$i$f$flatMap	I
/*     */     //   80	113	7	$this$flatMap$iv	Ljava/lang/Iterable;
/*     */     //   65	130	6	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   235	6	10	$i$a$-firstNotNullOfOrNull-ResourcePainterProvider$loadPainter$2	I
/*     */     //   232	9	9	it	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   268	63	9	$i$a$-run-ResourcePainterProvider$loadPainter$3	I
/*     */     //   265	66	8	$this$loadPainter_u24lambda_u248	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;
/*     */     //   569	16	14	$i$a$-with-ResourcePainterProvider$loadPainter$4	I
/*     */     //   566	19	13	$this$loadPainter_u24lambda_u249	Lorg/jetbrains/jewel/ui/painter/PainterWrapperHint;
/*     */     //   551	35	11	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   32	579	4	scopes	Ljava/util/List;
/*     */     //   343	268	6	chosenScope	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   353	258	7	url	Ljava/net/URL;
/*     */     //   381	230	8	extension	Ljava/lang/String;
/*     */     //   384	227	9	painter	Ljava/lang/Object;
/*     */     //   0	611	0	this	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;
/*     */     //   0	611	1	scope	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   0	611	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	611	3	$changed	I
/*     */   }
/*     */   
/*     */   private final Pair<Scope, URL> resolveResource(Scope scope) {
/*     */     String normalized = StringsKt.removePrefix(scope.getPath(), "/");
/*     */     for (ClassLoader classLoader : this.contextClassLoaders) {
/*     */       URL url = classLoader.getResource(normalized);
/*     */       if (url != null) {
/*     */         this.logger.trace("Found resource: '" + normalized + "'");
/*     */         return TuplesKt.to(scope, url);
/*     */       } 
/*     */     } 
/*     */     return null;
/*     */   }
/*     */   
/*  46 */   public ResourcePainterProvider(@NotNull String basePath, @NotNull ClassLoader... classLoaders) { this.basePath = basePath;
/*  47 */     Object $this$myLogger$iv = this; int $i$f$myLogger = 0; this.logger = 
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
/* 275 */       JewelLogger.Companion.getInstance(ResourcePainterProvider.class); this.classLoaders = ArraysKt.toSet((Object[])classLoaders); this.cache = new ConcurrentHashMap<>(); this.contextClassLoaders = ArraysKt.toList((Object[])classLoaders); Object object1 = $this$myLogger$iv = DocumentBuilderFactory.newDefaultInstance();
/* 276 */     ResourcePainterProvider resourcePainterProvider = this; int $i$a$-apply-ResourcePainterProvider$documentBuilderFactory$1 = 0; object1.setFeature("http://javax.xml.XMLConstants/feature/secure-processing", true); resourcePainterProvider.documentBuilderFactory = (DocumentBuilderFactory)$this$myLogger$iv; }
/*     */   @Composable private final Painter createSvgPainter(Scope scope, URL url, Composer $composer, int $changed) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w 41072621
/*     */     //   4: invokeinterface startReplaceGroup : (I)V
/*     */     //   9: invokestatic isTraceInProgress : ()Z
/*     */     //   12: ifeq -> 27
/*     */     //   15: ldc_w 41072621
/*     */     //   18: iload #4
/*     */     //   20: iconst_m1
/*     */     //   21: ldc_w 'org.jetbrains.jewel.ui.painter.ResourcePainterProvider.createSvgPainter (ResourcePainterProvider.kt:142)'
/*     */     //   24: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   27: aload_0
/*     */     //   28: aload_2
/*     */     //   29: aload_3
/*     */     //   30: ldc_w 1006577532
/*     */     //   33: invokeinterface startReplaceGroup : (I)V
/*     */     //   38: aload_3
/*     */     //   39: astore #7
/*     */     //   41: aload_3
/*     */     //   42: aload_0
/*     */     //   43: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   48: iload #4
/*     */     //   50: bipush #14
/*     */     //   52: iand
/*     */     //   53: bipush #6
/*     */     //   55: ixor
/*     */     //   56: iconst_4
/*     */     //   57: if_icmple -> 70
/*     */     //   60: aload_3
/*     */     //   61: aload_1
/*     */     //   62: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   67: ifne -> 79
/*     */     //   70: iload #4
/*     */     //   72: bipush #6
/*     */     //   74: iand
/*     */     //   75: iconst_4
/*     */     //   76: if_icmpne -> 83
/*     */     //   79: iconst_1
/*     */     //   80: goto -> 84
/*     */     //   83: iconst_0
/*     */     //   84: ior
/*     */     //   85: aload_3
/*     */     //   86: aload_2
/*     */     //   87: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   92: ior
/*     */     //   93: istore #8
/*     */     //   95: nop
/*     */     //   96: iconst_0
/*     */     //   97: istore #9
/*     */     //   99: aload #7
/*     */     //   101: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   106: astore #10
/*     */     //   108: iconst_0
/*     */     //   109: istore #11
/*     */     //   111: iload #8
/*     */     //   113: ifne -> 127
/*     */     //   116: aload #10
/*     */     //   118: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   121: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   124: if_acmpne -> 166
/*     */     //   127: astore #15
/*     */     //   129: astore #14
/*     */     //   131: iconst_0
/*     */     //   132: istore #12
/*     */     //   134: aload_0
/*     */     //   135: aload_1
/*     */     //   136: aload_2
/*     */     //   137: <illegal opcode> invoke : (Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;Ljava/net/URL;)Lkotlin/jvm/functions/Function1;
/*     */     //   142: astore #16
/*     */     //   144: aload #14
/*     */     //   146: aload #15
/*     */     //   148: aload #16
/*     */     //   150: astore #13
/*     */     //   152: aload #7
/*     */     //   154: aload #13
/*     */     //   156: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   161: aload #13
/*     */     //   163: goto -> 168
/*     */     //   166: aload #10
/*     */     //   168: nop
/*     */     //   169: nop
/*     */     //   170: nop
/*     */     //   171: checkcast kotlin/jvm/functions/Function1
/*     */     //   174: astore #6
/*     */     //   176: aload_3
/*     */     //   177: invokeinterface endReplaceGroup : ()V
/*     */     //   182: aload #6
/*     */     //   184: getstatic org/jetbrains/jewel/ui/painter/ResourcePainterProvider$createSvgPainter$2.INSTANCE : Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$createSvgPainter$2;
/*     */     //   187: checkcast kotlin/jvm/functions/Function3
/*     */     //   190: aload_3
/*     */     //   191: bipush #14
/*     */     //   193: iload #4
/*     */     //   195: iconst_3
/*     */     //   196: ishr
/*     */     //   197: iand
/*     */     //   198: sipush #7168
/*     */     //   201: iload #4
/*     */     //   203: iconst_3
/*     */     //   204: ishl
/*     */     //   205: iand
/*     */     //   206: ior
/*     */     //   207: invokespecial tryLoadingResource : (Ljava/net/URL;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;
/*     */     //   210: astore #5
/*     */     //   212: invokestatic isTraceInProgress : ()Z
/*     */     //   215: ifeq -> 221
/*     */     //   218: invokestatic traceEventEnd : ()V
/*     */     //   221: aload_3
/*     */     //   222: invokeinterface endReplaceGroup : ()V
/*     */     //   227: aload #5
/*     */     //   229: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #143	-> 24
/*     */     //   #144	-> 28
/*     */     //   #145	-> 95
/*     */     //   #295	-> 99
/*     */     //   #296	-> 111
/*     */     //   #297	-> 127
/*     */     //   #145	-> 134
/*     */     //   #297	-> 150
/*     */     //   #298	-> 152
/*     */     //   #299	-> 161
/*     */     //   #300	-> 166
/*     */     //   #296	-> 168
/*     */     //   #295	-> 169
/*     */     //   #295	-> 170
/*     */     //   #145	-> 171
/*     */     //   #143	-> 184
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   134	8	12	$i$a$-cache-ResourcePainterProvider$createSvgPainter$1	I
/*     */     //   152	11	13	value$iv	Ljava/lang/Object;
/*     */     //   111	58	11	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   108	61	10	it$iv	Ljava/lang/Object;
/*     */     //   99	72	9	$i$f$cache	I
/*     */     //   96	75	7	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   96	75	8	invalid$iv	Z
/*     */     //   0	230	0	this	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;
/*     */     //   0	230	1	scope	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   0	230	2	url	Ljava/net/URL;
/*     */     //   0	230	3	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	230	4	$changed	I }
/*     */   private static final Painter createSvgPainter$lambda$12$lambda$11(ResourcePainterProvider this$0, Scope $scope, URL $url, URL resourceUrl) { Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl"); Intrinsics.checkNotNullExpressionValue($url.openStream(), "openStream(...)"); InputStream inputStream = this$0.patchSvg($scope, $url.openStream(), $scope.getAcceptedHints()); Throwable throwable = null; try {
/*     */       InputStream inputStream1 = inputStream; int $i$a$-use-ResourcePainterProvider$createSvgPainter$1$1$1 = 0;
/*     */       this$0.logger.trace("Loading icon " + this$0.basePath + "(" + CollectionsKt.joinToString$default($scope.getAcceptedHints(), null, null, null, 0, null, null, 63, null) + ") from " + resourceUrl);
/*     */       Intrinsics.checkNotNullExpressionValue(inputStream1.readAllBytes(), "readAllBytes(...)");
/*     */       Painter painter = ImageDecoders_skikoKt.decodeToSvgPainter(inputStream1.readAllBytes(), $scope);
/*     */     } catch (Throwable throwable1) {
/*     */       throwable = throwable1 = null;
/*     */       throw throwable1;
/*     */     } finally {
/*     */       CloseableKt.closeFinally(inputStream, throwable);
/*     */     } 
/*     */     return painter; }
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ResourcePainterProvider$createSvgPainter$2 implements Function3<Painter, Composer, Integer, Painter> {
/*     */     public static final ResourcePainterProvider$createSvgPainter$2 INSTANCE = new ResourcePainterProvider$createSvgPainter$2();
/*     */     @Composable public final Painter invoke(Painter it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(it, "it");
/*     */       $composer.startReplaceGroup(680755851);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(680755851, $changed, -1, "org.jetbrains.jewel.ui.painter.ResourcePainterProvider.createSvgPainter.<anonymous> (ResourcePainterProvider.kt:150)"); 
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return it; } } private final InputStream patchSvg(Scope scope, InputStream inputStream, List hints) { // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: checkcast java/lang/Iterable
/*     */     //   4: astore #4
/*     */     //   6: iconst_0
/*     */     //   7: istore #5
/*     */     //   9: aload #4
/*     */     //   11: instanceof java/util/Collection
/*     */     //   14: ifeq -> 34
/*     */     //   17: aload #4
/*     */     //   19: checkcast java/util/Collection
/*     */     //   22: invokeinterface isEmpty : ()Z
/*     */     //   27: ifeq -> 34
/*     */     //   30: iconst_1
/*     */     //   31: goto -> 93
/*     */     //   34: aload #4
/*     */     //   36: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   41: astore #6
/*     */     //   43: aload #6
/*     */     //   45: invokeinterface hasNext : ()Z
/*     */     //   50: ifeq -> 92
/*     */     //   53: aload #6
/*     */     //   55: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   60: astore #7
/*     */     //   62: aload #7
/*     */     //   64: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   67: astore #8
/*     */     //   69: iconst_0
/*     */     //   70: istore #9
/*     */     //   72: aload #8
/*     */     //   74: instanceof org/jetbrains/jewel/ui/painter/PainterSvgPatchHint
/*     */     //   77: ifne -> 84
/*     */     //   80: iconst_1
/*     */     //   81: goto -> 85
/*     */     //   84: iconst_0
/*     */     //   85: ifne -> 43
/*     */     //   88: iconst_0
/*     */     //   89: goto -> 93
/*     */     //   92: iconst_1
/*     */     //   93: ifeq -> 98
/*     */     //   96: aload_2
/*     */     //   97: areturn
/*     */     //   98: aload_2
/*     */     //   99: checkcast java/io/Closeable
/*     */     //   102: astore #4
/*     */     //   104: aconst_null
/*     */     //   105: astore #5
/*     */     //   107: nop
/*     */     //   108: aload #4
/*     */     //   110: checkcast java/io/InputStream
/*     */     //   113: astore #6
/*     */     //   115: iconst_0
/*     */     //   116: istore #7
/*     */     //   118: aload_0
/*     */     //   119: getfield documentBuilderFactory : Ljavax/xml/parsers/DocumentBuilderFactory;
/*     */     //   122: invokevirtual newDocumentBuilder : ()Ljavax/xml/parsers/DocumentBuilder;
/*     */     //   125: astore #8
/*     */     //   127: aload #8
/*     */     //   129: aload_2
/*     */     //   130: invokevirtual parse : (Ljava/io/InputStream;)Lorg/w3c/dom/Document;
/*     */     //   133: astore #9
/*     */     //   135: aload_3
/*     */     //   136: checkcast java/lang/Iterable
/*     */     //   139: astore #10
/*     */     //   141: iconst_0
/*     */     //   142: istore #11
/*     */     //   144: aload #10
/*     */     //   146: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   151: astore #12
/*     */     //   153: aload #12
/*     */     //   155: invokeinterface hasNext : ()Z
/*     */     //   160: ifeq -> 231
/*     */     //   163: aload #12
/*     */     //   165: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   170: astore #13
/*     */     //   172: aload #13
/*     */     //   174: checkcast org/jetbrains/jewel/ui/painter/PainterHint
/*     */     //   177: astore #14
/*     */     //   179: iconst_0
/*     */     //   180: istore #15
/*     */     //   182: aload #14
/*     */     //   184: instanceof org/jetbrains/jewel/ui/painter/PainterSvgPatchHint
/*     */     //   187: ifeq -> 227
/*     */     //   190: aload #14
/*     */     //   192: checkcast org/jetbrains/jewel/ui/painter/PainterSvgPatchHint
/*     */     //   195: astore #16
/*     */     //   197: iconst_0
/*     */     //   198: istore #17
/*     */     //   200: aload #16
/*     */     //   202: aload_1
/*     */     //   203: checkcast org/jetbrains/jewel/ui/painter/PainterProviderScope
/*     */     //   206: aload #9
/*     */     //   208: invokeinterface getDocumentElement : ()Lorg/w3c/dom/Element;
/*     */     //   213: dup
/*     */     //   214: ldc_w 'getDocumentElement(...)'
/*     */     //   217: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   220: invokeinterface patch : (Lorg/jetbrains/jewel/ui/painter/PainterProviderScope;Lorg/w3c/dom/Element;)V
/*     */     //   225: nop
/*     */     //   226: nop
/*     */     //   227: nop
/*     */     //   228: goto -> 153
/*     */     //   231: nop
/*     */     //   232: aload #9
/*     */     //   234: invokestatic checkNotNull : (Ljava/lang/Object;)V
/*     */     //   237: aload #9
/*     */     //   239: invokestatic writeToString : (Lorg/w3c/dom/Document;)Ljava/lang/String;
/*     */     //   242: astore #10
/*     */     //   244: aload #10
/*     */     //   246: astore #11
/*     */     //   248: iconst_0
/*     */     //   249: istore #12
/*     */     //   251: aload_0
/*     */     //   252: getfield logger : Lorg/jetbrains/jewel/foundation/util/JewelLogger;
/*     */     //   255: aload #11
/*     */     //   257: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   262: invokevirtual trace : (Ljava/lang/String;)V
/*     */     //   265: aload #10
/*     */     //   267: astore #10
/*     */     //   269: getstatic kotlin/text/Charsets.UTF_8 : Ljava/nio/charset/Charset;
/*     */     //   272: astore #11
/*     */     //   274: new java/io/ByteArrayInputStream
/*     */     //   277: dup
/*     */     //   278: aload #10
/*     */     //   280: aload #11
/*     */     //   282: invokevirtual getBytes : (Ljava/nio/charset/Charset;)[B
/*     */     //   285: dup
/*     */     //   286: ldc_w 'getBytes(...)'
/*     */     //   289: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   292: invokespecial <init> : ([B)V
/*     */     //   295: checkcast java/io/InputStream
/*     */     //   298: astore #18
/*     */     //   300: aload #4
/*     */     //   302: aload #5
/*     */     //   304: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
/*     */     //   307: aload #18
/*     */     //   309: areturn
/*     */     //   310: astore #6
/*     */     //   312: aload #6
/*     */     //   314: astore #5
/*     */     //   316: aload #6
/*     */     //   318: athrow
/*     */     //   319: astore #6
/*     */     //   321: aload #4
/*     */     //   323: aload #5
/*     */     //   325: invokestatic closeFinally : (Ljava/io/Closeable;Ljava/lang/Throwable;)V
/*     */     //   328: aload #6
/*     */     //   330: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #155	-> 0
/*     */     //   #301	-> 9
/*     */     //   #302	-> 34
/*     */     //   #155	-> 72
/*     */     //   #302	-> 85
/*     */     //   #303	-> 92
/*     */     //   #155	-> 93
/*     */     //   #156	-> 96
/*     */     //   #159	-> 98
/*     */     //   #160	-> 118
/*     */     //   #161	-> 127
/*     */     //   #163	-> 135
/*     */     //   #304	-> 144
/*     */     //   #164	-> 182
/*     */     //   #165	-> 190
/*     */     //   #276	-> 197
/*     */     //   #165	-> 200
/*     */     //   #165	-> 225
/*     */     //   #166	-> 226
/*     */     //   #304	-> 227
/*     */     //   #305	-> 231
/*     */     //   #168	-> 232
/*     */     //   #169	-> 239
/*     */     //   #170	-> 244
/*     */     //   #276	-> 248
/*     */     //   #170	-> 251
/*     */     //   #170	-> 265
/*     */     //   #171	-> 269
/*     */     //   #168	-> 298
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   72	13	9	$i$a$-all-ResourcePainterProvider$patchSvg$1	I
/*     */     //   69	16	8	it	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   62	30	7	element$iv	Ljava/lang/Object;
/*     */     //   9	84	5	$i$f$all	I
/*     */     //   6	87	4	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   200	25	17	$i$a$-with-ResourcePainterProvider$patchSvg$2$1$1	I
/*     */     //   197	28	16	$this$patchSvg_u24lambda_u2417_u24lambda_u2415_u24lambda_u2414	Lorg/jetbrains/jewel/ui/painter/PainterSvgPatchHint;
/*     */     //   182	45	15	$i$a$-forEach-ResourcePainterProvider$patchSvg$2$1	I
/*     */     //   179	48	14	hint	Lorg/jetbrains/jewel/ui/painter/PainterHint;
/*     */     //   172	56	13	element$iv	Ljava/lang/Object;
/*     */     //   144	88	11	$i$f$forEach	I
/*     */     //   141	91	10	$this$forEach$iv	Ljava/lang/Iterable;
/*     */     //   251	14	12	$i$a$-also-ResourcePainterProvider$patchSvg$2$2	I
/*     */     //   248	17	11	patchedSvg	Ljava/lang/String;
/*     */     //   118	180	7	$i$a$-use-ResourcePainterProvider$patchSvg$2	I
/*     */     //   127	171	8	builder	Ljavax/xml/parsers/DocumentBuilder;
/*     */     //   135	163	9	document	Lorg/w3c/dom/Document;
/*     */     //   115	183	6	it	Ljava/io/InputStream;
/*     */     //   0	331	0	this	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider;
/*     */     //   0	331	1	scope	Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;
/*     */     //   0	331	2	inputStream	Ljava/io/InputStream;
/*     */     //   0	331	3	hints	Ljava/util/List;
/*     */     // Exception table:
/*     */     //   from	to	target	type
/*     */     //   107	300	310	java/lang/Throwable
/*     */     //   107	300	319	finally
/*     */     //   310	319	319	finally
/*     */     //   319	321	319	finally } @Composable private final Painter createVectorDrawablePainter(Scope scope, URL url, Composer $composer, int $changed) { $composer.startReplaceGroup(1764038238);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(1764038238, $changed, -1, "org.jetbrains.jewel.ui.painter.ResourcePainterProvider.createVectorDrawablePainter (ResourcePainterProvider.kt:177)"); 
/*     */     $composer.startReplaceGroup(95027826);
/*     */     Composer composer = $composer;
/*     */     boolean invalid$iv = ((($changed & 0xE ^ 0x6) > 4 && $composer.changed(scope)) || ($changed & 0x6) == 4);
/*     */     int $i$f$cache = 0;
/* 306 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 307 */     if (invalid$iv || it$iv == Composer.Companion.getEmpty()) {
/* 308 */       URL uRL = url; ResourcePainterProvider resourcePainterProvider = this; int $i$a$-cache-ResourcePainterProvider$createVectorDrawablePainter$1 = 0; Function1 function11 = scope::createVectorDrawablePainter$lambda$20$lambda$19; Object value$iv = function11;
/* 309 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 311 */     Function1<? super URL, ?> function1 = (Function1)it$iv; $composer.endReplaceGroup(); Painter painter = resourcePainterProvider.tryLoadingResource(uRL, function1, ResourcePainterProvider$createVectorDrawablePainter$2.INSTANCE, $composer, 0xE & $changed >> 3 | 0x1C00 & $changed << 3); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return painter; } private static final ImageVector createVectorDrawablePainter$lambda$20$lambda$19(Scope $scope, URL resourceUrl) { Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl"); InputStream inputStream = resourceUrl.openStream(); Throwable throwable = null; try { InputStream inputStream1 = inputStream; int $i$a$-use-ResourcePainterProvider$createVectorDrawablePainter$1$1$1 = 0; Intrinsics.checkNotNullExpressionValue(inputStream1.readAllBytes(), "readAllBytes(...)"); ImageVector imageVector = ImageDecodersKt.decodeToImageVector(inputStream1.readAllBytes(), $scope); } catch (Throwable throwable1) { throwable = throwable1 = null; throw throwable1; } finally { CloseableKt.closeFinally(inputStream, throwable); }  return imageVector; } @Metadata(mv = {2, 0, 0}, k = 3, xi = 48) static final class ResourcePainterProvider$createVectorDrawablePainter$2 implements Function3<ImageVector, Composer, Integer, Painter> {
/* 312 */     public static final ResourcePainterProvider$createVectorDrawablePainter$2 INSTANCE = new ResourcePainterProvider$createVectorDrawablePainter$2(); @Composable public final Painter invoke(ImageVector it, Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(it, "it"); $composer.startReplaceGroup(-1187116563); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1187116563, $changed, -1, "org.jetbrains.jewel.ui.painter.ResourcePainterProvider.createVectorDrawablePainter.<anonymous> (ResourcePainterProvider.kt:182)");  VectorPainter vectorPainter = VectorPainterKt.rememberVectorPainter(it, $composer, 0xE & $changed); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (Painter)vectorPainter; } } @Composable private final Painter createBitmapPainter(URL url, Composer $composer, int $changed) { $composer.startReplaceGroup(-769129196); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-769129196, $changed, -1, "org.jetbrains.jewel.ui.painter.ResourcePainterProvider.createBitmapPainter (ResourcePainterProvider.kt:188)");  $composer.startReplaceGroup(-1383833958); Composer composer = $composer; boolean invalid$iv = false; int $i$f$cache = 0; Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 314 */     URL uRL = url; ResourcePainterProvider resourcePainterProvider = this; int $i$a$-cache-ResourcePainterProvider$createBitmapPainter$1 = 0; Function1 function11 = ResourcePainterProvider::createBitmapPainter$lambda$23$lambda$22; Object value$iv = function11;
/* 315 */     composer.updateRememberedValue(value$iv);
/* 316 */     Function1<? super URL, ?> function1 = (it$iv == Composer.Companion.getEmpty()) ? (Function1)value$iv : 
/* 317 */       (Function1)it$iv;
/*     */     $composer.endReplaceGroup();
/*     */     Painter painter = resourcePainterProvider.tryLoadingResource(uRL, function1, ResourcePainterProvider$createBitmapPainter$2.INSTANCE, $composer, 0x30 | 0xE & $changed | 0x1C00 & $changed << 6);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return painter; }
/*     */ 
/*     */   
/*     */   private static final BitmapPainter createBitmapPainter$lambda$23$lambda$22(URL resourceUrl) {
/*     */     Intrinsics.checkNotNullParameter(resourceUrl, "resourceUrl");
/*     */     InputStream inputStream = resourceUrl.openStream();
/*     */     Throwable throwable = null;
/*     */     try {
/*     */       InputStream it = inputStream;
/*     */       int $i$a$-use-ResourcePainterProvider$createBitmapPainter$1$1$bitmap$1 = 0;
/*     */       Intrinsics.checkNotNullExpressionValue(it.readAllBytes(), "readAllBytes(...)");
/*     */       ImageBitmap imageBitmap = ImageDecodersKt.decodeToImageBitmap(it.readAllBytes());
/*     */     } catch (Throwable throwable1) {
/*     */       throwable = throwable1 = null;
/*     */       throw throwable1;
/*     */     } finally {
/*     */       CloseableKt.closeFinally(inputStream, throwable);
/*     */     } 
/*     */     ImageBitmap bitmap = imageBitmap;
/*     */     return new BitmapPainter(bitmap, 0L, 0L, 6, null);
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 3, xi = 48)
/*     */   static final class ResourcePainterProvider$createBitmapPainter$2 implements Function3<BitmapPainter, Composer, Integer, Painter> {
/*     */     public static final ResourcePainterProvider$createBitmapPainter$2 INSTANCE = new ResourcePainterProvider$createBitmapPainter$2();
/*     */     
/*     */     @Composable
/*     */     public final Painter invoke(BitmapPainter it, Composer $composer, int $changed) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */       $composer.startReplaceGroup(-1248347515);
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventStart(-1248347515, $changed, -1, "org.jetbrains.jewel.ui.painter.ResourcePainterProvider.createBitmapPainter.<anonymous> (ResourcePainterProvider.kt:194)"); 
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return (Painter)it;
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @ComposableInferredTarget(scheme = "[0[0]]")
/*     */   private final <T> Painter tryLoadingResource(URL url, Function1 loadingAction, Function3 paintAction, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(-1988749636);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(-1988749636, $changed, -1, "org.jetbrains.jewel.ui.painter.ResourcePainterProvider.tryLoadingResource (ResourcePainterProvider.kt:202)"); 
/*     */     try {
/*     */       object1 = loadingAction.invoke(url);
/*     */     } catch (RuntimeException e) {
/*     */       String message = "Unable to load SVG resource from " + url + "\n" + ExceptionsKt.stackTraceToString(e);
/*     */       this.logger.error(message);
/*     */       ColorPainter colorPainter = ResourcePainterProviderKt.access$getErrorPainter$p();
/*     */       if (ComposerKt.isTraceInProgress())
/*     */         ComposerKt.traceEventEnd(); 
/*     */       $composer.endReplaceGroup();
/*     */       return (Painter)colorPainter;
/*     */     } 
/*     */     Object painter = object1;
/*     */     Object object1 = paintAction.invoke(painter, $composer, Integer.valueOf(0x70 & $changed >> 3));
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return (Painter)object1;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 0, 0}, k = 1, xi = 48, d1 = {"\000h\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\020\016\n\000\n\002\020\"\n\002\030\002\n\002\b\002\n\002\020!\n\002\030\002\n\002\b\013\n\002\030\002\n\000\n\002\020\b\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\003\n\002\020\007\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\006\n\002\030\002\n\002\030\002\n\002\b\r\b\002\030\0002\0020\0012\0020\002B?\022\006\020\003\032\0020\002\022\006\020\004\032\0020\005\022\f\020\006\032\b\022\004\022\0020\b0\007\022\b\b\002\020\t\032\0020\005\022\016\b\002\020\n\032\b\022\004\022\0020\f0\013¢\006\004\b\r\020\016J\020\020\026\032\004\030\0010\0002\006\020\027\032\0020\030J\024\020\031\032\0020\032*\0020\033H\001¢\006\004\b\034\020\035J\024\020\031\032\0020\032*\0020\036H\001¢\006\004\b\037\020 J\024\020!\032\0020\033*\0020\"H\001¢\006\004\b#\020$J\024\020!\032\0020\033*\0020\032H\001¢\006\004\b#\020%J\024\020!\032\0020\033*\0020\036H\001¢\006\004\b&\020'J\024\020(\032\0020)*\0020*H\001¢\006\004\b+\020,J\024\020-\032\0020\"*\0020\033H\001¢\006\004\b.\020$J\024\020-\032\0020\"*\0020\036H\001¢\006\004\b/\020'J\r\0200\032\00201*\00202H\001J\024\0203\032\0020**\0020)H\001¢\006\004\b4\020,J\024\0205\032\0020\036*\0020\"H\001¢\006\004\b6\0207J\024\0205\032\0020\036*\0020\032H\001¢\006\004\b6\0208J\024\0205\032\0020\036*\0020\033H\001¢\006\004\b9\0207R\016\020\003\032\0020\002X\004¢\006\002\n\000R\024\020\004\032\0020\005X\004¢\006\b\n\000\032\004\b\017\020\020R\032\020\006\032\b\022\004\022\0020\b0\007X\004¢\006\b\n\000\032\004\b\021\020\022R\024\020\t\032\0020\005X\004¢\006\b\n\000\032\004\b\023\020\020R\032\020\n\032\b\022\004\022\0020\f0\013X\004¢\006\b\n\000\032\004\b\024\020\025R\024\020:\032\0020\"8\026X\005¢\006\006\032\004\b;\020<R\024\020=\032\0020\"8\026X\005¢\006\006\032\004\b>\020<¨\006?"}, d2 = {"Lorg/jetbrains/jewel/ui/painter/ResourcePainterProvider$Scope;", "Lorg/jetbrains/jewel/ui/painter/ResourcePainterProviderScope;", "Landroidx/compose/ui/unit/Density;", "localDensity", "rawPath", "", "classLoaders", "", "Ljava/lang/ClassLoader;", "path", "acceptedHints", "", "Lorg/jetbrains/jewel/ui/painter/PainterHint;", "<init>", "(Landroidx/compose/ui/unit/Density;Ljava/lang/String;Ljava/util/Set;Ljava/lang/String;Ljava/util/List;)V", "getRawPath", "()Ljava/lang/String;", "getClassLoaders", "()Ljava/util/Set;", "getPath", "getAcceptedHints", "()Ljava/util/List;", "apply", "pathHint", "Lorg/jetbrains/jewel/ui/painter/PainterPathHint;", "roundToPx", "", "Landroidx/compose/ui/unit/Dp;", "roundToPx-0680j_4", "(F)I", "Landroidx/compose/ui/unit/TextUnit;", "roundToPx--R2X_6o", "(J)I", "toDp", "", "toDp-u2uoSUM", "(F)F", "(I)F", "toDp-GaN1DYA", "(J)F", "toDpSize", "Landroidx/compose/ui/unit/DpSize;", "Landroidx/compose/ui/geometry/Size;", "toDpSize-k-rfVVM", "(J)J", "toPx", "toPx-0680j_4", "toPx--R2X_6o", "toRect", "Landroidx/compose/ui/geometry/Rect;", "Landroidx/compose/ui/unit/DpRect;", "toSize", "toSize-XkaWNTQ", "toSp", "toSp-kPz2Gy4", "(F)J", "(I)J", "toSp-0xMU5do", "density", "getDensity", "()F", "fontScale", "getFontScale", "ui"})
/*     */   private static final class Scope implements ResourcePainterProviderScope, Density {
/*     */     @NotNull
/*     */     private final Density localDensity;
/*     */     @NotNull
/*     */     private final String rawPath;
/*     */     @NotNull
/*     */     private final Set<ClassLoader> classLoaders;
/*     */     @NotNull
/*     */     private final String path;
/*     */     @NotNull
/*     */     private final List<PainterHint> acceptedHints;
/*     */     
/*     */     public Scope(@NotNull Density localDensity, @NotNull String rawPath, @NotNull Set<ClassLoader> classLoaders, @NotNull String path, @NotNull List<PainterHint> acceptedHints) {
/*     */       this.localDensity = localDensity;
/*     */       this.rawPath = rawPath;
/*     */       this.classLoaders = classLoaders;
/*     */       this.path = path;
/*     */       this.acceptedHints = acceptedHints;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getRawPath() {
/*     */       return this.rawPath;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public Set<ClassLoader> getClassLoaders() {
/*     */       return this.classLoaders;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String getPath() {
/*     */       return this.path;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public List<PainterHint> getAcceptedHints() {
/*     */       return this.acceptedHints;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Scope apply(@NotNull PainterPathHint pathHint) {
/*     */       Intrinsics.checkNotNullParameter(pathHint, "pathHint");
/*     */       PainterPathHint $this$apply_u24lambda_u240 = pathHint;
/*     */       int $i$a$-with-ResourcePainterProvider$Scope$apply$1 = 0;
/*     */       String patched = $this$apply_u24lambda_u240.patch(this);
/*     */       if (Intrinsics.areEqual(patched, getPath()))
/*     */         return null; 
/*     */       return new Scope(this.localDensity, getRawPath(), getClassLoaders(), patched, getAcceptedHints());
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public int roundToPx-0680j_4(float $this$roundToPx_u2d0680j_4) {
/*     */       return this.localDensity.roundToPx-0680j_4($this$roundToPx_u2d0680j_4);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public int roundToPx--R2X_6o(long $this$roundToPx_u2d_u2dR2X_6o) {
/*     */       return this.localDensity.roundToPx--R2X_6o($this$roundToPx_u2d_u2dR2X_6o);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public float toDp-u2uoSUM(float $this$toDp_u2du2uoSUM) {
/*     */       return this.localDensity.toDp-u2uoSUM($this$toDp_u2du2uoSUM);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public float toDp-u2uoSUM(int $this$toDp_u2du2uoSUM) {
/*     */       return this.localDensity.toDp-u2uoSUM($this$toDp_u2du2uoSUM);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public float toDp-GaN1DYA(long $this$toDp_u2dGaN1DYA) {
/*     */       return this.localDensity.toDp-GaN1DYA($this$toDp_u2dGaN1DYA);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public long toDpSize-k-rfVVM(long $this$toDpSize_u2dk_u2drfVVM) {
/*     */       return this.localDensity.toDpSize-k-rfVVM($this$toDpSize_u2dk_u2drfVVM);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public float toPx-0680j_4(float $this$toPx_u2d0680j_4) {
/*     */       return this.localDensity.toPx-0680j_4($this$toPx_u2d0680j_4);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public float toPx--R2X_6o(long $this$toPx_u2d_u2dR2X_6o) {
/*     */       return this.localDensity.toPx--R2X_6o($this$toPx_u2d_u2dR2X_6o);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     @NotNull
/*     */     public Rect toRect(@NotNull DpRect $this$toRect) {
/*     */       Intrinsics.checkNotNullParameter($this$toRect, "<this>");
/*     */       return this.localDensity.toRect($this$toRect);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public long toSize-XkaWNTQ(long $this$toSize_u2dXkaWNTQ) {
/*     */       return this.localDensity.toSize-XkaWNTQ($this$toSize_u2dXkaWNTQ);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public long toSp-kPz2Gy4(float $this$toSp_u2dkPz2Gy4) {
/*     */       return this.localDensity.toSp-kPz2Gy4($this$toSp_u2dkPz2Gy4);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public long toSp-kPz2Gy4(int $this$toSp_u2dkPz2Gy4) {
/*     */       return this.localDensity.toSp-kPz2Gy4($this$toSp_u2dkPz2Gy4);
/*     */     }
/*     */     
/*     */     @Stable
/*     */     public long toSp-0xMU5do(float $this$toSp_u2d0xMU5do) {
/*     */       return this.localDensity.toSp-0xMU5do($this$toSp_u2d0xMU5do);
/*     */     }
/*     */     
/*     */     public float getDensity() {
/*     */       return this.localDensity.getDensity();
/*     */     }
/*     */     
/*     */     public float getFontScale() {
/*     */       return this.localDensity.getFontScale();
/*     */     }
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\jewel-ui-243-0.27.0.jar!\org\jetbrains\jewe\\ui\painter\ResourcePainterProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */