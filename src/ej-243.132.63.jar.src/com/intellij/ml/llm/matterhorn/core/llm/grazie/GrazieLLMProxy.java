/*     */ package com.intellij.ml.llm.matterhorn.core.llm.grazie;
/*     */ 
/*     */ import ai.grazie.api.gateway.client.SuspendableAPIGatewayClient;
/*     */ import ai.grazie.api.gateway.client.api.llm.ChatRequestBuilder;
/*     */ import ai.grazie.model.llm.chat.function.LLMFunction;
/*     */ import ai.grazie.model.llm.chat.function.LLMFunctionsBuilder;
/*     */ import ai.grazie.model.llm.chat.v5.LLMChat;
/*     */ import com.intellij.ml.llm.matterhorn.CustomArtifactEvent;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.AICache;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.DelayStrategy;
/*     */ import com.intellij.ml.llm.matterhorn.core.llm.anthropic.AnthropicInputSchema;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswer;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIAnswerChoice;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIContentAnswerChoice;
/*     */ import com.intellij.ml.llm.matterhorn.llm.AIToolUseAnswerChoice;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LLMProxy;
/*     */ import com.intellij.ml.llm.matterhorn.llm.LlmProvider;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornChat;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornTool;
/*     */ import com.intellij.ml.llm.matterhorn.llm.MatterhornToolParam;
/*     */ import com.intellij.ml.llm.matterhorn.llm.ModelParameters;
/*     */ import com.intellij.ml.llm.matterhorn.settings.MatterhornPropertyProvider;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Collection;
/*     */ import java.util.Iterator;
/*     */ import java.util.LinkedHashMap;
/*     */ import java.util.List;
/*     */ import java.util.Map;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.collections.CollectionsKt;
/*     */ import kotlin.collections.MapsKt;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.coroutines.jvm.internal.ContinuationImpl;
/*     */ import kotlin.coroutines.jvm.internal.DebugMetadata;
/*     */ import kotlin.jvm.functions.Function1;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.Ref;
/*     */ import kotlin.text.StringsKt;
/*     */ import kotlinx.serialization.json.Json;
/*     */ import org.jetbrains.annotations.NotNull;
/*     */ import org.jetbrains.annotations.Nullable;
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000®\001\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\b\005\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\002\020\002\n\002\b\004\n\002\030\002\n\002\b\002\n\002\030\002\n\002\020\b\n\002\030\002\n\002\020\000\n\002\b\002\n\002\030\002\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\030\002\n\000\n\002\020$\n\002\020 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\030\002\n\002\b\002\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\002\020\016\n\002\b\003\b\026\030\000 <2\0020\001:\002<=B?\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005\022\b\b\002\020\006\032\0020\007\022\b\b\002\020\b\032\0020\t\022\b\b\002\020\n\032\0020\t\022\b\b\002\020\013\032\0020\t¢\006\004\b\f\020\rJ2\020\016\032\0020\0172\006\020\020\032\0020\0212\006\020\022\032\0020\0232\022\020\024\032\016\022\004\022\0020\026\022\004\022\0020\0270\025H@¢\006\002\020\030J\b\020\031\032\0020\027H\024J\020\020\032\032\0020\0272\006\020\033\032\0020\034H\024J2\020\035\032\0020\0172\"\020\036\032\036\b\001\022\004\022\0020 \022\n\022\b\022\004\022\0020\0170!\022\006\022\004\030\0010\"0\037H@¢\006\002\020#J\020\020$\032\0020%*\0060&j\002`'H\002J\f\020(\032\0020)*\0020*H\002J4\020+\032\024\022\004\022\0020 \022\n\022\b\022\004\022\0020.0-0,*\0020/2\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\0200J4\0201\032\024\022\004\022\0020 \022\n\022\b\022\004\022\0020.0-0,*\0020/2\006\020\020\032\0020\0212\006\020\022\032\0020\023H@¢\006\002\0200J$\0202\032\024\022\004\022\0020 \022\n\022\b\022\004\022\0020.0-0,*\b\022\004\022\002030-H\002J$\0204\032\b\022\004\022\0020.0-*\024\022\004\022\0020 \022\n\022\b\022\004\022\0020.0-0,H\002J\022\0205\032\00206*\b\022\004\022\0020.0-H\002J\022\0207\032\00208*\b\022\004\022\0020.0-H\002J\016\0209\032\004\030\0010:*\0020;H\002R\016\020\002\032\0020\003X\004¢\006\002\n\000R\016\020\004\032\0020\005X\004¢\006\002\n\000R\016\020\006\032\0020\007X\004¢\006\002\n\000R\016\020\b\032\0020\tX\004¢\006\002\n\000R\016\020\n\032\0020\tX\004¢\006\002\n\000R\016\020\013\032\0020\tX\004¢\006\002\n\000¨\006>"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;", "Lcom/intellij/ml/llm/matterhorn/llm/LLMProxy;", "llmCache", "Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;", "auth", "Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieAuthService;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;", "delayStrategy", "Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;", "delayStrategyForRateLimit", "delayStrategyForAuthenticationIssue", "<init>", "(Lcom/intellij/ml/llm/matterhorn/core/llm/AICache;Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieAuthService;Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;Lcom/intellij/ml/llm/matterhorn/core/llm/DelayStrategy;)V", "sendChat", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "eventHandler", "Lkotlin/Function1;", "Lcom/intellij/ml/llm/matterhorn/CustomArtifactEvent;", "", "(Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateQuota", "reportQuota", "updated", "Lai/grazie/quota/Quota;", "sendWithRecovery", "send", "Lkotlin/Function2;", "", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toRetryableType", "Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/RetryableType;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "toProfileID", "Lai/grazie/model/llm/profile/LLMProfileID;", "Lcom/intellij/ml/llm/matterhorn/llm/LLM;", "getOpenAIContentChoices", "", "", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;", "(Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAnthropicContentChoices", "collapseAnswerGroups", "Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$AIAnswerChoiceIndex;", "toAnswerChoices", "reduceToSingleContentChoice", "Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice;", "reduceToSingleToolChoice", "Lcom/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice;", "toToolUsage", "Lcom/intellij/ml/llm/matterhorn/llm/AIToolUsage;", "", "Companion", "AIAnswerChoiceIndex", "core-llm"})
/*     */ @SourceDebugExtension({"SMAP\nGrazieLLMProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieLLMProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy\n+ 2 Transform.kt\nkotlinx/coroutines/flow/FlowKt__TransformKt\n+ 3 Emitters.kt\nkotlinx/coroutines/flow/FlowKt__EmittersKt\n+ 4 SafeCollector.common.kt\nkotlinx/coroutines/flow/internal/SafeCollector_commonKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 7 Maps.kt\nkotlin/collections/MapsKt__MapsKt\n+ 8 Json.kt\nkotlinx/serialization/json/Json\n+ 9 logger.kt\ncom/intellij/openapi/diagnostic/LoggerKt\n*L\n1#1,368:1\n56#2:369\n59#2:373\n56#2:374\n59#2:378\n46#3:370\n51#3:372\n46#3:375\n51#3:377\n105#4:371\n105#4:376\n1797#5,3:379\n1557#5:382\n1628#5,2:383\n1734#5,3:385\n1755#5,3:388\n1557#5:391\n1628#5,3:392\n1630#5:395\n808#5,11:396\n808#5,11:407\n1611#5,9:418\n1863#5:427\n1864#5:429\n1620#5:430\n1246#5,4:433\n774#5:438\n865#5,2:439\n1557#5:441\n1628#5,3:442\n1202#5,2:445\n1230#5,4:447\n1246#5,4:453\n1863#5,2:458\n1#6:428\n462#7:431\n412#7:432\n462#7:451\n412#7:452\n205#8:437\n205#8:457\n14#9:460\n*S KotlinDebug\n*F\n+ 1 GrazieLLMProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy\n*L\n224#1:369\n224#1:373\n284#1:374\n284#1:378\n224#1:370\n224#1:372\n284#1:375\n284#1:377\n224#1:371\n284#1:376\n307#1:379,3\n336#1:382\n336#1:383,2\n338#1:385,3\n339#1:388,3\n340#1:391\n340#1:392,3\n336#1:395\n349#1:396,11\n350#1:407,11\n350#1:418,9\n350#1:427\n350#1:429\n350#1:430\n361#1:433,4\n272#1:438\n272#1:439,2\n272#1:441\n272#1:442,3\n273#1:445,2\n273#1:447,4\n273#1:453,4\n255#1:458,2\n350#1:428\n361#1:431\n361#1:432\n273#1:451\n273#1:452\n266#1:437\n277#1:457\n60#1:460\n*E\n"})
/*     */ public class GrazieLLMProxy implements LLMProxy {
/*  47 */   public GrazieLLMProxy(@NotNull AICache llmCache, @NotNull GrazieAuthService auth, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull DelayStrategy delayStrategy, @NotNull DelayStrategy delayStrategyForRateLimit, @NotNull DelayStrategy delayStrategyForAuthenticationIssue) { this.llmCache = llmCache;
/*  48 */     this.auth = auth;
/*  49 */     this.propertyProvider = propertyProvider;
/*  50 */     this.delayStrategy = delayStrategy;
/*  51 */     this.delayStrategyForRateLimit = delayStrategyForRateLimit;
/*  52 */     this.delayStrategyForAuthenticationIssue = delayStrategyForAuthenticationIssue;
/*     */ 
/*     */ 
/*     */     
/*  56 */     EnvExtensionsKt.assertHasJbAI(BuildConfigKt.getConfig()); } @Nullable public Object sendWithTracking(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull MatterhornPropertyProvider propertyProvider, @NotNull Function4 request, @NotNull Function1 eventHandler, @NotNull Continuation $completion) { return LLMProxy.DefaultImpls.sendWithTracking(this, chat, modelParameters, propertyProvider, request, eventHandler, $completion); } public boolean getImagesSupported() { return LLMProxy.DefaultImpls.getImagesSupported(this); }
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\022\n\002\030\002\n\002\020\000\n\002\b\003\n\002\030\002\n\000\b\003\030\0002\0020\001B\t\b\002¢\006\004\b\002\020\003R\016\020\004\032\0020\005X\004¢\006\002\n\000¨\006\006"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$Companion;", "", "<init>", "()V", "logger", "Lcom/intellij/openapi/diagnostic/Logger;", "core-llm"}) public static final class Companion {
/*     */     private Companion() {} }
/*     */   @NotNull
/*  60 */   public static final Companion Companion = new Companion(null); @NotNull private final AICache llmCache; @NotNull private final GrazieAuthService auth; @NotNull private final MatterhornPropertyProvider propertyProvider; @NotNull private final DelayStrategy delayStrategy; @NotNull private final DelayStrategy delayStrategyForRateLimit; @NotNull private final DelayStrategy delayStrategyForAuthenticationIssue; static { int $i$f$logger = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 460 */     Intrinsics.checkNotNullExpressionValue(Logger.getInstance(GrazieLLMProxy.class), "getInstance(...)"); } @NotNull private static final Logger logger = Logger.getInstance(GrazieLLMProxy.class);
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000&\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\020\b\n\002\b\n\n\002\020\013\n\002\b\003\n\002\020\016\n\000\b\b\030\0002\0020\001B\027\022\006\020\002\032\0020\003\022\006\020\004\032\0020\005¢\006\004\b\006\020\007J\t\020\f\032\0020\003HÆ\003J\t\020\r\032\0020\005HÆ\003J\035\020\016\032\0020\0002\b\b\002\020\002\032\0020\0032\b\b\002\020\004\032\0020\005HÆ\001J\023\020\017\032\0020\0202\b\020\021\032\004\030\0010\001HÖ\003J\t\020\022\032\0020\005HÖ\001J\t\020\023\032\0020\024HÖ\001R\021\020\002\032\0020\003¢\006\b\n\000\032\004\b\b\020\tR\021\020\004\032\0020\005¢\006\b\n\000\032\004\b\n\020\013¨\006\025"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$AIAnswerChoiceIndex;", "", "choice", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "index", "", "<init>", "(Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;I)V", "getChoice", "()Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;", "getIndex", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "", "core-llm"})
/*     */   public static final class AIAnswerChoiceIndex {
/*     */     @NotNull
/*     */     private final AIAnswerChoice choice;
/*     */     private final int index;
/*     */     
/*     */     public AIAnswerChoiceIndex(@NotNull AIAnswerChoice choice, int index) {
/*     */       this.choice = choice;
/*     */       this.index = index;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AIAnswerChoice getChoice() {
/*     */       return this.choice;
/*     */     }
/*     */     
/*     */     public final int getIndex() {
/*     */       return this.index;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AIAnswerChoice component1() {
/*     */       return this.choice;
/*     */     }
/*     */     
/*     */     public final int component2() {
/*     */       return this.index;
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public final AIAnswerChoiceIndex copy(@NotNull AIAnswerChoice choice, int index) {
/*     */       Intrinsics.checkNotNullParameter(choice, "choice");
/*     */       return new AIAnswerChoiceIndex(choice, index);
/*     */     }
/*     */     
/*     */     @NotNull
/*     */     public String toString() {
/*     */       return "AIAnswerChoiceIndex(choice=" + this.choice + ", index=" + this.index + ")";
/*     */     }
/*     */     
/*     */     public int hashCode() {
/*     */       result = this.choice.hashCode();
/*     */       return result * 31 + Integer.hashCode(this.index);
/*     */     }
/*     */     
/*     */     public boolean equals(@Nullable Object other) {
/*     */       if (this == other)
/*     */         return true; 
/*     */       if (!(other instanceof AIAnswerChoiceIndex))
/*     */         return false; 
/*     */       AIAnswerChoiceIndex aIAnswerChoiceIndex = (AIAnswerChoiceIndex)other;
/*     */       return !Intrinsics.areEqual(this.choice, aIAnswerChoiceIndex.choice) ? false : (!(this.index != aIAnswerChoiceIndex.index));
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieLLMProxy.kt", l = {70}, i = {0, 0}, s = {"L$0", "J$0"}, n = {"response", "start$iv"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy$sendChat$2")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\006\n\000\n\002\030\002\020\000\032\0020\001H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;"})
/*     */   @SourceDebugExtension({"SMAP\nGrazieLLMProxy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GrazieLLMProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$sendChat$2\n+ 2 Timing.kt\nkotlin/system/TimingKt\n*L\n1#1,368:1\n17#2,6:369\n*S KotlinDebug\n*F\n+ 1 GrazieLLMProxy.kt\ncom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$sendChat$2\n*L\n69#1:369,6\n*E\n"})
/*     */   static final class GrazieLLMProxy$sendChat$2 extends SuspendLambda implements Function1<Continuation<? super AIAnswer>, Object> {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     long J$0;
/*     */     int label;
/*     */     
/*     */     GrazieLLMProxy$sendChat$2(MatterhornChat $chat, ModelParameters $modelParameters, Function1<CustomArtifactEvent, Unit> $eventHandler, Continuation $completion) {
/*     */       super(1, $completion);
/*     */     }
/*     */     
/*     */     public final Object invokeSuspend(Object $result) {
/*     */       Ref.ObjectRef response;
/*     */       long time;
/*     */       GrazieLLMProxy grazieLLMProxy;
/*     */       MatterhornChat matterhornChat;
/*     */       ModelParameters modelParameters;
/*     */       Function1<CustomArtifactEvent, Unit> function1;
/*     */       int $i$f$measureTimeMillis;
/*     */       long start$iv;
/*     */       int $i$a$-measureTimeMillis-GrazieLLMProxy$sendChat$2$time$1;
/*     */       Ref.ObjectRef objectRef1;
/*     */       Object object = IntrinsicsKt.getCOROUTINE_SUSPENDED();
/*     */       switch (this.label) {
/*     */         case 0:
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           response = new Ref.ObjectRef();
/*     */           grazieLLMProxy = GrazieLLMProxy.this;
/*     */           matterhornChat = this.$chat;
/*     */           modelParameters = this.$modelParameters;
/*     */           function1 = this.$eventHandler;
/*     */           $i$f$measureTimeMillis = 0;
/*     */           start$iv = System.currentTimeMillis();
/*     */           $i$a$-measureTimeMillis-GrazieLLMProxy$sendChat$2$time$1 = 0;
/*     */           objectRef1 = response;
/*     */           this.L$0 = response;
/*     */           this.L$1 = objectRef1;
/*     */           this.J$0 = start$iv;
/*     */           this.label = 1;
/*     */           if (grazieLLMProxy.sendWithTracking(matterhornChat, modelParameters, grazieLLMProxy.propertyProvider, new GrazieLLMProxy$sendChat$2$time$1$1(null), function1, (Continuation<? super AIAnswer>)this) == object)
/*     */             return object; 
/*     */           objectRef1.element = grazieLLMProxy.sendWithTracking(matterhornChat, modelParameters, grazieLLMProxy.propertyProvider, new GrazieLLMProxy$sendChat$2$time$1$1(null), function1, (Continuation<? super AIAnswer>)this);
/*     */           time = System.currentTimeMillis() - start$iv;
/*     */           ((AIAnswer)response.element).setTime(time);
/*     */           GrazieLLMProxy.this.updateQuota();
/*     */           return response.element;
/*     */         case 1:
/*     */           $i$f$measureTimeMillis = 0;
/*     */           $i$a$-measureTimeMillis-GrazieLLMProxy$sendChat$2$time$1 = 0;
/*     */           start$iv = this.J$0;
/*     */           objectRef1 = (Ref.ObjectRef)this.L$1;
/*     */           response = (Ref.ObjectRef)this.L$0;
/*     */           ResultKt.throwOnFailure(SYNTHETIC_LOCAL_VARIABLE_1);
/*     */           objectRef1.element = SYNTHETIC_LOCAL_VARIABLE_1;
/*     */           time = System.currentTimeMillis() - start$iv;
/*     */           ((AIAnswer)response.element).setTime(time);
/*     */           GrazieLLMProxy.this.updateQuota();
/*     */           return response.element;
/*     */       } 
/*     */       throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
/*     */     }
/*     */     
/*     */     public final Continuation<Unit> create(Continuation<? super GrazieLLMProxy$sendChat$2> $completion) {
/*     */       return (Continuation<Unit>)new GrazieLLMProxy$sendChat$2(this.$chat, this.$modelParameters, this.$eventHandler, $completion);
/*     */     }
/*     */     
/*     */     public final Object invoke(Continuation<?> p1) {
/*     */       return ((GrazieLLMProxy$sendChat$2)create(p1)).invokeSuspend(Unit.INSTANCE);
/*     */     }
/*     */     
/*     */     @DebugMetadata(f = "GrazieLLMProxy.kt", l = {75, 79, 81}, i = {0, 0, 1, 2}, s = {"L$0", "L$1", "L$0", "L$0"}, n = {"chat", "modelParameters", "modelParameters", "modelParameters"}, m = "invokeSuspend", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy$sendChat$2$time$1$1")
/*     */     @Metadata(mv = {2, 1, 0}, k = 3, xi = 48, d1 = {"\000\030\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\020\000\032\0020\0012\006\020\002\032\0020\0032\006\020\004\032\0020\0052\006\020\006\032\0020\007H\n"}, d2 = {"<anonymous>", "Lcom/intellij/ml/llm/matterhorn/llm/AIAnswer;", "chat", "Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;", "modelParameters", "Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;", "propertyProvider", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyProvider;"})
/*     */     static final class GrazieLLMProxy$sendChat$2$time$1$1 extends SuspendLambda implements Function4<MatterhornChat, ModelParameters, MatterhornPropertyProvider, Continuation<? super AIAnswer>, Object> {
/*     */       int label;
/*     */       
/*     */       GrazieLLMProxy$sendChat$2$time$1$1(Continuation $completion) {
/*     */         super(4, $completion);
/*     */       }
/*     */       
/*     */       public final Object invokeSuspend(Object $result) {
/*     */         // Byte code:
/*     */         //   0: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */         //   3: astore #7
/*     */         //   5: aload_0
/*     */         //   6: getfield label : I
/*     */         //   9: tableswitch default -> 359, 0 -> 40, 1 -> 100, 2 -> 229, 3 -> 287
/*     */         //   40: aload_1
/*     */         //   41: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   44: aload_0
/*     */         //   45: getfield L$0 : Ljava/lang/Object;
/*     */         //   48: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */         //   51: astore_2
/*     */         //   52: aload_0
/*     */         //   53: getfield L$1 : Ljava/lang/Object;
/*     */         //   56: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */         //   59: astore_3
/*     */         //   60: aload_0
/*     */         //   61: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */         //   64: invokestatic access$getAuth$p : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;)Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieAuthService;
/*     */         //   67: aload_0
/*     */         //   68: checkcast kotlin/coroutines/Continuation
/*     */         //   71: aload_0
/*     */         //   72: aload_2
/*     */         //   73: putfield L$0 : Ljava/lang/Object;
/*     */         //   76: aload_0
/*     */         //   77: aload_3
/*     */         //   78: putfield L$1 : Ljava/lang/Object;
/*     */         //   81: aload_0
/*     */         //   82: iconst_1
/*     */         //   83: putfield label : I
/*     */         //   86: invokeinterface getClient : (Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   91: dup
/*     */         //   92: aload #7
/*     */         //   94: if_acmpne -> 121
/*     */         //   97: aload #7
/*     */         //   99: areturn
/*     */         //   100: aload_0
/*     */         //   101: getfield L$1 : Ljava/lang/Object;
/*     */         //   104: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */         //   107: astore_3
/*     */         //   108: aload_0
/*     */         //   109: getfield L$0 : Ljava/lang/Object;
/*     */         //   112: checkcast com/intellij/ml/llm/matterhorn/llm/MatterhornChat
/*     */         //   115: astore_2
/*     */         //   116: aload_1
/*     */         //   117: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   120: aload_1
/*     */         //   121: checkcast ai/grazie/api/gateway/client/SuspendableAPIGatewayClient
/*     */         //   124: dup
/*     */         //   125: ifnonnull -> 139
/*     */         //   128: pop
/*     */         //   129: new java/lang/RuntimeException
/*     */         //   132: dup
/*     */         //   133: ldc 'Not authorized'
/*     */         //   135: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   138: athrow
/*     */         //   139: astore #4
/*     */         //   141: aload_3
/*     */         //   142: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */         //   145: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */         //   148: getstatic com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$sendChat$2$time$1$1$WhenMappings.$EnumSwitchMapping$0 : [I
/*     */         //   151: swap
/*     */         //   152: invokevirtual ordinal : ()I
/*     */         //   155: iaload
/*     */         //   156: tableswitch default -> 306, 1 -> 180, 2 -> 248
/*     */         //   180: aload_2
/*     */         //   181: aconst_null
/*     */         //   182: iconst_1
/*     */         //   183: aconst_null
/*     */         //   184: invokestatic checkChatForAnthropic$default : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Ljava/lang/String;ILjava/lang/Object;)Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */         //   187: astore #6
/*     */         //   189: aload_0
/*     */         //   190: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */         //   193: aload #4
/*     */         //   195: aload #6
/*     */         //   197: aload_3
/*     */         //   198: aload_0
/*     */         //   199: checkcast kotlin/coroutines/Continuation
/*     */         //   202: aload_0
/*     */         //   203: aload_3
/*     */         //   204: putfield L$0 : Ljava/lang/Object;
/*     */         //   207: aload_0
/*     */         //   208: aconst_null
/*     */         //   209: putfield L$1 : Ljava/lang/Object;
/*     */         //   212: aload_0
/*     */         //   213: iconst_2
/*     */         //   214: putfield label : I
/*     */         //   217: invokestatic access$getAnthropicContentChoices : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   220: dup
/*     */         //   221: aload #7
/*     */         //   223: if_acmpne -> 242
/*     */         //   226: aload #7
/*     */         //   228: areturn
/*     */         //   229: aload_0
/*     */         //   230: getfield L$0 : Ljava/lang/Object;
/*     */         //   233: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */         //   236: astore_3
/*     */         //   237: aload_1
/*     */         //   238: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   241: aload_1
/*     */         //   242: checkcast java/util/Map
/*     */         //   245: goto -> 326
/*     */         //   248: aload_0
/*     */         //   249: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */         //   252: aload #4
/*     */         //   254: aload_2
/*     */         //   255: aload_3
/*     */         //   256: aload_0
/*     */         //   257: checkcast kotlin/coroutines/Continuation
/*     */         //   260: aload_0
/*     */         //   261: aload_3
/*     */         //   262: putfield L$0 : Ljava/lang/Object;
/*     */         //   265: aload_0
/*     */         //   266: aconst_null
/*     */         //   267: putfield L$1 : Ljava/lang/Object;
/*     */         //   270: aload_0
/*     */         //   271: iconst_3
/*     */         //   272: putfield label : I
/*     */         //   275: invokestatic access$getOpenAIContentChoices : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */         //   278: dup
/*     */         //   279: aload #7
/*     */         //   281: if_acmpne -> 300
/*     */         //   284: aload #7
/*     */         //   286: areturn
/*     */         //   287: aload_0
/*     */         //   288: getfield L$0 : Ljava/lang/Object;
/*     */         //   291: checkcast com/intellij/ml/llm/matterhorn/llm/ModelParameters
/*     */         //   294: astore_3
/*     */         //   295: aload_1
/*     */         //   296: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */         //   299: aload_1
/*     */         //   300: checkcast java/util/Map
/*     */         //   303: goto -> 326
/*     */         //   306: new java/lang/RuntimeException
/*     */         //   309: dup
/*     */         //   310: aload_3
/*     */         //   311: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */         //   314: invokevirtual getProvider : ()Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;
/*     */         //   317: <illegal opcode> makeConcatWithConstants : (Lcom/intellij/ml/llm/matterhorn/llm/LlmProvider;)Ljava/lang/String;
/*     */         //   322: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   325: athrow
/*     */         //   326: astore #5
/*     */         //   328: new com/intellij/ml/llm/matterhorn/llm/AIAnswer
/*     */         //   331: dup
/*     */         //   332: aload_3
/*     */         //   333: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */         //   336: aload_0
/*     */         //   337: getfield this$0 : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */         //   340: aload #5
/*     */         //   342: invokestatic access$toAnswerChoices : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Ljava/util/Map;)Ljava/util/List;
/*     */         //   345: lconst_0
/*     */         //   346: lconst_0
/*     */         //   347: lconst_0
/*     */         //   348: lconst_0
/*     */         //   349: lconst_0
/*     */         //   350: iconst_0
/*     */         //   351: sipush #252
/*     */         //   354: aconst_null
/*     */         //   355: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;Ljava/util/List;JJJJJZILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */         //   358: areturn
/*     */         //   359: new java/lang/IllegalStateException
/*     */         //   362: dup
/*     */         //   363: ldc 'call to 'resume' before 'invoke' with coroutine'
/*     */         //   365: invokespecial <init> : (Ljava/lang/String;)V
/*     */         //   368: athrow
/*     */         // Line number table:
/*     */         //   Java source line number -> byte code offset
/*     */         //   #74	-> 3
/*     */         //   #75	-> 60
/*     */         //   #74	-> 97
/*     */         //   #75	-> 121
/*     */         //   #76	-> 141
/*     */         //   #78	-> 180
/*     */         //   #79	-> 189
/*     */         //   #74	-> 226
/*     */         //   #79	-> 242
/*     */         //   #81	-> 248
/*     */         //   #82	-> 254
/*     */         //   #83	-> 255
/*     */         //   #81	-> 260
/*     */         //   #74	-> 284
/*     */         //   #81	-> 300
/*     */         //   #85	-> 306
/*     */         //   #76	-> 326
/*     */         //   #89	-> 328
/*     */         //   #74	-> 359
/*     */         // Local variable table:
/*     */         //   start	length	slot	name	descriptor
/*     */         //   52	48	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */         //   116	12	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */         //   139	50	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */         //   248	7	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */         //   60	40	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */         //   108	121	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */         //   237	50	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */         //   295	31	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */         //   326	33	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */         //   141	79	4	authClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */         //   248	6	4	authClient	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */         //   328	31	5	result	Ljava/util/Map;
/*     */         //   189	31	6	safeChat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */         //   0	369	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$sendChat$2$time$1$1;
/*     */         //   44	315	1	$result	Ljava/lang/Object;
/*     */       }
/*     */       
/*     */       public final Object invoke(MatterhornChat p1, ModelParameters p2, MatterhornPropertyProvider p3, Continuation<? super GrazieLLMProxy$sendChat$2$time$1$1> p4) {
/*     */         GrazieLLMProxy$sendChat$2$time$1$1 grazieLLMProxy$sendChat$2$time$1$1 = new GrazieLLMProxy$sendChat$2$time$1$1(p4);
/*     */         grazieLLMProxy$sendChat$2$time$1$1.L$0 = p1;
/*     */         grazieLLMProxy$sendChat$2$time$1$1.L$1 = p2;
/*     */         return grazieLLMProxy$sendChat$2$time$1$1.invokeSuspend(Unit.INSTANCE);
/*     */       }
/*     */     }
/*     */   }
/*     */   
/*     */   protected void updateQuota() {}
/*     */   
/*     */   protected void reportQuota(@NotNull Quota updated) {
/*     */     Intrinsics.checkNotNullParameter(updated, "updated");
/*     */   }
/*     */   
/*     */   private final RetryableType toRetryableType(Exception $this$toRetryableType) {
/*     */     Exception exception = $this$toRetryableType;
/*     */     return (exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.Unauthorized || exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.Forbidden || exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.OutOfQuota || exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.UnavailableForLegalReasons) ? RetryableType.RETRY_AUTH : ((exception instanceof java.util.concurrent.CancellationException || exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.ContentTooLarge || exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.InternalServerError) ? RetryableType.NO_RETRY : ((exception instanceof ai.grazie.model.cloud.exceptions.HTTPStatusException.TooManyRequests) ? RetryableType.EXPONENTIAL_DELAY_RETRY : RetryableType.DEFAULT_RETRY));
/*     */   }
/*     */   
/*     */   private final LLMProfileID toProfileID(LLM $this$toProfileID) {
/*     */     return new LLMProfileID($this$toProfileID.getJbai());
/*     */   }
/*     */   
/*     */   private final Object getOpenAIContentChoices(SuspendableAPIGatewayClient $this$getOpenAIContentChoices, MatterhornChat chat, ModelParameters modelParameters, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getOpenAIContentChoices$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getOpenAIContentChoices$1
/*     */     //   13: astore #12
/*     */     //   15: aload #12
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #12
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getOpenAIContentChoices$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #12
/*     */     //   53: aload #12
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #11
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #13
/*     */     //   65: aload #12
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 408, 0 -> 96, 1 -> 286, 2 -> 381
/*     */     //   96: aload #11
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: astore #10
/*     */     //   104: aload_1
/*     */     //   105: invokevirtual llm : ()Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   108: invokevirtual v7 : ()Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;
/*     */     //   111: new ai/grazie/model/llm/prompt/LLMPromptID
/*     */     //   114: dup
/*     */     //   115: ldc_w 'ij.junie.openai'
/*     */     //   118: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   121: aload_0
/*     */     //   122: aload_3
/*     */     //   123: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   126: invokespecial toProfileID : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;)Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   129: getstatic com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieChatMessageUtils.INSTANCE : Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieChatMessageUtils;
/*     */     //   132: new ai/grazie/model/llm/chat/v5/LLMChat$Builder
/*     */     //   135: dup
/*     */     //   136: aconst_null
/*     */     //   137: iconst_1
/*     */     //   138: aconst_null
/*     */     //   139: invokespecial <init> : (Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   142: aload_2
/*     */     //   143: invokevirtual getSystem : ()Ljava/lang/String;
/*     */     //   146: invokevirtual system : (Ljava/lang/String;)Lai/grazie/model/llm/chat/v5/LLMChat$Builder;
/*     */     //   149: aload_2
/*     */     //   150: invokevirtual getMessages : ()Ljava/util/List;
/*     */     //   153: aload_3
/*     */     //   154: aconst_null
/*     */     //   155: iconst_4
/*     */     //   156: aconst_null
/*     */     //   157: invokestatic addMessages$default : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieChatMessageUtils;Lai/grazie/model/llm/chat/v5/LLMChat$Builder;Ljava/util/List;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;ILjava/lang/Object;)Lai/grazie/model/llm/chat/v5/LLMChat$Builder;
/*     */     //   160: invokevirtual build : ()Lai/grazie/model/llm/chat/v5/LLMChat;
/*     */     //   163: new ai/grazie/utils/attributes/Attributes
/*     */     //   166: dup
/*     */     //   167: invokespecial <init> : ()V
/*     */     //   170: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
/*     */     //   173: invokevirtual getTemperature : ()Lai/grazie/utils/attributes/Attributes$Key$Double;
/*     */     //   176: checkcast ai/grazie/utils/attributes/Attributes$Key
/*     */     //   179: new ai/grazie/utils/attributes/Attributes$Value$Double
/*     */     //   182: dup
/*     */     //   183: aload_3
/*     */     //   184: invokevirtual getTemperature : ()Ljava/lang/Double;
/*     */     //   187: dup
/*     */     //   188: ifnull -> 197
/*     */     //   191: invokevirtual doubleValue : ()D
/*     */     //   194: goto -> 199
/*     */     //   197: pop
/*     */     //   198: dconst_0
/*     */     //   199: aconst_null
/*     */     //   200: iconst_2
/*     */     //   201: aconst_null
/*     */     //   202: invokespecial <init> : (DLai/grazie/utils/mpp/time/Timestamp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   205: checkcast ai/grazie/utils/attributes/Attributes$Value
/*     */     //   208: invokevirtual put : (Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;)Lai/grazie/utils/attributes/Attributes;
/*     */     //   211: getstatic ai/grazie/model/llm/parameters/LLMParameters.INSTANCE : Lai/grazie/model/llm/parameters/LLMParameters;
/*     */     //   214: invokevirtual getNumberOfChoices : ()Lai/grazie/utils/attributes/Attributes$Key$Long;
/*     */     //   217: checkcast ai/grazie/utils/attributes/Attributes$Key
/*     */     //   220: new ai/grazie/utils/attributes/Attributes$Value$Long
/*     */     //   223: dup
/*     */     //   224: aload_3
/*     */     //   225: invokevirtual getNumberOfSuggestions : ()Ljava/lang/Integer;
/*     */     //   228: dup
/*     */     //   229: ifnull -> 239
/*     */     //   232: invokevirtual intValue : ()I
/*     */     //   235: i2l
/*     */     //   236: goto -> 241
/*     */     //   239: pop
/*     */     //   240: lconst_1
/*     */     //   241: aconst_null
/*     */     //   242: iconst_2
/*     */     //   243: aconst_null
/*     */     //   244: invokespecial <init> : (JLai/grazie/utils/mpp/time/Timestamp;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
/*     */     //   247: checkcast ai/grazie/utils/attributes/Attributes$Value
/*     */     //   250: invokevirtual put : (Lai/grazie/utils/attributes/Attributes$Key;Lai/grazie/utils/attributes/Attributes$Value;)Lai/grazie/utils/attributes/Attributes;
/*     */     //   253: aload #12
/*     */     //   255: aload #12
/*     */     //   257: aload_0
/*     */     //   258: putfield L$0 : Ljava/lang/Object;
/*     */     //   261: aload #12
/*     */     //   263: aload #10
/*     */     //   265: putfield L$1 : Ljava/lang/Object;
/*     */     //   268: aload #12
/*     */     //   270: iconst_1
/*     */     //   271: putfield label : I
/*     */     //   274: invokevirtual chat : (Lai/grazie/model/llm/prompt/LLMPromptID;Lai/grazie/model/llm/profile/LLMProfileID;Lai/grazie/model/llm/chat/v5/LLMChat;Lai/grazie/utils/attributes/Attributes;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   277: dup
/*     */     //   278: aload #13
/*     */     //   280: if_acmpne -> 312
/*     */     //   283: aload #13
/*     */     //   285: areturn
/*     */     //   286: aload #12
/*     */     //   288: getfield L$1 : Ljava/lang/Object;
/*     */     //   291: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy
/*     */     //   294: astore #10
/*     */     //   296: aload #12
/*     */     //   298: getfield L$0 : Ljava/lang/Object;
/*     */     //   301: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy
/*     */     //   304: astore_0
/*     */     //   305: aload #11
/*     */     //   307: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   310: aload #11
/*     */     //   312: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   315: astore #5
/*     */     //   317: iconst_0
/*     */     //   318: istore #6
/*     */     //   320: aload #5
/*     */     //   322: astore #7
/*     */     //   324: iconst_0
/*     */     //   325: istore #8
/*     */     //   327: iconst_0
/*     */     //   328: istore #9
/*     */     //   330: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getOpenAIContentChoices$$inlined$mapNotNull$1
/*     */     //   333: dup
/*     */     //   334: aload #7
/*     */     //   336: aload_0
/*     */     //   337: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;)V
/*     */     //   340: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   343: nop
/*     */     //   344: nop
/*     */     //   345: aconst_null
/*     */     //   346: aload #12
/*     */     //   348: iconst_1
/*     */     //   349: aconst_null
/*     */     //   350: aload #12
/*     */     //   352: aload #10
/*     */     //   354: putfield L$0 : Ljava/lang/Object;
/*     */     //   357: aload #12
/*     */     //   359: aconst_null
/*     */     //   360: putfield L$1 : Ljava/lang/Object;
/*     */     //   363: aload #12
/*     */     //   365: iconst_2
/*     */     //   366: putfield label : I
/*     */     //   369: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   372: dup
/*     */     //   373: aload #13
/*     */     //   375: if_acmpne -> 398
/*     */     //   378: aload #13
/*     */     //   380: areturn
/*     */     //   381: aload #12
/*     */     //   383: getfield L$0 : Ljava/lang/Object;
/*     */     //   386: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy
/*     */     //   389: astore #10
/*     */     //   391: aload #11
/*     */     //   393: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   396: aload #11
/*     */     //   398: aload #10
/*     */     //   400: swap
/*     */     //   401: checkcast java/util/List
/*     */     //   404: invokespecial collapseAnswerGroups : (Ljava/util/List;)Ljava/util/Map;
/*     */     //   407: areturn
/*     */     //   408: new java/lang/IllegalStateException
/*     */     //   411: dup
/*     */     //   412: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   415: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   418: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #211	-> 63
/*     */     //   #214	-> 101
/*     */     //   #215	-> 111
/*     */     //   #216	-> 121
/*     */     //   #217	-> 129
/*     */     //   #218	-> 142
/*     */     //   #219	-> 149
/*     */     //   #220	-> 160
/*     */     //   #221	-> 163
/*     */     //   #222	-> 170
/*     */     //   #223	-> 211
/*     */     //   #214	-> 255
/*     */     //   #211	-> 283
/*     */     //   #224	-> 317
/*     */     //   #369	-> 320
/*     */     //   #370	-> 327
/*     */     //   #371	-> 330
/*     */     //   #372	-> 343
/*     */     //   #373	-> 344
/*     */     //   #233	-> 345
/*     */     //   #211	-> 378
/*     */     //   #233	-> 398
/*     */     //   #211	-> 408
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	185	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */     //   305	38	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */     //   101	10	1	$this$getOpenAIContentChoices	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   101	59	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   101	127	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   317	28	5	$this$mapNotNull$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   324	20	7	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   330	13	9	$i$f$unsafeFlow	I
/*     */     //   327	17	8	$i$f$unsafeTransform	I
/*     */     //   320	25	6	$i$f$mapNotNull	I
/*     */     //   0	419	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	355	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	348	11	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private final Object getAnthropicContentChoices(SuspendableAPIGatewayClient $this$getAnthropicContentChoices, MatterhornChat chat, ModelParameters modelParameters, Continuation $completion) {
/*     */     // Byte code:
/*     */     //   0: aload #4
/*     */     //   2: instanceof com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$1
/*     */     //   5: ifeq -> 41
/*     */     //   8: aload #4
/*     */     //   10: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$1
/*     */     //   13: astore #12
/*     */     //   15: aload #12
/*     */     //   17: getfield label : I
/*     */     //   20: ldc -2147483648
/*     */     //   22: iand
/*     */     //   23: ifeq -> 41
/*     */     //   26: aload #12
/*     */     //   28: dup
/*     */     //   29: getfield label : I
/*     */     //   32: ldc -2147483648
/*     */     //   34: isub
/*     */     //   35: putfield label : I
/*     */     //   38: goto -> 53
/*     */     //   41: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$1
/*     */     //   44: dup
/*     */     //   45: aload_0
/*     */     //   46: aload #4
/*     */     //   48: invokespecial <init> : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lkotlin/coroutines/Continuation;)V
/*     */     //   51: astore #12
/*     */     //   53: aload #12
/*     */     //   55: getfield result : Ljava/lang/Object;
/*     */     //   58: astore #11
/*     */     //   60: invokestatic getCOROUTINE_SUSPENDED : ()Ljava/lang/Object;
/*     */     //   63: astore #13
/*     */     //   65: aload #12
/*     */     //   67: getfield label : I
/*     */     //   70: tableswitch default -> 274, 0 -> 96, 1 -> 152, 2 -> 247
/*     */     //   96: aload #11
/*     */     //   98: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   101: aload_0
/*     */     //   102: astore #10
/*     */     //   104: aload_1
/*     */     //   105: invokevirtual llm : ()Lai/grazie/api/gateway/client/api/llm/LlmAPIClient;
/*     */     //   108: invokevirtual v7 : ()Lai/grazie/api/gateway/client/api/llm/LlmAPIClient$V7;
/*     */     //   111: aload_0
/*     */     //   112: aload_3
/*     */     //   113: aload_2
/*     */     //   114: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;)Lkotlin/jvm/functions/Function1;
/*     */     //   119: aload #12
/*     */     //   121: aload #12
/*     */     //   123: aload_0
/*     */     //   124: putfield L$0 : Ljava/lang/Object;
/*     */     //   127: aload #12
/*     */     //   129: aload #10
/*     */     //   131: putfield L$1 : Ljava/lang/Object;
/*     */     //   134: aload #12
/*     */     //   136: iconst_1
/*     */     //   137: putfield label : I
/*     */     //   140: invokevirtual chat : (Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
/*     */     //   143: dup
/*     */     //   144: aload #13
/*     */     //   146: if_acmpne -> 178
/*     */     //   149: aload #13
/*     */     //   151: areturn
/*     */     //   152: aload #12
/*     */     //   154: getfield L$1 : Ljava/lang/Object;
/*     */     //   157: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy
/*     */     //   160: astore #10
/*     */     //   162: aload #12
/*     */     //   164: getfield L$0 : Ljava/lang/Object;
/*     */     //   167: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy
/*     */     //   170: astore_0
/*     */     //   171: aload #11
/*     */     //   173: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   176: aload #11
/*     */     //   178: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   181: astore #5
/*     */     //   183: iconst_0
/*     */     //   184: istore #6
/*     */     //   186: aload #5
/*     */     //   188: astore #7
/*     */     //   190: iconst_0
/*     */     //   191: istore #8
/*     */     //   193: iconst_0
/*     */     //   194: istore #9
/*     */     //   196: new com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy$getAnthropicContentChoices$$inlined$mapNotNull$1
/*     */     //   199: dup
/*     */     //   200: aload #7
/*     */     //   202: aload_0
/*     */     //   203: invokespecial <init> : (Lkotlinx/coroutines/flow/Flow;Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;)V
/*     */     //   206: checkcast kotlinx/coroutines/flow/Flow
/*     */     //   209: nop
/*     */     //   210: nop
/*     */     //   211: aconst_null
/*     */     //   212: aload #12
/*     */     //   214: iconst_1
/*     */     //   215: aconst_null
/*     */     //   216: aload #12
/*     */     //   218: aload #10
/*     */     //   220: putfield L$0 : Ljava/lang/Object;
/*     */     //   223: aload #12
/*     */     //   225: aconst_null
/*     */     //   226: putfield L$1 : Ljava/lang/Object;
/*     */     //   229: aload #12
/*     */     //   231: iconst_2
/*     */     //   232: putfield label : I
/*     */     //   235: invokestatic toList$default : (Lkotlinx/coroutines/flow/Flow;Ljava/util/List;Lkotlin/coroutines/Continuation;ILjava/lang/Object;)Ljava/lang/Object;
/*     */     //   238: dup
/*     */     //   239: aload #13
/*     */     //   241: if_acmpne -> 264
/*     */     //   244: aload #13
/*     */     //   246: areturn
/*     */     //   247: aload #12
/*     */     //   249: getfield L$0 : Ljava/lang/Object;
/*     */     //   252: checkcast com/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy
/*     */     //   255: astore #10
/*     */     //   257: aload #11
/*     */     //   259: invokestatic throwOnFailure : (Ljava/lang/Object;)V
/*     */     //   262: aload #11
/*     */     //   264: aload #10
/*     */     //   266: swap
/*     */     //   267: checkcast java/util/List
/*     */     //   270: invokespecial collapseAnswerGroups : (Ljava/util/List;)Ljava/util/Map;
/*     */     //   273: areturn
/*     */     //   274: new java/lang/IllegalStateException
/*     */     //   277: dup
/*     */     //   278: ldc_w 'call to 'resume' before 'invoke' with coroutine'
/*     */     //   281: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   284: athrow
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #235	-> 63
/*     */     //   #238	-> 101
/*     */     //   #235	-> 149
/*     */     //   #284	-> 183
/*     */     //   #374	-> 186
/*     */     //   #375	-> 193
/*     */     //   #376	-> 196
/*     */     //   #377	-> 209
/*     */     //   #378	-> 210
/*     */     //   #302	-> 211
/*     */     //   #235	-> 244
/*     */     //   #302	-> 264
/*     */     //   #235	-> 274
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   101	51	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */     //   171	38	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */     //   101	42	1	$this$getAnthropicContentChoices	Lai/grazie/api/gateway/client/SuspendableAPIGatewayClient;
/*     */     //   101	42	2	chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   101	42	3	modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   183	28	5	$this$mapNotNull$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   190	20	7	$this$unsafeTransform$iv$iv	Lkotlinx/coroutines/flow/Flow;
/*     */     //   196	13	9	$i$f$unsafeFlow	I
/*     */     //   193	17	8	$i$f$unsafeTransform	I
/*     */     //   186	25	6	$i$f$mapNotNull	I
/*     */     //   0	285	4	$completion	Lkotlin/coroutines/Continuation;
/*     */     //   53	221	12	$continuation	Lkotlin/coroutines/Continuation;
/*     */     //   60	214	11	$result	Ljava/lang/Object;
/*     */   }
/*     */   
/*     */   private static final Unit getAnthropicContentChoices$lambda$9(GrazieLLMProxy this$0, ModelParameters $modelParameters, MatterhornChat $chat, ChatRequestBuilder $this$chat) {
/*     */     // Byte code:
/*     */     //   0: aload_3
/*     */     //   1: ldc_w '$this$chat'
/*     */     //   4: invokestatic checkNotNullParameter : (Ljava/lang/Object;Ljava/lang/String;)V
/*     */     //   7: aload_3
/*     */     //   8: new ai/grazie/model/llm/prompt/LLMPromptID
/*     */     //   11: dup
/*     */     //   12: ldc_w 'ij.junie.sonnet'
/*     */     //   15: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   18: invokevirtual setPrompt : (Lai/grazie/model/llm/prompt/LLMPromptID;)V
/*     */     //   21: aload_3
/*     */     //   22: aload_0
/*     */     //   23: aload_1
/*     */     //   24: invokevirtual getModel : ()Lcom/intellij/ml/llm/matterhorn/llm/LLM;
/*     */     //   27: invokespecial toProfileID : (Lcom/intellij/ml/llm/matterhorn/llm/LLM;)Lai/grazie/model/llm/profile/LLMProfileID;
/*     */     //   30: invokevirtual setProfile : (Lai/grazie/model/llm/profile/LLMProfileID;)V
/*     */     //   33: aload_3
/*     */     //   34: aload_1
/*     */     //   35: invokevirtual getTemperature : ()Ljava/lang/Double;
/*     */     //   38: dup
/*     */     //   39: ifnonnull -> 47
/*     */     //   42: pop
/*     */     //   43: dconst_0
/*     */     //   44: invokestatic valueOf : (D)Ljava/lang/Double;
/*     */     //   47: invokevirtual setTemperature : (Ljava/lang/Double;)V
/*     */     //   50: aload_1
/*     */     //   51: invokevirtual getStop : ()Ljava/util/Map;
/*     */     //   54: dup
/*     */     //   55: ifnull -> 66
/*     */     //   58: invokeinterface size : ()I
/*     */     //   63: goto -> 68
/*     */     //   66: pop
/*     */     //   67: iconst_0
/*     */     //   68: iconst_1
/*     */     //   69: if_icmpgt -> 76
/*     */     //   72: iconst_1
/*     */     //   73: goto -> 77
/*     */     //   76: iconst_0
/*     */     //   77: istore #4
/*     */     //   79: getstatic kotlin/_Assertions.ENABLED : Z
/*     */     //   82: ifeq -> 105
/*     */     //   85: iload #4
/*     */     //   87: ifne -> 105
/*     */     //   90: ldc_w 'Assertion failed'
/*     */     //   93: astore #5
/*     */     //   95: new java/lang/AssertionError
/*     */     //   98: dup
/*     */     //   99: aload #5
/*     */     //   101: invokespecial <init> : (Ljava/lang/Object;)V
/*     */     //   104: athrow
/*     */     //   105: aload_3
/*     */     //   106: aload_1
/*     */     //   107: invokevirtual getStop : ()Ljava/util/Map;
/*     */     //   110: dup
/*     */     //   111: ifnull -> 140
/*     */     //   114: invokestatic toList : (Ljava/util/Map;)Ljava/util/List;
/*     */     //   117: dup
/*     */     //   118: ifnull -> 140
/*     */     //   121: invokestatic first : (Ljava/util/List;)Ljava/lang/Object;
/*     */     //   124: checkcast kotlin/Pair
/*     */     //   127: dup
/*     */     //   128: ifnull -> 140
/*     */     //   131: invokevirtual getFirst : ()Ljava/lang/Object;
/*     */     //   134: checkcast java/lang/String
/*     */     //   137: goto -> 142
/*     */     //   140: pop
/*     */     //   141: aconst_null
/*     */     //   142: invokevirtual setStopToken : (Ljava/lang/String;)V
/*     */     //   145: aload_3
/*     */     //   146: aconst_null
/*     */     //   147: aload_2
/*     */     //   148: aload_1
/*     */     //   149: aload_3
/*     */     //   150: <illegal opcode> invoke : (Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;)Lkotlin/jvm/functions/Function1;
/*     */     //   155: iconst_1
/*     */     //   156: aconst_null
/*     */     //   157: invokestatic messages$default : (Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V
/*     */     //   160: getstatic kotlin/Unit.INSTANCE : Lkotlin/Unit;
/*     */     //   163: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #239	-> 7
/*     */     //   #240	-> 21
/*     */     //   #241	-> 33
/*     */     //   #242	-> 50
/*     */     //   #243	-> 105
/*     */     //   #244	-> 145
/*     */     //   #284	-> 160
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   0	164	0	this$0	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */     //   0	164	1	$modelParameters	Lcom/intellij/ml/llm/matterhorn/llm/ModelParameters;
/*     */     //   0	164	2	$chat	Lcom/intellij/ml/llm/matterhorn/llm/MatterhornChat;
/*     */     //   0	164	3	$this$chat	Lai/grazie/api/gateway/client/api/llm/ChatRequestBuilder;
/*     */   }
/*     */   
/*     */   private static final Unit getAnthropicContentChoices$lambda$9$lambda$8(MatterhornChat $chat, ModelParameters $modelParameters, ChatRequestBuilder $this_chat, LLMChat.Builder $this$messages) {
/*     */     Intrinsics.checkNotNullParameter($this$messages, "$this$messages");
/*     */     $this$messages.system($chat.getSystem());
/*     */     if ($modelParameters.getPromptCacheEnabled())
/*     */       $this_chat.addCachePoint($this$messages); 
/*     */     GrazieChatMessageUtils.INSTANCE.addMessages($this$messages, $chat.getMessages(), $modelParameters, $this_chat);
/*     */     if (!$chat.getTools().isEmpty()) {
/*     */       boolean bool = $chat.getToolChoice() instanceof com.intellij.ml.llm.matterhorn.llm.MatterhornToolChoice.Auto;
/*     */       if (_Assertions.ENABLED && !bool) {
/*     */         String str = "Assertion failed";
/*     */         throw new AssertionError(str);
/*     */       } 
/*     */     } 
/*     */     $this_chat.functions($chat::getAnthropicContentChoices$lambda$9$lambda$8$lambda$7);
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit getAnthropicContentChoices$lambda$9$lambda$8$lambda$7(MatterhornChat $chat, LLMFunctionsBuilder $this$functions) {
/*     */     Intrinsics.checkNotNullParameter($this$functions, "$this$functions");
/*     */     Iterable $this$forEach$iv = $chat.getTools();
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv = iterator.next();
/*     */       MatterhornTool tool = (MatterhornTool)element$iv;
/*     */       int $i$a$-forEach-GrazieLLMProxy$getAnthropicContentChoices$2$1$1$1 = 0;
/*     */       $this$functions.function(tool::getAnthropicContentChoices$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5);
/*     */     } 
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private static final Unit getAnthropicContentChoices$lambda$9$lambda$8$lambda$7$lambda$6$lambda$5(MatterhornTool $tool, LLMFunction.Builder $this$function) {
/*     */     Intrinsics.checkNotNullParameter($this$function, "$this$function");
/*     */     $this$function.setName($tool.getName());
/*     */     $this$function.setDescription($tool.getDescription());
/*     */     List list1 = $tool.getParams();
/*     */     List list3 = CollectionsKt.emptyList();
/*     */     Map map = MapsKt.emptyMap();
/*     */     AnthropicInputSchema schema = new AnthropicInputSchema("object", map, list3);
/*     */     Json json1 = (Json)Json.Default;
/*     */     int i = 0;
/*     */     json1.getSerializersModule();
/*     */     if ($tool.getParams() == null)
/*     */       $tool.getParams(); 
/*     */     List list4 = CollectionsKt.emptyList(), list8 = $tool.getParams();
/*     */     int $i$f$filter = 0;
/*     */     List list6 = list4;
/*     */     Collection<Object> collection = new ArrayList();
/*     */     int $i$f$filterTo = 0;
/*     */     for (Object element$iv$iv : list6) {
/*     */       MatterhornToolParam it = (MatterhornToolParam)element$iv$iv;
/*     */       int $i$a$-filter-GrazieLLMProxy$getAnthropicContentChoices$2$1$1$1$1$schema$1 = 0;
/*     */       if (it.getRequired())
/*     */         collection.add(element$iv$iv); 
/*     */     } 
/*     */     Iterable $this$filter$iv = collection;
/*     */     list8 = list8;
/*     */     int $i$f$map = 0;
/*     */     Iterable $this$filterTo$iv$iv = $this$filter$iv;
/*     */     Collection<String> destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$filter$iv, 10));
/*     */     int $i$f$mapTo = 0;
/*     */     for (Object item$iv$iv : $this$filterTo$iv$iv) {
/*     */       MatterhornToolParam matterhornToolParam = (MatterhornToolParam)item$iv$iv;
/*     */       Collection<String> collection1 = destination$iv$iv;
/*     */       int $i$a$-map-GrazieLLMProxy$getAnthropicContentChoices$2$1$1$1$1$schema$2 = 0;
/*     */       collection1.add(matterhornToolParam.getName());
/*     */     } 
/*     */     List list2 = (List)destination$iv$iv;
/*     */     if ($tool.getParams() == null)
/*     */       $tool.getParams(); 
/*     */     List list5 = CollectionsKt.emptyList();
/*     */     list8 = $tool.getParams();
/*     */     int $i$f$associateBy = 0;
/*     */     int capacity$iv = RangesKt.coerceAtLeast(MapsKt.mapCapacity(CollectionsKt.collectionSizeOrDefault(list5, 10)), 16);
/*     */     List list7 = list5;
/*     */     Map<Object, Object> map5 = new LinkedHashMap<>(capacity$iv);
/*     */     int $i$f$associateByTo = 0;
/*     */     for (Object element$iv$iv : list7) {
/*     */       MatterhornToolParam matterhornToolParam = (MatterhornToolParam)element$iv$iv;
/*     */       Map<Object, Object> map6 = map5;
/*     */       int $i$a$-associateBy-GrazieLLMProxy$getAnthropicContentChoices$2$1$1$1$1$schema$3 = 0;
/*     */       map6.put(matterhornToolParam.getName(), element$iv$iv);
/*     */     } 
/*     */     Map<Object, Object> map2 = map5;
/*     */     list8 = list8;
/*     */     int $i$f$mapValues = 0;
/*     */     Map<Object, Object> map3 = map2, map4 = new LinkedHashMap<>(MapsKt.mapCapacity(map2.size()));
/*     */     int $i$f$mapValuesTo = 0;
/*     */     Iterable<Map.Entry<Object, Object>> $this$associateByTo$iv$iv$iv = map3.entrySet();
/*     */     int j = 0;
/*     */     for (Object<Object, Object> element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/*     */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv;
/*     */       Map<Object, Object> map6 = map4;
/*     */       int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0;
/*     */       Map.Entry entry2 = (Map.Entry)element$iv$iv$iv;
/*     */       Object object = entry1.getKey();
/*     */       Map<Object, Object> map7 = map6;
/*     */       int $i$a$-mapValues-GrazieLLMProxy$getAnthropicContentChoices$2$1$1$1$1$schema$4 = 0;
/*     */     } 
/*     */     Map<Object, Object> map1 = map4;
/*     */     schema = new AnthropicInputSchema("object", map1, list2);
/*     */     Json this_$iv = (Json)Json.Default;
/*     */     int $i$f$encodeToString = 0;
/*     */     this_$iv.getSerializersModule();
/*     */     list8.setParameters(((list1 == null || list1.isEmpty())) ? LLMFunctionParameters.Companion.fromJsonString(json1.encodeToString((SerializationStrategy)AnthropicInputSchema.Companion.serializer(), schema)) : LLMFunctionParameters.Companion.fromJsonString(this_$iv.encodeToString((SerializationStrategy)AnthropicInputSchema.Companion.serializer(), schema)));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   private final Map<Integer, List<AIAnswerChoice>> collapseAnswerGroups(List $this$collapseAnswerGroups) {
/*     */     if ($this$collapseAnswerGroups.isEmpty())
/*     */       return MapsKt.emptyMap(); 
/*     */     List list = $this$collapseAnswerGroups;
/*     */     LinkedHashMap<Object, Object> linkedHashMap = new LinkedHashMap<>();
/*     */     int $i$f$fold = 0;
/*     */     Object<Object, Object> accumulator$iv = (Object<Object, Object>)linkedHashMap;
/*     */     for (Object element$iv : list) {
/*     */       AIAnswerChoiceIndex aIAnswerChoiceIndex = (AIAnswerChoiceIndex)element$iv;
/*     */       Object<Object, Object> object = accumulator$iv;
/*     */       int $i$a$-fold-GrazieLLMProxy$collapseAnswerGroups$1 = 0;
/*     */       List group = (List)object.get(Integer.valueOf(aIAnswerChoiceIndex.getIndex()));
/*     */     } 
/*     */     return (Map)accumulator$iv;
/*     */   }
/*     */   
/*     */   private final List<AIAnswerChoice> toAnswerChoices(Map $this$toAnswerChoices) {
/*     */     // Byte code:
/*     */     //   0: aload_1
/*     */     //   1: invokeinterface values : ()Ljava/util/Collection;
/*     */     //   6: checkcast java/lang/Iterable
/*     */     //   9: astore_2
/*     */     //   10: iconst_0
/*     */     //   11: istore_3
/*     */     //   12: aload_2
/*     */     //   13: astore #4
/*     */     //   15: new java/util/ArrayList
/*     */     //   18: dup
/*     */     //   19: aload_2
/*     */     //   20: bipush #10
/*     */     //   22: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   25: invokespecial <init> : (I)V
/*     */     //   28: checkcast java/util/Collection
/*     */     //   31: astore #5
/*     */     //   33: iconst_0
/*     */     //   34: istore #6
/*     */     //   36: aload #4
/*     */     //   38: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   43: astore #7
/*     */     //   45: aload #7
/*     */     //   47: invokeinterface hasNext : ()Z
/*     */     //   52: ifeq -> 420
/*     */     //   55: aload #7
/*     */     //   57: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   62: astore #8
/*     */     //   64: aload #5
/*     */     //   66: aload #8
/*     */     //   68: checkcast java/util/List
/*     */     //   71: astore #9
/*     */     //   73: astore #21
/*     */     //   75: iconst_0
/*     */     //   76: istore #10
/*     */     //   78: nop
/*     */     //   79: aload #9
/*     */     //   81: checkcast java/lang/Iterable
/*     */     //   84: astore #11
/*     */     //   86: iconst_0
/*     */     //   87: istore #12
/*     */     //   89: aload #11
/*     */     //   91: instanceof java/util/Collection
/*     */     //   94: ifeq -> 114
/*     */     //   97: aload #11
/*     */     //   99: checkcast java/util/Collection
/*     */     //   102: invokeinterface isEmpty : ()Z
/*     */     //   107: ifeq -> 114
/*     */     //   110: iconst_1
/*     */     //   111: goto -> 165
/*     */     //   114: aload #11
/*     */     //   116: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   121: astore #13
/*     */     //   123: aload #13
/*     */     //   125: invokeinterface hasNext : ()Z
/*     */     //   130: ifeq -> 164
/*     */     //   133: aload #13
/*     */     //   135: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   140: astore #14
/*     */     //   142: aload #14
/*     */     //   144: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   147: astore #15
/*     */     //   149: iconst_0
/*     */     //   150: istore #16
/*     */     //   152: aload #15
/*     */     //   154: instanceof com/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice
/*     */     //   157: ifne -> 123
/*     */     //   160: iconst_0
/*     */     //   161: goto -> 165
/*     */     //   164: iconst_1
/*     */     //   165: ifeq -> 180
/*     */     //   168: aload_0
/*     */     //   169: aload #9
/*     */     //   171: invokespecial reduceToSingleContentChoice : (Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/llm/AIContentAnswerChoice;
/*     */     //   174: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   177: goto -> 407
/*     */     //   180: aload #9
/*     */     //   182: checkcast java/lang/Iterable
/*     */     //   185: astore #11
/*     */     //   187: iconst_0
/*     */     //   188: istore #12
/*     */     //   190: aload #11
/*     */     //   192: instanceof java/util/Collection
/*     */     //   195: ifeq -> 215
/*     */     //   198: aload #11
/*     */     //   200: checkcast java/util/Collection
/*     */     //   203: invokeinterface isEmpty : ()Z
/*     */     //   208: ifeq -> 215
/*     */     //   211: iconst_0
/*     */     //   212: goto -> 266
/*     */     //   215: aload #11
/*     */     //   217: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   222: astore #13
/*     */     //   224: aload #13
/*     */     //   226: invokeinterface hasNext : ()Z
/*     */     //   231: ifeq -> 265
/*     */     //   234: aload #13
/*     */     //   236: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   241: astore #14
/*     */     //   243: aload #14
/*     */     //   245: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   248: astore #15
/*     */     //   250: iconst_0
/*     */     //   251: istore #16
/*     */     //   253: aload #15
/*     */     //   255: instanceof com/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice
/*     */     //   258: ifeq -> 224
/*     */     //   261: iconst_1
/*     */     //   262: goto -> 266
/*     */     //   265: iconst_0
/*     */     //   266: ifeq -> 281
/*     */     //   269: aload_0
/*     */     //   270: aload #9
/*     */     //   272: invokespecial reduceToSingleToolChoice : (Ljava/util/List;)Lcom/intellij/ml/llm/matterhorn/llm/AIToolUseAnswerChoice;
/*     */     //   275: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   278: goto -> 407
/*     */     //   281: aload #9
/*     */     //   283: checkcast java/lang/Iterable
/*     */     //   286: astore #11
/*     */     //   288: iconst_0
/*     */     //   289: istore #12
/*     */     //   291: aload #11
/*     */     //   293: astore #13
/*     */     //   295: new java/util/ArrayList
/*     */     //   298: dup
/*     */     //   299: aload #11
/*     */     //   301: bipush #10
/*     */     //   303: invokestatic collectionSizeOrDefault : (Ljava/lang/Iterable;I)I
/*     */     //   306: invokespecial <init> : (I)V
/*     */     //   309: checkcast java/util/Collection
/*     */     //   312: astore #14
/*     */     //   314: iconst_0
/*     */     //   315: istore #15
/*     */     //   317: aload #13
/*     */     //   319: invokeinterface iterator : ()Ljava/util/Iterator;
/*     */     //   324: astore #16
/*     */     //   326: aload #16
/*     */     //   328: invokeinterface hasNext : ()Z
/*     */     //   333: ifeq -> 384
/*     */     //   336: aload #16
/*     */     //   338: invokeinterface next : ()Ljava/lang/Object;
/*     */     //   343: astore #17
/*     */     //   345: aload #14
/*     */     //   347: aload #17
/*     */     //   349: checkcast com/intellij/ml/llm/matterhorn/llm/AIAnswerChoice
/*     */     //   352: astore #18
/*     */     //   354: astore #19
/*     */     //   356: iconst_0
/*     */     //   357: istore #20
/*     */     //   359: aload #18
/*     */     //   361: invokevirtual getClass : ()Ljava/lang/Class;
/*     */     //   364: invokestatic getOrCreateKotlinClass : (Ljava/lang/Class;)Lkotlin/reflect/KClass;
/*     */     //   367: invokeinterface getSimpleName : ()Ljava/lang/String;
/*     */     //   372: aload #19
/*     */     //   374: swap
/*     */     //   375: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   380: pop
/*     */     //   381: goto -> 326
/*     */     //   384: aload #14
/*     */     //   386: checkcast java/util/List
/*     */     //   389: nop
/*     */     //   390: <illegal opcode> makeConcatWithConstants : (Ljava/util/List;)Ljava/lang/String;
/*     */     //   395: astore #22
/*     */     //   397: new java/lang/RuntimeException
/*     */     //   400: dup
/*     */     //   401: aload #22
/*     */     //   403: invokespecial <init> : (Ljava/lang/String;)V
/*     */     //   406: athrow
/*     */     //   407: nop
/*     */     //   408: aload #21
/*     */     //   410: swap
/*     */     //   411: invokeinterface add : (Ljava/lang/Object;)Z
/*     */     //   416: pop
/*     */     //   417: goto -> 45
/*     */     //   420: aload #5
/*     */     //   422: checkcast java/util/List
/*     */     //   425: nop
/*     */     //   426: areturn
/*     */     // Line number table:
/*     */     //   Java source line number -> byte code offset
/*     */     //   #336	-> 0
/*     */     //   #382	-> 12
/*     */     //   #383	-> 36
/*     */     //   #384	-> 64
/*     */     //   #337	-> 78
/*     */     //   #338	-> 79
/*     */     //   #385	-> 89
/*     */     //   #386	-> 114
/*     */     //   #338	-> 152
/*     */     //   #386	-> 157
/*     */     //   #387	-> 164
/*     */     //   #338	-> 165
/*     */     //   #339	-> 180
/*     */     //   #388	-> 190
/*     */     //   #389	-> 215
/*     */     //   #339	-> 253
/*     */     //   #389	-> 258
/*     */     //   #390	-> 265
/*     */     //   #339	-> 266
/*     */     //   #340	-> 281
/*     */     //   #391	-> 291
/*     */     //   #392	-> 317
/*     */     //   #393	-> 345
/*     */     //   #340	-> 359
/*     */     //   #393	-> 375
/*     */     //   #394	-> 384
/*     */     //   #391	-> 389
/*     */     //   #340	-> 395
/*     */     //   #341	-> 407
/*     */     //   #384	-> 411
/*     */     //   #395	-> 420
/*     */     //   #382	-> 425
/*     */     //   #342	-> 426
/*     */     // Local variable table:
/*     */     //   start	length	slot	name	descriptor
/*     */     //   152	5	16	$i$a$-all-GrazieLLMProxy$toAnswerChoices$1$1	I
/*     */     //   149	8	15	it	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   142	22	14	element$iv	Ljava/lang/Object;
/*     */     //   89	76	12	$i$f$all	I
/*     */     //   86	79	11	$this$all$iv	Ljava/lang/Iterable;
/*     */     //   253	5	16	$i$a$-any-GrazieLLMProxy$toAnswerChoices$1$2	I
/*     */     //   250	8	15	it	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   243	22	14	element$iv	Ljava/lang/Object;
/*     */     //   190	76	12	$i$f$any	I
/*     */     //   187	79	11	$this$any$iv	Ljava/lang/Iterable;
/*     */     //   359	13	20	$i$a$-map-GrazieLLMProxy$toAnswerChoices$1$3	I
/*     */     //   356	16	18	it	Lcom/intellij/ml/llm/matterhorn/llm/AIAnswerChoice;
/*     */     //   345	36	17	item$iv$iv	Ljava/lang/Object;
/*     */     //   317	69	15	$i$f$mapTo	I
/*     */     //   314	72	13	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   314	72	14	destination$iv$iv	Ljava/util/Collection;
/*     */     //   291	99	12	$i$f$map	I
/*     */     //   288	102	11	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   78	330	10	$i$a$-map-GrazieLLMProxy$toAnswerChoices$1	I
/*     */     //   75	333	9	group	Ljava/util/List;
/*     */     //   64	353	8	item$iv$iv	Ljava/lang/Object;
/*     */     //   36	386	6	$i$f$mapTo	I
/*     */     //   33	389	4	$this$mapTo$iv$iv	Ljava/lang/Iterable;
/*     */     //   33	389	5	destination$iv$iv	Ljava/util/Collection;
/*     */     //   12	414	3	$i$f$map	I
/*     */     //   10	416	2	$this$map$iv	Ljava/lang/Iterable;
/*     */     //   0	427	0	this	Lcom/intellij/ml/llm/matterhorn/core/llm/grazie/GrazieLLMProxy;
/*     */     //   0	427	1	$this$toAnswerChoices	Ljava/util/Map;
/*     */   }
/*     */   
/*     */   private final AIContentAnswerChoice reduceToSingleContentChoice(List $this$reduceToSingleContentChoice) {
/*     */     return new AIContentAnswerChoice(CollectionsKt.joinToString$default($this$reduceToSingleContentChoice, "\n", null, null, 0, null, GrazieLLMProxy::reduceToSingleContentChoice$lambda$16, 30, null), null, null, 6, null);
/*     */   }
/*     */   
/*     */   private static final CharSequence reduceToSingleContentChoice$lambda$16(AIAnswerChoice it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getContent();
/*     */   }
/*     */   
/*     */   private final AIToolUseAnswerChoice reduceToSingleToolChoice(List $this$reduceToSingleToolChoice) {
/*     */     Iterable $this$filterIsInstance$iv = $this$reduceToSingleToolChoice;
/*     */     int $i$f$filterIsInstance = 0;
/*     */     Iterable iterable2 = $this$filterIsInstance$iv;
/*     */     Collection<Object> destination$iv$iv = new ArrayList();
/*     */     int $i$f$filterIsInstanceTo = 0;
/*     */     for (Object element$iv$iv : iterable2) {
/*     */       if (element$iv$iv instanceof AIContentAnswerChoice)
/*     */         destination$iv$iv.add(element$iv$iv); 
/*     */     } 
/*     */     String str = CollectionsKt.joinToString$default(destination$iv$iv, "\n", null, null, 0, null, GrazieLLMProxy::reduceToSingleToolChoice$lambda$17, 30, null);
/*     */     Iterable iterable1 = $this$reduceToSingleToolChoice;
/*     */     int i = 0;
/*     */     Iterable iterable3 = iterable1;
/*     */     Collection<Object> collection1 = new ArrayList();
/*     */     int j = 0;
/*     */     for (Object element$iv$iv : iterable3) {
/*     */       if (element$iv$iv instanceof AIToolUseAnswerChoice)
/*     */         collection1.add(element$iv$iv); 
/*     */     } 
/*     */     iterable1 = collection1;
/*     */     int $i$f$mapNotNull = 0;
/*     */     Iterable $this$filterIsInstanceTo$iv$iv = iterable1;
/*     */     Collection collection = new ArrayList();
/*     */     int $i$f$mapNotNullTo = 0;
/*     */     Iterable $this$forEach$iv$iv$iv = $this$filterIsInstanceTo$iv$iv;
/*     */     int $i$f$forEach = 0;
/*     */     Iterator iterator = $this$forEach$iv$iv$iv.iterator();
/*     */     if (iterator.hasNext()) {
/*     */       Object element$iv$iv$iv = iterator.next(), element$iv$iv = element$iv$iv$iv;
/*     */       int $i$a$-forEach-CollectionsKt___CollectionsKt$mapNotNullTo$1$iv$iv = 0;
/*     */       AIToolUseAnswerChoice it = (AIToolUseAnswerChoice)element$iv$iv;
/*     */       int $i$a$-mapNotNull-GrazieLLMProxy$reduceToSingleToolChoice$2 = 0;
/*     */     } 
/*     */     $this$filterIsInstance$iv = collection;
/*     */     return new AIToolUseAnswerChoice((List)$this$filterIsInstance$iv, str, null, null, 12, null);
/*     */   }
/*     */   
/*     */   private static final CharSequence reduceToSingleToolChoice$lambda$17(AIContentAnswerChoice it) {
/*     */     Intrinsics.checkNotNullParameter(it, "it");
/*     */     return it.getContent();
/*     */   }
/*     */   
/*     */   private final AIToolUsage toToolUsage(String $this$toToolUsage) {
/*     */     String toolName = StringsKt.substringBefore$default($this$toToolUsage, "\n", null, 2, null);
/*     */     if (StringsKt.isBlank(toolName))
/*     */       return null; 
/*     */     String paramsContent = StringsKt.substringAfter$default($this$toToolUsage, "\n", null, 2, null);
/*     */     JsonElement jsonContent = Json.Default.parseToJsonElement(paramsContent);
/*     */     Map $this$mapValues$iv = (Map)JsonElementKt.getJsonObject(jsonContent);
/*     */     int $i$f$mapValues = 0;
/*     */     Map map1 = $this$mapValues$iv;
/*     */     Map<Object, Object> destination$iv$iv = new LinkedHashMap<>(MapsKt.mapCapacity($this$mapValues$iv.size()));
/*     */     int $i$f$mapValuesTo = 0;
/*     */     Iterable $this$associateByTo$iv$iv$iv = map1.entrySet();
/*     */     int $i$f$associateByTo = 0;
/*     */     for (Object element$iv$iv$iv : $this$associateByTo$iv$iv$iv) {
/*     */       Map.Entry entry1 = (Map.Entry)element$iv$iv$iv;
/*     */       Map<Object, Object> map2 = destination$iv$iv;
/*     */       int $i$a$-associateByTo-MapsKt__MapsKt$mapValuesTo$1$iv$iv = 0;
/*     */       Map.Entry entry2 = (Map.Entry)element$iv$iv$iv;
/*     */       Object object1 = entry1.getKey();
/*     */       Map<Object, Object> map3 = map2;
/*     */       int $i$a$-mapValues-GrazieLLMProxy$toToolUsage$toolParams$1 = 0;
/*     */     } 
/*     */     Map toolParams = ((((CharSequence)paramsContent).length() == 0)) ? MapsKt.emptyMap() : destination$iv$iv;
/*     */     return new AIToolUsage(null, toolName, toolParams);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object sendChat(@NotNull MatterhornChat chat, @NotNull ModelParameters modelParameters, @NotNull Function1<? super CustomArtifactEvent, Unit> eventHandler, @NotNull Continuation<? super AIAnswer> $completion) {
/*     */     return sendChat$suspendImpl(this, chat, modelParameters, eventHandler, $completion);
/*     */   }
/*     */   
/*     */   @Nullable
/*     */   public Object sendWithRecovery(@NotNull Function2<? super Integer, ? super Continuation<? super AIAnswer>, ? extends Object> send, @NotNull Continuation<? super AIAnswer> $completion) {
/*     */     return sendWithRecovery$suspendImpl(this, send, $completion);
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieLLMProxy.kt", l = {238, 302}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getAnthropicContentChoices", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieLLMProxy$getAnthropicContentChoices$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     GrazieLLMProxy$getAnthropicContentChoices$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieLLMProxy.this.getAnthropicContentChoices(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieLLMProxy.kt", l = {214, 233}, i = {0}, s = {"L$0"}, n = {"this"}, m = "getOpenAIContentChoices", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieLLMProxy$getOpenAIContentChoices$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     int label;
/*     */     
/*     */     GrazieLLMProxy$getOpenAIContentChoices$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieLLMProxy.this.getOpenAIContentChoices(null, null, null, (Continuation)this);
/*     */     }
/*     */   }
/*     */   
/*     */   @DebugMetadata(f = "GrazieLLMProxy.kt", l = {120, 132, 133, 143, 153}, i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"}, n = {"$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt", "$this", "send", "delaysValues", "delaysValuesForRateLimit", "delayValuesForAuthenticationIssue", "currentAttempt"}, m = "sendWithRecovery$suspendImpl", c = "com.intellij.ml.llm.matterhorn.core.llm.grazie.GrazieLLMProxy")
/*     */   @Metadata(mv = {2, 1, 0}, k = 3, xi = 48)
/*     */   static final class GrazieLLMProxy$sendWithRecovery$1 extends ContinuationImpl {
/*     */     Object L$0;
/*     */     Object L$1;
/*     */     Object L$2;
/*     */     Object L$3;
/*     */     Object L$4;
/*     */     int I$0;
/*     */     int label;
/*     */     
/*     */     GrazieLLMProxy$sendWithRecovery$1(Continuation $completion) {
/*     */       super($completion);
/*     */     }
/*     */     
/*     */     @Nullable
/*     */     public final Object invokeSuspend(@NotNull Object $result) {
/*     */       this.result = $result;
/*     */       this.label |= Integer.MIN_VALUE;
/*     */       return GrazieLLMProxy.sendWithRecovery$suspendImpl(GrazieLLMProxy.this, null, (Continuation<? super AIAnswer>)this);
/*     */     }
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\core\llm\grazie\GrazieLLMProxy.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */