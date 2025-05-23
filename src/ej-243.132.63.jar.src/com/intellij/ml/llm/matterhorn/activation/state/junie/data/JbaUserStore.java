/*    */ package com.intellij.ml.llm.matterhorn.activation.state.junie.data;
/*    */ 
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaAuthData;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaIdToken;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.model.JbaUser;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepository;
/*    */ import com.intellij.ml.llm.matterhorn.activation.data.repos.JunieJbaUserRepositoryKt;
/*    */ import com.intellij.ml.llm.matterhorn.activation.platform.AiaServiceSupport;
/*    */ import com.intellij.openapi.components.Service;
/*    */ import com.intellij.ui.JBAccountInfoService;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.DefaultConstructorMarker;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import kotlinx.coroutines.CoroutineScope;
/*    */ import kotlinx.coroutines.flow.Flow;
/*    */ import kotlinx.coroutines.flow.FlowKt;
/*    */ import org.jetbrains.annotations.NotNull;
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
/*    */ @Service
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\036\n\002\030\002\n\002\030\002\n\000\n\002\030\002\n\002\b\003\n\002\030\002\n\002\030\002\n\002\b\003\b\007\030\0002\0020\001B\017\022\006\020\002\032\0020\003¢\006\004\b\004\020\005R\031\020\006\032\n\022\006\022\004\030\0010\b0\007¢\006\b\n\000\032\004\b\t\020\n¨\006\013"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore;", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStore;", "cs", "Lkotlinx/coroutines/CoroutineScope;", "<init>", "(Lkotlinx/coroutines/CoroutineScope;)V", "authDataLazy", "Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "Lcom/intellij/ml/llm/matterhorn/activation/data/model/JbaAuthData;", "getAuthDataLazy", "()Lcom/intellij/ml/llm/matterhorn/activation/state/junie/data/StateLazy;", "state.junie.impl"})
/*    */ @StabilityInferred(parameters = 0)
/*    */ @SourceDebugExtension({"SMAP\nAiaDataStore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore\n+ 2 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/AiaDataStoreKt\n+ 3 Merge.kt\nkotlinx/coroutines/flow/FlowKt__MergeKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,83:1\n75#2:84\n189#3:85\n1#4:86\n*S KotlinDebug\n*F\n+ 1 AiaDataStore.kt\ncom/intellij/ml/llm/matterhorn/activation/state/junie/data/JbaUserStore\n*L\n66#1:84\n66#1:85\n*E\n"})
/*    */ public final class JbaUserStore
/*    */   implements AiaDataStore
/*    */ {
/*    */   @NotNull
/*    */   private final StateLazy<JbaAuthData> authDataLazy;
/*    */   public static final int $stable = 8;
/*    */   
/*    */   public JbaUserStore(@NotNull CoroutineScope cs) {
/* 66 */     AiaServiceSupport $this$invoke$iv = (AiaServiceSupport)JunieJbaUserRepository.Companion; int $i$f$invoke = 0;
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
/* 84 */     Flow $this$flatMapLatest$iv$iv = $this$invoke$iv.instanceFlow(); int $i$f$flatMapLatest = 0; JBAccountInfoService jBAccountInfoService = JBAccountInfoService.getInstance(); CoroutineScope coroutineScope = cs;
/* 85 */     Flow flow1 = FlowKt.transformLatest($this$flatMapLatest$iv$iv, new JbaUserStore$special$$inlined$invoke$1(null)); JbaUserStore jbaUserStore = this; int $i$a$-let-JbaUserStore$authDataLazy$2 = 0; if (jBAccountInfoService.getUserData() != null) {
/* 86 */       JBAccountInfoService.JBAData userData = jBAccountInfoService.getUserData(); int $i$a$-let-JbaUserStore$authDataLazy$2$1 = 0; String str1 = jBAccountInfoService.getIdToken(); JbaUser jbaUser1 = JunieJbaUserRepositoryKt.toJbaUser(userData); int $i$a$-let-JbaUserStore$authDataLazy$2$1$1 = 0;
/*    */       jBAccountInfoService.getIdToken();
/*    */       DefaultConstructorMarker defaultConstructorMarker = null;
/*    */       String str2 = (jBAccountInfoService.getIdToken() != null) ? JbaIdToken.constructor-impl(str1) : null;
/*    */       JbaUser jbaUser2 = JunieJbaUserRepositoryKt.toJbaUser(userData);
/*    */     } else {
/*    */       new JbaAuthData(jbaUser2, str2, defaultConstructorMarker);
/*    */     } 
/*    */     JbaAuthData jbaAuthData = null;
/*    */     JBAccountInfoService.getInstance();
/*    */     this.authDataLazy = StateLazyKt.stateLazyIn(FlowKt.transformLatest($this$flatMapLatest$iv$iv, new JbaUserStore$special$$inlined$invoke$1(null)), cs, (JBAccountInfoService.getInstance() != null) ? jbaAuthData : null);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final StateLazy<JbaAuthData> getAuthDataLazy() {
/*    */     return this.authDataLazy;
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\activation\state\junie\data\JbaUserStore.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */