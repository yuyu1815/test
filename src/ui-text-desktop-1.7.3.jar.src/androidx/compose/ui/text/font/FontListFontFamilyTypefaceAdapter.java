/*     */ package androidx.compose.ui.text.font;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import androidx.compose.ui.text.platform.DispatcherKt;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashSet;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Pair;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.TuplesKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.CoroutineContext;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlinx.coroutines.AwaitKt;
/*     */ import kotlinx.coroutines.BuildersKt;
/*     */ import kotlinx.coroutines.CoroutineExceptionHandler;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.CoroutineScopeKt;
/*     */ import kotlinx.coroutines.CoroutineStart;
/*     */ import kotlinx.coroutines.Deferred;
/*     */ import kotlinx.coroutines.Job;
/*     */ import kotlinx.coroutines.SupervisorKt;
/*     */ import kotlinx.coroutines.TimeoutKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000R\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\020\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\000\n\002\020\000\n\002\b\002\b\000\030\000 \0322\0020\001:\001\032B\031\022\b\b\002\020\002\032\0020\003\022\b\b\002\020\004\032\0020\005¢\006\002\020\006J\036\020\t\032\0020\n2\006\020\013\032\0020\f2\006\020\r\032\0020\016H@¢\006\002\020\017JB\020\020\032\004\030\0010\0212\006\020\022\032\0020\0232\006\020\024\032\0020\0162\022\020\025\032\016\022\004\022\0020\027\022\004\022\0020\n0\0262\022\020\030\032\016\022\004\022\0020\023\022\004\022\0020\0310\026H\026R\016\020\007\032\0020\bX\016¢\006\002\n\000R\016\020\002\032\0020\003X\004¢\006\002\n\000¨\006\033"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter;", "Landroidx/compose/ui/text/font/FontFamilyTypefaceAdapter;", "asyncTypefaceCache", "Landroidx/compose/ui/text/font/AsyncTypefaceCache;", "injectedContext", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/compose/ui/text/font/AsyncTypefaceCache;Lkotlin/coroutines/CoroutineContext;)V", "asyncLoadScope", "Lkotlinx/coroutines/CoroutineScope;", "preload", "", "family", "Landroidx/compose/ui/text/font/FontFamily;", "resourceLoader", "Landroidx/compose/ui/text/font/PlatformFontLoader;", "(Landroidx/compose/ui/text/font/FontFamily;Landroidx/compose/ui/text/font/PlatformFontLoader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "resolve", "Landroidx/compose/ui/text/font/TypefaceResult;", "typefaceRequest", "Landroidx/compose/ui/text/font/TypefaceRequest;", "platformFontLoader", "onAsyncCompletion", "Lkotlin/Function1;", "Landroidx/compose/ui/text/font/TypefaceResult$Immutable;", "createDefaultTypeface", "", "Companion", "ui-text"})
/*     */ @StabilityInferred(parameters = 0)
/*     */ @SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,432:1\n235#2,3:433\n33#2,4:436\n238#2,2:440\n38#2:442\n240#2:443\n151#2,3:444\n33#2,4:447\n154#2,2:451\n38#2:453\n156#2:454\n461#2,4:455\n33#2,4:459\n465#2,3:463\n38#2:466\n468#2:467\n33#2,6:468\n44#3,4:474\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter\n*L\n72#1:433,3\n72#1:436,4\n72#1:440,2\n72#1:442\n72#1:443\n73#1:444,3\n73#1:447,4\n73#1:451,2\n73#1:453\n73#1:454\n74#1:455,4\n74#1:459,4\n74#1:463,3\n74#1:466\n74#1:467\n78#1:468,6\n159#1:474,4\n*E\n"})
/*     */ public final class FontListFontFamilyTypefaceAdapter
/*     */   implements FontFamilyTypefaceAdapter
/*     */ {
/*     */   public FontListFontFamilyTypefaceAdapter(@NotNull AsyncTypefaceCache asyncTypefaceCache, @NotNull CoroutineContext injectedContext) {
/*  51 */     this.asyncTypefaceCache = asyncTypefaceCache;
/*     */ 
/*     */ 
/*     */     
/*  55 */     this.asyncLoadScope = CoroutineScopeKt.CoroutineScope(
/*     */         
/*  57 */         DropExceptionHandler.plus(
/*  58 */           (CoroutineContext)DispatcherKt.getFontCacheManagementDispatcher()).plus(
/*  59 */           injectedContext).plus(
/*  60 */           (CoroutineContext)SupervisorKt.SupervisorJob((Job)injectedContext.get((CoroutineContext.Key)Job.Key))));
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   @Nullable
/*     */   public final Object preload(@NotNull FontFamily family, @NotNull PlatformFontLoader resourceLoader, @NotNull Continuation $completion) {
/*  67 */     if (!(family instanceof FontListFontFamily)) return Unit.INSTANCE;
/*     */     
/*  69 */     List<Font> allFonts = ((FontListFontFamily)family).getFonts();
/*     */     
/*  71 */     List<Font> list1 = ((FontListFontFamily)family).getFonts();
/*  72 */     int $i$f$fastFilter = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 434 */     ArrayList<Object> arrayList = new ArrayList(list1.size());
/* 435 */     List<Font> list2 = list1; int j = 0;
/*     */     
/* 437 */     int index$iv$iv = 0, n = list2.size(); if (index$iv$iv < n) {
/* 438 */       Object item$iv$iv = list2.get(index$iv$iv);
/* 439 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastFilter$2$iv = 0;
/* 440 */       Font it = (Font)it$iv; int $i$a$-fastFilter-FontListFontFamilyTypefaceAdapter$preload$asyncStyles$1 = 0; if (FontLoadingStrategy.equals-impl0(it.getLoadingStrategy-PKNRLFQ(), FontLoadingStrategy.Companion.getAsync-PKNRLFQ())) arrayList.add(it$iv);
/*     */     
/*     */     } 
/* 443 */     List<Object> $this$fastFilter$iv = arrayList;
/*     */     int $i$f$fastMap = 0;
/* 445 */     ArrayList<Pair> target$iv = new ArrayList($this$fastFilter$iv.size());
/* 446 */     List<Object> $this$fastForEach$iv$iv = $this$fastFilter$iv; j = 0;
/*     */     
/* 448 */     index$iv$iv = 0; n = $this$fastForEach$iv$iv.size(); if (index$iv$iv < n) {
/* 449 */       Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/* 450 */       Object it$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/* 451 */       Font font = (Font)it$iv; ArrayList<Pair> arrayList2 = target$iv; int $i$a$-fastMap-FontListFontFamilyTypefaceAdapter$preload$asyncStyles$2 = 0; arrayList2.add(TuplesKt.to(font.getWeight(), FontStyle.box-impl(font.getStyle-_-LCdwA())));
/*     */     } 
/*     */     
/* 454 */     List<Pair> $this$fastMap$iv = target$iv;
/*     */     int $i$f$fastDistinctBy = 0;
/* 456 */     HashSet set$iv = new HashSet($this$fastMap$iv.size());
/* 457 */     ArrayList arrayList1 = new ArrayList($this$fastMap$iv.size());
/* 458 */     List<Pair> list3 = $this$fastMap$iv; int k = 0;
/*     */     
/* 460 */     int m = 0, i1 = list3.size(); if (m < i1) {
/* 461 */       Object item$iv$iv = list3.get(m);
/* 462 */       Object e$iv = item$iv$iv; int $i$a$-fastForEach-ListUtilsKt$fastDistinctBy$2$iv = 0;
/* 463 */       Pair it = (Pair)e$iv; int $i$a$-fastDistinctBy-FontListFontFamilyTypefaceAdapter$preload$asyncStyles$3 = 0; Object key$iv = it;
/*     */     } 
/*     */ 
/*     */     
/* 467 */     List asyncStyles = arrayList1; List<Font> asyncLoads = new ArrayList(); List $this$fastForEach$iv = asyncStyles;
/*     */     int $i$f$fastForEach = 0;
/* 469 */     int index$iv = 0, i = $this$fastForEach$iv.size(); if (index$iv < i) {
/* 470 */       Object item$iv = $this$fastForEach$iv.get(index$iv);
/* 471 */       Pair pair = (Pair)item$iv; int $i$a$-fastForEach-FontListFontFamilyTypefaceAdapter$preload$2 = 0; FontWeight fontWeight = (FontWeight)pair.component1(); int fontStyle = ((FontStyle)pair.component2()).unbox-impl(); List<Font> matched = fontMatcher.matchFont-RetOiIg(allFonts, fontWeight, fontStyle);
/*     */     }  if (CoroutineScopeKt.coroutineScope(new FontListFontFamilyTypefaceAdapter$preload$3(this, resourceLoader, null), $completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */       return CoroutineScopeKt.coroutineScope(new FontListFontFamilyTypefaceAdapter$preload$3(this, resourceLoader, null), $completion);  CoroutineScopeKt.coroutineScope(new FontListFontFamilyTypefaceAdapter$preload$3(this, resourceLoader, null), $completion); return Unit.INSTANCE; } static { int $i$f$CoroutineExceptionHandler = 0;
/* 474 */     CoroutineExceptionHandler.Key key = CoroutineExceptionHandler.Key; DropExceptionHandler = new FontListFontFamilyTypefaceAdapter$special$$inlined$CoroutineExceptionHandler$1(key); }
/*     */ 
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\020\002\n\000\n\002\030\002\n\000\020\000\032\0020\0012\006\020\002\032\0020\003H\n¢\006\002\b\004"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/ui/text/font/TypefaceRequest;", "invoke"})
/*     */   static final class FontListFontFamilyTypefaceAdapter$preload$2$1 extends Lambda implements Function1<TypefaceRequest, Unit> {
/*     */     public static final FontListFontFamilyTypefaceAdapter$preload$2$1 INSTANCE = new FontListFontFamilyTypefaceAdapter$preload$2$1();
/*     */     
/*     */     public final void invoke(@NotNull TypefaceRequest it) {
/*     */       Intrinsics.checkNotNullParameter(it, "it");
/*     */     }
/*     */     
/*     */     FontListFontFamilyTypefaceAdapter$preload$2$1() {
/*     */       super(1);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {117}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$preload$3")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   @SourceDebugExtension({"SMAP\nFontListFontFamilyTypefaceAdapter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,432:1\n461#2,4:433\n33#2,4:437\n465#2,3:441\n38#2:444\n468#2:445\n151#2,3:446\n33#2,4:449\n154#2,2:453\n38#2:455\n156#2:456\n*S KotlinDebug\n*F\n+ 1 FontListFontFamilyTypefaceAdapter.kt\nandroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$preload$3\n*L\n104#1:433,4\n104#1:437,4\n104#1:441,3\n104#1:444\n104#1:445\n105#1:446,3\n105#1:449,4\n105#1:453,2\n105#1:455\n105#1:456\n*E\n"})
/*     */   static final class FontListFontFamilyTypefaceAdapter$preload$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     FontListFontFamilyTypefaceAdapter$preload$3(FontListFontFamilyTypefaceAdapter $receiver, PlatformFontLoader $resourceLoader, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       CoroutineScope $this$coroutineScope;
/*     */       List<Font> $this$fastDistinctBy$iv;
/*     */       List $this$fastMap$iv;
/*     */       int $i$f$fastDistinctBy;
/*     */       FontListFontFamilyTypefaceAdapter fontListFontFamilyTypefaceAdapter;
/*     */       HashSet set$iv;
/*     */       PlatformFontLoader platformFontLoader;
/*     */       ArrayList target$iv;
/*     */       int $i$f$fastMap;
/*     */       List<Font> $this$fastForEach$iv$iv;
/*     */       ArrayList<Deferred> arrayList;
/*     */       int $i$f$fastForEach;
/*     */       List list1;
/*     */       int index$iv$iv, i, k, j, m;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           $this$coroutineScope = (CoroutineScope)this.L$0;
/*     */           $this$fastDistinctBy$iv = this.$asyncLoads;
/*     */           $i$f$fastDistinctBy = 0;
/*     */           set$iv = new HashSet($this$fastDistinctBy$iv.size());
/*     */           target$iv = new ArrayList($this$fastDistinctBy$iv.size());
/*     */           $this$fastForEach$iv$iv = $this$fastDistinctBy$iv;
/*     */           $i$f$fastForEach = 0;
/*     */           index$iv$iv = 0;
/*     */           k = $this$fastForEach$iv$iv.size();
/*     */           if (index$iv$iv < k) {
/*     */             Object item$iv$iv = $this$fastForEach$iv$iv.get(index$iv$iv);
/*     */             Object e$iv = item$iv$iv;
/*     */             int $i$a$-fastForEach-ListUtilsKt$fastDistinctBy$2$iv = 0;
/*     */             Font it = (Font)e$iv;
/*     */             int $i$a$-fastDistinctBy-FontListFontFamilyTypefaceAdapter$preload$3$1 = 0;
/*     */             Object key$iv = it;
/*     */           } 
/*     */           $this$fastMap$iv = target$iv;
/*     */           fontListFontFamilyTypefaceAdapter = FontListFontFamilyTypefaceAdapter.this;
/*     */           platformFontLoader = this.$resourceLoader;
/*     */           $i$f$fastMap = 0;
/*     */           arrayList = new ArrayList($this$fastMap$iv.size());
/*     */           list1 = $this$fastMap$iv;
/*     */           i = 0;
/*     */           j = 0;
/*     */           m = list1.size();
/*     */           if (j < m) {
/*     */             Object item$iv$iv = list1.get(j);
/*     */             Object it$iv = item$iv$iv;
/*     */             int $i$a$-fastForEach-ListUtilsKt$fastMap$2$iv = 0;
/*     */             Font font = (Font)it$iv;
/*     */             ArrayList<Deferred> arrayList1 = arrayList;
/*     */             int $i$a$-fastMap-FontListFontFamilyTypefaceAdapter$preload$3$2 = 0;
/*     */             arrayList1.add(BuildersKt.async$default($this$coroutineScope, null, null, new FontListFontFamilyTypefaceAdapter$preload$3$2$1(font, platformFontLoader, null), 3, null));
/*     */           } 
/*     */           this.label = 1;
/*     */           if (AwaitKt.joinAll(arrayList, (Continuation)this) == object)
/*     */             return object; 
/*     */           AwaitKt.joinAll(arrayList, (Continuation)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super FontListFontFamilyTypefaceAdapter$preload$3> $completion) {
/*     */       FontListFontFamilyTypefaceAdapter$preload$3 fontListFontFamilyTypefaceAdapter$preload$3 = new FontListFontFamilyTypefaceAdapter$preload$3(FontListFontFamilyTypefaceAdapter.this, this.$resourceLoader, $completion);
/*     */       fontListFontFamilyTypefaceAdapter$preload$3.L$0 = value;
/*     */       return (Continuation<Unit>)fontListFontFamilyTypefaceAdapter$preload$3;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((FontListFontFamilyTypefaceAdapter$preload$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public TypefaceResult resolve(@NotNull TypefaceRequest typefaceRequest, @NotNull PlatformFontLoader platformFontLoader, @NotNull Function1<? super TypefaceResult.Immutable, Unit> onAsyncCompletion, @NotNull Function1 createDefaultTypeface) {
/*     */     Intrinsics.checkNotNullParameter(typefaceRequest, "typefaceRequest");
/*     */     Intrinsics.checkNotNullParameter(platformFontLoader, "platformFontLoader");
/*     */     Intrinsics.checkNotNullParameter(onAsyncCompletion, "onAsyncCompletion");
/*     */     Intrinsics.checkNotNullParameter(createDefaultTypeface, "createDefaultTypeface");
/*     */     if (!(typefaceRequest.getFontFamily() instanceof FontListFontFamily))
/*     */       return null; 
/*     */     List<Font> matched = fontMatcher.matchFont-RetOiIg(((FontListFontFamily)typefaceRequest.getFontFamily()).getFonts(), typefaceRequest.getFontWeight(), typefaceRequest.getFontStyle-_-LCdwA());
/*     */     Pair pair = FontListFontFamilyTypefaceAdapterKt.access$firstImmediatelyAvailable(matched, typefaceRequest, this.asyncTypefaceCache, platformFontLoader, createDefaultTypeface);
/*     */     List<? extends Font> asyncFontsToLoad = (List)pair.component1();
/*     */     Object synthesizedTypeface = pair.component2();
/*     */     if (asyncFontsToLoad == null)
/*     */       return new TypefaceResult.Immutable(synthesizedTypeface, false, 2, null); 
/*     */     AsyncFontListLoader asyncLoader = new AsyncFontListLoader(asyncFontsToLoad, synthesizedTypeface, typefaceRequest, this.asyncTypefaceCache, onAsyncCompletion, platformFontLoader);
/*     */     BuildersKt.launch$default(this.asyncLoadScope, null, CoroutineStart.UNDISPATCHED, new FontListFontFamilyTypefaceAdapter$resolve$1(asyncLoader, null), 1, null);
/*     */     return new TypefaceResult.Async(asyncLoader);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "FontListFontFamilyTypefaceAdapter.kt", l = {153}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "androidx.compose.ui.text.font.FontListFontFamilyTypefaceAdapter$resolve$1")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H@"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class FontListFontFamilyTypefaceAdapter$resolve$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     FontListFontFamilyTypefaceAdapter$resolve$1(AsyncFontListLoader $asyncLoader, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$asyncLoader.load((Continuation<? super Unit>)this) == object)
/*     */             return object; 
/*     */           this.$asyncLoader.load((Continuation<? super Unit>)this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super FontListFontFamilyTypefaceAdapter$resolve$1> $completion) {
/*     */       return (Continuation<Unit>)new FontListFontFamilyTypefaceAdapter$resolve$1(this.$asyncLoader, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull CoroutineScope p1, @Nullable Continuation<?> p2) {
/*     */       return ((FontListFontFamilyTypefaceAdapter$resolve$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\000\034\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\003\b\003\030\0002\0020\001B\007\b\002¢\006\002\020\002R\021\020\003\032\0020\004¢\006\b\n\000\032\004\b\005\020\006R\021\020\007\032\0020\b¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Landroidx/compose/ui/text/font/FontListFontFamilyTypefaceAdapter$Companion;", "", "()V", "DropExceptionHandler", "Lkotlinx/coroutines/CoroutineExceptionHandler;", "getDropExceptionHandler", "()Lkotlinx/coroutines/CoroutineExceptionHandler;", "fontMatcher", "Landroidx/compose/ui/text/font/FontMatcher;", "getFontMatcher", "()Landroidx/compose/ui/text/font/FontMatcher;", "ui-text"})
/*     */   public static final class Companion {
/*     */     private Companion() {}
/*     */     
/*     */     @NotNull
/*     */     public final FontMatcher getFontMatcher() {
/*     */       return FontListFontFamilyTypefaceAdapter.fontMatcher;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final CoroutineExceptionHandler getDropExceptionHandler() {
/*     */       return FontListFontFamilyTypefaceAdapter.DropExceptionHandler;
/*     */     }
/*     */   }
/*     */   
/*     */   @NotNull
/*     */   public static final Companion Companion = new Companion(null);
/*     */   @NotNull
/*     */   private final AsyncTypefaceCache asyncTypefaceCache;
/*     */   @NotNull
/*     */   private CoroutineScope asyncLoadScope;
/*     */   public static final int $stable = 8;
/*     */   @NotNull
/*     */   private static final FontMatcher fontMatcher = new FontMatcher();
/*     */   @NotNull
/*     */   private static final CoroutineExceptionHandler DropExceptionHandler;
/*     */   
/*     */   public FontListFontFamilyTypefaceAdapter() {
/*     */     this(null, null, 3, null);
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\li\\ui-text-desktop-1.7.3.jar!\androidx\compos\\ui\text\font\FontListFontFamilyTypefaceAdapter.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */