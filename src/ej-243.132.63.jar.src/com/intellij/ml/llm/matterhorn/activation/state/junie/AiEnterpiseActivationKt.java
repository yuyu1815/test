/*     */ package com.intellij.ml.llm.matterhorn.activation.state.junie;
/*     */ 
/*     */ import androidx.compose.runtime.Composable;
/*     */ import androidx.compose.runtime.Composer;
/*     */ import androidx.compose.runtime.ComposerKt;
/*     */ import com.intellij.ml.llm.activation.data.model.LlmModelId;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.AieProvisionStatus;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.GrazieAuthData;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthFailure;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.AieAuthResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.data.model.result.GrazieResult;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.activity.ActivityCallable;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.data.AieProvisionStore;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.data.StateLazyKt;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.junie.util.OutcomeKt;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiEnterpriseActivation;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivationProgressing;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivationRoadblocked;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AiaActivationStalled;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AieAllowanceStep;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AieAuthStep;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AieFetchCapabilitiesPending;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AieFetchCapabilitiesStep;
/*     */ import com.intellij.ml.llm.matterhorn.activation.state.model.AieRestricted;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLM;
/*     */ import com.intellij.openapi.diagnostic.Logger;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.List;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.NoWhenBranchMatchedException;
/*     */ import kotlin.ResultKt;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.intrinsics.IntrinsicsKt;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.coroutines.jvm.internal.SuspendLambda;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.functions.Function2;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
/*     */ import kotlin.time.DurationKt;
/*     */ import kotlin.time.DurationUnit;
/*     */ import kotlinx.coroutines.CoroutineScope;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 2, xi = 48, d1 = {"\000`\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\002\b\002\n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\000\032\037\020\000\032\0020\0012\b\b\002\020\002\032\0020\0032\006\020\004\032\0020\005H\001¢\006\002\020\006\032!\020\007\032\016\022\004\022\0020\t\022\004\022\0020\n0\b2\006\020\004\032\0020\005H\002¢\006\002\020\013\032!\020\f\032\016\022\004\022\0020\r\022\004\022\0020\0160\b2\006\020\002\032\0020\003H\003¢\006\002\020\017\032#\020\020\032\016\022\004\022\0020\t\022\004\022\002H\0210\b\"\004\b\000\020\021*\0020\022H\002¢\006\002\020\023\032#\020\024\032\016\022\004\022\0020\r\022\004\022\002H\0210\b\"\004\b\000\020\021*\0020\025H\002¢\006\002\020\026\032\037\020\027\032\0020\0302\006\020\031\032\0020\0322\006\020\033\032\0020\034H\003¢\006\004\b\035\020\036\032\016\020\037\032\b\022\004\022\0020!0 H\002¨\006\""}, d2 = {"aiEnterpriseActivation", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation;", "store", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;", "provisionedStatus", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;Landroidx/compose/runtime/Composer;II)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation;", "aieAllowanceStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowancePending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowed;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;)Ljava/lang/Object;", "aieAuthStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthenticated;", "(Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;", "toAllowanceIncomplete", "T", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieBlocked;)Ljava/lang/Object;", "toAuthIncomplete", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure;", "(Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/AieAuthFailure;)Ljava/lang/Object;", "aieFetchCapabilitiesStep", "Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;", "apiUrl", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;", "authData", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;", "aieFetchCapabilitiesStep-wZDqZQU", "(Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;", "computeModelRequirements", "", "Lcom/intellij/ml/llm/activation/data/model/LlmModelId;", "state.junie.impl"})
/*     */ @SourceDebugExtension({"SMAP\naiEnterpiseActivation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 aiEnterpiseActivation.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 service.kt\ncom/intellij/openapi/components/ServiceKt\n+ 4 outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/util/OutcomeKt\n+ 5 Outcome.kt\ncom/intellij/ml/llm/matterhorn/activation/state/model/Outcome\n+ 6 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 8 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,184:1\n47#2:185\n40#3,3:186\n21#4:189\n22#4:193\n21#4:194\n22#4:198\n30#4:199\n21#4:200\n22#4:204\n16#5,3:190\n16#5,3:195\n16#5,3:201\n58#6:205\n36#6,2:206\n1225#7,6:208\n1225#7,6:214\n1225#7,6:220\n1557#8:226\n1628#8,3:227\n*S KotlinDebug\n*F\n+ 1 aiEnterpiseActivation.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt\n*L\n36#1:185\n36#1:186,3\n39#1:189\n39#1:193\n45#1:194\n45#1:198\n58#1:199\n58#1:200\n58#1:204\n39#1:190,3\n45#1:195,3\n58#1:201,3\n119#1:205\n119#1:206,2\n122#1:208,6\n135#1:214,6\n160#1:220,6\n180#1:226\n180#1:227,3\n*E\n"})
/*     */ public final class AiEnterpiseActivationKt
/*     */ {
/*     */   @Composable
/*     */   @NotNull
/*     */   public static final AiEnterpriseActivation aiEnterpriseActivation(@Nullable AieProvisionStore store, @NotNull AieProvisionStatus.AieProvisioned provisionedStatus, @Nullable Composer $composer, int $changed, int paramInt1) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: ldc 'provisionedStatus'
/*     */     //   3: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   6: aload_2
/*     */     //   7: ldc -1287520327
/*     */     //   9: invokeinterface startReplaceGroup : (I)V
/*     */     //   14: iload #4
/*     */     //   16: iconst_1
/*     */     //   17: iand
/*     */     //   18: ifeq -> 118
/*     */     //   21: iconst_0
/*     */     //   22: istore #5
/*     */     //   24: iconst_0
/*     */     //   25: istore #6
/*     */     //   27: ldc com/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore
/*     */     //   29: astore #7
/*     */     //   31: invokestatic getApplication : ()Lcom/intellij/openapi/application/Application;
/*     */     //   34: aload #7
/*     */     //   36: invokeinterface getService : (Ljava/lang/Class;)Ljava/lang/Object;
/*     */     //   41: dup
/*     */     //   42: ifnonnull -> 109
/*     */     //   45: pop
/*     */     //   46: new java/lang/RuntimeException
/*     */     //   49: dup
/*     */     //   50: new java/lang/StringBuilder
/*     */     //   53: dup
/*     */     //   54: invokespecial <init> : ()V
/*     */     //   57: ldc 'Cannot find service '
/*     */     //   59: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   62: aload #7
/*     */     //   64: invokevirtual getName : ()Ljava/lang/String;
/*     */     //   67: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   70: ldc ' (classloader='
/*     */     //   72: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   75: aload #7
/*     */     //   77: invokevirtual getClassLoader : ()Ljava/lang/ClassLoader;
/*     */     //   80: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   83: ldc ', client='
/*     */     //   85: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
/*     */     //   88: getstatic com/intellij/codeWithMe/ClientId.Companion : Lcom/intellij/codeWithMe/ClientId$Companion;
/*     */     //   91: invokevirtual getCurrentOrNull : ()Lcom/intellij/codeWithMe/ClientId;
/*     */     //   94: invokevirtual append : (Ljava/lang/Object;)Ljava/lang/StringBuilder;
/*     */     //   97: bipush #41
/*     */     //   99: invokevirtual append : (C)Ljava/lang/StringBuilder;
/*     */     //   102: invokevirtual toString : ()Ljava/lang/String;
/*     */     //   105: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   108: athrow
/*     */     //   109: nop
/*     */     //   110: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore
/*     */     //   113: nop
/*     */     //   114: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore
/*     */     //   117: astore_0
/*     */     //   118: invokestatic isTraceInProgress : ()Z
/*     */     //   121: ifeq -> 133
/*     */     //   124: ldc -1287520327
/*     */     //   126: iload_3
/*     */     //   127: iconst_m1
/*     */     //   128: ldc 'com.intellij.ml.llm.matterhorn.activation.state.junie.aiEnterpriseActivation (aiEnterpiseActivation.kt:37)'
/*     */     //   130: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   133: aload_1
/*     */     //   134: invokestatic aieAllowanceStep : (Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;)Ljava/lang/Object;
/*     */     //   137: astore #6
/*     */     //   139: iconst_0
/*     */     //   140: istore #7
/*     */     //   142: iconst_0
/*     */     //   143: istore #8
/*     */     //   145: aload #6
/*     */     //   147: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   150: istore #9
/*     */     //   152: iload #9
/*     */     //   154: iconst_1
/*     */     //   155: if_icmpne -> 214
/*     */     //   158: aload #6
/*     */     //   160: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   163: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowancePending
/*     */     //   166: astore #10
/*     */     //   168: iconst_0
/*     */     //   169: istore #11
/*     */     //   171: new com/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation
/*     */     //   174: dup
/*     */     //   175: aload #10
/*     */     //   177: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep
/*     */     //   180: aconst_null
/*     */     //   181: aconst_null
/*     */     //   182: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/Outcome.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;
/*     */     //   185: aload #10
/*     */     //   187: invokevirtual ofIncomplete-l12Rbqo : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   190: aconst_null
/*     */     //   191: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   194: astore #12
/*     */     //   196: invokestatic isTraceInProgress : ()Z
/*     */     //   199: ifeq -> 205
/*     */     //   202: invokestatic traceEventEnd : ()V
/*     */     //   205: aload_2
/*     */     //   206: invokeinterface endReplaceGroup : ()V
/*     */     //   211: aload #12
/*     */     //   213: areturn
/*     */     //   214: iload #9
/*     */     //   216: ifne -> 234
/*     */     //   219: aload #6
/*     */     //   221: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   224: astore #13
/*     */     //   226: iconst_0
/*     */     //   227: istore #14
/*     */     //   229: aload #13
/*     */     //   231: goto -> 242
/*     */     //   234: new kotlin/NoWhenBranchMatchedException
/*     */     //   237: dup
/*     */     //   238: invokespecial <init> : ()V
/*     */     //   241: athrow
/*     */     //   242: nop
/*     */     //   243: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowed
/*     */     //   246: astore #5
/*     */     //   248: aload_0
/*     */     //   249: aload_2
/*     */     //   250: bipush #14
/*     */     //   252: iload_3
/*     */     //   253: iand
/*     */     //   254: invokestatic aieAuthStep : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;
/*     */     //   257: astore #7
/*     */     //   259: iconst_0
/*     */     //   260: istore #8
/*     */     //   262: iconst_0
/*     */     //   263: istore #9
/*     */     //   265: aload #7
/*     */     //   267: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   270: istore #10
/*     */     //   272: iload #10
/*     */     //   274: iconst_1
/*     */     //   275: if_icmpne -> 338
/*     */     //   278: aload #7
/*     */     //   280: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   283: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending
/*     */     //   286: astore #11
/*     */     //   288: iconst_0
/*     */     //   289: istore #12
/*     */     //   291: new com/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation
/*     */     //   294: dup
/*     */     //   295: aload #5
/*     */     //   297: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep
/*     */     //   300: aload #11
/*     */     //   302: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep
/*     */     //   305: aconst_null
/*     */     //   306: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/Outcome.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;
/*     */     //   309: aload #11
/*     */     //   311: invokevirtual ofIncomplete-l12Rbqo : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   314: aconst_null
/*     */     //   315: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   318: astore #13
/*     */     //   320: invokestatic isTraceInProgress : ()Z
/*     */     //   323: ifeq -> 329
/*     */     //   326: invokestatic traceEventEnd : ()V
/*     */     //   329: aload_2
/*     */     //   330: invokeinterface endReplaceGroup : ()V
/*     */     //   335: aload #13
/*     */     //   337: areturn
/*     */     //   338: iload #10
/*     */     //   340: ifne -> 358
/*     */     //   343: aload #7
/*     */     //   345: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   348: astore #14
/*     */     //   350: iconst_0
/*     */     //   351: istore #15
/*     */     //   353: aload #14
/*     */     //   355: goto -> 366
/*     */     //   358: new kotlin/NoWhenBranchMatchedException
/*     */     //   361: dup
/*     */     //   362: invokespecial <init> : ()V
/*     */     //   365: athrow
/*     */     //   366: nop
/*     */     //   367: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthenticated
/*     */     //   370: astore #6
/*     */     //   372: aload #5
/*     */     //   374: invokevirtual getActivatedStatus : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieActivated;
/*     */     //   377: invokevirtual getApiUrl-vI_bMBc : ()Ljava/lang/String;
/*     */     //   380: astore #7
/*     */     //   382: aload #6
/*     */     //   384: invokevirtual getAuthData : ()Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   387: astore #8
/*     */     //   389: aload #7
/*     */     //   391: aload #8
/*     */     //   393: aload_2
/*     */     //   394: iconst_0
/*     */     //   395: invokestatic aieFetchCapabilitiesStep-wZDqZQU : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;
/*     */     //   398: astore #9
/*     */     //   400: aload #9
/*     */     //   402: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/Journey
/*     */     //   405: astore #10
/*     */     //   407: iconst_0
/*     */     //   408: istore #11
/*     */     //   410: aload #10
/*     */     //   412: invokeinterface getOutcome-07x5Wys : ()Ljava/lang/Object;
/*     */     //   417: astore #12
/*     */     //   419: iconst_0
/*     */     //   420: istore #13
/*     */     //   422: iconst_0
/*     */     //   423: istore #14
/*     */     //   425: aload #12
/*     */     //   427: invokestatic isIncomplete-impl : (Ljava/lang/Object;)Z
/*     */     //   430: istore #15
/*     */     //   432: iload #15
/*     */     //   434: iconst_1
/*     */     //   435: if_icmpne -> 499
/*     */     //   438: aload #12
/*     */     //   440: invokestatic incompleteOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   443: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending
/*     */     //   446: astore #16
/*     */     //   448: iconst_0
/*     */     //   449: istore #17
/*     */     //   451: new com/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation
/*     */     //   454: dup
/*     */     //   455: aload #5
/*     */     //   457: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep
/*     */     //   460: aload #6
/*     */     //   462: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep
/*     */     //   465: aload #9
/*     */     //   467: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/Outcome.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/model/Outcome$Companion;
/*     */     //   470: aload #16
/*     */     //   472: invokevirtual ofIncomplete-l12Rbqo : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   475: aconst_null
/*     */     //   476: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   479: astore #18
/*     */     //   481: invokestatic isTraceInProgress : ()Z
/*     */     //   484: ifeq -> 490
/*     */     //   487: invokestatic traceEventEnd : ()V
/*     */     //   490: aload_2
/*     */     //   491: invokeinterface endReplaceGroup : ()V
/*     */     //   496: aload #18
/*     */     //   498: areturn
/*     */     //   499: iload #15
/*     */     //   501: ifne -> 518
/*     */     //   504: aload #12
/*     */     //   506: invokestatic getOrNull-impl : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   509: astore #19
/*     */     //   511: iconst_0
/*     */     //   512: istore #20
/*     */     //   514: nop
/*     */     //   515: goto -> 526
/*     */     //   518: new kotlin/NoWhenBranchMatchedException
/*     */     //   521: dup
/*     */     //   522: invokespecial <init> : ()V
/*     */     //   525: athrow
/*     */     //   526: nop
/*     */     //   527: nop
/*     */     //   528: new com/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext
/*     */     //   531: dup
/*     */     //   532: aload #7
/*     */     //   534: aload #8
/*     */     //   536: aconst_null
/*     */     //   537: iconst_1
/*     */     //   538: aconst_null
/*     */     //   539: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lcom/intellij/ml/llm/matterhorn/activation/data/model/AipLicenseProductType;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   542: astore #10
/*     */     //   544: new com/intellij/ml/llm/matterhorn/activation/state/model/AiEnterpriseActivation
/*     */     //   547: dup
/*     */     //   548: aload #5
/*     */     //   550: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep
/*     */     //   553: aload #6
/*     */     //   555: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep
/*     */     //   558: aload #9
/*     */     //   560: aload #10
/*     */     //   562: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   565: aconst_null
/*     */     //   566: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   569: astore #11
/*     */     //   571: invokestatic isTraceInProgress : ()Z
/*     */     //   574: ifeq -> 580
/*     */     //   577: invokestatic traceEventEnd : ()V
/*     */     //   580: aload_2
/*     */     //   581: invokeinterface endReplaceGroup : ()V
/*     */     //   586: aload #11
/*     */     //   588: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #36	-> 21
/*     */     //   #185	-> 24
/*     */     //   #186	-> 27
/*     */     //   #187	-> 31
/*     */     //   #188	-> 46
/*     */     //   #187	-> 109
/*     */     //   #185	-> 113
/*     */     //   #38	-> 130
/*     */     //   #39	-> 133
/*     */     //   #189	-> 142
/*     */     //   #190	-> 145
/*     */     //   #191	-> 152
/*     */     //   #40	-> 171
/*     */     //   #41	-> 175
/*     */     //   #42	-> 182
/*     */     //   #40	-> 191
/*     */     //   #192	-> 214
/*     */     //   #193	-> 229
/*     */     //   #192	-> 231
/*     */     //   #190	-> 234
/*     */     //   #189	-> 242
/*     */     //   #39	-> 243
/*     */     //   #45	-> 248
/*     */     //   #194	-> 262
/*     */     //   #195	-> 265
/*     */     //   #196	-> 272
/*     */     //   #46	-> 291
/*     */     //   #47	-> 295
/*     */     //   #48	-> 306
/*     */     //   #46	-> 315
/*     */     //   #197	-> 338
/*     */     //   #198	-> 353
/*     */     //   #197	-> 355
/*     */     //   #195	-> 358
/*     */     //   #194	-> 366
/*     */     //   #45	-> 367
/*     */     //   #54	-> 372
/*     */     //   #55	-> 382
/*     */     //   #57	-> 389
/*     */     //   #58	-> 400
/*     */     //   #199	-> 410
/*     */     //   #200	-> 422
/*     */     //   #201	-> 425
/*     */     //   #202	-> 432
/*     */     //   #59	-> 451
/*     */     //   #60	-> 455
/*     */     //   #61	-> 467
/*     */     //   #59	-> 476
/*     */     //   #203	-> 499
/*     */     //   #204	-> 514
/*     */     //   #203	-> 515
/*     */     //   #201	-> 518
/*     */     //   #200	-> 526
/*     */     //   #199	-> 527
/*     */     //   #65	-> 528
/*     */     //   #66	-> 532
/*     */     //   #67	-> 534
/*     */     //   #68	-> 536
/*     */     //   #69	-> 537
/*     */     //   #65	-> 539
/*     */     //   #71	-> 544
/*     */     //   #72	-> 548
/*     */     //   #73	-> 560
/*     */     //   #71	-> 566
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   27	83	6	$i$f$service	I
/*     */     //   31	79	7	serviceClass$iv$iv	Ljava/lang/Class;
/*     */     //   24	90	5	$i$f$rememberDataStore	I
/*     */     //   171	43	11	$i$a$-getOrElse-G1CwGJM-AiEnterpiseActivationKt$aiEnterpriseActivation$aieAllowed$1	I
/*     */     //   168	46	10	allowanceStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowancePending;
/*     */     //   229	2	14	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv	I
/*     */     //   226	5	13	it$iv	Ljava/lang/Object;
/*     */     //   145	97	8	$i$f$fold-impl	I
/*     */     //   142	101	7	$i$f$getOrElse-G1CwGJM	I
/*     */     //   139	104	6	$this$getOrElse_u2dG1CwGJM$iv	Ljava/lang/Object;
/*     */     //   291	47	12	$i$a$-getOrElse-G1CwGJM-AiEnterpiseActivationKt$aiEnterpriseActivation$aieAuthenticated$1	I
/*     */     //   288	50	11	authStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthPending;
/*     */     //   353	2	15	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv	I
/*     */     //   350	5	14	it$iv	Ljava/lang/Object;
/*     */     //   265	101	9	$i$f$fold-impl	I
/*     */     //   262	105	8	$i$f$getOrElse-G1CwGJM	I
/*     */     //   259	108	7	$this$getOrElse_u2dG1CwGJM$iv	Ljava/lang/Object;
/*     */     //   451	48	17	$i$a$-completeOrElse-AiEnterpiseActivationKt$aiEnterpriseActivation$1	I
/*     */     //   448	51	16	pending	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending;
/*     */     //   514	1	20	$i$a$-fold-impl-OutcomeKt$getOrElse$1$iv$iv	I
/*     */     //   511	4	19	it$iv$iv	Ljava/lang/Object;
/*     */     //   425	101	14	$i$f$fold-impl	I
/*     */     //   422	105	13	$i$f$getOrElse-G1CwGJM	I
/*     */     //   419	108	12	$this$getOrElse_u2dG1CwGJM$iv$iv	Ljava/lang/Object;
/*     */     //   410	118	11	$i$f$completeOrElse	I
/*     */     //   407	121	10	$this$completeOrElse$iv	Lcom/intellij/ml/llm/matterhorn/activation/state/model/Journey;
/*     */     //   248	341	5	aieAllowed	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAllowanceStep$AieAllowed;
/*     */     //   372	217	6	aieAuthenticated	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieAuthStep$AieAuthenticated;
/*     */     //   382	207	7	apiUrl	Ljava/lang/String;
/*     */     //   389	200	8	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   400	189	9	compatibilityStep	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep;
/*     */     //   544	45	10	authContext	Lcom/intellij/ml/llm/matterhorn/activation/state/model/GrazieAuthContext;
/*     */     //   0	589	0	store	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AieProvisionStore;
/*     */     //   0	589	1	provisionedStatus	Lcom/intellij/ml/llm/matterhorn/activation/data/model/AieProvisionStatus$AieProvisioned;
/*     */     //   0	589	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	589	3	$changed	I
/*     */   }
/*     */   
/*     */   private static final Object aieAllowanceStep(AieProvisionStatus.AieProvisioned provisionedStatus) {
/*  78 */     AieProvisionStatus.AieProvisioned aieProvisioned = provisionedStatus;
/*     */     
/*  80 */     if (aieProvisioned instanceof AieProvisionStatus.AieActivated) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*  85 */     return (aieProvisioned instanceof AieProvisionStatus.AieBlocked) ? toAllowanceIncomplete((AieProvisionStatus.AieBlocked)provisionedStatus) : "JD-Core does not support Kotlin"; } @Composable private static final Object aieAuthStep(AieProvisionStore store, Composer $composer, int $changed) { $composer.startReplaceGroup(1154655699); if (ComposerKt.isTraceInProgress()) ComposerKt.traceEventStart(1154655699, $changed, -1, "com.intellij.ml.llm.matterhorn.activation.state.junie.aieAuthStep (aiEnterpiseActivation.kt:84)"); 
/*  86 */     AieAuthResult authResult = (AieAuthResult)StateLazyKt.observeValue(store.getAuthDataLazy(), $composer, 0);
/*     */     
/*  88 */     AieAuthResult aieAuthResult1 = authResult;
/*     */ 
/*     */     
/*  91 */     if (aieAuthResult1 instanceof AieAuthResult.AieAuthSuccess) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     }  Object object = Intrinsics.areEqual(aieAuthResult1, AieAuthFailure.AieServiceUnavailable.INSTANCE) ? OutcomeKt.activationProgressing((AiaActivationProgressing)AieAuthStep.AieAuthInitializing.INSTANCE) : ((aieAuthResult1 instanceof AieAuthFailure) ? toAuthIncomplete((AieAuthFailure)authResult) : "JD-Core does not support Kotlin"); if (ComposerKt.isTraceInProgress())
/*  96 */       ComposerKt.traceEventEnd();  $composer.endReplaceGroup(); return object; } private static final <T> Object toAllowanceIncomplete(AieProvisionStatus.AieBlocked $this$toAllowanceIncomplete) { AieProvisionStatus.AieBlocked aieBlocked = $this$toAllowanceIncomplete; return 
/*  97 */       Intrinsics.areEqual(aieBlocked, AieProvisionStatus.AieBlocked.AieProvisionerLoginRequired.INSTANCE) ? OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)AieRestricted.AieAuthRequired.INSTANCE) : (
/*  98 */       (aieBlocked instanceof AieProvisionStatus.AieBlocked.AieProvisioningError) ? 
/*  99 */       OutcomeKt.activationStalled((AiaActivationStalled)new AieRestricted.AieFailure(((AieProvisionStatus.AieBlocked.AieProvisioningError)$this$toAllowanceIncomplete).getMessage())) : 
/*     */       
/* 101 */       OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)AieAllowanceStep.AieProhibited.INSTANCE)); }
/*     */ 
/*     */   
/*     */   private static final <T> Object toAuthIncomplete(AieAuthFailure $this$toAuthIncomplete)
/*     */   {
/* 106 */     AieAuthFailure aieAuthFailure = $this$toAuthIncomplete;
/*     */ 
/*     */     
/* 109 */     if (aieAuthFailure instanceof AieAuthFailure.AieAuthGenericError) {
/*     */     
/*     */     } else {
/*     */       throw new NoWhenBranchMatchedException();
/*     */     } 
/*     */     return (aieAuthFailure instanceof AieAuthFailure.AieServiceUnavailable) ? OutcomeKt.activationProgressing((AiaActivationProgressing)AieAuthStep.AieAuthInitializing.INSTANCE) : (Intrinsics.areEqual(aieAuthFailure, AieAuthFailure.AieLoginRequired.INSTANCE) ? OutcomeKt.activationRoadblocked((AiaActivationRoadblocked)AieRestricted.AieAuthRequired.INSTANCE) : "JD-Core does not support Kotlin");
/*     */   } @Composable
/*     */   private static final AieFetchCapabilitiesStep aieFetchCapabilitiesStep-wZDqZQU(String apiUrl, GrazieAuthData authData, Composer $composer, int $changed) {
/*     */     // Byte code:
/*     */     //   0: aload_2
/*     */     //   1: ldc_w -1859121984
/*     */     //   4: invokeinterface startReplaceGroup : (I)V
/*     */     //   9: invokestatic isTraceInProgress : ()Z
/*     */     //   12: ifeq -> 26
/*     */     //   15: ldc_w -1859121984
/*     */     //   18: iload_3
/*     */     //   19: iconst_m1
/*     */     //   20: ldc_w 'com.intellij.ml.llm.matterhorn.activation.state.junie.aieFetchCapabilitiesStep (aiEnterpiseActivation.kt:116)'
/*     */     //   23: invokestatic traceEventStart : (IIILjava/lang/String;)V
/*     */     //   26: iconst_0
/*     */     //   27: istore #5
/*     */     //   29: iconst_0
/*     */     //   30: istore #6
/*     */     //   32: invokestatic lookup : ()Ljava/lang/invoke/MethodHandles$Lookup;
/*     */     //   35: invokevirtual lookupClass : ()Ljava/lang/Class;
/*     */     //   38: astore #7
/*     */     //   40: aload #7
/*     */     //   42: invokestatic getInstance : (Ljava/lang/Class;)Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   45: dup
/*     */     //   46: ldc_w 'getInstance(...)'
/*     */     //   49: invokestatic checkNotNullExpressionValue : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   52: nop
/*     */     //   53: astore #4
/*     */     //   55: getstatic com/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapper.Companion : Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapper$Companion;
/*     */     //   58: invokevirtual invoke : ()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/GrazieResultMapper;
/*     */     //   61: checkcast com/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper
/*     */     //   64: aload_2
/*     */     //   65: iconst_0
/*     */     //   66: invokestatic rememberActivityLauncher : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/OpResultMapper;Landroidx/compose/runtime/Composer;I)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;
/*     */     //   69: astore #5
/*     */     //   71: aload #5
/*     */     //   73: aload_2
/*     */     //   74: ldc_w 1589645473
/*     */     //   77: invokeinterface startReplaceGroup : (I)V
/*     */     //   82: aload_2
/*     */     //   83: astore #8
/*     */     //   85: iload_3
/*     */     //   86: bipush #14
/*     */     //   88: iand
/*     */     //   89: bipush #6
/*     */     //   91: ixor
/*     */     //   92: iconst_4
/*     */     //   93: if_icmple -> 106
/*     */     //   96: aload_2
/*     */     //   97: aload_0
/*     */     //   98: invokeinterface changed : (Ljava/lang/Object;)Z
/*     */     //   103: ifne -> 114
/*     */     //   106: iload_3
/*     */     //   107: bipush #6
/*     */     //   109: iand
/*     */     //   110: iconst_4
/*     */     //   111: if_icmpne -> 118
/*     */     //   114: iconst_1
/*     */     //   115: goto -> 119
/*     */     //   118: iconst_0
/*     */     //   119: aload_2
/*     */     //   120: aload_1
/*     */     //   121: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   126: ior
/*     */     //   127: aload_2
/*     */     //   128: aload #4
/*     */     //   130: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   135: ior
/*     */     //   136: istore #9
/*     */     //   138: iconst_0
/*     */     //   139: istore #10
/*     */     //   141: aload #8
/*     */     //   143: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   148: astore #11
/*     */     //   150: iconst_0
/*     */     //   151: istore #12
/*     */     //   153: iload #9
/*     */     //   155: ifne -> 169
/*     */     //   158: aload #11
/*     */     //   160: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   163: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   166: if_acmpne -> 208
/*     */     //   169: astore #18
/*     */     //   171: iconst_0
/*     */     //   172: istore #13
/*     */     //   174: new com/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1
/*     */     //   177: dup
/*     */     //   178: aload_0
/*     */     //   179: aload_1
/*     */     //   180: aload #4
/*     */     //   182: aconst_null
/*     */     //   183: invokespecial <init> : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lcom/intellij/openapi/diagnostic/Logger;Lkotlin/coroutines/Continuation;)V
/*     */     //   186: checkcast kotlin/jvm/functions/Function1
/*     */     //   189: aload #18
/*     */     //   191: swap
/*     */     //   192: astore #14
/*     */     //   194: aload #8
/*     */     //   196: aload #14
/*     */     //   198: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   203: aload #14
/*     */     //   205: goto -> 210
/*     */     //   208: aload #11
/*     */     //   210: nop
/*     */     //   211: nop
/*     */     //   212: nop
/*     */     //   213: checkcast kotlin/jvm/functions/Function1
/*     */     //   216: astore #7
/*     */     //   218: aload_2
/*     */     //   219: invokeinterface endReplaceGroup : ()V
/*     */     //   224: aload #7
/*     */     //   226: invokestatic bind : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;Lkotlin/jvm/functions/Function1;)Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*     */     //   229: astore #6
/*     */     //   231: aload_0
/*     */     //   232: invokestatic box-impl : (Ljava/lang/String;)Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieApiUrl;
/*     */     //   235: aload_2
/*     */     //   236: ldc_w 1589659313
/*     */     //   239: invokeinterface startReplaceGroup : (I)V
/*     */     //   244: aload_2
/*     */     //   245: astore #8
/*     */     //   247: aload_2
/*     */     //   248: aload #6
/*     */     //   250: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   255: istore #9
/*     */     //   257: iconst_0
/*     */     //   258: istore #10
/*     */     //   260: aload #8
/*     */     //   262: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   267: astore #11
/*     */     //   269: iconst_0
/*     */     //   270: istore #12
/*     */     //   272: iload #9
/*     */     //   274: ifne -> 288
/*     */     //   277: aload #11
/*     */     //   279: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   282: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   285: if_acmpne -> 325
/*     */     //   288: astore #18
/*     */     //   290: iconst_0
/*     */     //   291: istore #13
/*     */     //   293: new com/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1
/*     */     //   296: dup
/*     */     //   297: aload #6
/*     */     //   299: aconst_null
/*     */     //   300: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;Lkotlin/coroutines/Continuation;)V
/*     */     //   303: checkcast kotlin/jvm/functions/Function2
/*     */     //   306: aload #18
/*     */     //   308: swap
/*     */     //   309: astore #14
/*     */     //   311: aload #8
/*     */     //   313: aload #14
/*     */     //   315: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   320: aload #14
/*     */     //   322: goto -> 327
/*     */     //   325: aload #11
/*     */     //   327: nop
/*     */     //   328: nop
/*     */     //   329: nop
/*     */     //   330: checkcast kotlin/jvm/functions/Function2
/*     */     //   333: astore #7
/*     */     //   335: aload_2
/*     */     //   336: invokeinterface endReplaceGroup : ()V
/*     */     //   341: aload #7
/*     */     //   343: aload_2
/*     */     //   344: bipush #14
/*     */     //   346: iload_3
/*     */     //   347: iand
/*     */     //   348: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   351: aload #5
/*     */     //   353: invokeinterface getLatestOpResult : ()Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */     //   358: astore #8
/*     */     //   360: aload #8
/*     */     //   362: ifnonnull -> 407
/*     */     //   365: new com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep
/*     */     //   368: dup
/*     */     //   369: aload #6
/*     */     //   371: checkcast kotlin/jvm/functions/Function0
/*     */     //   374: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieFetchCapabilitiesInProgress.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieFetchCapabilitiesInProgress;
/*     */     //   377: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing
/*     */     //   380: invokestatic activationProgressing : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationProgressing;)Ljava/lang/Object;
/*     */     //   383: aconst_null
/*     */     //   384: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   387: astore #9
/*     */     //   389: invokestatic isTraceInProgress : ()Z
/*     */     //   392: ifeq -> 398
/*     */     //   395: invokestatic traceEventEnd : ()V
/*     */     //   398: aload_2
/*     */     //   399: invokeinterface endReplaceGroup : ()V
/*     */     //   404: aload #9
/*     */     //   406: areturn
/*     */     //   407: aload #8
/*     */     //   409: instanceof com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*     */     //   412: ifne -> 457
/*     */     //   415: new com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep
/*     */     //   418: dup
/*     */     //   419: aload #6
/*     */     //   421: checkcast kotlin/jvm/functions/Function0
/*     */     //   424: getstatic com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieFetchCapabilitiesFailure.INSTANCE : Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieFetchCapabilitiesFailure;
/*     */     //   427: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled
/*     */     //   430: invokestatic activationStalled : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationStalled;)Ljava/lang/Object;
/*     */     //   433: aconst_null
/*     */     //   434: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   437: astore #9
/*     */     //   439: invokestatic isTraceInProgress : ()Z
/*     */     //   442: ifeq -> 448
/*     */     //   445: invokestatic traceEventEnd : ()V
/*     */     //   448: aload_2
/*     */     //   449: invokeinterface endReplaceGroup : ()V
/*     */     //   454: aload #9
/*     */     //   456: areturn
/*     */     //   457: aload #8
/*     */     //   459: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/OpResult$OpCompleted$OpSucceeded
/*     */     //   462: invokevirtual getValue : ()Ljava/lang/Object;
/*     */     //   465: checkcast java/util/List
/*     */     //   468: astore #7
/*     */     //   470: invokestatic computeModelRequirements : ()Ljava/util/List;
/*     */     //   473: astore #8
/*     */     //   475: aload #7
/*     */     //   477: aload #8
/*     */     //   479: checkcast java/util/Collection
/*     */     //   482: invokeinterface containsAll : (Ljava/util/Collection;)Z
/*     */     //   487: ifne -> 670
/*     */     //   490: new com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieIncompatibleModels
/*     */     //   493: dup
/*     */     //   494: aload #7
/*     */     //   496: aload #8
/*     */     //   498: invokespecial <init> : (Ljava/util/List;Ljava/util/List;)V
/*     */     //   501: astore #9
/*     */     //   503: aload #7
/*     */     //   505: aload_2
/*     */     //   506: ldc_w 1589690100
/*     */     //   509: invokeinterface startReplaceGroup : (I)V
/*     */     //   514: aload_2
/*     */     //   515: astore #11
/*     */     //   517: aload_2
/*     */     //   518: aload #4
/*     */     //   520: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   525: aload_2
/*     */     //   526: aload #9
/*     */     //   528: invokeinterface changedInstance : (Ljava/lang/Object;)Z
/*     */     //   533: ior
/*     */     //   534: istore #12
/*     */     //   536: iconst_0
/*     */     //   537: istore #13
/*     */     //   539: aload #11
/*     */     //   541: invokeinterface rememberedValue : ()Ljava/lang/Object;
/*     */     //   546: astore #14
/*     */     //   548: iconst_0
/*     */     //   549: istore #15
/*     */     //   551: iload #12
/*     */     //   553: ifne -> 567
/*     */     //   556: aload #14
/*     */     //   558: getstatic androidx/compose/runtime/Composer.Companion : Landroidx/compose/runtime/Composer$Companion;
/*     */     //   561: invokevirtual getEmpty : ()Ljava/lang/Object;
/*     */     //   564: if_acmpne -> 606
/*     */     //   567: astore #18
/*     */     //   569: iconst_0
/*     */     //   570: istore #16
/*     */     //   572: new com/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1
/*     */     //   575: dup
/*     */     //   576: aload #4
/*     */     //   578: aload #9
/*     */     //   580: aconst_null
/*     */     //   581: invokespecial <init> : (Lcom/intellij/openapi/diagnostic/Logger;Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieIncompatibleModels;Lkotlin/coroutines/Continuation;)V
/*     */     //   584: checkcast kotlin/jvm/functions/Function2
/*     */     //   587: aload #18
/*     */     //   589: swap
/*     */     //   590: astore #17
/*     */     //   592: aload #11
/*     */     //   594: aload #17
/*     */     //   596: invokeinterface updateRememberedValue : (Ljava/lang/Object;)V
/*     */     //   601: aload #17
/*     */     //   603: goto -> 608
/*     */     //   606: aload #14
/*     */     //   608: nop
/*     */     //   609: nop
/*     */     //   610: nop
/*     */     //   611: checkcast kotlin/jvm/functions/Function2
/*     */     //   614: astore #10
/*     */     //   616: aload_2
/*     */     //   617: invokeinterface endReplaceGroup : ()V
/*     */     //   622: aload #10
/*     */     //   624: aload_2
/*     */     //   625: iconst_0
/*     */     //   626: invokestatic LaunchedEffect : (Ljava/lang/Object;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V
/*     */     //   629: new com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep
/*     */     //   632: dup
/*     */     //   633: aload #6
/*     */     //   635: checkcast kotlin/jvm/functions/Function0
/*     */     //   638: aload #9
/*     */     //   640: checkcast com/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked
/*     */     //   643: invokestatic activationRoadblocked : (Lcom/intellij/ml/llm/matterhorn/activation/state/model/AiaActivationRoadblocked;)Ljava/lang/Object;
/*     */     //   646: aconst_null
/*     */     //   647: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   650: astore #10
/*     */     //   652: invokestatic isTraceInProgress : ()Z
/*     */     //   655: ifeq -> 661
/*     */     //   658: invokestatic traceEventEnd : ()V
/*     */     //   661: aload_2
/*     */     //   662: invokeinterface endReplaceGroup : ()V
/*     */     //   667: aload #10
/*     */     //   669: areturn
/*     */     //   670: new com/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesStep
/*     */     //   673: dup
/*     */     //   674: aload #6
/*     */     //   676: checkcast kotlin/jvm/functions/Function0
/*     */     //   679: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   682: invokestatic done : (Ljava/lang/Object;)Ljava/lang/Object;
/*     */     //   685: aconst_null
/*     */     //   686: invokespecial <init> : (Lkotlin/jvm/functions/Function0;Ljava/lang/Object;Lkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   689: astore #9
/*     */     //   691: invokestatic isTraceInProgress : ()Z
/*     */     //   694: ifeq -> 700
/*     */     //   697: invokestatic traceEventEnd : ()V
/*     */     //   700: aload_2
/*     */     //   701: invokeinterface endReplaceGroup : ()V
/*     */     //   706: aload #9
/*     */     //   708: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #117	-> 23
/*     */     //   #119	-> 26
/*     */     //   #205	-> 29
/*     */     //   #206	-> 32
/*     */     //   #207	-> 40
/*     */     //   #205	-> 52
/*     */     //   #119	-> 53
/*     */     //   #118	-> 53
/*     */     //   #121	-> 55
/*     */     //   #122	-> 71
/*     */     //   #208	-> 141
/*     */     //   #209	-> 153
/*     */     //   #210	-> 169
/*     */     //   #122	-> 174
/*     */     //   #210	-> 192
/*     */     //   #211	-> 194
/*     */     //   #212	-> 203
/*     */     //   #213	-> 208
/*     */     //   #209	-> 210
/*     */     //   #208	-> 211
/*     */     //   #208	-> 212
/*     */     //   #122	-> 213
/*     */     //   #135	-> 231
/*     */     //   #214	-> 260
/*     */     //   #215	-> 272
/*     */     //   #216	-> 288
/*     */     //   #135	-> 293
/*     */     //   #216	-> 309
/*     */     //   #217	-> 311
/*     */     //   #218	-> 320
/*     */     //   #219	-> 325
/*     */     //   #215	-> 327
/*     */     //   #214	-> 328
/*     */     //   #214	-> 329
/*     */     //   #135	-> 330
/*     */     //   #139	-> 351
/*     */     //   #140	-> 360
/*     */     //   #141	-> 369
/*     */     //   #142	-> 374
/*     */     //   #140	-> 384
/*     */     //   #145	-> 407
/*     */     //   #146	-> 419
/*     */     //   #147	-> 424
/*     */     //   #145	-> 434
/*     */     //   #150	-> 457
/*     */     //   #139	-> 468
/*     */     //   #154	-> 470
/*     */     //   #153	-> 473
/*     */     //   #155	-> 475
/*     */     //   #156	-> 490
/*     */     //   #158	-> 494
/*     */     //   #157	-> 496
/*     */     //   #156	-> 498
/*     */     //   #160	-> 503
/*     */     //   #220	-> 539
/*     */     //   #221	-> 551
/*     */     //   #222	-> 567
/*     */     //   #160	-> 572
/*     */     //   #222	-> 590
/*     */     //   #223	-> 592
/*     */     //   #224	-> 601
/*     */     //   #225	-> 606
/*     */     //   #221	-> 608
/*     */     //   #220	-> 609
/*     */     //   #220	-> 610
/*     */     //   #160	-> 611
/*     */     //   #164	-> 629
/*     */     //   #165	-> 633
/*     */     //   #166	-> 638
/*     */     //   #164	-> 647
/*     */     //   #170	-> 670
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   32	20	6	$i$f$currentClassLogger	I
/*     */     //   40	12	7	clazz$iv$iv	Ljava/lang/Class;
/*     */     //   29	24	5	$i$f$fileLogger	I
/*     */     //   174	15	13	$i$a$-cache-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1	I
/*     */     //   194	11	14	value$iv	Ljava/lang/Object;
/*     */     //   153	58	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   150	61	11	it$iv	Ljava/lang/Object;
/*     */     //   141	72	10	$i$f$cache	I
/*     */     //   138	75	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   138	75	9	invalid$iv	Z
/*     */     //   293	13	13	$i$a$-cache-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1	I
/*     */     //   311	11	14	value$iv	Ljava/lang/Object;
/*     */     //   272	56	12	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   269	59	11	it$iv	Ljava/lang/Object;
/*     */     //   260	70	10	$i$f$cache	I
/*     */     //   257	73	8	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   257	73	9	invalid$iv	Z
/*     */     //   360	108	8	result	Lcom/intellij/ml/llm/matterhorn/activation/state/model/OpResult;
/*     */     //   572	15	16	$i$a$-cache-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2	I
/*     */     //   592	11	17	value$iv	Ljava/lang/Object;
/*     */     //   551	58	15	$i$a$-let-ComposerKt$cache$1$iv	I
/*     */     //   548	61	14	it$iv	Ljava/lang/Object;
/*     */     //   539	72	13	$i$f$cache	I
/*     */     //   536	75	11	$this$cache$iv	Landroidx/compose/runtime/Composer;
/*     */     //   536	75	12	invalid$iv	Z
/*     */     //   503	167	9	incompatibility	Lcom/intellij/ml/llm/matterhorn/activation/state/model/AieFetchCapabilitiesPending$AieIncompatibleModels;
/*     */     //   55	654	4	logger	Lcom/intellij/openapi/diagnostic/Logger;
/*     */     //   71	638	5	availableModelActivity	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityLauncher;
/*     */     //   231	478	6	availableModelCallable	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/activity/ActivityCallable;
/*     */     //   470	239	7	availableModels	Ljava/util/List;
/*     */     //   475	234	8	requiredModels	Ljava/util/List;
/*     */     //   0	709	0	apiUrl	Ljava/lang/String;
/*     */     //   0	709	1	authData	Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */     //   0	709	2	$composer	Landroidx/compose/runtime/Composer;
/*     */     //   0	709	3	$changed	I
/*     */   } @DebugMetadata(f = "aiEnterpiseActivation.kt", l = {123}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\016\n\000\n\002\030\002\n\002\020 \n\002\030\002\020\000\032\016\022\n\022\b\022\004\022\0020\0030\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;", "", "Lcom/intellij/ml/llm/activation/data/model/LlmModelId;"})
/*     */   static final class AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1 extends SuspendLambda implements Function1<Continuation<? super GrazieResult<? extends List<? extends LlmModelId>>>, Object> { int label; AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1(String $apiUrl, GrazieAuthData $authData, Logger $logger, Continuation $completion) {
/*     */       super(1, $completion);
/* 122 */     } public final Object invokeSuspend(Object $result) { Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 123 */           this.label = 1; if (TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(10, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends List<? extends LlmModelId>>>, Object>(this.$apiUrl, this.$authData, this.$logger, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #27
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 337, 0 -> 36, 1 -> 64, 2 -> 105
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion;
/*     */                   //   43: aload_0
/*     */                   //   44: checkcast kotlin/coroutines/Continuation
/*     */                   //   47: aload_0
/*     */                   //   48: iconst_1
/*     */                   //   49: putfield label : I
/*     */                   //   52: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   55: dup
/*     */                   //   56: aload #27
/*     */                   //   58: if_acmpne -> 69
/*     */                   //   61: aload #27
/*     */                   //   63: areturn
/*     */                   //   64: aload_1
/*     */                   //   65: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   68: aload_1
/*     */                   //   69: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */                   //   72: astore_2
/*     */                   //   73: aload_2
/*     */                   //   74: aload_0
/*     */                   //   75: getfield $apiUrl : Ljava/lang/String;
/*     */                   //   78: aload_0
/*     */                   //   79: getfield $authData : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */                   //   82: aload_0
/*     */                   //   83: checkcast kotlin/coroutines/Continuation
/*     */                   //   86: aload_0
/*     */                   //   87: iconst_2
/*     */                   //   88: putfield label : I
/*     */                   //   91: invokeinterface listAvailableModels-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   96: dup
/*     */                   //   97: aload #27
/*     */                   //   99: if_acmpne -> 110
/*     */                   //   102: aload #27
/*     */                   //   104: areturn
/*     */                   //   105: aload_1
/*     */                   //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   109: aload_1
/*     */                   //   110: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   113: astore #4
/*     */                   //   115: aload_0
/*     */                   //   116: getfield $logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   119: astore #5
/*     */                   //   121: iconst_0
/*     */                   //   122: istore #6
/*     */                   //   124: aload #4
/*     */                   //   126: astore #7
/*     */                   //   128: aload #7
/*     */                   //   130: astore #8
/*     */                   //   132: iconst_0
/*     */                   //   133: istore #9
/*     */                   //   135: aload #8
/*     */                   //   137: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */                   //   140: ifeq -> 330
/*     */                   //   143: aload #8
/*     */                   //   145: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */                   //   148: invokevirtual getValue : ()Ljava/lang/Object;
/*     */                   //   151: checkcast java/util/List
/*     */                   //   154: astore #10
/*     */                   //   156: iconst_0
/*     */                   //   157: istore #11
/*     */                   //   159: aload #5
/*     */                   //   161: astore #12
/*     */                   //   163: aconst_null
/*     */                   //   164: astore #13
/*     */                   //   166: iconst_0
/*     */                   //   167: istore #14
/*     */                   //   169: aload #12
/*     */                   //   171: invokevirtual isDebugEnabled : ()Z
/*     */                   //   174: ifeq -> 204
/*     */                   //   177: aload #12
/*     */                   //   179: astore #15
/*     */                   //   181: iconst_0
/*     */                   //   182: istore #16
/*     */                   //   184: aload #10
/*     */                   //   186: invokeinterface size : ()I
/*     */                   //   191: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */                   //   196: aload #15
/*     */                   //   198: swap
/*     */                   //   199: aload #13
/*     */                   //   201: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                   //   204: nop
/*     */                   //   205: aload #10
/*     */                   //   207: checkcast java/lang/Iterable
/*     */                   //   210: astore #12
/*     */                   //   212: iconst_0
/*     */                   //   213: istore #13
/*     */                   //   215: iconst_0
/*     */                   //   216: istore #14
/*     */                   //   218: aload #12
/*     */                   //   220: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                   //   225: astore #16
/*     */                   //   227: aload #16
/*     */                   //   229: invokeinterface hasNext : ()Z
/*     */                   //   234: ifeq -> 328
/*     */                   //   237: aload #16
/*     */                   //   239: invokeinterface next : ()Ljava/lang/Object;
/*     */                   //   244: astore #17
/*     */                   //   246: iload #14
/*     */                   //   248: iinc #14, 1
/*     */                   //   251: istore #18
/*     */                   //   253: iload #18
/*     */                   //   255: ifge -> 261
/*     */                   //   258: invokestatic throwIndexOverflow : ()V
/*     */                   //   261: iload #18
/*     */                   //   263: aload #17
/*     */                   //   265: checkcast com/intellij/ml/llm/activation/data/model/LlmModelId
/*     */                   //   268: invokevirtual unbox-impl : ()Ljava/lang/String;
/*     */                   //   271: astore #19
/*     */                   //   273: istore #20
/*     */                   //   275: iconst_0
/*     */                   //   276: istore #21
/*     */                   //   278: aload #5
/*     */                   //   280: astore #22
/*     */                   //   282: aconst_null
/*     */                   //   283: astore #23
/*     */                   //   285: iconst_0
/*     */                   //   286: istore #24
/*     */                   //   288: aload #22
/*     */                   //   290: invokevirtual isDebugEnabled : ()Z
/*     */                   //   293: ifeq -> 323
/*     */                   //   296: aload #22
/*     */                   //   298: astore #25
/*     */                   //   300: iconst_0
/*     */                   //   301: istore #26
/*     */                   //   303: iload #20
/*     */                   //   305: aload #19
/*     */                   //   307: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */                   //   310: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
/*     */                   //   315: aload #25
/*     */                   //   317: swap
/*     */                   //   318: aload #23
/*     */                   //   320: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                   //   323: nop
/*     */                   //   324: nop
/*     */                   //   325: goto -> 227
/*     */                   //   328: nop
/*     */                   //   329: nop
/*     */                   //   330: nop
/*     */                   //   331: aload #7
/*     */                   //   333: nop
/*     */                   //   334: astore_3
/*     */                   //   335: aload_3
/*     */                   //   336: areturn
/*     */                   //   337: new java/lang/IllegalStateException
/*     */                   //   340: dup
/*     */                   //   341: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   343: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   346: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #123	-> 3
/*     */                   //   #124	-> 40
/*     */                   //   #123	-> 61
/*     */                   //   #125	-> 73
/*     */                   //   #123	-> 102
/*     */                   //   #126	-> 115
/*     */                   //   #185	-> 124
/*     */                   //   #186	-> 135
/*     */                   //   #127	-> 159
/*     */                   //   #187	-> 163
/*     */                   //   #188	-> 169
/*     */                   //   #189	-> 177
/*     */                   //   #127	-> 184
/*     */                   //   #189	-> 199
/*     */                   //   #191	-> 204
/*     */                   //   #128	-> 205
/*     */                   //   #192	-> 215
/*     */                   //   #193	-> 218
/*     */                   //   #193	-> 263
/*     */                   //   #129	-> 278
/*     */                   //   #194	-> 282
/*     */                   //   #195	-> 288
/*     */                   //   #196	-> 296
/*     */                   //   #129	-> 303
/*     */                   //   #196	-> 318
/*     */                   //   #198	-> 323
/*     */                   //   #130	-> 324
/*     */                   //   #193	-> 325
/*     */                   //   #199	-> 328
/*     */                   //   #131	-> 329
/*     */                   //   #186	-> 330
/*     */                   //   #200	-> 330
/*     */                   //   #185	-> 331
/*     */                   //   #200	-> 333
/*     */                   //   #126	-> 334
/*     */                   //   #125	-> 334
/*     */                   //   #132	-> 335
/*     */                   //   #123	-> 337
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   73	23	2	grazie	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */                   //   335	2	3	availableModels	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   115	17	4	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   132	24	8	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   156	56	10	models	Ljava/util/List;
/*     */                   //   163	21	12	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   212	15	12	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */                   //   166	38	13	e$iv	Ljava/lang/Exception;
/*     */                   //   218	111	14	index$iv	I
/*     */                   //   246	29	17	item$iv	Ljava/lang/Object;
/*     */                   //   275	40	19	next	Ljava/lang/String;
/*     */                   //   275	40	20	idx	I
/*     */                   //   282	21	22	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   285	38	23	e$iv	Ljava/lang/Exception;
/*     */                   //   184	12	16	$i$a$-debug$default-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$1	I
/*     */                   //   169	36	14	$i$f$debug	I
/*     */                   //   303	12	26	$i$a$-debug$default-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$2$1	I
/*     */                   //   288	36	24	$i$f$debug	I
/*     */                   //   278	47	21	$i$a$-forEachIndexed-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$2	I
/*     */                   //   215	114	13	$i$f$forEachIndexed	I
/*     */                   //   159	171	11	$i$a$-onSuccess-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1	I
/*     */                   //   135	196	9	$i$a$-apply-GrazieResultMapperKt$onSuccess$1$iv	I
/*     */                   //   124	210	6	$i$f$onSuccess	I
/*     */                   //   0	347	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1;
/* 123 */                   //   40	297	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$apiUrl, this.$authData, this.$logger, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this) == object) return object;  return TimeoutKt.withTimeout-KLykuaI(DurationKt.toDuration(10, DurationUnit.SECONDS), new Function2<CoroutineScope, Continuation<? super GrazieResult<? extends List<? extends LlmModelId>>>, Object>(this.$apiUrl, this.$authData, this.$logger, null) { int label; public final Object invokeSuspend(Object $result) { // Byte code:
/*     */                   //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */                   //   3: astore #27
/*     */                   //   5: aload_0
/*     */                   //   6: getfield label : I
/*     */                   //   9: tableswitch default -> 337, 0 -> 36, 1 -> 64, 2 -> 105
/*     */                   //   36: aload_1
/*     */                   //   37: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   40: getstatic com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository.Companion : Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository$Companion;
/*     */                   //   43: aload_0
/*     */                   //   44: checkcast kotlin/coroutines/Continuation
/*     */                   //   47: aload_0
/*     */                   //   48: iconst_1
/*     */                   //   49: putfield label : I
/*     */                   //   52: invokevirtual instance : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   55: dup
/*     */                   //   56: aload #27
/*     */                   //   58: if_acmpne -> 69
/*     */                   //   61: aload #27
/*     */                   //   63: areturn
/*     */                   //   64: aload_1
/*     */                   //   65: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   68: aload_1
/*     */                   //   69: checkcast com/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository
/*     */                   //   72: astore_2
/*     */                   //   73: aload_2
/*     */                   //   74: aload_0
/*     */                   //   75: getfield $apiUrl : Ljava/lang/String;
/*     */                   //   78: aload_0
/*     */                   //   79: getfield $authData : Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;
/*     */                   //   82: aload_0
/*     */                   //   83: checkcast kotlin/coroutines/Continuation
/*     */                   //   86: aload_0
/*     */                   //   87: iconst_2
/*     */                   //   88: putfield label : I
/*     */                   //   91: invokeinterface listAvailableModels-1CSWKTE : (Ljava/lang/String;Lcom/intellij/ml/llm/matterhorn/activation/data/model/GrazieAuthData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */                   //   96: dup
/*     */                   //   97: aload #27
/*     */                   //   99: if_acmpne -> 110
/*     */                   //   102: aload #27
/*     */                   //   104: areturn
/*     */                   //   105: aload_1
/*     */                   //   106: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */                   //   109: aload_1
/*     */                   //   110: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult
/*     */                   //   113: astore #4
/*     */                   //   115: aload_0
/*     */                   //   116: getfield $logger : Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   119: astore #5
/*     */                   //   121: iconst_0
/*     */                   //   122: istore #6
/*     */                   //   124: aload #4
/*     */                   //   126: astore #7
/*     */                   //   128: aload #7
/*     */                   //   130: astore #8
/*     */                   //   132: iconst_0
/*     */                   //   133: istore #9
/*     */                   //   135: aload #8
/*     */                   //   137: instanceof com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */                   //   140: ifeq -> 330
/*     */                   //   143: aload #8
/*     */                   //   145: checkcast com/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult$GrazieSuccess
/*     */                   //   148: invokevirtual getValue : ()Ljava/lang/Object;
/*     */                   //   151: checkcast java/util/List
/*     */                   //   154: astore #10
/*     */                   //   156: iconst_0
/*     */                   //   157: istore #11
/*     */                   //   159: aload #5
/*     */                   //   161: astore #12
/*     */                   //   163: aconst_null
/*     */                   //   164: astore #13
/*     */                   //   166: iconst_0
/*     */                   //   167: istore #14
/*     */                   //   169: aload #12
/*     */                   //   171: invokevirtual isDebugEnabled : ()Z
/*     */                   //   174: ifeq -> 204
/*     */                   //   177: aload #12
/*     */                   //   179: astore #15
/*     */                   //   181: iconst_0
/*     */                   //   182: istore #16
/*     */                   //   184: aload #10
/*     */                   //   186: invokeinterface size : ()I
/*     */                   //   191: <illegal opcode> makeConcatWithConstants : (I)Ljava/lang/String;
/*     */                   //   196: aload #15
/*     */                   //   198: swap
/*     */                   //   199: aload #13
/*     */                   //   201: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                   //   204: nop
/*     */                   //   205: aload #10
/*     */                   //   207: checkcast java/lang/Iterable
/*     */                   //   210: astore #12
/*     */                   //   212: iconst_0
/*     */                   //   213: istore #13
/*     */                   //   215: iconst_0
/*     */                   //   216: istore #14
/*     */                   //   218: aload #12
/*     */                   //   220: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */                   //   225: astore #16
/*     */                   //   227: aload #16
/*     */                   //   229: invokeinterface hasNext : ()Z
/*     */                   //   234: ifeq -> 328
/*     */                   //   237: aload #16
/*     */                   //   239: invokeinterface next : ()Ljava/lang/Object;
/*     */                   //   244: astore #17
/*     */                   //   246: iload #14
/*     */                   //   248: iinc #14, 1
/*     */                   //   251: istore #18
/*     */                   //   253: iload #18
/*     */                   //   255: ifge -> 261
/*     */                   //   258: invokestatic throwIndexOverflow : ()V
/*     */                   //   261: iload #18
/*     */                   //   263: aload #17
/*     */                   //   265: checkcast com/intellij/ml/llm/activation/data/model/LlmModelId
/*     */                   //   268: invokevirtual unbox-impl : ()Ljava/lang/String;
/*     */                   //   271: astore #19
/*     */                   //   273: istore #20
/*     */                   //   275: iconst_0
/*     */                   //   276: istore #21
/*     */                   //   278: aload #5
/*     */                   //   280: astore #22
/*     */                   //   282: aconst_null
/*     */                   //   283: astore #23
/*     */                   //   285: iconst_0
/*     */                   //   286: istore #24
/*     */                   //   288: aload #22
/*     */                   //   290: invokevirtual isDebugEnabled : ()Z
/*     */                   //   293: ifeq -> 323
/*     */                   //   296: aload #22
/*     */                   //   298: astore #25
/*     */                   //   300: iconst_0
/*     */                   //   301: istore #26
/*     */                   //   303: iload #20
/*     */                   //   305: aload #19
/*     */                   //   307: invokestatic toString-impl : (Ljava/lang/String;)Ljava/lang/String;
/*     */                   //   310: <illegal opcode> makeConcatWithConstants : (ILjava/lang/String;)Ljava/lang/String;
/*     */                   //   315: aload #25
/*     */                   //   317: swap
/*     */                   //   318: aload #23
/*     */                   //   320: invokevirtual debug : (Ljava/lang/String;Ljava/lang/Throwable;)V
/*     */                   //   323: nop
/*     */                   //   324: nop
/*     */                   //   325: goto -> 227
/*     */                   //   328: nop
/*     */                   //   329: nop
/*     */                   //   330: nop
/*     */                   //   331: aload #7
/*     */                   //   333: nop
/*     */                   //   334: astore_3
/*     */                   //   335: aload_3
/*     */                   //   336: areturn
/*     */                   //   337: new java/lang/IllegalStateException
/*     */                   //   340: dup
/*     */                   //   341: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */                   //   343: invokespecial <init> : (Ljava/lang/String;)V
/*     */                   //   346: athrow
/*     */                   // Line number table:
/*     */                   //   Java source line number -> byte code offset
/*     */                   //   #123	-> 3
/*     */                   //   #124	-> 40
/*     */                   //   #123	-> 61
/*     */                   //   #125	-> 73
/*     */                   //   #123	-> 102
/*     */                   //   #126	-> 115
/*     */                   //   #185	-> 124
/*     */                   //   #186	-> 135
/*     */                   //   #127	-> 159
/*     */                   //   #187	-> 163
/*     */                   //   #188	-> 169
/*     */                   //   #189	-> 177
/*     */                   //   #127	-> 184
/*     */                   //   #189	-> 199
/*     */                   //   #191	-> 204
/*     */                   //   #128	-> 205
/*     */                   //   #192	-> 215
/*     */                   //   #193	-> 218
/*     */                   //   #193	-> 263
/*     */                   //   #129	-> 278
/*     */                   //   #194	-> 282
/*     */                   //   #195	-> 288
/*     */                   //   #196	-> 296
/*     */                   //   #129	-> 303
/*     */                   //   #196	-> 318
/*     */                   //   #198	-> 323
/*     */                   //   #130	-> 324
/*     */                   //   #193	-> 325
/*     */                   //   #199	-> 328
/*     */                   //   #131	-> 329
/*     */                   //   #186	-> 330
/*     */                   //   #200	-> 330
/*     */                   //   #185	-> 331
/*     */                   //   #200	-> 333
/*     */                   //   #126	-> 334
/*     */                   //   #125	-> 334
/*     */                   //   #132	-> 335
/*     */                   //   #123	-> 337
/*     */                   // Local variable table:
/*     */                   //   start	length	slot	name	descriptor
/*     */                   //   73	23	2	grazie	Lcom/intellij/ml/llm/matterhorn/activation/data/repos/JunieGrazieRepository;
/*     */                   //   335	2	3	availableModels	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   115	17	4	$this$onSuccess$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   132	24	8	$this$onSuccess_u24lambda_u241$iv	Lcom/intellij/ml/llm/matterhorn/activation/data/model/result/GrazieResult;
/*     */                   //   156	56	10	models	Ljava/util/List;
/*     */                   //   163	21	12	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   212	15	12	$this$forEachIndexed$iv	Ljava/lang/Iterable;
/*     */                   //   166	38	13	e$iv	Ljava/lang/Exception;
/*     */                   //   218	111	14	index$iv	I
/*     */                   //   246	29	17	item$iv	Ljava/lang/Object;
/*     */                   //   275	40	19	next	Ljava/lang/String;
/*     */                   //   275	40	20	idx	I
/*     */                   //   282	21	22	$this$debug_u24default$iv	Lcom/intellij/openapi/diagnostic/Logger;
/*     */                   //   285	38	23	e$iv	Ljava/lang/Exception;
/*     */                   //   184	12	16	$i$a$-debug$default-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$1	I
/*     */                   //   169	36	14	$i$f$debug	I
/*     */                   //   303	12	26	$i$a$-debug$default-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$2$1	I
/*     */                   //   288	36	24	$i$f$debug	I
/*     */                   //   278	47	21	$i$a$-forEachIndexed-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1$2	I
/*     */                   //   215	114	13	$i$f$forEachIndexed	I
/*     */                   //   159	171	11	$i$a$-onSuccess-AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1$availableModels$1	I
/*     */                   //   135	196	9	$i$a$-apply-GrazieResultMapperKt$onSuccess$1$iv	I
/*     */                   //   124	210	6	$i$f$onSuccess	I
/*     */                   //   0	347	0	this	Lcom/intellij/ml/llm/matterhorn/activation/state/junie/AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1$1;
/* 123 */                   //   40	297	1	$result	Ljava/lang/Object; } public final Continuation<Unit> create(Object value, Continuation<? super null> $completion) { return (Continuation)new Function2<>(this.$apiUrl, this.$authData, this.$logger, $completion); } public final Object invoke(CoroutineScope p1, Continuation<?> p2) { return ((null)create(p1, p2)).invokeSuspend(Unit.INSTANCE); } }(Continuation)this);
/*     */         case 1:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           return SYNTHETIC_LOCAL_VARIABLE_1; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine"); } public final Continuation<Unit> create(Continuation<? super AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1> $completion) {
/*     */       return (Continuation<Unit>)new AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1(this.$apiUrl, this.$authData, this.$logger, $completion);
/*     */     } public final Object invoke(Continuation<?> p1) {
/*     */       return ((AiEnterpiseActivationKt$aieFetchCapabilitiesStep$availableModelCallable$1$1)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     } } @DebugMetadata(f = "aiEnterpiseActivation.kt", l = {136}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label; public final Object invokeSuspend(Object $result) {
/* 135 */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 136 */           this.label = 1; if (this.$availableModelCallable.invoke().awaitOpResult((Continuation)this) == object) return object;  this.$availableModelCallable.invoke().awaitOpResult((Continuation)this);
/* 137 */           return Unit.INSTANCE;case 1: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1); return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1(ActivityCallable<GrazieResult<List<LlmModelId>>, GrazieResult.GrazieFailure, List<LlmModelId>> $availableModelCallable, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1> $completion) {
/*     */       return (Continuation<Unit>)new AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1(this.$availableModelCallable, $completion);
/*     */     }
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AiEnterpiseActivationKt$aieFetchCapabilitiesStep$1$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   
/*     */   @DebugMetadata(f = "aiEnterpiseActivation.kt", l = {}, i = {}, s = {}, n = {}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.activation.state.junie.AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\n\n\000\n\002\020\002\n\002\030\002\020\000\032\0020\001*\0020\002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"})
/*     */   static final class AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> { int label;
/*     */     
/*     */     AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1(Logger $logger, AieFetchCapabilitiesPending.AieIncompatibleModels $incompatibility, Continuation $completion) {
/*     */       super(2, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/* 160 */       IntrinsicsKt.getCOROUTINE_SUSPENDED(); switch (this.label) { case 0: ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/* 161 */           this.$logger.warn("AI Enterprise incompatibility detected: " + this.$incompatibility);
/* 162 */           return Unit.INSTANCE; }
/*     */       
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Object value, Continuation<? super AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1> $completion) {
/*     */       return (Continuation<Unit>)new AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1(this.$logger, this.$incompatibility, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(CoroutineScope p1, Continuation<?> p2) {
/*     */       return ((AiEnterpiseActivationKt$aieFetchCapabilitiesStep$2$1)create(p1, p2)).invokeSuspend(Unit.INSTANCE);
/*     */     } }
/*     */   
/*     */   private static final List<LlmModelId> computeModelRequirements() {
/* 176 */     LLM[] arrayOfLLM = new LLM[4]; arrayOfLLM[0] = LLM.Companion.getCLAUDE_SONNET_3_7_2025_02_19(); arrayOfLLM[1] = 
/* 177 */       LLM.Companion.getGPT_4_O_MINI_2024_07_18();
/* 178 */     arrayOfLLM[2] = LLM.Companion.getGPT_4_O_2024_08_06();
/* 179 */     arrayOfLLM[3] = LLM.Companion.getGPT_4_1_2025_04_14(); List list1 = CollectionsKt.listOf((Object[])arrayOfLLM);
/* 180 */     int $i$f$map = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 226 */     List list2 = list1; Collection<LlmModelId> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault(list1, 10)); int $i$f$mapTo = 0;
/* 227 */     for (Object item$iv$iv : list2) {
/* 228 */       LLM lLM = (LLM)item$iv$iv; Collection<LlmModelId> collection = destination$iv$iv; int $i$a$-map-AiEnterpiseActivationKt$computeModelRequirements$1 = 0; collection.add(LlmModelId.box-impl(LlmModelId.constructor-impl(lLM.getJbai())));
/* 229 */     }  return (List<LlmModelId>)destination$iv$iv;
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\AiEnterpiseActivationKt.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */