/*    */ package com.intellij.ml.llm.matterhorn.ej.ui;
/*    */ import androidx.compose.runtime.internal.StabilityInferred;
/*    */ import com.intellij.history.ActivityPresentationProvider;
/*    */ import kotlin.Metadata;
/*    */ import kotlin.jvm.internal.Intrinsics;
/*    */ import org.jetbrains.annotations.NotNull;
/*    */ import org.jetbrains.annotations.Nullable;
/*    */ 
/*    */ @Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000 \n\002\030\002\n\002\030\002\n\002\b\003\n\002\020\016\n\002\b\003\n\002\030\002\n\000\n\002\030\002\n\000\b\007\030\0002\0020\001B\007¢\006\004\b\002\020\003J\027\020\b\032\004\030\0010\t2\013\020\n\032\0070\005¢\006\002\b\013H\026R\024\020\004\032\0020\0058VX\004¢\006\006\032\004\b\006\020\007¨\006\f"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/ui/EjActivityPresentationProvider;", "Lcom/intellij/history/ActivityPresentationProvider;", "<init>", "()V", "id", "", "getId", "()Ljava/lang/String;", "getIcon", "Ljavax/swing/Icon;", "kind", "Lorg/jetbrains/annotations/NonNls;", "ej-ui"})
/*    */ @StabilityInferred(parameters = 1)
/*    */ public final class EjActivityPresentationProvider implements ActivityPresentationProvider {
/*    */   @NotNull
/*    */   public String getId() {
/* 14 */     return JunieActivityKt.getJunieActivityId().getProviderId();
/*    */   } public static final int $stable; @Nullable
/*    */   public Icon getIcon(@NotNull String kind) {
/* 17 */     Intrinsics.checkNotNullParameter(kind, "kind"); return JunieIcons.INSTANCE.getLogo16();
/*    */   }
/*    */ }


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\e\\ui\EjActivityPresentationProvider.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */