package com.intellij.ml.llm.matterhorn.ej.core.actions.edit;

import com.intellij.openapi.editor.Document;
import java.nio.file.Path;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(mv = {2, 1, 0}, k = 1, xi = 48, d1 = {"\000,\n\002\030\002\n\002\020\000\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\030\002\n\000\n\002\020\016\n\002\b\005\n\002\020\002\n\002\b\002\bf\030\0002\0020\001J(\020\002\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\006\032\0020\0072\006\020\b\032\0020\tH¦@¢\006\002\020\nJ \020\013\032\004\030\0010\0032\006\020\004\032\0020\0052\006\020\f\032\0020\tH¦@¢\006\002\020\rJ\016\020\016\032\0020\017H¦@¢\006\002\020\020¨\006\021"}, d2 = {"Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditSession;", "", "requestDocumentUpdate", "Lcom/intellij/ml/llm/matterhorn/ej/core/actions/edit/EditError;", "path", "Ljava/nio/file/Path;", "document", "Lcom/intellij/openapi/editor/Document;", "updatedText", "", "(Ljava/nio/file/Path;Lcom/intellij/openapi/editor/Document;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestDocumentCreation", "newText", "(Ljava/nio/file/Path;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commit", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "ej-core"})
public interface EditSession {
  @Nullable
  Object requestDocumentUpdate(@NotNull Path paramPath, @NotNull Document paramDocument, @NotNull String paramString, @NotNull Continuation<? super EditError> paramContinuation);
  
  @Nullable
  Object requestDocumentCreation(@NotNull Path paramPath, @NotNull String paramString, @NotNull Continuation<? super EditError> paramContinuation);
  
  @Nullable
  Object commit(@NotNull Continuation<? super Unit> paramContinuation);
}


/* Location:              C:\Users\yuzum\Downloads\ej-release-243.132.63.zip!\ej\lib\ej-243.132.63.jar!\com\intellij\ml\llm\matterhorn\ej\core\actions\edit\EditSession.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */