/*     */ package org.jetbrains.compose.resources;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import androidx.compose.runtime.State;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Lambda;
/*     */ import kotlin.reflect.KProperty;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {1, 9, 0}, k = 2, xi = 48, d1 = {"\0008\n\000\n\002\020\016\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\002\n\002\020\021\n\002\020\000\n\002\b\002\n\002\030\002\n\002\b\004\n\002\020 \n\000\n\002\030\002\n\002\b\007\032\036\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\006\0322\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\022\020\007\032\n\022\006\b\001\022\0020\t0\b\"\0020\tH@¢\006\002\020\n\032&\020\000\032\0020\0012\006\020\013\032\0020\f2\006\020\002\032\0020\0032\006\020\004\032\0020\005H@¢\006\002\020\r\032:\020\000\032\0020\0012\006\020\013\032\0020\f2\006\020\002\032\0020\0032\006\020\004\032\0020\0052\022\020\007\032\n\022\006\b\001\022\0020\t0\b\"\0020\tH@¢\006\002\020\016\032<\020\017\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\f\020\020\032\b\022\004\022\0020\0010\0212\006\020\022\032\0020\0232\006\020\013\032\0020\fH@¢\006\002\020\024\032.\020\017\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\022\032\0020\0232\006\020\013\032\0020\fH@¢\006\002\020\025\032\035\020\026\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\005H\007¢\006\002\020\027\0321\020\026\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\022\020\007\032\n\022\006\b\001\022\0020\t0\b\"\0020\tH\007¢\006\002\020\030¨\006\031²\006\n\020\032\032\0020\001X\002²\006\n\020\032\032\0020\001X\002"}, d2 = {"getPluralString", "", "resource", "Lorg/jetbrains/compose/resources/PluralStringResource;", "quantity", "", "(Lorg/jetbrains/compose/resources/PluralStringResource;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "formatArgs", "", "", "(Lorg/jetbrains/compose/resources/PluralStringResource;I[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "environment", "Lorg/jetbrains/compose/resources/ResourceEnvironment;", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/PluralStringResource;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/ResourceEnvironment;Lorg/jetbrains/compose/resources/PluralStringResource;I[Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "loadPluralString", "args", "", "resourceReader", "Lorg/jetbrains/compose/resources/ResourceReader;", "(Lorg/jetbrains/compose/resources/PluralStringResource;ILjava/util/List;Lorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Lorg/jetbrains/compose/resources/PluralStringResource;ILorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "pluralStringResource", "(Lorg/jetbrains/compose/resources/PluralStringResource;ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;", "(Lorg/jetbrains/compose/resources/PluralStringResource;I[Ljava/lang/Object;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;", "library", "pluralStr"})
/*     */ @SourceDebugExtension({"SMAP\nPluralStringResources.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PluralStringResources.kt\norg/jetbrains/compose/resources/PluralStringResourcesKt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,156:1\n11065#2:157\n11400#2,3:158\n11065#2:161\n11400#2,3:162\n11065#2:165\n11400#2,3:166\n81#3:169\n81#3:170\n*S KotlinDebug\n*F\n+ 1 PluralStringResources.kt\norg/jetbrains/compose/resources/PluralStringResourcesKt\n*L\n97#1:157\n97#1:158,3\n117#1:161\n117#1:162,3\n141#1:165\n141#1:166,3\n30#1:169\n98#1:170\n*E\n"})
/*     */ public final class PluralStringResourcesKt {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final String pluralStringResource(@NotNull PluralStringResource resource, int quantity, @Nullable Composer $composer, int $changed) {
/*  28 */     Intrinsics.checkNotNullParameter(resource, "resource"); $composer.startReplaceGroup(-1455357955); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1455357955, $changed, -1, "org.jetbrains.compose.resources.pluralStringResource (PluralStringResources.kt:27)"); 
/*  29 */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/*  30 */     State<?> pluralStr$delegate = ResourceState_blockingKt.rememberResourceState(resource, Integer.valueOf(quantity), PluralStringResourcesKt$pluralStringResource$pluralStr$2.INSTANCE, new PluralStringResourcesKt$pluralStringResource$pluralStr$3(resource, quantity, resourceReader, null), $composer, 0x1180 | 0xE & $changed | 0x70 & $changed);
/*     */ 
/*     */     
/*  33 */     String str = pluralStringResource$lambda$0((State)pluralStr$delegate); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return str;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static final String pluralStringResource$lambda$0(State $pluralStr$delegate) {
/*     */     State state = $pluralStr$delegate;
/*     */     Object object = null;
/*     */     KProperty property$iv = null;
/*     */     int $i$f$getValue = 0;
/* 169 */     return (String)state.getValue(); } private static final String pluralStringResource$lambda$2(State $pluralStr$delegate) { State state = $pluralStr$delegate; Object object = null; KProperty property$iv = null; int $i$f$getValue = 0;
/* 170 */     return (String)state.getValue(); }
/*     */ 
/*     */   
/*     */   @DebugMetadata(f = "PluralStringResources.kt", l = {72, 73}, i = {0, 0, 0, 1, 1, 1}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "I$0"}, n = {"resource", "environment", "quantity", "resource", "item", "quantity"}, m = "loadPluralString", c = "org.jetbrains.compose.resources.PluralStringResourcesKt")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class PluralStringResourcesKt$loadPluralString$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     PluralStringResourcesKt$loadPluralString$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return PluralStringResourcesKt.loadPluralString(null, 0, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "PluralStringResources.kt", l = {153}, i = {0}, s = {"L$0"}, n = {"args"}, m = "loadPluralString", c = "org.jetbrains.compose.resources.PluralStringResourcesKt")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48)
/*     */   static final class PluralStringResourcesKt$loadPluralString$2 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     int label;
/*     */     
/*     */     PluralStringResourcesKt$loadPluralString$2(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return PluralStringResourcesKt.loadPluralString(null, 0, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class PluralStringResourcesKt$pluralStringResource$pluralStr$2 extends Lambda implements Function0<String> {
/*     */     public static final PluralStringResourcesKt$pluralStringResource$pluralStr$2 INSTANCE = new PluralStringResourcesKt$pluralStringResource$pluralStr$2();
/*     */     
/*     */     PluralStringResourcesKt$pluralStringResource$pluralStr$2() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       return "";
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "PluralStringResources.kt", l = {31}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.PluralStringResourcesKt$pluralStringResource$pluralStr$3")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*     */   static final class PluralStringResourcesKt$pluralStringResource$pluralStr$3 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     PluralStringResourcesKt$pluralStringResource$pluralStr$3(PluralStringResource $resource, int $quantity, ResourceReader $resourceReader, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ResourceEnvironment env;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           env = (ResourceEnvironment)this.L$0;
/*     */           this.label = 1;
/*     */           if (PluralStringResourcesKt.loadPluralString(this.$resource, this.$quantity, this.$resourceReader, env, (Continuation)this) == object)
/*     */             return object; 
/*     */           return PluralStringResourcesKt.loadPluralString(this.$resource, this.$quantity, this.$resourceReader, env, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super PluralStringResourcesKt$pluralStringResource$pluralStr$3> $completion) {
/*     */       PluralStringResourcesKt$pluralStringResource$pluralStr$3 pluralStringResourcesKt$pluralStringResource$pluralStr$3 = new PluralStringResourcesKt$pluralStringResource$pluralStr$3(this.$resource, this.$quantity, this.$resourceReader, $completion);
/*     */       pluralStringResourcesKt$pluralStringResource$pluralStr$3.L$0 = value;
/*     */       return (Continuation<Unit>)pluralStringResourcesKt$pluralStringResource$pluralStr$3;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*     */       return ((PluralStringResourcesKt$pluralStringResource$pluralStr$3)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getPluralString(@NotNull PluralStringResource resource, int quantity, @NotNull Continuation<? super String> $completion) {
/*     */     return loadPluralString(resource, quantity, ResourceReaderKt.getDefaultResourceReader(), ResourceEnvironmentKt.getSystemResourceEnvironment(), $completion);
/*     */   }
/*     */   
/*     */   @ExperimentalResourceApi
/*     */   @Nullable
/*     */   public static final Object getPluralString(@NotNull ResourceEnvironment environment, @NotNull PluralStringResource resource, int quantity, @NotNull Continuation<? super String> $completion) {
/*     */     return loadPluralString(resource, quantity, ResourceReaderKt.getDefaultResourceReader(), environment, $completion);
/*     */   }
/*     */   
/*     */   private static final Object loadPluralString(PluralStringResource resource, int quantity, ResourceReader resourceReader, ResourceEnvironment environment, Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof org/jetbrains/compose/resources/PluralStringResourcesKt$loadPluralString$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast org/jetbrains/compose/resources/PluralStringResourcesKt$loadPluralString$1
/*     */     //   13: astore #11
/*     */     //   15: aload #11
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #11
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new org/jetbrains/compose/resources/PluralStringResourcesKt$loadPluralString$1
/*     */     //   44: dup
/*     */     //   45: aload #4
/*     */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #11
/*     */     //   52: aload #11
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #10
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #12
/*     */     //   64: aload #11
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 358, 0 -> 96, 1 -> 152, 2 -> 244
/*     */     //   96: aload #10
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: checkcast org/jetbrains/compose/resources/Resource
/*     */     //   105: aload_3
/*     */     //   106: invokestatic getResourceItemByEnvironment : (Lorg/jetbrains/compose/resources/Resource;Lorg/jetbrains/compose/resources/ResourceEnvironment;)Lorg/jetbrains/compose/resources/ResourceItem;
/*     */     //   109: astore #5
/*     */     //   111: aload #5
/*     */     //   113: aload_2
/*     */     //   114: aload #11
/*     */     //   116: aload #11
/*     */     //   118: aload_0
/*     */     //   119: putfield L$0 : Ljava/lang/Object;
/*     */     //   122: aload #11
/*     */     //   124: aload_3
/*     */     //   125: putfield L$1 : Ljava/lang/Object;
/*     */     //   128: aload #11
/*     */     //   130: iload_1
/*     */     //   131: putfield I$0 : I
/*     */     //   134: aload #11
/*     */     //   136: iconst_1
/*     */     //   137: putfield label : I
/*     */     //   140: invokestatic getStringItem : (Lorg/jetbrains/compose/resources/ResourceItem;Lorg/jetbrains/compose/resources/ResourceReader;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #12
/*     */     //   146: if_acmpne -> 183
/*     */     //   149: aload #12
/*     */     //   151: areturn
/*     */     //   152: aload #11
/*     */     //   154: getfield I$0 : I
/*     */     //   157: istore_1
/*     */     //   158: aload #11
/*     */     //   160: getfield L$1 : Ljava/lang/Object;
/*     */     //   163: checkcast org/jetbrains/compose/resources/ResourceEnvironment
/*     */     //   166: astore_3
/*     */     //   167: aload #11
/*     */     //   169: getfield L$0 : Ljava/lang/Object;
/*     */     //   172: checkcast org/jetbrains/compose/resources/PluralStringResource
/*     */     //   175: astore_0
/*     */     //   176: aload #10
/*     */     //   178: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   181: aload #10
/*     */     //   183: dup
/*     */     //   184: ldc 'null cannot be cast to non-null type org.jetbrains.compose.resources.StringItem.Plurals'
/*     */     //   186: invokestatic checkNotNull : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   189: checkcast org/jetbrains/compose/resources/StringItem$Plurals
/*     */     //   192: astore #6
/*     */     //   194: getstatic org/jetbrains/compose/resources/plural/PluralRuleList.Companion : Lorg/jetbrains/compose/resources/plural/PluralRuleList$Companion;
/*     */     //   197: aload_3
/*     */     //   198: invokevirtual getLanguage$library : ()Lorg/jetbrains/compose/resources/LanguageQualifier;
/*     */     //   201: aload_3
/*     */     //   202: invokevirtual getRegion$library : ()Lorg/jetbrains/compose/resources/RegionQualifier;
/*     */     //   205: aload #11
/*     */     //   207: aload #11
/*     */     //   209: aload_0
/*     */     //   210: putfield L$0 : Ljava/lang/Object;
/*     */     //   213: aload #11
/*     */     //   215: aload #6
/*     */     //   217: putfield L$1 : Ljava/lang/Object;
/*     */     //   220: aload #11
/*     */     //   222: iload_1
/*     */     //   223: putfield I$0 : I
/*     */     //   226: aload #11
/*     */     //   228: iconst_2
/*     */     //   229: putfield label : I
/*     */     //   232: invokevirtual getInstance : (Lorg/jetbrains/compose/resources/LanguageQualifier;Lorg/jetbrains/compose/resources/RegionQualifier;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   235: dup
/*     */     //   236: aload #12
/*     */     //   238: if_acmpne -> 276
/*     */     //   241: aload #12
/*     */     //   243: areturn
/*     */     //   244: aload #11
/*     */     //   246: getfield I$0 : I
/*     */     //   249: istore_1
/*     */     //   250: aload #11
/*     */     //   252: getfield L$1 : Ljava/lang/Object;
/*     */     //   255: checkcast org/jetbrains/compose/resources/StringItem$Plurals
/*     */     //   258: astore #6
/*     */     //   260: aload #11
/*     */     //   262: getfield L$0 : Ljava/lang/Object;
/*     */     //   265: checkcast org/jetbrains/compose/resources/PluralStringResource
/*     */     //   268: astore_0
/*     */     //   269: aload #10
/*     */     //   271: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   274: aload #10
/*     */     //   276: checkcast org/jetbrains/compose/resources/plural/PluralRuleList
/*     */     //   279: astore #7
/*     */     //   281: aload #7
/*     */     //   283: iload_1
/*     */     //   284: invokevirtual getCategory : (I)Lorg/jetbrains/compose/resources/plural/PluralCategory;
/*     */     //   287: astore #8
/*     */     //   289: aload #6
/*     */     //   291: invokevirtual getItems : ()Ljava/util/Map;
/*     */     //   294: aload #8
/*     */     //   296: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   301: checkcast java/lang/String
/*     */     //   304: dup
/*     */     //   305: ifnonnull -> 353
/*     */     //   308: pop
/*     */     //   309: aload #6
/*     */     //   311: invokevirtual getItems : ()Ljava/util/Map;
/*     */     //   314: getstatic org/jetbrains/compose/resources/plural/PluralCategory.OTHER : Lorg/jetbrains/compose/resources/plural/PluralCategory;
/*     */     //   317: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   322: checkcast java/lang/String
/*     */     //   325: dup
/*     */     //   326: ifnonnull -> 353
/*     */     //   329: pop
/*     */     //   330: new java/lang/IllegalStateException
/*     */     //   333: dup
/*     */     //   334: aload_0
/*     */     //   335: invokevirtual getKey : ()Ljava/lang/String;
/*     */     //   338: aload #8
/*     */     //   340: iload_1
/*     */     //   341: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lorg/jetbrains/compose/resources/plural/PluralCategory;I)Ljava/lang/String;
/*     */     //   346: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   349: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   352: athrow
/*     */     //   353: astore #9
/*     */     //   355: aload #9
/*     */     //   357: areturn
/*     */     //   358: new java/lang/IllegalStateException
/*     */     //   361: dup
/*     */     //   362: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   364: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   367: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #65	-> 62
/*     */     //   #71	-> 101
/*     */     //   #72	-> 111
/*     */     //   #65	-> 149
/*     */     //   #72	-> 183
/*     */     //   #73	-> 194
/*     */     //   #74	-> 197
/*     */     //   #75	-> 201
/*     */     //   #73	-> 207
/*     */     //   #65	-> 241
/*     */     //   #77	-> 281
/*     */     //   #78	-> 289
/*     */     //   #79	-> 308
/*     */     //   #78	-> 325
/*     */     //   #80	-> 334
/*     */     //   #78	-> 353
/*     */     //   #81	-> 355
/*     */     //   #65	-> 358
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	51	0	resource	Lorg/jetbrains/compose/resources/PluralStringResource;
/*     */     //   176	68	0	resource	Lorg/jetbrains/compose/resources/PluralStringResource;
/*     */     //   269	39	0	resource	Lorg/jetbrains/compose/resources/PluralStringResource;
/*     */     //   308	21	0	resource	Lorg/jetbrains/compose/resources/PluralStringResource;
/*     */     //   329	24	0	resource	Lorg/jetbrains/compose/resources/PluralStringResource;
/*     */     //   101	51	1	quantity	I
/*     */     //   158	86	1	quantity	I
/*     */     //   250	58	1	quantity	I
/*     */     //   308	21	1	quantity	I
/*     */     //   329	24	1	quantity	I
/*     */     //   101	42	2	resourceReader	Lorg/jetbrains/compose/resources/ResourceReader;
/*     */     //   101	51	3	environment	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */     //   167	40	3	environment	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */     //   111	32	5	resourceItem	Lorg/jetbrains/compose/resources/ResourceItem;
/*     */     //   194	50	6	item	Lorg/jetbrains/compose/resources/StringItem$Plurals;
/*     */     //   260	48	6	item	Lorg/jetbrains/compose/resources/StringItem$Plurals;
/*     */     //   308	17	6	item	Lorg/jetbrains/compose/resources/StringItem$Plurals;
/*     */     //   281	8	7	pluralRuleList	Lorg/jetbrains/compose/resources/plural/PluralRuleList;
/*     */     //   289	19	8	pluralCategory	Lorg/jetbrains/compose/resources/plural/PluralCategory;
/*     */     //   308	21	8	pluralCategory	Lorg/jetbrains/compose/resources/plural/PluralCategory;
/*     */     //   329	24	8	pluralCategory	Lorg/jetbrains/compose/resources/plural/PluralCategory;
/*     */     //   355	3	9	str	Ljava/lang/String;
/*     */     //   52	306	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	299	10	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final String pluralStringResource(@NotNull PluralStringResource resource, int quantity, @NotNull Object[] formatArgs, @Nullable Composer $composer, int $changed) {
/*     */     Intrinsics.checkNotNullParameter(resource, "resource");
/*     */     Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
/*     */     $composer.startReplaceGroup(1953641168);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventStart(1953641168, $changed, -1, "org.jetbrains.compose.resources.pluralStringResource (PluralStringResources.kt:94)"); 
/*     */     ResourceReader resourceReader = ResourceReader_skikoKt.getCurrentOrPreview(ResourceReaderKt.getLocalResourceReader(), $composer, 6);
/*     */     Object[] $this$map$iv = formatArgs;
/*     */     int $i$f$map = 0;
/*     */     Object[] arrayOfObject1 = $this$map$iv;
/*     */     Collection<String> destination$iv$iv = new ArrayList($this$map$iv.length);
/*     */     int $i$f$mapTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject1.length; b < i; ) {
/*     */       Object item$iv$iv = arrayOfObject1[b];
/*     */       Object object1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-PluralStringResourcesKt$pluralStringResource$args$1 = 0;
/*     */       collection.add(object1.toString());
/*     */     } 
/*     */     List<String> args = (List)destination$iv$iv;
/*     */     State<?> pluralStr$delegate = ResourceState_blockingKt.rememberResourceState(resource, Integer.valueOf(quantity), args, PluralStringResourcesKt$pluralStringResource$pluralStr$5.INSTANCE, new PluralStringResourcesKt$pluralStringResource$pluralStr$6(resource, quantity, args, resourceReader, null), $composer, 0x8E00 | 0xE & $changed | 0x70 & $changed);
/*     */     String str = pluralStringResource$lambda$2((State)pluralStr$delegate);
/*     */     if (ComposerKt.isTraceInProgress())
/*     */       ComposerKt.traceEventEnd(); 
/*     */     $composer.endReplaceGroup();
/*     */     return str;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\b\n\000\n\002\020\016\n\000\020\000\032\0020\001H\n¢\006\002\b\002"}, d2 = {"<anonymous>", "", "invoke"})
/*     */   static final class PluralStringResourcesKt$pluralStringResource$pluralStr$5 extends Lambda implements Function0<String> {
/*     */     public static final PluralStringResourcesKt$pluralStringResource$pluralStr$5 INSTANCE = new PluralStringResourcesKt$pluralStringResource$pluralStr$5();
/*     */     
/*     */     PluralStringResourcesKt$pluralStringResource$pluralStr$5() {
/*     */       super(0);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final String invoke() {
/*     */       return "";
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "PluralStringResources.kt", l = {99}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "org.jetbrains.compose.resources.PluralStringResourcesKt$pluralStringResource$pluralStr$6")
/*     */   @Metadata(mv = {1, 9, 0}, k = 3, xi = 48, d1 = {"\000\f\n\000\n\002\020\016\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\003H@"}, d2 = {"<anonymous>", "", "env", "Lorg/jetbrains/compose/resources/ResourceEnvironment;"})
/*     */   static final class PluralStringResourcesKt$pluralStringResource$pluralStr$6 extends SuspendLambda implements Function2<ResourceEnvironment, Continuation<? super String>, Object> {
/*     */     int label;
/*     */     
/*     */     PluralStringResourcesKt$pluralStringResource$pluralStr$6(PluralStringResource $resource, int $quantity, List<String> $args, ResourceReader $resourceReader, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       ResourceEnvironment env;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           env = (ResourceEnvironment)this.L$0;
/*     */           this.label = 1;
/*     */           if (PluralStringResourcesKt.loadPluralString(this.$resource, this.$quantity, this.$args, this.$resourceReader, env, (Continuation)this) == object)
/*     */             return object; 
/*     */           return PluralStringResourcesKt.loadPluralString(this.$resource, this.$quantity, this.$args, this.$resourceReader, env, (Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final Continuation<Unit> create(@Nullable Object value, @NotNull Continuation<? super PluralStringResourcesKt$pluralStringResource$pluralStr$6> $completion) {
/*     */       PluralStringResourcesKt$pluralStringResource$pluralStr$6 pluralStringResourcesKt$pluralStringResource$pluralStr$6 = new PluralStringResourcesKt$pluralStringResource$pluralStr$6(this.$resource, this.$quantity, this.$args, this.$resourceReader, $completion);
/*     */       pluralStringResourcesKt$pluralStringResource$pluralStr$6.L$0 = value;
/*     */       return (Continuation<Unit>)pluralStringResourcesKt$pluralStringResource$pluralStr$6;
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invoke(@NotNull ResourceEnvironment p1, @Nullable Continuation<?> p2) {
/*     */       return ((PluralStringResourcesKt$pluralStringResource$pluralStr$6)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public static final Object getPluralString(@NotNull PluralStringResource resource, int quantity, @NotNull Object[] formatArgs, @NotNull Continuation<? super String> $completion) {
/*     */     Object[] arrayOfObject1 = formatArgs;
/*     */     int j = quantity;
/*     */     PluralStringResource pluralStringResource = resource;
/*     */     int $i$f$map = 0;
/*     */     Object[] arrayOfObject2 = arrayOfObject1;
/*     */     Collection<String> destination$iv$iv = new ArrayList(arrayOfObject1.length);
/*     */     int $i$f$mapTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject2.length; b < i; ) {
/*     */       Object item$iv$iv = arrayOfObject2[b];
/*     */       Object object1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-PluralStringResourcesKt$getPluralString$4 = 0;
/*     */       collection.add(object1.toString());
/*     */     } 
/*     */     List<String> list = (List)destination$iv$iv;
/*     */     return loadPluralString(pluralStringResource, j, list, ResourceReaderKt.getDefaultResourceReader(), ResourceEnvironmentKt.getSystemResourceEnvironment(), $completion);
/*     */   }
/*     */   
/*     */   @ExperimentalResourceApi
/*     */   @Nullable
/*     */   public static final Object getPluralString(@NotNull ResourceEnvironment environment, @NotNull PluralStringResource resource, int quantity, @NotNull Object[] formatArgs, @NotNull Continuation<? super String> $completion) {
/*     */     Object[] arrayOfObject1 = formatArgs;
/*     */     int j = quantity;
/*     */     PluralStringResource pluralStringResource = resource;
/*     */     int $i$f$map = 0;
/*     */     Object[] arrayOfObject2 = arrayOfObject1;
/*     */     Collection<String> destination$iv$iv = new ArrayList(arrayOfObject1.length);
/*     */     int $i$f$mapTo = 0;
/*     */     byte b;
/*     */     int i;
/*     */     for (b = 0, i = arrayOfObject2.length; b < i; ) {
/*     */       Object item$iv$iv = arrayOfObject2[b];
/*     */       Object object1 = item$iv$iv;
/*     */       Collection<String> collection = destination$iv$iv;
/*     */       int $i$a$-map-PluralStringResourcesKt$getPluralString$6 = 0;
/*     */       collection.add(object1.toString());
/*     */     } 
/*     */     List<String> list = (List)destination$iv$iv;
/*     */     return loadPluralString(pluralStringResource, j, list, ResourceReaderKt.getDefaultResourceReader(), environment, $completion);
/*     */   }
/*     */   
/*     */   private static final Object loadPluralString(PluralStringResource resource, int quantity, List args, ResourceReader resourceReader, ResourceEnvironment environment, Continuation<? super String> paramContinuation) {
/*     */     // Byte code:
/*     */     //   0: aload #5
/*     */     //   2: instanceof org/jetbrains/compose/resources/PluralStringResourcesKt$loadPluralString$2
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #5
/*     */     //   10: checkcast org/jetbrains/compose/resources/PluralStringResourcesKt$loadPluralString$2
/*     */     //   13: astore #8
/*     */     //   15: aload #8
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #8
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 52
/*     */     //   41: new org/jetbrains/compose/resources/PluralStringResourcesKt$loadPluralString$2
/*     */     //   44: dup
/*     */     //   45: aload #5
/*     */     //   47: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   50: astore #8
/*     */     //   52: aload #8
/*     */     //   54: getfield result : Ljava/lang/Object;
/*     */     //   57: astore #7
/*     */     //   59: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   62: astore #9
/*     */     //   64: aload #8
/*     */     //   66: getfield label : I
/*     */     //   69: tableswitch default -> 156, 0 -> 92, 1 -> 128
/*     */     //   92: aload #7
/*     */     //   94: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   97: aload_0
/*     */     //   98: iload_1
/*     */     //   99: aload_3
/*     */     //   100: aload #4
/*     */     //   102: aload #8
/*     */     //   104: aload #8
/*     */     //   106: aload_2
/*     */     //   107: putfield L$0 : Ljava/lang/Object;
/*     */     //   110: aload #8
/*     */     //   112: iconst_1
/*     */     //   113: putfield label : I
/*     */     //   116: invokestatic loadPluralString : (Lorg/jetbrains/compose/resources/PluralStringResource;ILorg/jetbrains/compose/resources/ResourceReader;Lorg/jetbrains/compose/resources/ResourceEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   119: dup
/*     */     //   120: aload #9
/*     */     //   122: if_acmpne -> 144
/*     */     //   125: aload #9
/*     */     //   127: areturn
/*     */     //   128: aload #8
/*     */     //   130: getfield L$0 : Ljava/lang/Object;
/*     */     //   133: checkcast java/util/List
/*     */     //   136: astore_2
/*     */     //   137: aload #7
/*     */     //   139: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   142: aload #7
/*     */     //   144: checkcast java/lang/String
/*     */     //   147: astore #6
/*     */     //   149: aload #6
/*     */     //   151: aload_2
/*     */     //   152: invokestatic replaceWithArgs : (Ljava/lang/String;Ljava/util/List;)Ljava/lang/String;
/*     */     //   155: areturn
/*     */     //   156: new java/lang/IllegalStateException
/*     */     //   159: dup
/*     */     //   160: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   162: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   165: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #146	-> 62
/*     */     //   #153	-> 97
/*     */     //   #146	-> 125
/*     */     //   #154	-> 149
/*     */     //   #146	-> 156
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   97	22	0	resource	Lorg/jetbrains/compose/resources/PluralStringResource;
/*     */     //   97	22	1	quantity	I
/*     */     //   97	31	2	args	Ljava/util/List;
/*     */     //   137	19	2	args	Ljava/util/List;
/*     */     //   97	22	3	resourceReader	Lorg/jetbrains/compose/resources/ResourceReader;
/*     */     //   97	22	4	environment	Lorg/jetbrains/compose/resources/ResourceEnvironment;
/*     */     //   149	7	6	str	Ljava/lang/String;
/*     */     //   52	104	8	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   59	97	7	$result	Ljava/lang/Object;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\library-desktop-1.7.3.jar!\org\jetbrains\compose\resources\PluralStringResourcesKt.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */