/*     */ package org.jetbrains.compose.resources;
/*     */ import kotlin.coroutines.Continuation;
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\000P\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\002\b\004\n\002\030\002\n\002\b\004\n\002\030\002\n\002\020\016\n\002\030\002\n\000\n\002\020\002\n\000\n\002\020\022\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\007\n\002\030\002\n\000\n\002\030\002\n\002\b\t\032\b\020\024\032\0020\025H\000\032\036\020\026\032\0020\0272\006\020\030\032\0020\0312\006\020\032\032\0020\033H@¢\006\002\020\034\032\025\020\035\032\0020\0012\006\020\032\032\0020\033H\007¢\006\002\020\036\032:\020\037\032\0020\0232\006\020 \032\0020\0222\006\020!\032\0020\0222\006\020\"\032\0020#2\022\020$\032\016\022\004\022\0020\027\022\004\022\0020\0230%H@¢\006\002\020&\032\025\020'\032\0020\f2\006\020\032\032\0020\033H\007¢\006\002\020(\032\025\020)\032\0020\f2\006\020\032\032\0020\033H\003¢\006\002\020(\032\025\020*\032\0020\0072\006\020\032\032\0020\033H\007¢\006\002\020+\"\033\020\000\032\0020\0018BX\002¢\006\f\n\004\b\004\020\005\032\004\b\002\020\003\"\033\020\006\032\0020\0078BX\002¢\006\f\n\004\b\n\020\005\032\004\b\b\020\t\"\033\020\013\032\0020\f8BX\002¢\006\f\n\004\b\017\020\005\032\004\b\r\020\016\"\032\020\020\032\016\022\004\022\0020\022\022\004\022\0020\0230\021X\004¢\006\002\n\000¨\006,²\006\n\020-\032\0020\001X\002²\006\n\020.\032\0020\007X\002²\006\n\020)\032\0020\fX\002"}, d2 = {"emptyImageBitmap", "Landroidx/compose/ui/graphics/ImageBitmap;", "getEmptyImageBitmap", "()Landroidx/compose/ui/graphics/ImageBitmap;", "emptyImageBitmap$delegate", "Lkotlin/Lazy;", "emptyImageVector", "Landroidx/compose/ui/graphics/vector/ImageVector;", "getEmptyImageVector", "()Landroidx/compose/ui/graphics/vector/ImageVector;", "emptyImageVector$delegate", "emptySvgPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "getEmptySvgPainter", "()Landroidx/compose/ui/graphics/painter/Painter;", "emptySvgPainter$delegate", "imageCache", "Lorg/jetbrains/compose/resources/AsyncCache;", "", "Lorg/jetbrains/compose/resources/ImageCache;", "dropImageCache", "", "getDrawableResourceBytes", "", "environment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "resource", "Lorg/jetbrains/compose/resources/DrawableResource;", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/DrawableResource;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "imageResource", "(Lorg/jetbrains/compose/resources/DrawableResource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/ImageBitmap;", "loadImage", "path", "cacheKey", "resourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "decode", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/compose/resources/ResourceReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "painterResource", "(Lorg/jetbrains/compose/resources/DrawableResource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/painter/Painter;", "svgPainter", "vectorResource", "(Lorg/jetbrains/compose/resources/DrawableResource;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/graphics/vector/ImageVector;", "library", "imageBitmap", "imageVector"})
/*     */ @SourceDebugExtension({"SMAP\nImageResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.kt\norg/jetbrains/compose/resources/ImageResourcesKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,159:1\n77#2:160\n77#2:167\n77#2:168\n1225#3,6:161\n81#4:169\n81#4:170\n81#4:171\n*S KotlinDebug\n*F\n+ 1 ImageResources.kt\norg/jetbrains/compose/resources/ImageResourcesKt\n*L\n37#1:160\n89#1:167\n109#1:168\n38#1:161,6\n60#1:169\n90#1:170\n110#1:171\n*E\n"})
/*     */ public final class ImageResourcesKt { @NotNull
/*     */   private static final Lazy emptyImageBitmap$delegate = LazyKt.lazy(ImageResourcesKt$emptyImageBitmap$2.INSTANCE); private static final ImageBitmap getEmptyImageBitmap() {
/*     */     Lazy lazy = emptyImageBitmap$delegate;
/*     */     return (ImageBitmap)lazy.getValue();
/*     */   } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "invoke"})
/*     */   static final class ImageResourcesKt$emptyImageBitmap$2 extends Lambda implements Function0<ImageBitmap> { public static final ImageResourcesKt$emptyImageBitmap$2 INSTANCE = new ImageResourcesKt$emptyImageBitmap$2();
/*     */     ImageResourcesKt$emptyImageBitmap$2() {
/*     */       super(0);
/*     */     }
/*     */     @NotNull
/*     */     public final ImageBitmap invoke() {
/*     */       return ImageBitmapKt.ImageBitmap-x__-hDU$default(1, 1, 0, false, null, 28, null);
/*     */     } }
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final ImageBitmap imageResource(@NotNull DrawableResource resource, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(resource, "resource");
/*     */     $composer.startReplaceGroup(1838739546);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(1838739546, $changed, -1, "org.jetbrains.compose.resources.imageResource (ImageResources.kt:56)"); 
/*     */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/*     */     ResourceEnvironment resourceEnvironment = ResourceEnvironmentKt.rememberResourceEnvironment($composer, 0);
/*     */     State<?> imageBitmap$delegate = ResourceState_blockingKt.rememberResourceState(resource, resourceReader, resourceEnvironment, ImageResourcesKt$imageResource$imageBitmap$2.INSTANCE, new ImageResourcesKt$imageResource$imageBitmap$3(resource, resourceEnvironment, resourceReader, null), $composer, 0x8C00 | 0xE & $changed);
/*     */     ImageBitmap imageBitmap = imageResource$lambda$1((State)imageBitmap$delegate);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return imageBitmap;
/*     */   }
/*     */   @Composable
/*     */   @NotNull
/*  36 */   public static final Painter painterResource(@NotNull DrawableResource resource, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(resource, "resource"); $composer.startReplaceGroup(-1508925367); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1508925367, $changed, -1, "org.jetbrains.compose.resources.painterResource (ImageResources.kt:35)"); 
/*  37 */     CompositionLocal compositionLocal = (CompositionLocal)ResourceEnvironmentKt.getLocalComposeEnvironment(); int $changed$iv = 6, $i$f$getCurrent = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 160 */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object1 = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); ResourceEnvironment environment = ((ComposeEnvironment)object1).rememberEnvironment($composer, 0); $composer.startReplaceGroup(-1389301971); Composer composer = $composer; int i = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(resource)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changed(environment), $i$f$cache = 0;
/* 161 */     Object it$iv = composer.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/* 162 */     if (i != 0 || it$iv == Composer.Companion.getEmpty()) {
/* 163 */       int $i$a$-cache-ImageResourcesKt$painterResource$filePath$1 = 0; Object value$iv = ResourceEnvironmentKt.getResourceItemByEnvironment(resource, environment).getPath$library();
/* 164 */       composer.updateRememberedValue(value$iv);
/*     */     } 
/* 166 */     String str1 = (String)it$iv; $composer.endReplaceGroup(); String filePath = str1; if (StringsKt.endsWith(filePath, ".xml", true)) { $composer.startReplaceGroup(-118556854); VectorPainter vectorPainter = VectorPainterKt.rememberVectorPainter(vectorResource(resource, $composer, 0xE & $changed), $composer, 0); $composer.endReplaceGroup(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (Painter)vectorPainter; }  if (StringsKt.endsWith(filePath, ".svg", true)) { $composer.startReplaceGroup(-118445595); Painter painter = svgPainter(resource, $composer, 0xE & $changed); $composer.endReplaceGroup(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return painter; }  $composer.startReplaceGroup(-118396429); BitmapPainter bitmapPainter = new BitmapPainter(imageResource(resource, $composer, 0xE & $changed), 0L, 0L, 6, null); $composer.endReplaceGroup(); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return (Painter)bitmapPainter; } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "invoke"}) static final class ImageResourcesKt$imageResource$imageBitmap$2 extends Lambda implements Function0<ImageBitmap> {
/*     */     public static final ImageResourcesKt$imageResource$imageBitmap$2 INSTANCE = new ImageResourcesKt$imageResource$imageBitmap$2(); @NotNull public final ImageBitmap invoke() { return ImageResourcesKt.getEmptyImageBitmap(); } ImageResourcesKt$imageResource$imageBitmap$2() { super(0); } } @DebugMetadata(f = "ImageResources.kt", l = {68}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ImageResourcesKt$imageResource$imageBitmap$3") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/ImageBitmap;", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"}) @SourceDebugExtension({"SMAP\nImageResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.kt\norg/jetbrains/compose/resources/ImageResourcesKt$imageResource$imageBitmap$3\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,159:1\n288#2,2:160\n*S KotlinDebug\n*F\n+ 1 ImageResources.kt\norg/jetbrains/compose/resources/ImageResourcesKt$imageResource$imageBitmap$3\n*L\n64#1:160,2\n*E\n"}) static final class ImageResourcesKt$imageResource$imageBitmap$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super ImageBitmap>, Object> {
/*     */     int label; ImageResourcesKt$imageResource$imageBitmap$3(DrawableResource $resource, ResourceEnvironment $resourceEnvironment, ResourceReader $resourceReader, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { // Byte code:
/*     */       //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */       //   3: astore #12
/*     */       //   5: aload_0
/*     */       //   6: getfield label : I
/*     */       //   9: tableswitch default -> 252, 0 -> 32, 1 -> 230
/*     */       //   32: aload_1
/*     */       //   33: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   36: aload_0
/*     */       //   37: getfield L$0 : Ljava/lang/Object;
/*     */       //   40: checkcast org/jetbrains/compose/resources/ResourceEnvironment
/*     */       //   43: astore_2
/*     */       //   44: aload_0
/*     */       //   45: getfield $resource : Lorg/jetbrains/compose/resources/DrawableResource;
/*     */       //   48: checkcast org/jetbrains/compose/resources/Resource
/*     */       //   51: aload_2
/*     */       //   52: invokestatic getResourceItemByEnvironment : (Lorg/jetbrains/compose/resources/Resource;Lorg/jetbrains/compose/resources/ResourceEnvironment;)Lorg/jetbrains/compose/resources/ResourceItem;
/*     */       //   55: astore_3
/*     */       //   56: aload_3
/*     */       //   57: invokevirtual getQualifiers$library : ()Ljava/util/Set;
/*     */       //   60: checkcast java/lang/Iterable
/*     */       //   63: astore #6
/*     */       //   65: iconst_0
/*     */       //   66: istore #7
/*     */       //   68: aload #6
/*     */       //   70: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */       //   75: astore #8
/*     */       //   77: aload #8
/*     */       //   79: invokeinterface hasNext : ()Z
/*     */       //   84: ifeq -> 119
/*     */       //   87: aload #8
/*     */       //   89: invokeinterface next : ()Ljava/lang/Object;
/*     */       //   94: astore #9
/*     */       //   96: aload #9
/*     */       //   98: checkcast org/jetbrains/compose/resources/Qualifier
/*     */       //   101: astore #10
/*     */       //   103: iconst_0
/*     */       //   104: istore #11
/*     */       //   106: aload #10
/*     */       //   108: instanceof org/jetbrains/compose/resources/DensityQualifier
/*     */       //   111: ifeq -> 77
/*     */       //   114: aload #9
/*     */       //   116: goto -> 120
/*     */       //   119: aconst_null
/*     */       //   120: astore #5
/*     */       //   122: aload #5
/*     */       //   124: instanceof org/jetbrains/compose/resources/DensityQualifier
/*     */       //   127: ifeq -> 138
/*     */       //   130: aload #5
/*     */       //   132: checkcast org/jetbrains/compose/resources/DensityQualifier
/*     */       //   135: goto -> 139
/*     */       //   138: aconst_null
/*     */       //   139: astore #4
/*     */       //   141: aload #4
/*     */       //   143: dup
/*     */       //   144: ifnull -> 153
/*     */       //   147: invokevirtual getDpi : ()I
/*     */       //   150: goto -> 160
/*     */       //   153: pop
/*     */       //   154: getstatic org/jetbrains/compose/resources/DensityQualifier.MDPI : Lorg/jetbrains/compose/resources/DensityQualifier;
/*     */       //   157: invokevirtual getDpi : ()I
/*     */       //   160: istore #5
/*     */       //   162: aload_0
/*     */       //   163: getfield $resourceEnvironment : Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */       //   166: invokevirtual getDensity$library : ()Lorg/jetbrains/compose/resources/DensityQualifier;
/*     */       //   169: invokevirtual getDpi : ()I
/*     */       //   172: istore #6
/*     */       //   174: aload_3
/*     */       //   175: invokevirtual getPath$library : ()Ljava/lang/String;
/*     */       //   178: astore #7
/*     */       //   180: aload #7
/*     */       //   182: aload #7
/*     */       //   184: iload #6
/*     */       //   186: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;I)Ljava/lang/String;
/*     */       //   191: aload_0
/*     */       //   192: getfield $resourceReader : Lorg/jetbrains/compose/resources/ResourceReader;
/*     */       //   195: new org/jetbrains/compose/resources/ImageResourcesKt$imageResource$imageBitmap$3$cached$1
/*     */       //   198: dup
/*     */       //   199: iload #5
/*     */       //   201: iload #6
/*     */       //   203: invokespecial <init> : (II)V
/*     */       //   206: checkcast kotlin/jvm/functions/Function1
/*     */       //   209: aload_0
/*     */       //   210: checkcast kotlin/coroutines/Continuation
/*     */       //   213: aload_0
/*     */       //   214: iconst_1
/*     */       //   215: putfield label : I
/*     */       //   218: invokestatic access$loadImage : (Ljava/lang/String;Ljava/lang/String;Lorg/jetbrains/compose/resources/ResourceReader;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */       //   221: dup
/*     */       //   222: aload #12
/*     */       //   224: if_acmpne -> 235
/*     */       //   227: aload #12
/*     */       //   229: areturn
/*     */       //   230: aload_1
/*     */       //   231: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */       //   234: aload_1
/*     */       //   235: dup
/*     */       //   236: ldc 'null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Bitmap'
/*     */       //   238: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */       //   241: checkcast org/jetbrains/compose/resources/ImageCache$Bitmap
/*     */       //   244: astore #8
/*     */       //   246: aload #8
/*     */       //   248: invokevirtual getBitmap : ()Landroidx/compose/ui/graphics/ImageBitmap;
/*     */       //   251: areturn
/*     */       //   252: new java/lang/IllegalStateException
/*     */       //   255: dup
/*     */       //   256: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */       //   258: invokespecial <init> : (Ljava/lang/String;)V
/*     */       //   261: athrow
/*     */       // Line number table:
/*     */       //   Java source line number -> byte code offset
/*     */       //   #62	-> 3
/*     */       //   #63	-> 44
/*     */       //   #64	-> 56
/*     */       //   #160	-> 68
/*     */       //   #64	-> 106
/*     */       //   #160	-> 111
/*     */       //   #161	-> 119
/*     */       //   #64	-> 120
/*     */       //   #65	-> 141
/*     */       //   #66	-> 162
/*     */       //   #67	-> 174
/*     */       //   #68	-> 180
/*     */       //   #62	-> 227
/*     */       //   #68	-> 235
/*     */       //   #71	-> 246
/*     */       //   #62	-> 252
/*     */       // Local variable table:
/*     */       //   start	length	slot	name	descriptor
/*     */       //   44	12	2	env	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */       //   56	55	3	item	Lorg/jetbrains/compose/resources/ResourceItem;
/*     */       //   111	8	3	item	Lorg/jetbrains/compose/resources/ResourceItem;
/*     */       //   119	1	3	item	Lorg/jetbrains/compose/resources/ResourceItem;
/*     */       //   120	60	3	item	Lorg/jetbrains/compose/resources/ResourceItem;
/*     */       //   141	9	4	resourceDensityQualifier	Lorg/jetbrains/compose/resources/DensityQualifier;
/*     */       //   162	59	5	resourceDensity	I
/*     */       //   65	12	6	$this$firstOrNull$iv	Ljava/lang/Iterable;
/*     */       //   174	47	6	screenDensity	I
/*     */       //   180	41	7	path	Ljava/lang/String;
/*     */       //   246	6	8	cached	Lorg/jetbrains/compose/resources/ImageCache$Bitmap;
/*     */       //   96	23	9	element$iv	Ljava/lang/Object;
/*     */       //   103	8	10	it	Lorg/jetbrains/compose/resources/Qualifier;
/*     */       //   106	5	11	$i$a$-firstOrNull-ImageResourcesKt$imageResource$imageBitmap$3$resourceDensityQualifier$1	I
/*     */       //   68	52	7	$i$f$firstOrNull	I
/*     */       //   36	216	0	this	Lorg/jetbrains/compose/resources/ImageResourcesKt$imageResource$imageBitmap$3;
/*     */       //   36	216	1	$result	Ljava/lang/Object; } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ImageResourcesKt$imageResource$imageBitmap$3> $completion) { ImageResourcesKt$imageResource$imageBitmap$3 imageResourcesKt$imageResource$imageBitmap$3 = new ImageResourcesKt$imageResource$imageBitmap$3(this.$resource, this.$resourceEnvironment, this.$resourceReader, $completion); imageResourcesKt$imageResource$imageBitmap$3.L$0 = value; return (Continuation<Unit>)imageResourcesKt$imageResource$imageBitmap$3; } @Nullable public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) { return ((ImageResourcesKt$imageResource$imageBitmap$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\022\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/ImageCache;", "it", "", "invoke"}) static final class ImageResourcesKt$imageResource$imageBitmap$3$cached$1 extends Lambda implements Function1<byte[], ImageCache> {
/* 169 */       @NotNull public final ImageCache invoke(@NotNull byte[] it) { Intrinsics.checkNotNullParameter(it, "it"); return new ImageCache.Bitmap(ImageResources_skikoKt.toImageBitmap(it, this.$resourceDensity, this.$screenDensity)); } ImageResourcesKt$imageResource$imageBitmap$3$cached$1(int $resourceDensity, int $screenDensity) { super(1); } } } @NotNull private static final Lazy emptyImageVector$delegate = LazyKt.lazy(ImageResourcesKt$emptyImageVector$2.INSTANCE); private static final ImageBitmap imageResource$lambda$1(State $imageBitmap$delegate) { State state = $imageBitmap$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (ImageBitmap)state.getValue(); } private static final ImageVector getEmptyImageVector() { Lazy lazy = emptyImageVector$delegate; return (ImageVector)lazy.getValue(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/vector/ImageVector;", "invoke"}) @SourceDebugExtension({"SMAP\nImageResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ImageResources.kt\norg/jetbrains/compose/resources/ImageResourcesKt$emptyImageVector$2\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,159:1\n149#2:160\n*S KotlinDebug\n*F\n+ 1 ImageResources.kt\norg/jetbrains/compose/resources/ImageResourcesKt$emptyImageVector$2\n*L\n77#1:160\n*E\n"}) static final class ImageResourcesKt$emptyImageVector$2 extends Lambda implements Function0<ImageVector> {
/* 170 */     public static final ImageResourcesKt$emptyImageVector$2 INSTANCE = new ImageResourcesKt$emptyImageVector$2(); @NotNull public final ImageVector invoke() { int $this$dp$iv = 1, $i$f$getDp = 0; $this$dp$iv = 1; $i$f$getDp = 0; return (new ImageVector.Builder("emptyImageVector", Dp.constructor-impl($this$dp$iv), Dp.constructor-impl($this$dp$iv), 1.0F, 1.0F, 0L, 0, false, 224, null)).build(); } ImageResourcesKt$emptyImageVector$2() { super(0); } } @Composable @NotNull public static final ImageVector vectorResource(@NotNull DrawableResource resource, @Nullable Composer $composer, int $changed) { Intrinsics.checkNotNullParameter(resource, "resource"); $composer.startReplaceGroup(-1394399862); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1394399862, $changed, -1, "org.jetbrains.compose.resources.vectorResource (ImageResources.kt:86)");  ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6); CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity(); int $changed$iv = 0, $i$f$getCurrent = 0; ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp"); Object object = $composer.consume(compositionLocal); ComposerKt.sourceInformationMarkerEnd($composer); Density density = (Density)object; State<?> imageVector$delegate = ResourceState_blockingKt.rememberResourceState(resource, resourceReader, density, ImageResourcesKt$vectorResource$imageVector$2.INSTANCE, new ImageResourcesKt$vectorResource$imageVector$3(resource, resourceReader, density, null), $composer, 0x8C00 | 0xE & $changed); ImageVector imageVector = vectorResource$lambda$2((State)imageVector$delegate); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return imageVector; } private static final ImageVector vectorResource$lambda$2(State $imageVector$delegate) { State state = $imageVector$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (ImageVector)state.getValue(); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/vector/ImageVector;", "invoke"}) static final class ImageResourcesKt$vectorResource$imageVector$2 extends Lambda implements Function0<ImageVector> {
/* 171 */     public static final ImageResourcesKt$vectorResource$imageVector$2 INSTANCE = new ImageResourcesKt$vectorResource$imageVector$2(); ImageResourcesKt$vectorResource$imageVector$2() { super(0); } @NotNull public final ImageVector invoke() { return ImageResourcesKt.getEmptyImageVector(); } } @DebugMetadata(f = "ImageResources.kt", l = {92}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ImageResourcesKt$vectorResource$imageVector$3") @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/vector/ImageVector;", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"}) static final class ImageResourcesKt$vectorResource$imageVector$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super ImageVector>, Object> { int label; ImageResourcesKt$vectorResource$imageVector$3(DrawableResource $resource, ResourceReader $resourceReader, Density $density, Continuation $completion) { super(2, $completion); } @Nullable public final Object invokeSuspend(@NotNull Object $result) { ResourceEnvironment env; String path; ImageCache.Vector cached; Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); env = (ResourceEnvironment)this.L$0; path = ResourceEnvironmentKt.getResourceItemByEnvironment(this.$resource, env).getPath$library(); this.label = 1; if (ImageResourcesKt.loadImage(path, path, this.$resourceReader, new ImageResourcesKt$vectorResource$imageVector$3$cached$1(this.$density), (Continuation)this) == object) return object;  Intrinsics.checkNotNull(ImageResourcesKt.loadImage(path, path, this.$resourceReader, new ImageResourcesKt$vectorResource$imageVector$3$cached$1(this.$density), (Continuation)this), "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Vector"); cached = (ImageCache.Vector)ImageResourcesKt.loadImage(path, path, this.$resourceReader, new ImageResourcesKt$vectorResource$imageVector$3$cached$1(this.$density), (Continuation)this); return cached.getVector();case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); Intrinsics.checkNotNull(SYNTHETIC_LOCAL_VARIABLE_1, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Vector"); cached = (ImageCache.Vector)SYNTHETIC_LOCAL_VARIABLE_1; return cached.getVector(); }  throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } @NotNull public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ImageResourcesKt$vectorResource$imageVector$3> $completion) { ImageResourcesKt$vectorResource$imageVector$3 imageResourcesKt$vectorResource$imageVector$3 = new ImageResourcesKt$vectorResource$imageVector$3(this.$resource, this.$resourceReader, this.$density, $completion); imageResourcesKt$vectorResource$imageVector$3.L$0 = value; return (Continuation<Unit>)imageResourcesKt$vectorResource$imageVector$3; } @Nullable public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) { return ((ImageResourcesKt$vectorResource$imageVector$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\022\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/ImageCache;", "it", "", "invoke"}) static final class ImageResourcesKt$vectorResource$imageVector$3$cached$1 extends Lambda implements Function1<byte[], ImageCache> { @NotNull public final ImageCache invoke(@NotNull byte[] it) { Intrinsics.checkNotNullParameter(it, "it"); return new ImageCache.Vector(XmlVectorParserKt.toImageVector(ImageResources_jvmAndAndroidKt.toXmlElement(it), this.$density)); } ImageResourcesKt$vectorResource$imageVector$3$cached$1(Density $density) { super(1); } } } @NotNull private static final Lazy emptySvgPainter$delegate = LazyKt.lazy(ImageResourcesKt$emptySvgPainter$2.INSTANCE); private static final Painter svgPainter$lambda$3(State $svgPainter$delegate) { State state = $svgPainter$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0; return (Painter)state.getValue(); }
/*     */ 
/*     */   
/*     */   private static final Painter getEmptySvgPainter() {
/*     */     Lazy lazy = emptySvgPainter$delegate;
/*     */     return (Painter)lazy.getValue();
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "invoke"})
/*     */   static final class ImageResourcesKt$emptySvgPainter$2 extends Lambda implements Function0<BitmapPainter> {
/*     */     public static final ImageResourcesKt$emptySvgPainter$2 INSTANCE = new ImageResourcesKt$emptySvgPainter$2();
/*     */     
/*     */     ImageResourcesKt$emptySvgPainter$2() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final BitmapPainter invoke() {
/*     */       return new BitmapPainter(ImageResourcesKt.getEmptyImageBitmap(), 0L, 0L, 6, null);
/*     */     }
/*     */   }
/*     */   
/*     */   @Composable
/*     */   private static final Painter svgPainter(DrawableResource resource, Composer $composer, int $changed) {
/*     */     $composer.startReplaceGroup(1371694195);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(1371694195, $changed, -1, "org.jetbrains.compose.resources.svgPainter (ImageResources.kt:106)"); 
/*     */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/*     */     CompositionLocal compositionLocal = (CompositionLocal)CompositionLocalsKt.getLocalDensity();
/*     */     int $changed$iv = 0, $i$f$getCurrent = 0;
/*     */     ComposerKt.sourceInformationMarkerStart($composer, 2023513938, "CC:CompositionLocal.kt#9igjgp");
/*     */     Object object = $composer.consume(compositionLocal);
/*     */     ComposerKt.sourceInformationMarkerEnd($composer);
/*     */     Density density = (Density)object;
/*     */     State<?> svgPainter$delegate = ResourceState_blockingKt.rememberResourceState(resource, resourceReader, density, ImageResourcesKt$svgPainter$svgPainter$2.INSTANCE, new ImageResourcesKt$svgPainter$svgPainter$3(resource, resourceReader, density, null), $composer, 0x8C00 | 0xE & $changed);
/*     */     Painter painter = svgPainter$lambda$3((State)svgPainter$delegate);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return painter;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\030\002\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/painter/Painter;", "invoke"})
/*     */   static final class ImageResourcesKt$svgPainter$svgPainter$2 extends Lambda implements Function0<Painter> {
/*     */     public static final ImageResourcesKt$svgPainter$svgPainter$2 INSTANCE = new ImageResourcesKt$svgPainter$svgPainter$2();
/*     */     
/*     */     ImageResourcesKt$svgPainter$svgPainter$2() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Painter invoke() {
/*     */       return ImageResourcesKt.getEmptySvgPainter();
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ImageResources.kt", l = {112}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ImageResourcesKt$svgPainter$svgPainter$3")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "Landroidx/compose/ui/graphics/painter/Painter;", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*     */   static final class ImageResourcesKt$svgPainter$svgPainter$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super Painter>, Object> {
/*     */     int label;
/*     */     
/*     */     ImageResourcesKt$svgPainter$svgPainter$3(DrawableResource $resource, ResourceReader $resourceReader, Density $density, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ResourceEnvironment env;
/*     */       String path;
/*     */       ImageCache.Svg cached;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           env = (ResourceEnvironment)this.L$0;
/*     */           path = ResourceEnvironmentKt.getResourceItemByEnvironment(this.$resource, env).getPath$library();
/*     */           this.label = 1;
/*     */           if (ImageResourcesKt.loadImage(path, path, this.$resourceReader, new ImageResourcesKt$svgPainter$svgPainter$3$cached$1(this.$density), (Continuation)this) == object)
/*     */             return object; 
/*     */           Intrinsics.checkNotNull(ImageResourcesKt.loadImage(path, path, this.$resourceReader, new ImageResourcesKt$svgPainter$svgPainter$3$cached$1(this.$density), (Continuation)this), "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Svg");
/*     */           cached = (ImageCache.Svg)ImageResourcesKt.loadImage(path, path, this.$resourceReader, new ImageResourcesKt$svgPainter$svgPainter$3$cached$1(this.$density), (Continuation)this);
/*     */           return cached.getPainter();
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           Intrinsics.checkNotNull(SYNTHETIC_LOCAL_VARIABLE_1, "null cannot be cast to non-null type org.jetbrains.compose.resources.ImageCache.Svg");
/*     */           cached = (ImageCache.Svg)SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           return cached.getPainter();
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super ImageResourcesKt$svgPainter$svgPainter$3> $completion) {
/*     */       ImageResourcesKt$svgPainter$svgPainter$3 imageResourcesKt$svgPainter$svgPainter$3 = new ImageResourcesKt$svgPainter$svgPainter$3(this.$resource, this.$resourceReader, this.$density, $completion);
/*     */       imageResourcesKt$svgPainter$svgPainter$3.L$0 = value;
/*     */       return (Continuation<Unit>)imageResourcesKt$svgPainter$svgPainter$3;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*     */       return ((ImageResourcesKt$svgPainter$svgPainter$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\000\n\002\020\022\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/ImageCache;", "it", "", "invoke"})
/*     */     static final class ImageResourcesKt$svgPainter$svgPainter$3$cached$1 extends Lambda implements Function1<byte[], ImageCache> {
/*     */       @NotNull
/*     */       public final ImageCache invoke(@NotNull byte[] it) {
/*     */         Intrinsics.checkNotNullParameter(it, "it");
/*     */         return new ImageCache.Svg(ImageResources_skikoKt.toSvgPainter(ImageResources_skikoKt.toSvgElement(it), this.$density));
/*     */       }
/*     */       
/*     */       ImageResourcesKt$svgPainter$svgPainter$3$cached$1(Density $density) {
/*     */         super(1);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   @ExperimentalResourceApi
/*     */   @Nullable
/*     */   public static final Object getDrawableResourceBytes(@NotNull ResourceEnvironment environment, @NotNull DrawableResource resource, @NotNull Continuation<? super byte[]> $completion) {
/*     */     ResourceItem resourceItem = ResourceEnvironmentKt.getResourceItemByEnvironment(resource, environment);
/*     */     return ResourceReaderKt.getDefaultResourceReader().read(resourceItem.getPath$library(), $completion);
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   private static final AsyncCache<String, ImageCache> imageCache = new AsyncCache<>();
/*     */   
/*     */   public static final void dropImageCache() {
/*     */     imageCache.clear();
/*     */   }
/*     */   
/*     */   private static final Object loadImage(String path, String cacheKey, ResourceReader resourceReader, Function1<? super byte[], ? extends ImageCache> decode, Continuation<? super ImageCache> $completion) {
/*     */     return imageCache.getOrLoad(cacheKey, new ImageResourcesKt$loadImage$2(decode, resourceReader, path, null), $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "ImageResources.kt", l = {158}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.ImageResourcesKt$loadImage$2")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H@"}, d2 = {"<anonymous>", "Lorg/jetbrains/compose/resources/ImageCache;"})
/*     */   static final class ImageResourcesKt$loadImage$2 extends SuspendLambda implements Function1<Continuation<? super ImageCache>, Object> {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     ImageResourcesKt$loadImage$2(Function1<byte[], ImageCache> $decode, ResourceReader $resourceReader, String $path, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Function1<byte[], ImageCache> function1;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.L$0 = function1 = this.$decode;
/*     */           this.label = 1;
/*     */           return (this.$resourceReader.read(this.$path, (Continuation<? super byte[]>)this) == object) ? object : function1.invoke(this.$resourceReader.read(this.$path, (Continuation<? super byte[]>)this));
/*     */         case 1:
/*     */           function1 = (Function1<byte[], ImageCache>)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return function1.invoke(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@NotNull Continuation<? super ImageResourcesKt$loadImage$2> $completion) {
/*     */       return (Continuation<Unit>)new ImageResourcesKt$loadImage$2(this.$decode, this.$resourceReader, this.$path, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@Nullable Continuation<?> p1) {
/*     */       return ((ImageResourcesKt$loadImage$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   } }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\ImageResourcesKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */