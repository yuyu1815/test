/*    */ package com.intellij.ml.llm.matterhorn.core.llm;
/*    */ import com.intellij.ml.llm.matterhorn.settings.MatterhornProperty;
/*    */ import kotlin.Metadata;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000\030\n\002\030\002\n\002\030\002\n\002\b\003\n\002\020 \n\002\030\002\n\002\b\003\030\0002\0020\001B\007¢\006\004\b\002\020\003R\032\020\004\032\b\022\004\022\0020\0060\0058VX\004¢\006\006\032\004\b\007\020\b¨\006\t"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/core/llm/CorePropertiesContainer;", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornPropertyContainer;", "<init>", "()V", "properties", "", "Lcom/intellij/ml/llm/matterhorn/settings/MatterhornProperty;", "getProperties", "()Ljava/util/List;", "core-llm"})
/*    */ public final class CorePropertiesContainer implements MatterhornPropertyContainer {
/*    */   @NotNull
/*    */   public List<MatterhornProperty> getProperties() {
/* 10 */     return CoreProperties.INSTANCE.getProps();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\core-llm.jar!\com\intellij\ml\llm\matterhorn\core\llm\CorePropertiesContainer.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */