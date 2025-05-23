/*     */ package com.intellij.ml.llm.matterhorn.ej.ui.reporting;
/*     */ 
/*     */ import androidx.compose.runtime.internal.StabilityInferred;
/*     */ import com.intellij.codeWithMe.ClientId;
/*     */ import com.intellij.diagnostic.AbstractMessage;
/*     */ import com.intellij.diagnostic.MessagePool;
/*     */ import com.intellij.diagnostic.MessagePoolListener;
/*     */ import com.intellij.ide.ApplicationInitializedListener;
/*     */ import com.intellij.internal.statistic.utils.StatisticsUploadAssistant;
/*     */ import com.intellij.ml.llm.matterhorn.configuration.BuildConfigKt;
/*     */ import com.intellij.openapi.application.ApplicationManager;
/*     */ import kotlin.Metadata;
/*     */ import kotlin.Unit;
/*     */ import kotlin.coroutines.Continuation;
/*     */ import kotlin.jvm.internal.Intrinsics;
/*     */ import kotlin.jvm.internal.SourceDebugExtension;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\024\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\002\n\002\b\002\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\016\020\004\032\0020\005H@¢\006\002\020\006¨\006\007"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener;", "Lcom/intellij/ide/ApplicationInitializedListener;", "<init>", "()V", "execute", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-ui"})
/*     */ @StabilityInferred(parameters = 1)
/*     */ @SourceDebugExtension({"SMAP\nAbstractEJMessagePoolAutoReporter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AbstractEJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener\n+ 2 service.kt\ncom/intellij/openapi/components/ServiceKt\n*L\n1#1,184:1\n40#2,3:185\n*S KotlinDebug\n*F\n+ 1 AbstractEJMessagePoolAutoReporter.kt\ncom/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener\n*L\n177#1:185,3\n*E\n"})
/*     */ public final class MyAppListener
/*     */   implements ApplicationInitializedListener
/*     */ {
/*     */   public static final int $stable;
/*     */   
/*     */   @Nullable
/*     */   public Object execute(@NotNull Continuation $completion) {
/* 176 */     if (!BuildConfigKt.getConfig().getEapExceptionProcessing() && !StatisticsUploadAssistant.isAllowedByUserConsent()) return Unit.INSTANCE; 
/* 177 */     int $i$f$service = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 185 */     Class<EJMessagePoolAutoReporter> serviceClass$iv = EJMessagePoolAutoReporter.class;
/* 186 */     if (ApplicationManager.getApplication().getService(serviceClass$iv) == null) { ApplicationManager.getApplication().getService(serviceClass$iv);
/* 187 */       throw new RuntimeException("Cannot find service " + serviceClass$iv.getName() + " (classloader=" + serviceClass$iv.getClassLoader() + ", client=" + ClientId.Companion.getCurrentOrNull() + ')'); }
/*     */     
/*     */     EJMessagePoolAutoReporter reporter = (EJMessagePoolAutoReporter)ApplicationManager.getApplication().getService(serviceClass$iv);
/*     */     MessagePool.getInstance().addListener(new AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2(reporter));
/*     */     return Unit.INSTANCE;
/*     */   }
/*     */   
/*     */   @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\035\n\000\n\002\030\002\n\000\n\002\020\013\n\000\n\002\030\002\n\000\n\002\020\002\n\000*\001\000\b\n\030\0002\0020\001J\020\020\002\032\0020\0032\006\020\004\032\0020\005H\026J\b\020\006\032\0020\007H\026¨\006\b"}, d2 = {"com/intellij/ml/llm/matterhorn/ej/ui/reporting/AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2", "Lcom/intellij/diagnostic/MessagePoolListener;", "beforeEntryAdded", "", "message", "Lcom/intellij/diagnostic/AbstractMessage;", "newEntryAdded", "", "ej-ui"})
/*     */   public static final class AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2 implements MessagePoolListener {
/*     */     AbstractEJMessagePoolAutoReporter$MyAppListener$execute$2(EJMessagePoolAutoReporter $reporter) {}
/*     */     
/*     */     public boolean beforeEntryAdded(AbstractMessage message) {
/*     */       Intrinsics.checkNotNullParameter(message, "message");
/*     */       return !this.$reporter.newEntryConsumed(message);
/*     */     }
/*     */     
/*     */     public void newEntryAdded() {}
/*     */   }
/*     */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\reporting\AbstractEJMessagePoolAutoReporter$MyAppListener.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */