/*    */ package com.intellij.ml.llm.matterhorn.ej.core.statistics;
/*    */ 
/*    */ import com.intellij.internal.statistic.eventLog.FeatureUsageData;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornModelPersistentStateComponent;
/*    */ import com.intellij.openapi.components.ComponentManager;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import kotlin.jvm.internal.SourceDebugExtension;
/*    */ import org.jetbrains.annotations.NonNls;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000<\n\002\030\002\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020 \n\002\b\003\n\002\020\002\n\000\n\002\030\002\n\002\b\004\n\002\020\013\n\000\n\002\020\000\n\000\n\002\020\b\n\002\b\002\b\b\030\0002\0020\001B\021\022\b\b\001\020\002\032\0020\003¢\006\004\b\004\020\005J\032\020\f\032\0020\r2\006\020\016\032\0020\0172\b\020\020\032\004\030\0010\003H\026J\t\020\021\032\0020\003HÆ\003J\023\020\022\032\0020\0002\b\b\003\020\002\032\0020\003HÆ\001J\023\020\023\032\0020\0242\b\020\025\032\004\030\0010\026HÖ\003J\t\020\027\032\0020\030HÖ\001J\t\020\031\032\0020\003HÖ\001R\024\020\002\032\0020\003X\004¢\006\b\n\000\032\004\b\006\020\007R\032\020\b\032\b\022\004\022\0020\0030\t8VX\004¢\006\006\032\004\b\n\020\013¨\006\032"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData;", "Lcom/intellij/internal/statistic/eventLog/events/StringEventField;", "name", "", "<init>", "(Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "validationRule", "", "getValidationRule", "()Ljava/util/List;", "addData", "", "fuData", "Lcom/intellij/internal/statistic/eventLog/FeatureUsageData;", "value", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ej-core"})
/*    */ @SourceDebugExtension({"SMAP\nRequestPrivateData.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RequestPrivateData.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData\n+ 2 services.kt\ncom/intellij/openapi/components/ServicesKt\n*L\n1#1,28:1\n31#2,2:29\n*S KotlinDebug\n*F\n+ 1 RequestPrivateData.kt\ncom/intellij/ml/llm/matterhorn/ej/core/statistics/RequestPrivateData\n*L\n20#1:29,2\n*E\n"})
/*    */ public final class RequestPrivateData extends StringEventField {
/* 15 */   public RequestPrivateData(@NonNls @NotNull String name) { super(name); this.name = name; } @NotNull private final String name; @NotNull public String getName() { return this.name; } @NotNull
/*    */   public List<String> getValidationRule() {
/* 17 */     return CollectionsKt.listOf("{util#" + CustomValidationRule.getRuleId(TrueValidationRule.class) + "}");
/*    */   }
/*    */   public void addData(@NotNull FeatureUsageData fuData, @Nullable String value) {
/* 20 */     Intrinsics.checkNotNullParameter(fuData, "fuData"); ComponentManager $this$service$iv = (ComponentManager)ApplicationKt.getApplication(); int $i$f$service = 0;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */     
/* 29 */     Class<MatterhornModelPersistentStateComponent> serviceClass$iv = MatterhornModelPersistentStateComponent.class;
/* 30 */     if ($this$service$iv.getService(serviceClass$iv) == null) { $this$service$iv.getService(serviceClass$iv); throw ServicesKt.serviceNotFoundError($this$service$iv, serviceClass$iv); }  MatterhornModelPersistentStateComponent settings = (MatterhornModelPersistentStateComponent)$this$service$iv.getService(serviceClass$iv);
/*    */     if (!settings.isDataSharingEnabled())
/*    */       return; 
/*    */     if (value != null)
/*    */       super.addData(fuData, value); 
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final String component1() {
/*    */     return this.name;
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public final RequestPrivateData copy(@NonNls @NotNull String name) {
/*    */     Intrinsics.checkNotNullParameter(name, "name");
/*    */     return new RequestPrivateData(name);
/*    */   }
/*    */   
/*    */   @NotNull
/*    */   public String toString() {
/*    */     return "RequestPrivateData(name=" + this.name + ")";
/*    */   }
/*    */   
/*    */   public int hashCode() {
/*    */     return this.name.hashCode();
/*    */   }
/*    */   
/*    */   public boolean equals(@Nullable Object other) {
/*    */     if (this == other)
/*    */       return true; 
/*    */     if (!(other instanceof RequestPrivateData))
/*    */       return false; 
/*    */     RequestPrivateData requestPrivateData = (RequestPrivateData)other;
/*    */     return !!Intrinsics.areEqual(this.name, requestPrivateData.name);
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\statistics\RequestPrivateData.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */