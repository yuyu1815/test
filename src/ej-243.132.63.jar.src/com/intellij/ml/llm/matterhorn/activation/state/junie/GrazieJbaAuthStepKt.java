/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AipLicenseId;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaIdToken;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieHttpError;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieGrazieRepository;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityLauncher;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.GrazieJbaAuthStep;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.OpResult;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
/*     */ import kotlinx.coroutines.CoroutineScope;
/*     */ import kotlinx.coroutines.TimeoutKt;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000N\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\020\000\n\002\b\005\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\002\b\n\n\002\030\002\n\000\032\001\020\000\032\0020\0012\006\020\002\032\0020\0032\b\020\004\032\004\030\0010\0052\006\020\006\032\0020\0072\034\020\b\032\030\b\001\022\n\022\b\022\004\022\0020\0130\n\022\006\022\004\030\0010\f0\t2\034\020\r\032\030\b\001\022\n\022\b\022\004\022\0020\0130\n\022\006\022\004\030\0010\f0\t2\034\020\016\032\030\b\001\022\n\022\b\022\004\022\0020\0130\n\022\006\022\004\030\0010\f0\tH\001¢\006\004\b\017\020\020\032.\020\021\032\b\022\004\022\0020\0230\0222\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\004\b\024\020\025\0326\020\026\032\b\022\004\022\0020\0270\0222\006\020\030\032\0020\0312\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H@¢\006\004\b\032\020\033\032&\020\034\032\b\022\004\022\0020\0230\0222\006\020\002\032\0020\0032\006\020\035\032\0020\023H@¢\006\004\b\036\020\037\0320\020 \032\n\022\006\022\004\030\0010\0270\0222\006\020\030\032\0020\0312\006\020\002\032\0020\0032\006\020\035\032\0020\023H@¢\006\004\b!\020\"\"\016\020#\032\0020$X\004¢\006\002\n\000¨\006%"}, d2 = {"grazieJbaAuthStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieJbaAuthStep;", "apiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "jbaIdToken", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaIdToken;", "aipLicenseId", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseId;", "onAuthRejected", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "", "", "onLicenseRejected", "onAgreementRequired", "grazieJbaAuthStep-toclVnw", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieJbaAuthStep;", "getAccess", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "getAccess-SRYjgCQ", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerAndProvideAccess", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt;", "grazieRepository", "Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;", "registerAndProvideAccess-jY-5xoA", "(Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "refreshToken", "authData", "refreshToken-1CSWKTE", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "verifyAndRefreshToken", "verifyAndRefreshToken-4y8iXSM", "(Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LOG", "Lcom/intellij/openapi/diagnostic/Logger;", "state.junie.impl"})
/*     */ @SourceDebugExtension({"SMAP\ngrazieJbaAuthStep.kt\nKotlin\n*S Kotlin\n*F\n+ 1 grazieJbaAuthStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 GrazieResultMapper.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapperKt\n+ 4 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,189:1\n1225#2,6:190\n1225#2,6:196\n1225#2,6:202\n1225#2,6:208\n1225#2,6:214\n1225#2,6:220\n31#3,3:226\n37#3,2:229\n37#3,3:231\n39#3:234\n37#3,3:235\n31#3,3:238\n37#3,3:241\n41#3,3:244\n37#3,3:247\n58#4:250\n36#4,2:251\n*S KotlinDebug\n*F\n+ 1 grazieJbaAuthStep.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt\n*L\n40#1:190,6\n43#1:196,6\n62#1:202,6\n69#1:208,6\n77#1:214,6\n83#1:220,6\n114#1:226,3\n127#1:229,2\n132#1:231,3\n127#1:234\n139#1:235,3\n152#1:238,3\n167#1:241,3\n175#1:244,3\n182#1:247,3\n188#1:250\n188#1:251,2\n*E\n"})
/*     */ public final class GrazieJbaAuthStepKt {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final GrazieJbaAuthStep grazieJbaAuthStep-toclVnw(@NotNull String apiUrl, @Nullable String jbaIdToken, @NotNull String aipLicenseId, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onAuthRejected, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onLicenseRejected, @NotNull Function1<? super Continuation<? super Unit>, ? extends Object> onAgreementRequired, @Nullable Composer $composer, int $changed) {
/*  39 */     Intrinsics.checkNotNullParameter(apiUrl, "apiUrl"); Intrinsics.checkNotNullParameter(aipLicenseId, "aipLicenseId"); Intrinsics.checkNotNullParameter(onAuthRejected, "onAuthRejected"); Intrinsics.checkNotNullParameter(onLicenseRejected, "onLicenseRejected"); Intrinsics.checkNotNullParameter(onAgreementRequired, "onAgreementRequired"); $composer.startReplaceGroup(-1222563479); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(-1222563479, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.grazieJbaAuthStep (grazieJbaAuthStep.kt:38)"); 
/*  40 */     $composer.startReplaceGroup(-2072052782); Composer composer1 = $composer; boolean invalid$iv = false; int $i$f$cache = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 190 */     Object it$iv = composer1.rememberedValue(); int $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */     
/* 192 */     Logger logger = LOG; int $i$a$-cache-GrazieJbaAuthStepKt$grazieJbaAuthStep$1 = 0; Object value$iv = GrazieJbaAuthStepKt::grazieJbaAuthStep_toclVnw$lambda$1$lambda$0;
/* 193 */     composer1.updateRememberedValue(value$iv);
/* 194 */     Function0 function0 = (it$iv == Composer.Companion.getEmpty()) ? (Function0)value$iv : 
/* 195 */       (Function0)it$iv; $composer.endReplaceGroup(); LoggingComposeKt.TraceComposition(logger, function0, $composer, 48); $composer.startReplaceGroup(-2072051811); if (jbaIdToken == null)
/* 196 */     { $composer.startReplaceGroup(-2072050341); Composer composer = $composer; invalid$iv = $composer.changedInstance(onAuthRejected); $i$f$cache = 0; it$iv = composer.rememberedValue(); $i$a$-let-ComposerKt$cache$1$iv = 0;
/*     */       
/* 198 */       Unit unit = Unit.INSTANCE; int $i$a$-cache-GrazieJbaAuthStepKt$grazieJbaAuthStep$2 = 0; Object object = new GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1(onAuthRejected, null);
/* 199 */       composer.updateRememberedValue(object);
/* 200 */       Function2 function21 = (invalid$iv || it$iv == Composer.Companion.getEmpty()) ? (Function2)object : 
/* 201 */         (Function2)it$iv; $composer.endReplaceGroup(); EffectsKt.LaunchedEffect(unit, function21, $composer, 6); GrazieJbaAuthStep grazieJbaAuthStep = new GrazieJbaAuthStep(null, OutcomeKt.activationStalled((AiaActivationStalled)GrazieJbaAuthPending.GrazieJbaAuthFailure.INSTANCE), null); $composer.endReplaceGroup(); if (ComposerKt.isTraceInProgress())
/* 202 */         ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return grazieJbaAuthStep; }  $composer.endReplaceGroup(); ActivityLauncher authActivity = ActivityLauncherKt.rememberActivityLauncher(GrazieResultMapper.Companion.invoke(), $composer, 0); OpResult result = authActivity.getLatestOpResult(); if (!(result instanceof OpResult.OpCompleted.OpSucceeded)) { $composer.startReplaceGroup(191573242); $composer.startReplaceGroup(-2072028827); value$iv = $composer; int k = (((($changed & 0x380 ^ 0x180) > 256 && $composer.changed(aipLicenseId)) || ($changed & 0x180) == 256) ? 1 : 0) | (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(apiUrl)) || ($changed & 0x6) == 4) ? 1 : 0) | (((($changed & 0x70 ^ 0x30) > 32 && $composer.changed(JbaIdToken.box-impl(jbaIdToken))) || ($changed & 0x30) == 32) ? 1 : 0) | $composer.changedInstance(onAuthRejected) | $composer.changedInstance(onLicenseRejected) | $composer.changedInstance(onAgreementRequired), m = 0; Object object = value$iv.rememberedValue(); int n = 0;
/* 203 */       if (k != 0 || object == Composer.Companion.getEmpty()) {
/* 204 */         ActivityLauncher activityLauncher = authActivity; int $i$a$-cache-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1 = 0; Object object3 = new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1(aipLicenseId, apiUrl, jbaIdToken, onAuthRejected, onLicenseRejected, onAgreementRequired, null);
/* 205 */         value$iv.updateRememberedValue(object3);
/*     */       }  }
/*     */     else
/*     */     { $composer.startReplaceGroup(192096274);
/*     */       
/*     */       GrazieAuthData authData = (GrazieAuthData)((OpResult.OpCompleted.OpSucceeded)result).getValue();
/*     */       $composer.startReplaceGroup(-2072010996);
/*     */       Composer composer = $composer;
/*     */       int k = (((($changed & 0xE ^ 0x6) > 4 && $composer.changed(apiUrl)) || ($changed & 0x6) == 4) ? 1 : 0) | $composer.changedInstance(authData) | $composer.changedInstance(onAuthRejected) | $composer.changedInstance(onLicenseRejected) | $composer.changedInstance(onAgreementRequired), m = 0;
/* 214 */       Object object = composer.rememberedValue(); int n = 0;
/* 215 */       if (k != 0 || object == Composer.Companion.getEmpty()) {
/* 216 */         ActivityLauncher activityLauncher = authActivity; int $i$a$-cache-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1 = 0; Object object3 = new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1(apiUrl, authData, onAuthRejected, onLicenseRejected, onAgreementRequired, null);
/* 217 */         composer.updateRememberedValue(object3);
/*     */       }  }
/* 219 */      Function1 function1 = (Function1)object;
/*     */     $composer.endReplaceGroup();
/*     */     ActivityCallable<GrazieResult<GrazieAuthData>, GrazieResult.GrazieFailure, GrazieAuthData> provideAccessCallable = ActivityCallableKt.bind(activityLauncher, function1);
/*     */     $composer.startReplaceGroup(-2072019752);
/*     */     Composer $this$cache$iv = $composer;
/*     */     boolean bool1 = $composer.changedInstance(provideAccessCallable);
/*     */     int i = 0;
/*     */     Object object1 = $this$cache$iv.rememberedValue();
/*     */     int j = 0;
/*     */     AipLicenseId aipLicenseId1 = AipLicenseId.box-impl(aipLicenseId);
/*     */     JbaIdToken jbaIdToken1 = JbaIdToken.box-impl(jbaIdToken);
/*     */     GrazieApiUrl grazieApiUrl = GrazieApiUrl.box-impl(apiUrl);
/*     */     int $i$a$-cache-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1 = 0;
/*     */     GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1 grazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1 = new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1(provideAccessCallable, null);
/*     */     Object object2 = grazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1;
/*     */     $this$cache$iv.updateRememberedValue(object2);
/*     */     Function2 function2 = (bool1 || object1 == Composer.Companion.getEmpty()) ? (Function2)object2 : (Function2)object1;
/*     */     $composer.endReplaceGroup();
/*     */     EffectsKt.LaunchedEffect(grazieApiUrl, jbaIdToken1, aipLicenseId1, function2, $composer, 0xE & $changed | 0x70 & $changed | 0x380 & $changed);
/*     */     ActivityCallable<GrazieResult<GrazieAuthData>, GrazieResult.GrazieFailure, GrazieAuthData> activityCallable1 = provideAccessCallable;
/*     */     $composer.endReplaceGroup();
/*     */   }
/*     */   @NotNull
/*     */   private static final Logger LOG;
/*     */   
/*     */   private static final String grazieJbaAuthStep_toclVnw$lambda$1$lambda$0() {
/*     */     return "Grazie JBA auth";
/*     */   }
/*     */   
/*     */   static {
/*     */     int $i$f$fileLogger = 0;
/* 250 */     int $i$f$currentClassLogger = 0;
/* 251 */     Class<?> clazz$iv$iv = MethodHandles.lookup().lookupClass();
/* 252 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(clazz$iv$iv), "getInstance(...)"); LOG = Logger.getInstance(clazz$iv$iv);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {106, 108}, i = {0, 0, 0, 1}, s = {"L$0", "L$1", "L$2", "L$0"}, n = {"apiUrl", "jbaIdToken", "aipLicenseId", "grazieRepository"}, m = "getAccess-SRYjgCQ", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieJbaAuthStepKt$getAccess$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$getAccess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieJbaAuthStepKt.getAccess-SRYjgCQ(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {44}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1(Function1<Continuation<? super Unit>, Object> $onAuthRejected, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$onAuthRejected.invoke(this) == object)
/*     */             return object; 
/*     */           this.$onAuthRejected.invoke(this);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1(this.$onAuthRejected, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Object grazieJbaAuthStep_toclVnw$handleAuthFailure(Function1 $onAuthRejected, Function1 $onLicenseRejected, Function1 $onAgreementRequired, GrazieHttpError httpError, Continuation $completion) {
/*     */     GrazieHttpError grazieHttpError = httpError;
/*     */     if (grazieHttpError instanceof GrazieHttpError.Unauthorized) {
/*     */       if ($onAuthRejected.invoke($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */         return $onAuthRejected.invoke($completion); 
/*     */       $onAuthRejected.invoke($completion);
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     if (grazieHttpError instanceof GrazieHttpError.Forbidden) {
/*     */       if ($onLicenseRejected.invoke($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */         return $onLicenseRejected.invoke($completion); 
/*     */       $onLicenseRejected.invoke($completion);
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     if (grazieHttpError instanceof GrazieHttpError.AgreementNotAccepted) {
/*     */       if ($onAgreementRequired.invoke($completion) == IntrinsicsKt.getCOROUTINE_SUSPENDED())
/*     */         return $onAgreementRequired.invoke($completion); 
/*     */       $onAgreementRequired.invoke($completion);
/*     */       return Unit.INSTANCE;
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {64}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;"})
/*     */   static final class GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1(String $aipLicenseId, String $apiUrl, String $jbaIdToken, Function1<Continuation<? super Unit>, Object> $onAuthRejected, Function1<Continuation<? super Unit>, Object> $onLicenseRejected, Function1<Continuation<? super Unit>, Object> $onAgreementRequired, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           AipLicenseChoiceStepKt.getLog().info("aipLicenseChoiceOutcome-grazieJbaAuthStep:" + AipLicenseId.toString-impl(this.$aipLicenseId));
/*     */           this.label = 1;
/*     */           if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(15, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, null) {
/*     */                 Object L$0;
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #12
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 193, 0 -> 36, 1 -> 73, 2 -> 164
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield $apiUrl : Ljava/lang/String;
/*     */                   //   44: aload_0
/*     */                   //   45: getfield $jbaIdToken : Ljava/lang/String;
/*     */                   //   48: aload_0
/*     */                   //   49: getfield $aipLicenseId : Ljava/lang/String;
/*     */                   //   52: aload_0
/*     */                   //   53: checkcast kotlin/coroutines/Continuation
/*     */                   //   56: aload_0
/*     */                   //   57: iconst_1
/*     */                   //   58: putfield label : I
/*     */                   //   61: invokestatic access$getAccess-SRYjgCQ : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   64: dup
/*     */                   //   65: aload #12
/*     */                   //   67: if_acmpne -> 78
/*     */                   //   70: aload #12
/*     */                   //   72: areturn
/*     */                   //   73: aload_1
/*     */                   //   74: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   77: aload_1
/*     */                   //   78: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   81: astore_2
/*     */                   //   82: aload_0
/*     */                   //   83: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   86: astore_3
/*     */                   //   87: aload_0
/*     */                   //   88: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   91: astore #4
/*     */                   //   93: aload_0
/*     */                   //   94: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
/*     */                   //   97: astore #5
/*     */                   //   99: iconst_0
/*     */                   //   100: istore #6
/*     */                   //   102: aload_2
/*     */                   //   103: astore #7
/*     */                   //   105: aload #7
/*     */                   //   107: astore #8
/*     */                   //   109: iconst_0
/*     */                   //   110: istore #9
/*     */                   //   112: aload #8
/*     */                   //   114: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   117: ifeq -> 188
/*     */                   //   120: aload #8
/*     */                   //   122: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   125: astore #10
/*     */                   //   127: iconst_0
/*     */                   //   128: istore #11
/*     */                   //   130: aload_3
/*     */                   //   131: aload #4
/*     */                   //   133: aload #5
/*     */                   //   135: aload #10
/*     */                   //   137: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */                   //   140: aload_0
/*     */                   //   141: aload_0
/*     */                   //   142: aload #7
/*     */                   //   144: putfield L$0 : Ljava/lang/Object;
/*     */                   //   147: aload_0
/*     */                   //   148: iconst_2
/*     */                   //   149: putfield label : I
/*     */                   //   152: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   155: dup
/*     */                   //   156: aload #12
/*     */                   //   158: if_acmpne -> 187
/*     */                   //   161: aload #12
/*     */                   //   163: areturn
/*     */                   //   164: iconst_0
/*     */                   //   165: istore #6
/*     */                   //   167: iconst_0
/*     */                   //   168: istore #9
/*     */                   //   170: iconst_0
/*     */                   //   171: istore #11
/*     */                   //   173: aload_0
/*     */                   //   174: getfield L$0 : Ljava/lang/Object;
/*     */                   //   177: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   180: astore #7
/*     */                   //   182: aload_1
/*     */                   //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   186: aload_1
/*     */                   //   187: pop
/*     */                   //   188: nop
/*     */                   //   189: aload #7
/*     */                   //   191: nop
/*     */                   //   192: areturn
/*     */                   //   193: new java/lang/IllegalStateException
/*     */                   //   196: dup
/*     */                   //   197: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   199: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   202: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #64	-> 3
/*     */                   //   #65	-> 40
/*     */                   //   #64	-> 70
/*     */                   //   #66	-> 82
/*     */                   //   #190	-> 102
/*     */                   //   #191	-> 112
/*     */                   //   #66	-> 130
/*     */                   //   #64	-> 161
/*     */                   //   #66	-> 187
/*     */                   //   #191	-> 188
/*     */                   //   #192	-> 188
/*     */                   //   #190	-> 189
/*     */                   //   #192	-> 191
/*     */                   //   #66	-> 192
/*     */                   //   #64	-> 193
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   82	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   109	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   127	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */                   //   130	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*     */                   //   112	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   102	62	6	$i$f$onFailure	I
/*     */                   //   0	203	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1;
/*     */                   //   40	153	1	$result	Ljava/lang/Object;
/*     */                   //   173	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*     */                   //   170	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   167	25	6	$i$f$onFailure	I
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(15, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, null) {
/*     */                 Object L$0;
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #12
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 193, 0 -> 36, 1 -> 73, 2 -> 164
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield $apiUrl : Ljava/lang/String;
/*     */                   //   44: aload_0
/*     */                   //   45: getfield $jbaIdToken : Ljava/lang/String;
/*     */                   //   48: aload_0
/*     */                   //   49: getfield $aipLicenseId : Ljava/lang/String;
/*     */                   //   52: aload_0
/*     */                   //   53: checkcast kotlin/coroutines/Continuation
/*     */                   //   56: aload_0
/*     */                   //   57: iconst_1
/*     */                   //   58: putfield label : I
/*     */                   //   61: invokestatic access$getAccess-SRYjgCQ : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   64: dup
/*     */                   //   65: aload #12
/*     */                   //   67: if_acmpne -> 78
/*     */                   //   70: aload #12
/*     */                   //   72: areturn
/*     */                   //   73: aload_1
/*     */                   //   74: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   77: aload_1
/*     */                   //   78: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   81: astore_2
/*     */                   //   82: aload_0
/*     */                   //   83: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   86: astore_3
/*     */                   //   87: aload_0
/*     */                   //   88: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   91: astore #4
/*     */                   //   93: aload_0
/*     */                   //   94: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
/*     */                   //   97: astore #5
/*     */                   //   99: iconst_0
/*     */                   //   100: istore #6
/*     */                   //   102: aload_2
/*     */                   //   103: astore #7
/*     */                   //   105: aload #7
/*     */                   //   107: astore #8
/*     */                   //   109: iconst_0
/*     */                   //   110: istore #9
/*     */                   //   112: aload #8
/*     */                   //   114: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   117: ifeq -> 188
/*     */                   //   120: aload #8
/*     */                   //   122: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   125: astore #10
/*     */                   //   127: iconst_0
/*     */                   //   128: istore #11
/*     */                   //   130: aload_3
/*     */                   //   131: aload #4
/*     */                   //   133: aload #5
/*     */                   //   135: aload #10
/*     */                   //   137: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */                   //   140: aload_0
/*     */                   //   141: aload_0
/*     */                   //   142: aload #7
/*     */                   //   144: putfield L$0 : Ljava/lang/Object;
/*     */                   //   147: aload_0
/*     */                   //   148: iconst_2
/*     */                   //   149: putfield label : I
/*     */                   //   152: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   155: dup
/*     */                   //   156: aload #12
/*     */                   //   158: if_acmpne -> 187
/*     */                   //   161: aload #12
/*     */                   //   163: areturn
/*     */                   //   164: iconst_0
/*     */                   //   165: istore #6
/*     */                   //   167: iconst_0
/*     */                   //   168: istore #9
/*     */                   //   170: iconst_0
/*     */                   //   171: istore #11
/*     */                   //   173: aload_0
/*     */                   //   174: getfield L$0 : Ljava/lang/Object;
/*     */                   //   177: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   180: astore #7
/*     */                   //   182: aload_1
/*     */                   //   183: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   186: aload_1
/*     */                   //   187: pop
/*     */                   //   188: nop
/*     */                   //   189: aload #7
/*     */                   //   191: nop
/*     */                   //   192: areturn
/*     */                   //   193: new java/lang/IllegalStateException
/*     */                   //   196: dup
/*     */                   //   197: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   199: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   202: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #64	-> 3
/*     */                   //   #65	-> 40
/*     */                   //   #64	-> 70
/*     */                   //   #66	-> 82
/*     */                   //   #190	-> 102
/*     */                   //   #191	-> 112
/*     */                   //   #66	-> 130
/*     */                   //   #64	-> 161
/*     */                   //   #66	-> 187
/*     */                   //   #191	-> 188
/*     */                   //   #192	-> 188
/*     */                   //   #190	-> 189
/*     */                   //   #192	-> 191
/*     */                   //   #66	-> 192
/*     */                   //   #64	-> 193
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   82	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   109	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   127	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */                   //   130	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*     */                   //   112	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   102	62	6	$i$f$onFailure	I
/*     */                   //   0	203	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1;
/*     */                   //   40	153	1	$result	Ljava/lang/Object;
/*     */                   //   173	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1$1$1	I
/*     */                   //   170	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   167	25	6	$i$f$onFailure	I
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$apiUrl, this.$jbaIdToken, this.$aipLicenseId, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1(this.$aipLicenseId, this.$apiUrl, this.$jbaIdToken, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$provideAccessCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {70}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1(ActivityCallable<GrazieResult<GrazieAuthData>, GrazieResult.GrazieFailure, GrazieAuthData> $provideAccessCallable, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object1;
/*     */       OpResult opResult;
/*     */       int $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1$1;
/*     */       Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (this.$provideAccessCallable.invoke().awaitOpResult((Continuation)this) == object2)
/*     */             return object2; 
/*     */           object1 = this.$provideAccessCallable.invoke().awaitOpResult((Continuation)this);
/*     */           opResult = (OpResult)object1;
/*     */           $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1$1 = 0;
/*     */           GrazieJbaAuthStepKt.LOG.info("Background provide-access activity finished: " + opResult);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           object1 = SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           opResult = (OpResult)object1;
/*     */           $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1$1 = 0;
/*     */           GrazieJbaAuthStepKt.LOG.info("Background provide-access activity finished: " + opResult);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1(this.$provideAccessCallable, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {78}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\030\002\n\002\030\002\020\000\032\b\022\004\022\0020\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;"})
/*     */   static final class GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1(String $apiUrl, GrazieAuthData $authData, Function1<Continuation<? super Unit>, Object> $onAuthRejected, Function1<Continuation<? super Unit>, Object> $onLicenseRejected, Function1<Continuation<? super Unit>, Object> $onAgreementRequired, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(15, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>(this.$apiUrl, this.$authData, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, null) {
/*     */                 Object L$0;
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #12
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 189, 0 -> 36, 1 -> 69, 2 -> 160
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield $apiUrl : Ljava/lang/String;
/*     */                   //   44: aload_0
/*     */                   //   45: getfield $authData : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */                   //   48: aload_0
/*     */                   //   49: checkcast kotlin/coroutines/Continuation
/*     */                   //   52: aload_0
/*     */                   //   53: iconst_1
/*     */                   //   54: putfield label : I
/*     */                   //   57: invokestatic access$refreshToken-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   60: dup
/*     */                   //   61: aload #12
/*     */                   //   63: if_acmpne -> 74
/*     */                   //   66: aload #12
/*     */                   //   68: areturn
/*     */                   //   69: aload_1
/*     */                   //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   73: aload_1
/*     */                   //   74: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   77: astore_2
/*     */                   //   78: aload_0
/*     */                   //   79: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   82: astore_3
/*     */                   //   83: aload_0
/*     */                   //   84: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   87: astore #4
/*     */                   //   89: aload_0
/*     */                   //   90: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
/*     */                   //   93: astore #5
/*     */                   //   95: iconst_0
/*     */                   //   96: istore #6
/*     */                   //   98: aload_2
/*     */                   //   99: astore #7
/*     */                   //   101: aload #7
/*     */                   //   103: astore #8
/*     */                   //   105: iconst_0
/*     */                   //   106: istore #9
/*     */                   //   108: aload #8
/*     */                   //   110: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   113: ifeq -> 184
/*     */                   //   116: aload #8
/*     */                   //   118: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   121: astore #10
/*     */                   //   123: iconst_0
/*     */                   //   124: istore #11
/*     */                   //   126: aload_3
/*     */                   //   127: aload #4
/*     */                   //   129: aload #5
/*     */                   //   131: aload #10
/*     */                   //   133: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */                   //   136: aload_0
/*     */                   //   137: aload_0
/*     */                   //   138: aload #7
/*     */                   //   140: putfield L$0 : Ljava/lang/Object;
/*     */                   //   143: aload_0
/*     */                   //   144: iconst_2
/*     */                   //   145: putfield label : I
/*     */                   //   148: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   151: dup
/*     */                   //   152: aload #12
/*     */                   //   154: if_acmpne -> 183
/*     */                   //   157: aload #12
/*     */                   //   159: areturn
/*     */                   //   160: iconst_0
/*     */                   //   161: istore #6
/*     */                   //   163: iconst_0
/*     */                   //   164: istore #9
/*     */                   //   166: iconst_0
/*     */                   //   167: istore #11
/*     */                   //   169: aload_0
/*     */                   //   170: getfield L$0 : Ljava/lang/Object;
/*     */                   //   173: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   176: astore #7
/*     */                   //   178: aload_1
/*     */                   //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   182: aload_1
/*     */                   //   183: pop
/*     */                   //   184: nop
/*     */                   //   185: aload #7
/*     */                   //   187: nop
/*     */                   //   188: areturn
/*     */                   //   189: new java/lang/IllegalStateException
/*     */                   //   192: dup
/*     */                   //   193: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   195: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   198: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #78	-> 3
/*     */                   //   #79	-> 40
/*     */                   //   #78	-> 66
/*     */                   //   #80	-> 78
/*     */                   //   #190	-> 98
/*     */                   //   #191	-> 108
/*     */                   //   #80	-> 126
/*     */                   //   #78	-> 157
/*     */                   //   #80	-> 183
/*     */                   //   #191	-> 184
/*     */                   //   #192	-> 184
/*     */                   //   #190	-> 185
/*     */                   //   #192	-> 187
/*     */                   //   #80	-> 188
/*     */                   //   #78	-> 189
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   78	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   105	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   123	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */                   //   126	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1$1	I
/*     */                   //   108	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   98	62	6	$i$f$onFailure	I
/*     */                   //   0	199	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1;
/*     */                   //   40	149	1	$result	Ljava/lang/Object;
/*     */                   //   169	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1$1	I
/*     */                   //   166	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   163	25	6	$i$f$onFailure	I
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$apiUrl, this.$authData, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this) == object)
/*     */             return object; 
/*     */           return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(15, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends GrazieAuthData>>, Object>(this.$apiUrl, this.$authData, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, null) {
/*     */                 Object L$0;
/*     */                 int label;
/*     */                 
/*     */                 public final Object invokeSuspend(Object $result) {
/*     */                   // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #12
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 189, 0 -> 36, 1 -> 69, 2 -> 160
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: aload_0
/*     */                   //   41: getfield $apiUrl : Ljava/lang/String;
/*     */                   //   44: aload_0
/*     */                   //   45: getfield $authData : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */                   //   48: aload_0
/*     */                   //   49: checkcast kotlin/coroutines/Continuation
/*     */                   //   52: aload_0
/*     */                   //   53: iconst_1
/*     */                   //   54: putfield label : I
/*     */                   //   57: invokestatic access$refreshToken-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   60: dup
/*     */                   //   61: aload #12
/*     */                   //   63: if_acmpne -> 74
/*     */                   //   66: aload #12
/*     */                   //   68: areturn
/*     */                   //   69: aload_1
/*     */                   //   70: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   73: aload_1
/*     */                   //   74: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   77: astore_2
/*     */                   //   78: aload_0
/*     */                   //   79: getfield $onAuthRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   82: astore_3
/*     */                   //   83: aload_0
/*     */                   //   84: getfield $onLicenseRejected : Lkotlin/jvm/functions/Function1;
/*     */                   //   87: astore #4
/*     */                   //   89: aload_0
/*     */                   //   90: getfield $onAgreementRequired : Lkotlin/jvm/functions/Function1;
/*     */                   //   93: astore #5
/*     */                   //   95: iconst_0
/*     */                   //   96: istore #6
/*     */                   //   98: aload_2
/*     */                   //   99: astore #7
/*     */                   //   101: aload #7
/*     */                   //   103: astore #8
/*     */                   //   105: iconst_0
/*     */                   //   106: istore #9
/*     */                   //   108: aload #8
/*     */                   //   110: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   113: ifeq -> 184
/*     */                   //   116: aload #8
/*     */                   //   118: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */                   //   121: astore #10
/*     */                   //   123: iconst_0
/*     */                   //   124: istore #11
/*     */                   //   126: aload_3
/*     */                   //   127: aload #4
/*     */                   //   129: aload #5
/*     */                   //   131: aload #10
/*     */                   //   133: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */                   //   136: aload_0
/*     */                   //   137: aload_0
/*     */                   //   138: aload #7
/*     */                   //   140: putfield L$0 : Ljava/lang/Object;
/*     */                   //   143: aload_0
/*     */                   //   144: iconst_2
/*     */                   //   145: putfield label : I
/*     */                   //   148: invokestatic access$grazieJbaAuthStep_toclVnw$handleAuthFailure : (Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   151: dup
/*     */                   //   152: aload #12
/*     */                   //   154: if_acmpne -> 183
/*     */                   //   157: aload #12
/*     */                   //   159: areturn
/*     */                   //   160: iconst_0
/*     */                   //   161: istore #6
/*     */                   //   163: iconst_0
/*     */                   //   164: istore #9
/*     */                   //   166: iconst_0
/*     */                   //   167: istore #11
/*     */                   //   169: aload_0
/*     */                   //   170: getfield L$0 : Ljava/lang/Object;
/*     */                   //   173: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   176: astore #7
/*     */                   //   178: aload_1
/*     */                   //   179: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   182: aload_1
/*     */                   //   183: pop
/*     */                   //   184: nop
/*     */                   //   185: aload #7
/*     */                   //   187: nop
/*     */                   //   188: areturn
/*     */                   //   189: new java/lang/IllegalStateException
/*     */                   //   192: dup
/*     */                   //   193: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   195: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   198: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #78	-> 3
/*     */                   //   #79	-> 40
/*     */                   //   #78	-> 66
/*     */                   //   #80	-> 78
/*     */                   //   #190	-> 98
/*     */                   //   #191	-> 108
/*     */                   //   #80	-> 126
/*     */                   //   #78	-> 157
/*     */                   //   #80	-> 183
/*     */                   //   #191	-> 184
/*     */                   //   #192	-> 184
/*     */                   //   #190	-> 185
/*     */                   //   #192	-> 187
/*     */                   //   #80	-> 188
/*     */                   //   #78	-> 189
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   78	27	2	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   105	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   123	28	10	it	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */                   //   126	34	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1$1	I
/*     */                   //   108	52	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   98	62	6	$i$f$onFailure	I
/*     */                   //   0	199	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1;
/*     */                   //   40	149	1	$result	Ljava/lang/Object;
/*     */                   //   169	15	11	$i$a$-onFailure-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1$1$1	I
/*     */                   //   166	19	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */                   //   163	25	6	$i$f$onFailure	I
/*     */                 }
/*     */                 
/*     */                 public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) {
/*     */                   return (Continuation)new Function2<>(this.$apiUrl, this.$authData, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*     */                 }
/*     */                 
/*     */                 public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */                   return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */                 }
/*     */               }(Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1(this.$apiUrl, this.$authData, this.$onAuthRejected, this.$onLicenseRejected, this.$onAgreementRequired, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$refreshTokenCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {84, 85}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1(ActivityCallable<GrazieResult<GrazieAuthData>, GrazieResult.GrazieFailure, GrazieAuthData> $refreshTokenCallable, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Object object1;
/*     */       OpResult opResult;
/*     */       int $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1;
/*     */       Object object2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 1;
/*     */           if (DelayKt.delay-VtjQ1oo(DurationKt.toDuration(3, DurationUnit.HOURS), (Continuation)this) == object2)
/*     */             return object2; 
/*     */           DelayKt.delay-VtjQ1oo(DurationKt.toDuration(3, DurationUnit.HOURS), (Continuation)this);
/*     */           this.label = 2;
/*     */           if (this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this) == object2)
/*     */             return object2; 
/*     */           object1 = this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this);
/*     */           opResult = (OpResult)object1;
/*     */           $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1 = 0;
/*     */           GrazieJbaAuthStepKt.LOG.info("Background refresh-token activity finished: " + opResult);
/*     */           return Unit.INSTANCE;
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           this.label = 2;
/*     */           if (this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this) == object2)
/*     */             return object2; 
/*     */           object1 = this.$refreshTokenCallable.invoke().awaitOpResult((Continuation)this);
/*     */           opResult = (OpResult)object1;
/*     */           $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1 = 0;
/*     */           GrazieJbaAuthStepKt.LOG.info("Background refresh-token activity finished: " + opResult);
/*     */           return Unit.INSTANCE;
/*     */         case 2:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           object1 = SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           opResult = (OpResult)object1;
/*     */           $i$a$-also-GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1$1 = 0;
/*     */           GrazieJbaAuthStepKt.LOG.info("Background refresh-token activity finished: " + opResult);
/*     */           return Unit.INSTANCE;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1> $completion) {
/*     */       return (Continuation<Unit>)new GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1(this.$refreshTokenCallable, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((GrazieJbaAuthStepKt$grazieJbaAuthStep$authCallable$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */   }
/*     */   
/*     */   private static final Object getAccess-SRYjgCQ(String apiUrl, String jbaIdToken, String aipLicenseId, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$getAccess$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$getAccess$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #12
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 51
/*     */     //   41: new com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$getAccess$1
/*     */     //   44: dup
/*     */     //   45: aload_3
/*     */     //   46: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   49: astore #12
/*     */     //   51: aload #12
/*     */     //   53: getfield result : Ljava/lang/Object;
/*     */     //   56: astore #11
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #14
/*     */     //   63: aload #12
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 333, 0 -> 96, 1 -> 142, 2 -> 225
/*     */     //   96: aload #11
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion;
/*     */     //   104: aload #12
/*     */     //   106: aload #12
/*     */     //   108: aload_0
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #12
/*     */     //   114: aload_1
/*     */     //   115: putfield L$1 : Ljava/lang/Object;
/*     */     //   118: aload #12
/*     */     //   120: aload_2
/*     */     //   121: putfield L$2 : Ljava/lang/Object;
/*     */     //   124: aload #12
/*     */     //   126: iconst_1
/*     */     //   127: putfield label : I
/*     */     //   130: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   133: dup
/*     */     //   134: aload #14
/*     */     //   136: if_acmpne -> 176
/*     */     //   139: aload #14
/*     */     //   141: areturn
/*     */     //   142: aload #12
/*     */     //   144: getfield L$2 : Ljava/lang/Object;
/*     */     //   147: checkcast java/lang/String
/*     */     //   150: astore_2
/*     */     //   151: aload #12
/*     */     //   153: getfield L$1 : Ljava/lang/Object;
/*     */     //   156: checkcast java/lang/String
/*     */     //   159: astore_1
/*     */     //   160: aload #12
/*     */     //   162: getfield L$0 : Ljava/lang/Object;
/*     */     //   165: checkcast java/lang/String
/*     */     //   168: astore_0
/*     */     //   169: aload #11
/*     */     //   171: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   174: aload #11
/*     */     //   176: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   179: astore #4
/*     */     //   181: aload #4
/*     */     //   183: aload_0
/*     */     //   184: aload_1
/*     */     //   185: aload_2
/*     */     //   186: aload #12
/*     */     //   188: aload #12
/*     */     //   190: aload #4
/*     */     //   192: putfield L$0 : Ljava/lang/Object;
/*     */     //   195: aload #12
/*     */     //   197: aconst_null
/*     */     //   198: putfield L$1 : Ljava/lang/Object;
/*     */     //   201: aload #12
/*     */     //   203: aconst_null
/*     */     //   204: putfield L$2 : Ljava/lang/Object;
/*     */     //   207: aload #12
/*     */     //   209: iconst_2
/*     */     //   210: putfield label : I
/*     */     //   213: invokestatic registerAndProvideAccess-jY-5xoA : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   216: dup
/*     */     //   217: aload #14
/*     */     //   219: if_acmpne -> 242
/*     */     //   222: aload #14
/*     */     //   224: areturn
/*     */     //   225: aload #12
/*     */     //   227: getfield L$0 : Ljava/lang/Object;
/*     */     //   230: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   233: astore #4
/*     */     //   235: aload #11
/*     */     //   237: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   240: aload #11
/*     */     //   242: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   245: astore #5
/*     */     //   247: aload #5
/*     */     //   249: astore #6
/*     */     //   251: iconst_0
/*     */     //   252: istore #7
/*     */     //   254: aload #6
/*     */     //   256: astore #8
/*     */     //   258: aload #8
/*     */     //   260: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   263: ifeq -> 271
/*     */     //   266: aload #6
/*     */     //   268: goto -> 332
/*     */     //   271: aload #8
/*     */     //   273: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   276: ifeq -> 324
/*     */     //   279: aload #6
/*     */     //   281: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   284: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   287: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt
/*     */     //   290: invokevirtual unbox-impl : ()Ljava/lang/String;
/*     */     //   293: astore #9
/*     */     //   295: iconst_0
/*     */     //   296: istore #10
/*     */     //   298: aload #4
/*     */     //   300: aload #9
/*     */     //   302: invokeinterface authJwtToAuthData-cj1q3Zw : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   307: astore #13
/*     */     //   309: new com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   312: dup
/*     */     //   313: aload #13
/*     */     //   315: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   318: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   321: goto -> 332
/*     */     //   324: new kotlin/NoWhenBranchMatchedException
/*     */     //   327: dup
/*     */     //   328: invokespecial <init> : ()V
/*     */     //   331: athrow
/*     */     //   332: areturn
/*     */     //   333: new java/lang/IllegalStateException
/*     */     //   336: dup
/*     */     //   337: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   340: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   343: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #101	-> 61
/*     */     //   #106	-> 101
/*     */     //   #101	-> 139
/*     */     //   #109	-> 181
/*     */     //   #110	-> 183
/*     */     //   #111	-> 184
/*     */     //   #112	-> 185
/*     */     //   #108	-> 188
/*     */     //   #101	-> 222
/*     */     //   #114	-> 247
/*     */     //   #226	-> 254
/*     */     //   #227	-> 258
/*     */     //   #228	-> 271
/*     */     //   #115	-> 298
/*     */     //   #228	-> 307
/*     */     //   #226	-> 324
/*     */     //   #114	-> 332
/*     */     //   #101	-> 333
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	41	0	apiUrl	Ljava/lang/String;
/*     */     //   169	15	0	apiUrl	Ljava/lang/String;
/*     */     //   101	41	1	jbaIdToken	Ljava/lang/String;
/*     */     //   160	25	1	jbaIdToken	Ljava/lang/String;
/*     */     //   101	41	2	aipLicenseId	Ljava/lang/String;
/*     */     //   151	37	2	aipLicenseId	Ljava/lang/String;
/*     */     //   181	44	4	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   235	36	4	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   271	36	4	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   247	4	5	result	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   251	20	6	$this$map$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   271	24	6	$this$map$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   295	12	9	authJwt	Ljava/lang/String;
/*     */     //   298	9	10	$i$a$-map-GrazieJbaAuthStepKt$getAccess$2	I
/*     */     //   254	78	7	$i$f$map	I
/*     */     //   0	344	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   51	282	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	275	11	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Object registerAndProvideAccess-jY-5xoA(JunieGrazieRepository grazieRepository, String apiUrl, String jbaIdToken, String aipLicenseId, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$registerAndProvideAccess$1
/*     */     //   5: ifeq -> 43
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$registerAndProvideAccess$1
/*     */     //   13: astore #20
/*     */     //   15: aload #20
/*     */     //   17: getfield label : I
/*     */     //   20: ldc_w -2147483648
/*     */     //   23: iand
/*     */     //   24: ifeq -> 43
/*     */     //   27: aload #20
/*     */     //   29: dup
/*     */     //   30: getfield label : I
/*     */     //   33: ldc_w -2147483648
/*     */     //   36: isub
/*     */     //   37: putfield label : I
/*     */     //   40: goto -> 54
/*     */     //   43: new com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$registerAndProvideAccess$1
/*     */     //   46: dup
/*     */     //   47: aload #4
/*     */     //   49: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   52: astore #20
/*     */     //   54: aload #20
/*     */     //   56: getfield result : Ljava/lang/Object;
/*     */     //   59: astore #19
/*     */     //   61: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   64: astore #21
/*     */     //   66: aload #20
/*     */     //   68: getfield label : I
/*     */     //   71: tableswitch default -> 636, 0 -> 100, 1 -> 177, 2 -> 348, 3 -> 534
/*     */     //   100: aload #19
/*     */     //   102: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   105: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   108: aload_1
/*     */     //   109: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   112: aload_2
/*     */     //   113: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   116: aload_3
/*     */     //   117: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   120: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/*     */     //   125: invokevirtual debug : (Ljava/lang/String;)V
/*     */     //   128: aload_0
/*     */     //   129: aload_1
/*     */     //   130: aload_2
/*     */     //   131: aload #20
/*     */     //   133: aload #20
/*     */     //   135: aload_0
/*     */     //   136: putfield L$0 : Ljava/lang/Object;
/*     */     //   139: aload #20
/*     */     //   141: aload_1
/*     */     //   142: putfield L$1 : Ljava/lang/Object;
/*     */     //   145: aload #20
/*     */     //   147: aload_2
/*     */     //   148: putfield L$2 : Ljava/lang/Object;
/*     */     //   151: aload #20
/*     */     //   153: aload_3
/*     */     //   154: putfield L$3 : Ljava/lang/Object;
/*     */     //   157: aload #20
/*     */     //   159: iconst_1
/*     */     //   160: putfield label : I
/*     */     //   163: invokeinterface jbaUserInfo-mvY-0G4 : (Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   168: dup
/*     */     //   169: aload #21
/*     */     //   171: if_acmpne -> 220
/*     */     //   174: aload #21
/*     */     //   176: areturn
/*     */     //   177: aload #20
/*     */     //   179: getfield L$3 : Ljava/lang/Object;
/*     */     //   182: checkcast java/lang/String
/*     */     //   185: astore_3
/*     */     //   186: aload #20
/*     */     //   188: getfield L$2 : Ljava/lang/Object;
/*     */     //   191: checkcast java/lang/String
/*     */     //   194: astore_2
/*     */     //   195: aload #20
/*     */     //   197: getfield L$1 : Ljava/lang/Object;
/*     */     //   200: checkcast java/lang/String
/*     */     //   203: astore_1
/*     */     //   204: aload #20
/*     */     //   206: getfield L$0 : Ljava/lang/Object;
/*     */     //   209: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   212: astore_0
/*     */     //   213: aload #19
/*     */     //   215: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   218: aload #19
/*     */     //   220: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   223: astore #5
/*     */     //   225: iconst_0
/*     */     //   226: istore #6
/*     */     //   228: aload #5
/*     */     //   230: astore #7
/*     */     //   232: aload #7
/*     */     //   234: astore #8
/*     */     //   236: iconst_0
/*     */     //   237: istore #9
/*     */     //   239: aload #8
/*     */     //   241: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   244: ifeq -> 475
/*     */     //   247: aload #8
/*     */     //   249: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   252: astore #10
/*     */     //   254: iconst_0
/*     */     //   255: istore #11
/*     */     //   257: aload #10
/*     */     //   259: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */     //   262: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$NotFound
/*     */     //   265: ifne -> 292
/*     */     //   268: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   271: aload_1
/*     */     //   272: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   275: aload_2
/*     */     //   276: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   279: aload #10
/*     */     //   281: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;)Ljava/lang/String;
/*     */     //   286: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   289: aload #10
/*     */     //   291: areturn
/*     */     //   292: aload_0
/*     */     //   293: aload_1
/*     */     //   294: aload_2
/*     */     //   295: aload #20
/*     */     //   297: aload #20
/*     */     //   299: aload_0
/*     */     //   300: putfield L$0 : Ljava/lang/Object;
/*     */     //   303: aload #20
/*     */     //   305: aload_1
/*     */     //   306: putfield L$1 : Ljava/lang/Object;
/*     */     //   309: aload #20
/*     */     //   311: aload_2
/*     */     //   312: putfield L$2 : Ljava/lang/Object;
/*     */     //   315: aload #20
/*     */     //   317: aload_3
/*     */     //   318: putfield L$3 : Ljava/lang/Object;
/*     */     //   321: aload #20
/*     */     //   323: aload #7
/*     */     //   325: putfield L$4 : Ljava/lang/Object;
/*     */     //   328: aload #20
/*     */     //   330: iconst_2
/*     */     //   331: putfield label : I
/*     */     //   334: invokeinterface jbaRegister-mvY-0G4 : (Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   339: dup
/*     */     //   340: aload #21
/*     */     //   342: if_acmpne -> 410
/*     */     //   345: aload #21
/*     */     //   347: areturn
/*     */     //   348: iconst_0
/*     */     //   349: istore #6
/*     */     //   351: iconst_0
/*     */     //   352: istore #9
/*     */     //   354: iconst_0
/*     */     //   355: istore #11
/*     */     //   357: aload #20
/*     */     //   359: getfield L$4 : Ljava/lang/Object;
/*     */     //   362: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   365: astore #7
/*     */     //   367: aload #20
/*     */     //   369: getfield L$3 : Ljava/lang/Object;
/*     */     //   372: checkcast java/lang/String
/*     */     //   375: astore_3
/*     */     //   376: aload #20
/*     */     //   378: getfield L$2 : Ljava/lang/Object;
/*     */     //   381: checkcast java/lang/String
/*     */     //   384: astore_2
/*     */     //   385: aload #20
/*     */     //   387: getfield L$1 : Ljava/lang/Object;
/*     */     //   390: checkcast java/lang/String
/*     */     //   393: astore_1
/*     */     //   394: aload #20
/*     */     //   396: getfield L$0 : Ljava/lang/Object;
/*     */     //   399: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   402: astore_0
/*     */     //   403: aload #19
/*     */     //   405: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   408: aload #19
/*     */     //   410: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   413: astore #12
/*     */     //   415: iconst_0
/*     */     //   416: istore #13
/*     */     //   418: aload #12
/*     */     //   420: astore #14
/*     */     //   422: aload #14
/*     */     //   424: astore #15
/*     */     //   426: iconst_0
/*     */     //   427: istore #16
/*     */     //   429: aload #15
/*     */     //   431: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   434: ifeq -> 471
/*     */     //   437: aload #15
/*     */     //   439: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   442: astore #17
/*     */     //   444: iconst_0
/*     */     //   445: istore #18
/*     */     //   447: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   450: aload_1
/*     */     //   451: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   454: aload_2
/*     */     //   455: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   458: aload #17
/*     */     //   460: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;)Ljava/lang/String;
/*     */     //   465: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   468: aload #17
/*     */     //   470: areturn
/*     */     //   471: nop
/*     */     //   472: nop
/*     */     //   473: nop
/*     */     //   474: nop
/*     */     //   475: nop
/*     */     //   476: nop
/*     */     //   477: nop
/*     */     //   478: aload_0
/*     */     //   479: aload_1
/*     */     //   480: aload_2
/*     */     //   481: aload_3
/*     */     //   482: aload #20
/*     */     //   484: aload #20
/*     */     //   486: aload_1
/*     */     //   487: putfield L$0 : Ljava/lang/Object;
/*     */     //   490: aload #20
/*     */     //   492: aload_2
/*     */     //   493: putfield L$1 : Ljava/lang/Object;
/*     */     //   496: aload #20
/*     */     //   498: aload_3
/*     */     //   499: putfield L$2 : Ljava/lang/Object;
/*     */     //   502: aload #20
/*     */     //   504: aconst_null
/*     */     //   505: putfield L$3 : Ljava/lang/Object;
/*     */     //   508: aload #20
/*     */     //   510: aconst_null
/*     */     //   511: putfield L$4 : Ljava/lang/Object;
/*     */     //   514: aload #20
/*     */     //   516: iconst_3
/*     */     //   517: putfield label : I
/*     */     //   520: invokeinterface jbaProvideAccess-SRYjgCQ : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   525: dup
/*     */     //   526: aload #21
/*     */     //   528: if_acmpne -> 568
/*     */     //   531: aload #21
/*     */     //   533: areturn
/*     */     //   534: aload #20
/*     */     //   536: getfield L$2 : Ljava/lang/Object;
/*     */     //   539: checkcast java/lang/String
/*     */     //   542: astore_3
/*     */     //   543: aload #20
/*     */     //   545: getfield L$1 : Ljava/lang/Object;
/*     */     //   548: checkcast java/lang/String
/*     */     //   551: astore_2
/*     */     //   552: aload #20
/*     */     //   554: getfield L$0 : Ljava/lang/Object;
/*     */     //   557: checkcast java/lang/String
/*     */     //   560: astore_1
/*     */     //   561: aload #19
/*     */     //   563: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   566: aload #19
/*     */     //   568: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   571: astore #5
/*     */     //   573: iconst_0
/*     */     //   574: istore #6
/*     */     //   576: aload #5
/*     */     //   578: astore #7
/*     */     //   580: aload #7
/*     */     //   582: astore #8
/*     */     //   584: iconst_0
/*     */     //   585: istore #9
/*     */     //   587: aload #8
/*     */     //   589: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   592: ifeq -> 631
/*     */     //   595: aload #8
/*     */     //   597: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   600: astore #10
/*     */     //   602: iconst_0
/*     */     //   603: istore #11
/*     */     //   605: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   608: aload_1
/*     */     //   609: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   612: aload_2
/*     */     //   613: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   616: aload_3
/*     */     //   617: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   620: aload #10
/*     */     //   622: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;)Ljava/lang/String;
/*     */     //   627: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   630: nop
/*     */     //   631: nop
/*     */     //   632: aload #7
/*     */     //   634: nop
/*     */     //   635: areturn
/*     */     //   636: new java/lang/IllegalStateException
/*     */     //   639: dup
/*     */     //   640: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   643: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   646: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #119	-> 64
/*     */     //   #125	-> 105
/*     */     //   #127	-> 128
/*     */     //   #119	-> 174
/*     */     //   #229	-> 228
/*     */     //   #230	-> 239
/*     */     //   #128	-> 257
/*     */     //   #129	-> 268
/*     */     //   #130	-> 289
/*     */     //   #132	-> 292
/*     */     //   #119	-> 345
/*     */     //   #231	-> 418
/*     */     //   #232	-> 429
/*     */     //   #133	-> 447
/*     */     //   #134	-> 468
/*     */     //   #233	-> 471
/*     */     //   #231	-> 472
/*     */     //   #233	-> 473
/*     */     //   #136	-> 474
/*     */     //   #230	-> 475
/*     */     //   #234	-> 475
/*     */     //   #229	-> 476
/*     */     //   #234	-> 477
/*     */     //   #138	-> 478
/*     */     //   #119	-> 531
/*     */     //   #139	-> 573
/*     */     //   #235	-> 576
/*     */     //   #236	-> 587
/*     */     //   #140	-> 605
/*     */     //   #141	-> 630
/*     */     //   #236	-> 631
/*     */     //   #237	-> 631
/*     */     //   #235	-> 632
/*     */     //   #237	-> 634
/*     */     //   #138	-> 635
/*     */     //   #119	-> 636
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   105	72	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   213	135	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   403	41	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   471	4	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   475	3	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   478	47	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   105	72	1	apiUrl	Ljava/lang/String;
/*     */     //   204	144	1	apiUrl	Ljava/lang/String;
/*     */     //   394	74	1	apiUrl	Ljava/lang/String;
/*     */     //   471	4	1	apiUrl	Ljava/lang/String;
/*     */     //   475	59	1	apiUrl	Ljava/lang/String;
/*     */     //   561	69	1	apiUrl	Ljava/lang/String;
/*     */     //   105	72	2	jbaIdToken	Ljava/lang/String;
/*     */     //   195	153	2	jbaIdToken	Ljava/lang/String;
/*     */     //   385	83	2	jbaIdToken	Ljava/lang/String;
/*     */     //   471	4	2	jbaIdToken	Ljava/lang/String;
/*     */     //   475	59	2	jbaIdToken	Ljava/lang/String;
/*     */     //   552	78	2	jbaIdToken	Ljava/lang/String;
/*     */     //   105	72	3	aipLicenseId	Ljava/lang/String;
/*     */     //   186	162	3	aipLicenseId	Ljava/lang/String;
/*     */     //   376	68	3	aipLicenseId	Ljava/lang/String;
/*     */     //   471	4	3	aipLicenseId	Ljava/lang/String;
/*     */     //   475	59	3	aipLicenseId	Ljava/lang/String;
/*     */     //   543	87	3	aipLicenseId	Ljava/lang/String;
/*     */     //   225	11	5	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   573	11	5	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   236	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   584	18	8	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   254	38	10	userInfoFailure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */     //   602	29	10	failure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */     //   415	59	12	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   426	46	15	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   444	27	17	registerFailure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */     //   447	24	18	$i$a$-onFailure-GrazieJbaAuthStepKt$registerAndProvideAccess$2$1	I
/*     */     //   429	43	16	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */     //   418	56	13	$i$f$onFailure	I
/*     */     //   257	91	11	$i$a$-onFailure-GrazieJbaAuthStepKt$registerAndProvideAccess$2	I
/*     */     //   239	109	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */     //   228	120	6	$i$f$onFailure	I
/*     */     //   605	26	11	$i$a$-onFailure-GrazieJbaAuthStepKt$registerAndProvideAccess$3	I
/*     */     //   587	45	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */     //   576	59	6	$i$f$onFailure	I
/*     */     //   0	647	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   54	582	20	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   61	575	19	$result	Ljava/lang/Object;
/*     */     //   357	118	11	$i$a$-onFailure-GrazieJbaAuthStepKt$registerAndProvideAccess$2	I
/*     */     //   354	122	9	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */     //   351	127	6	$i$f$onFailure	I
/*     */   }
/*     */   
/*     */   private static final Object refreshToken-1CSWKTE(String apiUrl, GrazieAuthData authData, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$refreshToken$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_2
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$refreshToken$1
/*     */     //   11: astore #11
/*     */     //   13: aload #11
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #11
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 51
/*     */     //   41: new com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$refreshToken$1
/*     */     //   44: dup
/*     */     //   45: aload_2
/*     */     //   46: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   49: astore #11
/*     */     //   51: aload #11
/*     */     //   53: getfield result : Ljava/lang/Object;
/*     */     //   56: astore #10
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #13
/*     */     //   63: aload #11
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 334, 0 -> 96, 1 -> 136, 2 -> 200
/*     */     //   96: aload #10
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion;
/*     */     //   104: aload #11
/*     */     //   106: aload #11
/*     */     //   108: aload_0
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #11
/*     */     //   114: aload_1
/*     */     //   115: putfield L$1 : Ljava/lang/Object;
/*     */     //   118: aload #11
/*     */     //   120: iconst_1
/*     */     //   121: putfield label : I
/*     */     //   124: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   127: dup
/*     */     //   128: aload #13
/*     */     //   130: if_acmpne -> 161
/*     */     //   133: aload #13
/*     */     //   135: areturn
/*     */     //   136: aload #11
/*     */     //   138: getfield L$1 : Ljava/lang/Object;
/*     */     //   141: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData
/*     */     //   144: astore_1
/*     */     //   145: aload #11
/*     */     //   147: getfield L$0 : Ljava/lang/Object;
/*     */     //   150: checkcast java/lang/String
/*     */     //   153: astore_0
/*     */     //   154: aload #10
/*     */     //   156: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   159: aload #10
/*     */     //   161: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   164: astore_3
/*     */     //   165: aload_3
/*     */     //   166: aload_0
/*     */     //   167: aload_1
/*     */     //   168: aload #11
/*     */     //   170: aload #11
/*     */     //   172: aload_1
/*     */     //   173: putfield L$0 : Ljava/lang/Object;
/*     */     //   176: aload #11
/*     */     //   178: aload_3
/*     */     //   179: putfield L$1 : Ljava/lang/Object;
/*     */     //   182: aload #11
/*     */     //   184: iconst_2
/*     */     //   185: putfield label : I
/*     */     //   188: invokestatic verifyAndRefreshToken-4y8iXSM : (Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   191: dup
/*     */     //   192: aload #13
/*     */     //   194: if_acmpne -> 225
/*     */     //   197: aload #13
/*     */     //   199: areturn
/*     */     //   200: aload #11
/*     */     //   202: getfield L$1 : Ljava/lang/Object;
/*     */     //   205: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   208: astore_3
/*     */     //   209: aload #11
/*     */     //   211: getfield L$0 : Ljava/lang/Object;
/*     */     //   214: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData
/*     */     //   217: astore_1
/*     */     //   218: aload #10
/*     */     //   220: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   223: aload #10
/*     */     //   225: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   228: astore #4
/*     */     //   230: aload #4
/*     */     //   232: astore #5
/*     */     //   234: iconst_0
/*     */     //   235: istore #6
/*     */     //   237: aload #5
/*     */     //   239: astore #7
/*     */     //   241: aload #7
/*     */     //   243: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   246: ifeq -> 254
/*     */     //   249: aload #5
/*     */     //   251: goto -> 333
/*     */     //   254: aload #7
/*     */     //   256: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   259: ifeq -> 325
/*     */     //   262: aload #5
/*     */     //   264: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   267: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   270: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthJwt
/*     */     //   273: dup
/*     */     //   274: ifnull -> 283
/*     */     //   277: invokevirtual unbox-impl : ()Ljava/lang/String;
/*     */     //   280: goto -> 285
/*     */     //   283: pop
/*     */     //   284: aconst_null
/*     */     //   285: astore #8
/*     */     //   287: iconst_0
/*     */     //   288: istore #9
/*     */     //   290: aload #8
/*     */     //   292: ifnonnull -> 299
/*     */     //   295: aload_1
/*     */     //   296: goto -> 307
/*     */     //   299: aload_3
/*     */     //   300: aload #8
/*     */     //   302: invokeinterface authJwtToAuthData-cj1q3Zw : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   307: nop
/*     */     //   308: astore #12
/*     */     //   310: new com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   313: dup
/*     */     //   314: aload #12
/*     */     //   316: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   319: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   322: goto -> 333
/*     */     //   325: new kotlin/NoWhenBranchMatchedException
/*     */     //   328: dup
/*     */     //   329: invokespecial <init> : ()V
/*     */     //   332: athrow
/*     */     //   333: areturn
/*     */     //   334: new java/lang/IllegalStateException
/*     */     //   337: dup
/*     */     //   338: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   341: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   344: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #144	-> 61
/*     */     //   #145	-> 101
/*     */     //   #144	-> 133
/*     */     //   #148	-> 165
/*     */     //   #149	-> 166
/*     */     //   #150	-> 167
/*     */     //   #147	-> 170
/*     */     //   #144	-> 197
/*     */     //   #152	-> 230
/*     */     //   #238	-> 237
/*     */     //   #239	-> 241
/*     */     //   #240	-> 254
/*     */     //   #153	-> 290
/*     */     //   #154	-> 292
/*     */     //   #155	-> 299
/*     */     //   #156	-> 307
/*     */     //   #240	-> 308
/*     */     //   #238	-> 325
/*     */     //   #152	-> 333
/*     */     //   #144	-> 334
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	35	0	apiUrl	Ljava/lang/String;
/*     */     //   154	13	0	apiUrl	Ljava/lang/String;
/*     */     //   101	35	1	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   145	55	1	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   218	36	1	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   254	45	1	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   165	35	3	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   209	45	3	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   254	45	3	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   299	8	3	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   230	4	4	result	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   234	20	5	$this$map$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   254	29	5	$this$map$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   287	12	8	authJwt	Ljava/lang/String;
/*     */     //   299	8	8	authJwt	Ljava/lang/String;
/*     */     //   290	18	9	$i$a$-map-GrazieJbaAuthStepKt$refreshToken$2	I
/*     */     //   237	96	6	$i$f$map	I
/*     */     //   0	345	2	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   51	283	11	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	276	10	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Object verifyAndRefreshToken-4y8iXSM(JunieGrazieRepository grazieRepository, String apiUrl, GrazieAuthData authData, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: instanceof com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$verifyAndRefreshToken$1
/*     */     //   4: ifeq -> 41
/*     */     //   7: aload_3
/*     */     //   8: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$verifyAndRefreshToken$1
/*     */     //   11: astore #12
/*     */     //   13: aload #12
/*     */     //   15: getfield label : I
/*     */     //   18: ldc_w -2147483648
/*     */     //   21: iand
/*     */     //   22: ifeq -> 41
/*     */     //   25: aload #12
/*     */     //   27: dup
/*     */     //   28: getfield label : I
/*     */     //   31: ldc_w -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 51
/*     */     //   41: new com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt$verifyAndRefreshToken$1
/*     */     //   44: dup
/*     */     //   45: aload_3
/*     */     //   46: invokespecial <init> : (Lkotlin/coroutines/Continuation;)V
/*     */     //   49: astore #12
/*     */     //   51: aload #12
/*     */     //   53: getfield result : Ljava/lang/Object;
/*     */     //   56: astore #11
/*     */     //   58: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   61: astore #13
/*     */     //   63: aload #12
/*     */     //   65: getfield label : I
/*     */     //   68: tableswitch default -> 474, 0 -> 96, 1 -> 144, 2 -> 388
/*     */     //   96: aload #11
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: aload_1
/*     */     //   103: aload_2
/*     */     //   104: aload #12
/*     */     //   106: aload #12
/*     */     //   108: aload_0
/*     */     //   109: putfield L$0 : Ljava/lang/Object;
/*     */     //   112: aload #12
/*     */     //   114: aload_1
/*     */     //   115: putfield L$1 : Ljava/lang/Object;
/*     */     //   118: aload #12
/*     */     //   120: aload_2
/*     */     //   121: putfield L$2 : Ljava/lang/Object;
/*     */     //   124: aload #12
/*     */     //   126: iconst_1
/*     */     //   127: putfield label : I
/*     */     //   130: invokeinterface verifyToken-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   135: dup
/*     */     //   136: aload #13
/*     */     //   138: if_acmpne -> 178
/*     */     //   141: aload #13
/*     */     //   143: areturn
/*     */     //   144: aload #12
/*     */     //   146: getfield L$2 : Ljava/lang/Object;
/*     */     //   149: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData
/*     */     //   152: astore_2
/*     */     //   153: aload #12
/*     */     //   155: getfield L$1 : Ljava/lang/Object;
/*     */     //   158: checkcast java/lang/String
/*     */     //   161: astore_1
/*     */     //   162: aload #12
/*     */     //   164: getfield L$0 : Ljava/lang/Object;
/*     */     //   167: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */     //   170: astore_0
/*     */     //   171: aload #11
/*     */     //   173: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   176: aload #11
/*     */     //   178: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   181: astore #4
/*     */     //   183: iconst_0
/*     */     //   184: istore #5
/*     */     //   186: aload #4
/*     */     //   188: astore #6
/*     */     //   190: aload #6
/*     */     //   192: astore #7
/*     */     //   194: iconst_0
/*     */     //   195: istore #8
/*     */     //   197: aload #7
/*     */     //   199: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   202: ifeq -> 259
/*     */     //   205: aload #7
/*     */     //   207: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   210: astore #9
/*     */     //   212: iconst_0
/*     */     //   213: istore #10
/*     */     //   215: aload #9
/*     */     //   217: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */     //   220: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$Unauthorized
/*     */     //   223: ifne -> 258
/*     */     //   226: aload #9
/*     */     //   228: invokevirtual getHttpError : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError;
/*     */     //   231: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieHttpError$Forbidden
/*     */     //   234: ifne -> 258
/*     */     //   237: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   240: aload_1
/*     */     //   241: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   244: aload_2
/*     */     //   245: aload #9
/*     */     //   247: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;)Ljava/lang/String;
/*     */     //   252: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   255: aload #9
/*     */     //   257: areturn
/*     */     //   258: nop
/*     */     //   259: nop
/*     */     //   260: aload #6
/*     */     //   262: nop
/*     */     //   263: astore #4
/*     */     //   265: iconst_0
/*     */     //   266: istore #5
/*     */     //   268: aload #4
/*     */     //   270: astore #6
/*     */     //   272: aload #6
/*     */     //   274: astore #7
/*     */     //   276: iconst_0
/*     */     //   277: istore #8
/*     */     //   279: aload #7
/*     */     //   281: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   284: ifeq -> 342
/*     */     //   287: aload #7
/*     */     //   289: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   292: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   295: checkcast kotlinx/datetime/Instant
/*     */     //   298: astore #9
/*     */     //   300: iconst_0
/*     */     //   301: istore #10
/*     */     //   303: aload #9
/*     */     //   305: getstatic kotlinx/datetime/Clock$System.INSTANCE : Lkotlinx/datetime/Clock$System;
/*     */     //   308: invokevirtual now : ()Lkotlinx/datetime/Instant;
/*     */     //   311: getstatic kotlin/time/Duration.Companion : Lkotlin/time/Duration$Companion;
/*     */     //   314: pop
/*     */     //   315: bipush #6
/*     */     //   317: getstatic kotlin/time/DurationUnit.HOURS : Lkotlin/time/DurationUnit;
/*     */     //   320: invokestatic toDuration : (ILkotlin/time/DurationUnit;)J
/*     */     //   323: invokevirtual plus-LRDsOJo : (J)Lkotlinx/datetime/Instant;
/*     */     //   326: invokevirtual compareTo : (Lkotlinx/datetime/Instant;)I
/*     */     //   329: ifle -> 341
/*     */     //   332: new com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */     //   335: dup
/*     */     //   336: aconst_null
/*     */     //   337: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   340: areturn
/*     */     //   341: nop
/*     */     //   342: nop
/*     */     //   343: nop
/*     */     //   344: nop
/*     */     //   345: aload_0
/*     */     //   346: aload_1
/*     */     //   347: aload_2
/*     */     //   348: aload #12
/*     */     //   350: aload #12
/*     */     //   352: aload_1
/*     */     //   353: putfield L$0 : Ljava/lang/Object;
/*     */     //   356: aload #12
/*     */     //   358: aload_2
/*     */     //   359: putfield L$1 : Ljava/lang/Object;
/*     */     //   362: aload #12
/*     */     //   364: aconst_null
/*     */     //   365: putfield L$2 : Ljava/lang/Object;
/*     */     //   368: aload #12
/*     */     //   370: iconst_2
/*     */     //   371: putfield label : I
/*     */     //   374: invokeinterface refreshToken-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   379: dup
/*     */     //   380: aload #13
/*     */     //   382: if_acmpne -> 413
/*     */     //   385: aload #13
/*     */     //   387: areturn
/*     */     //   388: aload #12
/*     */     //   390: getfield L$1 : Ljava/lang/Object;
/*     */     //   393: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData
/*     */     //   396: astore_2
/*     */     //   397: aload #12
/*     */     //   399: getfield L$0 : Ljava/lang/Object;
/*     */     //   402: checkcast java/lang/String
/*     */     //   405: astore_1
/*     */     //   406: aload #11
/*     */     //   408: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   411: aload #11
/*     */     //   413: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */     //   416: astore #4
/*     */     //   418: iconst_0
/*     */     //   419: istore #5
/*     */     //   421: aload #4
/*     */     //   423: astore #6
/*     */     //   425: aload #6
/*     */     //   427: astore #7
/*     */     //   429: iconst_0
/*     */     //   430: istore #8
/*     */     //   432: aload #7
/*     */     //   434: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   437: ifeq -> 469
/*     */     //   440: aload #7
/*     */     //   442: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure
/*     */     //   445: astore #9
/*     */     //   447: iconst_0
/*     */     //   448: istore #10
/*     */     //   450: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieJbaAuthStepKt.LOG : Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   453: aload_1
/*     */     //   454: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */     //   457: aload_2
/*     */     //   458: aload #9
/*     */     //   460: <illegal opcode> makeConcatWithConstants : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;)Ljava/lang/String;
/*     */     //   465: invokevirtual info : (Ljava/lang/String;)V
/*     */     //   468: nop
/*     */     //   469: nop
/*     */     //   470: aload #6
/*     */     //   472: nop
/*     */     //   473: areturn
/*     */     //   474: new java/lang/IllegalStateException
/*     */     //   477: dup
/*     */     //   478: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   481: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   484: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #160	-> 61
/*     */     //   #166	-> 101
/*     */     //   #160	-> 141
/*     */     //   #167	-> 183
/*     */     //   #241	-> 186
/*     */     //   #242	-> 197
/*     */     //   #168	-> 215
/*     */     //   #169	-> 226
/*     */     //   #171	-> 237
/*     */     //   #172	-> 255
/*     */     //   #174	-> 258
/*     */     //   #242	-> 259
/*     */     //   #243	-> 259
/*     */     //   #241	-> 260
/*     */     //   #243	-> 262
/*     */     //   #175	-> 265
/*     */     //   #244	-> 268
/*     */     //   #245	-> 279
/*     */     //   #176	-> 303
/*     */     //   #176	-> 323
/*     */     //   #177	-> 332
/*     */     //   #179	-> 341
/*     */     //   #245	-> 342
/*     */     //   #246	-> 342
/*     */     //   #244	-> 343
/*     */     //   #246	-> 344
/*     */     //   #181	-> 345
/*     */     //   #160	-> 385
/*     */     //   #182	-> 418
/*     */     //   #247	-> 421
/*     */     //   #248	-> 432
/*     */     //   #183	-> 450
/*     */     //   #184	-> 468
/*     */     //   #248	-> 469
/*     */     //   #249	-> 469
/*     */     //   #247	-> 470
/*     */     //   #249	-> 472
/*     */     //   #181	-> 473
/*     */     //   #160	-> 474
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	43	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   171	66	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   258	1	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   259	4	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   263	69	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   341	1	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   342	3	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   345	34	0	grazieRepository	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */     //   101	43	1	apiUrl	Ljava/lang/String;
/*     */     //   162	93	1	apiUrl	Ljava/lang/String;
/*     */     //   258	1	1	apiUrl	Ljava/lang/String;
/*     */     //   259	4	1	apiUrl	Ljava/lang/String;
/*     */     //   263	69	1	apiUrl	Ljava/lang/String;
/*     */     //   341	1	1	apiUrl	Ljava/lang/String;
/*     */     //   342	46	1	apiUrl	Ljava/lang/String;
/*     */     //   406	62	1	apiUrl	Ljava/lang/String;
/*     */     //   101	43	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   153	102	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   258	1	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   259	4	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   263	69	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   341	1	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   342	46	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   397	71	2	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   183	11	4	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   265	11	4	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   418	11	4	$this$onFailure$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   194	18	7	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   276	24	7	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   429	18	7	$this$onFailure_u24lambda_u240$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */     //   212	46	9	verifyFailure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */     //   300	42	9	expirationTime	Lkotlinx/datetime/Instant;
/*     */     //   447	22	9	refreshFailure	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieFailure;
/*     */     //   215	44	10	$i$a$-onFailure-GrazieJbaAuthStepKt$verifyAndRefreshToken$2	I
/*     */     //   197	63	8	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */     //   186	77	5	$i$f$onFailure	I
/*     */     //   303	39	10	$i$a$-onSuccess-GrazieJbaAuthStepKt$verifyAndRefreshToken$3	I
/*     */     //   279	64	8	$i$a$-apply-GrazieResultMapperKt$onSuccess$1$iv	I
/*     */     //   268	77	5	$i$f$onSuccess	I
/*     */     //   450	19	10	$i$a$-onFailure-GrazieJbaAuthStepKt$verifyAndRefreshToken$4	I
/*     */     //   432	38	8	$i$a$-apply-GrazieResultMapperKt$onFailure$1$iv	I
/*     */     //   421	52	5	$i$f$onFailure	I
/*     */     //   0	485	3	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   51	423	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   58	416	11	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {145, 147}, i = {0, 0, 1, 1}, s = {"L$0", "L$1", "L$0", "L$1"}, n = {"apiUrl", "authData", "authData", "grazieRepository"}, m = "refreshToken-1CSWKTE", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieJbaAuthStepKt$refreshToken$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$refreshToken$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieJbaAuthStepKt.refreshToken-1CSWKTE(null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {127, 132, 138}, i = {0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2"}, n = {"grazieRepository", "apiUrl", "jbaIdToken", "aipLicenseId", "grazieRepository", "apiUrl", "jbaIdToken", "aipLicenseId", "apiUrl", "jbaIdToken", "aipLicenseId"}, m = "registerAndProvideAccess-jY-5xoA", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieJbaAuthStepKt$registerAndProvideAccess$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$registerAndProvideAccess$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieJbaAuthStepKt.registerAndProvideAccess-jY-5xoA(null, null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "grazieJbaAuthStep.kt", l = {166, 181}, i = {0, 0, 0, 1, 1}, s = {"L$0", "L$1", "L$2", "L$0", "L$1"}, n = {"grazieRepository", "apiUrl", "authData", "apiUrl", "authData"}, m = "verifyAndRefreshToken-4y8iXSM", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.GrazieJbaAuthStepKt")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieJbaAuthStepKt$verifyAndRefreshToken$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     int label;
/*     */     
/*     */     GrazieJbaAuthStepKt$verifyAndRefreshToken$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieJbaAuthStepKt.verifyAndRefreshToken-4y8iXSM(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\GrazieJbaAuthStepKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */